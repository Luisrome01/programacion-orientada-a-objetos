/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java_crud_postgresql;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author tatox
 */
public class CAlumnos {
    
    int codigo;
   String nombreAlumno;
   String apellidosAlumno;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombreAlumno() {
        return nombreAlumno;
    }

    public void setNombreAlumno(String nombreAlumno) {
        this.nombreAlumno = nombreAlumno;
    }

    public String getApellidosAlumno() {
        return apellidosAlumno;
    }

    public void setApellidosAlumno(String apellidosAlumno) {
        this.apellidosAlumno = apellidosAlumno;
    }
    
   
    public void MostrarAlumnos (JTable paramTablaTotalAlumnos){
    
      CConexion objetoConexion = new CConexion();
      
      DefaultTableModel modelo = new DefaultTableModel ();
      
      String sql= "";
      
        modelo.addColumn("ID");
         modelo.addColumn("Nombres");
         modelo.addColumn("Apellidos");
         
         paramTablaTotalAlumnos.setModel(modelo);
         sql = "select * from alumnos;";
         
         String [] datos = new String [3];
         Statement st;
         
         
         try {
        st= objetoConexion.establecerConexion().createStatement();
        
        ResultSet rs = st.executeQuery(sql);
        while(rs.next()){
            datos [0]= rs.getString(1);
            datos [1]= rs.getString(2);
            datos [2]= rs.getString(3);
            
            modelo. addRow(datos);
        }
        
        paramTablaTotalAlumnos.setModel(modelo);
        
        } catch (Exception e){
            
            JOptionPane.showMessageDialog(null,"ERROR:"+ e.toString());
        } 
  }  
    
    public void insertarAlumno(JTextField paramNombres, JTextField paramApellidos){
        setNombreAlumno(paramNombres.getText());
        setApellidosAlumno(paramApellidos.getText());
        CConexion objetoConexion = new CConexion ();
        String consulta = "insert into alumnos (nombres,apellidos ) values (?,? );";
        
        try{
            CallableStatement cs = objetoConexion.establecerConexion().prepareCall(consulta);
            cs.setString(1, getNombreAlumno());
            cs.setString(2, getApellidosAlumno());
            cs. execute();
            JOptionPane.showMessageDialog(null,"Se inserto correctamente");
            
    }    catch (Exception e){
            JOptionPane.showMessageDialog(null,"ERROR"+ e.toString());
    }
    }
    
    public void SeleccionarAlumno(JTable paramTablaAlumno, JTextField paramCodigo, JTextField paramNombre, JTextField paramApellidos){
    try {
        int fila =paramTablaAlumno.getSelectedRow();
        if (fila>=0){ 
            
            paramCodigo.setText(paramTablaAlumno.getValueAt(fila, 0).toString());
            paramNombre.setText(paramTablaAlumno.getValueAt(fila, 1).toString());
            paramApellidos.setText(paramTablaAlumno.getValueAt(fila, 2).toString());
        }
        else
        {JOptionPane.showMessageDialog(null,"Fila no seleccionada");}
    }catch (Exception e){
    JOptionPane.showMessageDialog(null,"ERROR"+ e.toString());
}
}
   public void ModificarAlumno( JTextField paramCodigo, JTextField paramNombres, JTextField paramApellidos){
        setNombreAlumno(paramNombres.getText());
        setApellidosAlumno(paramApellidos.getText());
        
        setCodigo(Integer.parseInt(paramCodigo.getText()));
        CConexion objetoConexion = new CConexion ();
        String consulta = "update alumnos set nombres= ?, apellidos= ? where id=?;";
        
        try{
            CallableStatement cs = objetoConexion.establecerConexion().prepareCall(consulta);
            cs.setString(1, getNombreAlumno());
            cs.setString(2, getApellidosAlumno());
            cs.setInt(3, getCodigo());
            
            cs. execute();
            JOptionPane.showMessageDialog(null,"Se modifico correctamente");
            
    }    catch (Exception e){
            JOptionPane.showMessageDialog(null,"ERROR"+ e.toString());
    }
    } 
   
     public void EliminarAlumno( JTextField paramCodigo){
       
        setCodigo(Integer.parseInt(paramCodigo.getText()));
        CConexion objetoConexion = new CConexion ();
        
        String consulta = "delete from alumnos where id=?";
        
        try{
            CallableStatement cs = objetoConexion.establecerConexion().prepareCall(consulta);
              cs.setInt(1, getCodigo());
            
            cs. execute();
            JOptionPane.showMessageDialog(null,"Se Elimino correctamente");
            
    }    catch (Exception e){
            JOptionPane.showMessageDialog(null,"ERROR"+ e.toString());
    }
    } 
}