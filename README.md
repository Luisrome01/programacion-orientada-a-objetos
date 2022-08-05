# programacion-orientada-a-objetos
 
/* Profesor, debido a que no sabia como entregar los archivos, he juntado todo el codigo en un mismo texto, aqui encontrara la Base de datos (crud)con conexion y tambien sus funciones
*

*/
//CRUD Luisrome3005
<?xml version="1.0" encoding="UTF-8" ?>

<Form version="1.5" maxVersion="1.9" type="org.netbeans.modules.form.forminfo.JFrameFormInfo">
  <Properties>
    <Property name="defaultCloseOperation" type="int" value="3"/>
    <Property name="title" type="java.lang.String" value="CRUD"/>
    <Property name="name" type="java.lang.String" value="CRUD" noResource="true"/>
    <Property name="preferredSize" type="java.awt.Dimension" editor="org.netbeans.beaninfo.editors.DimensionEditor">
      <Dimension value="[1000, 750]"/>
    </Property>
  </Properties>
  <SyntheticProperties>
    <SyntheticProperty name="formSizePolicy" type="int" value="1"/>
    <SyntheticProperty name="generateCenter" type="boolean" value="false"/>
  </SyntheticProperties>
  <AuxValues>
    <AuxValue name="FormSettings_autoResourcing" type="java.lang.Integer" value="0"/>
    <AuxValue name="FormSettings_autoSetComponentName" type="java.lang.Boolean" value="false"/>
    <AuxValue name="FormSettings_generateFQN" type="java.lang.Boolean" value="true"/>
    <AuxValue name="FormSettings_generateMnemonicsCode" type="java.lang.Boolean" value="false"/>
    <AuxValue name="FormSettings_i18nAutoMode" type="java.lang.Boolean" value="false"/>
    <AuxValue name="FormSettings_layoutCodeTarget" type="java.lang.Integer" value="1"/>
    <AuxValue name="FormSettings_listenerGenerationStyle" type="java.lang.Integer" value="0"/>
    <AuxValue name="FormSettings_variablesLocal" type="java.lang.Boolean" value="false"/>
    <AuxValue name="FormSettings_variablesModifier" type="java.lang.Integer" value="2"/>
  </AuxValues>

  <Layout>
    <DimensionLayout dim="0">
      <Group type="103" groupAlignment="0" attributes="0">
          <Group type="102" attributes="0">
              <Group type="103" groupAlignment="0" attributes="0">
                  <Group type="102" alignment="0" attributes="0">
                      <EmptySpace min="-2" pref="68" max="-2" attributes="0"/>
                      <Component id="jLabel5" min="-2" max="-2" attributes="0"/>
                  </Group>
                  <Group type="102" alignment="0" attributes="0">
                      <EmptySpace min="-2" pref="42" max="-2" attributes="0"/>
                      <Group type="103" groupAlignment="0" attributes="0">
                          <Component id="jLabel6" min="-2" max="-2" attributes="0"/>
                          <Group type="103" alignment="0" groupAlignment="1" max="-2" attributes="0">
                              <Component id="jScrollPane1" min="-2" max="-2" attributes="0"/>
                              <Group type="102" alignment="0" attributes="0">
                                  <Component id="Consultar" min="-2" max="-2" attributes="0"/>
                                  <EmptySpace min="-2" pref="26" max="-2" attributes="0"/>
                                  <Component id="Buscar" max="32767" attributes="0"/>
                                  <EmptySpace min="-2" pref="6" max="-2" attributes="0"/>
                              </Group>
                          </Group>
                          <Component id="jLabel7" alignment="0" min="-2" max="-2" attributes="0"/>
                          <Component id="parametro" alignment="0" min="-2" pref="146" max="-2" attributes="0"/>
                      </Group>
                  </Group>
              </Group>
              <Group type="103" groupAlignment="0" attributes="0">
                  <Group type="102" attributes="0">
                      <EmptySpace min="-2" pref="65" max="-2" attributes="0"/>
                      <Group type="103" groupAlignment="1" attributes="0">
                          <Group type="102" attributes="0">
                              <EmptySpace min="0" pref="0" max="32767" attributes="0"/>
                              <Group type="103" groupAlignment="1" max="-2" attributes="0">
                                  <Group type="102" alignment="0" attributes="0">
                                      <Component id="jLabel1" min="-2" max="-2" attributes="0"/>
                                      <EmptySpace min="-2" pref="108" max="-2" attributes="0"/>
                                      <Component id="tfNombre" max="32767" attributes="0"/>
                                  </Group>
                                  <Component id="cbVIP" alignment="1" min="-2" max="-2" attributes="0"/>
                                  <Group type="102" alignment="0" attributes="0">
                                      <Group type="103" groupAlignment="0" attributes="0">
                                          <Component id="jLabel2" min="-2" max="-2" attributes="0"/>
                                          <Component id="jLabel3" min="-2" max="-2" attributes="0"/>
                                          <Component id="Guardar" alignment="0" min="-2" max="-2" attributes="0"/>
                                      </Group>
                                      <EmptySpace min="-2" pref="32" max="-2" attributes="0"/>
                                      <Group type="103" groupAlignment="0" attributes="0">
                                          <Component id="Actualizar" min="-2" max="-2" attributes="0"/>
                                          <Group type="103" alignment="0" groupAlignment="0" max="-2" attributes="0">
                                              <Component id="tfCI" max="32767" attributes="0"/>
                                              <Component id="tfApellido" min="-2" pref="110" max="-2" attributes="0"/>
                                          </Group>
                                      </Group>
                                  </Group>
                              </Group>
                              <EmptySpace min="-2" pref="254" max="-2" attributes="0"/>
                          </Group>
                          <Group type="102" alignment="0" attributes="0">
                              <Group type="103" groupAlignment="1" attributes="0">
                                  <Component id="Eliminar" alignment="0" min="-2" max="-2" attributes="0"/>
                                  <Group type="102" alignment="0" attributes="0">
                                      <Component id="jLabel4" min="-2" max="-2" attributes="0"/>
                                      <EmptySpace min="-2" pref="71" max="-2" attributes="0"/>
                                      <Component id="DeleteCI" min="-2" pref="127" max="-2" attributes="0"/>
                                  </Group>
                                  <Component id="jLabel10" alignment="0" min="-2" max="-2" attributes="0"/>
                                  <Component id="jLabel11" alignment="0" min="-2" max="-2" attributes="0"/>
                              </Group>
                              <EmptySpace min="0" pref="0" max="32767" attributes="0"/>
                          </Group>
                      </Group>
                  </Group>
                  <Group type="102" alignment="1" attributes="0">
                      <EmptySpace pref="50" max="32767" attributes="0"/>
                      <Group type="103" groupAlignment="1" attributes="0">
                          <Component id="jLabel8" alignment="0" min="-2" pref="251" max="-2" attributes="0"/>
                          <Component id="jLabel14" alignment="0" min="-2" max="-2" attributes="0"/>
                          <Component id="jLabel13" alignment="0" min="-2" max="-2" attributes="0"/>
                          <Component id="jLabel9" alignment="0" min="-2" pref="448" max="-2" attributes="0"/>
                          <Component id="jLabel12" alignment="0" min="-2" max="-2" attributes="0"/>
                      </Group>
                      <EmptySpace min="-2" pref="193" max="-2" attributes="0"/>
                  </Group>
              </Group>
          </Group>
      </Group>
    </DimensionLayout>
    <DimensionLayout dim="1">
      <Group type="103" groupAlignment="0" attributes="0">
          <Group type="102" attributes="0">
              <Group type="103" groupAlignment="0" attributes="0">
                  <Group type="102" alignment="0" attributes="0">
                      <EmptySpace min="-2" pref="18" max="-2" attributes="0"/>
                      <Component id="jLabel5" min="-2" max="-2" attributes="0"/>
                  </Group>
                  <Group type="102" attributes="0">
                      <EmptySpace min="-2" pref="153" max="-2" attributes="0"/>
                      <Component id="jLabel6" min="-2" pref="30" max="-2" attributes="0"/>
                  </Group>
                  <Group type="102" alignment="1" attributes="0">
                      <EmptySpace max="-2" attributes="0"/>
                      <Component id="jLabel8" min="-2" pref="42" max="-2" attributes="0"/>
                      <EmptySpace max="-2" attributes="0"/>
                      <Component id="jLabel9" min="-2" max="-2" attributes="0"/>
                      <EmptySpace type="separate" max="-2" attributes="0"/>
                      <Component id="jLabel13" min="-2" max="-2" attributes="0"/>
                      <EmptySpace max="-2" attributes="0"/>
                      <Component id="jLabel14" min="-2" max="-2" attributes="0"/>
                  </Group>
              </Group>
              <EmptySpace min="-2" pref="30" max="-2" attributes="0"/>
              <Group type="103" groupAlignment="3" attributes="0">
                  <Component id="jLabel12" alignment="3" min="-2" max="-2" attributes="0"/>
                  <Component id="jLabel7" alignment="3" min="-2" max="-2" attributes="0"/>
              </Group>
              <Group type="103" groupAlignment="0" attributes="0">
                  <Group type="102" attributes="0">
                      <EmptySpace min="-2" pref="32" max="-2" attributes="0"/>
                      <Group type="103" groupAlignment="3" attributes="0">
                          <Component id="tfCI" alignment="3" min="-2" max="-2" attributes="0"/>
                          <Component id="jLabel3" alignment="3" min="-2" max="-2" attributes="0"/>
                      </Group>
                      <EmptySpace min="-2" pref="33" max="-2" attributes="0"/>
                      <Group type="103" groupAlignment="3" attributes="0">
                          <Component id="jLabel1" alignment="3" min="-2" max="-2" attributes="0"/>
                          <Component id="tfNombre" alignment="3" min="-2" max="-2" attributes="0"/>
                      </Group>
                      <EmptySpace min="-2" pref="37" max="-2" attributes="0"/>
                      <Group type="103" groupAlignment="3" attributes="0">
                          <Component id="tfApellido" alignment="3" min="-2" max="-2" attributes="0"/>
                          <Component id="jLabel2" alignment="3" min="-2" max="-2" attributes="0"/>
                      </Group>
                      <EmptySpace min="-2" pref="29" max="-2" attributes="0"/>
                      <Component id="cbVIP" min="-2" max="-2" attributes="0"/>
                      <EmptySpace min="-2" pref="11" max="-2" attributes="0"/>
                      <Group type="103" groupAlignment="3" attributes="0">
                          <Component id="Guardar" alignment="3" min="-2" max="-2" attributes="0"/>
                          <Component id="Actualizar" alignment="3" min="-2" max="-2" attributes="0"/>
                      </Group>
                      <EmptySpace type="separate" max="-2" attributes="0"/>
                      <Component id="jLabel10" min="-2" max="-2" attributes="0"/>
                      <EmptySpace min="-2" pref="23" max="-2" attributes="0"/>
                      <Component id="jLabel11" min="-2" max="-2" attributes="0"/>
                      <EmptySpace type="separate" max="-2" attributes="0"/>
                      <Group type="103" groupAlignment="3" attributes="0">
                          <Component id="jLabel4" alignment="3" min="-2" max="-2" attributes="0"/>
                          <Component id="DeleteCI" alignment="3" min="-2" max="-2" attributes="0"/>
                      </Group>
                      <EmptySpace type="separate" max="-2" attributes="0"/>
                      <Component id="Eliminar" min="-2" max="-2" attributes="0"/>
                  </Group>
                  <Group type="102" alignment="0" attributes="0">
                      <EmptySpace max="-2" attributes="0"/>
                      <Component id="parametro" min="-2" max="-2" attributes="0"/>
                      <EmptySpace type="separate" max="-2" attributes="0"/>
                      <Group type="103" groupAlignment="3" attributes="0">
                          <Component id="Consultar" alignment="3" min="-2" max="-2" attributes="0"/>
                          <Component id="Buscar" alignment="3" min="-2" max="-2" attributes="0"/>
                      </Group>
                      <EmptySpace type="unrelated" max="-2" attributes="0"/>
                      <Component id="jScrollPane1" min="-2" pref="350" max="-2" attributes="0"/>
                  </Group>
              </Group>
              <EmptySpace pref="93" max="32767" attributes="0"/>
          </Group>
      </Group>
    </DimensionLayout>
  </Layout>
  <SubComponents>
    <Container class="javax.swing.JScrollPane" name="jScrollPane1">
      <AuxValues>
        <AuxValue name="autoScrollPane" type="java.lang.Boolean" value="true"/>
      </AuxValues>

      <Layout class="org.netbeans.modules.form.compat2.layouts.support.JScrollPaneSupportLayout"/>
      <SubComponents>
        <Component class="javax.swing.JTable" name="Tabla">
          <Properties>
            <Property name="model" type="javax.swing.table.TableModel" editor="org.netbeans.modules.form.editors2.TableModelEditor">
              <Table columnCount="4" rowCount="0">
                <Column editable="true" title="ci" type="java.lang.Integer"/>
                <Column editable="true" title="nombre" type="java.lang.String"/>
                <Column editable="true" title="apellido" type="java.lang.String"/>
                <Column editable="true" title="vip" type="java.lang.Boolean"/>
              </Table>
            </Property>
            <Property name="columnModel" type="javax.swing.table.TableColumnModel" editor="org.netbeans.modules.form.editors2.TableColumnModelEditor">
              <TableColumnModel selectionModel="0">
                <Column maxWidth="-1" minWidth="-1" prefWidth="-1" resizable="true">
                  <Title/>
                  <Editor/>
                  <Renderer/>
                </Column>
                <Column maxWidth="-1" minWidth="-1" prefWidth="-1" resizable="true">
                  <Title/>
                  <Editor/>
                  <Renderer/>
                </Column>
                <Column maxWidth="-1" minWidth="-1" prefWidth="-1" resizable="true">
                  <Title/>
                  <Editor/>
                  <Renderer/>
                </Column>
                <Column maxWidth="-1" minWidth="-1" prefWidth="-1" resizable="true">
                  <Title/>
                  <Editor/>
                  <Renderer/>
                </Column>
              </TableColumnModel>
            </Property>
            <Property name="tableHeader" type="javax.swing.table.JTableHeader" editor="org.netbeans.modules.form.editors2.JTableHeaderEditor">
              <TableHeader reorderingAllowed="true" resizingAllowed="true"/>
            </Property>
          </Properties>
          <AccessibilityProperties>
            <Property name="AccessibleContext.accessibleName" type="java.lang.String" value="Tabla"/>
          </AccessibilityProperties>
          <Events>
            <EventHandler event="mouseClicked" listener="java.awt.event.MouseListener" parameters="java.awt.event.MouseEvent" handler="TablaMouseClicked"/>
          </Events>
        </Component>
      </SubComponents>
    </Container>
    <Component class="javax.swing.JButton" name="Guardar">
      <Properties>
        <Property name="text" type="java.lang.String" value="Guardar"/>
      </Properties>
      <Events>
        <EventHandler event="actionPerformed" listener="java.awt.event.ActionListener" parameters="java.awt.event.ActionEvent" handler="GuardarActionPerformed"/>
      </Events>
    </Component>
    <Component class="javax.swing.JButton" name="Actualizar">
      <Properties>
        <Property name="text" type="java.lang.String" value="Actualizar"/>
      </Properties>
      <Events>
        <EventHandler event="actionPerformed" listener="java.awt.event.ActionListener" parameters="java.awt.event.ActionEvent" handler="ActualizarActionPerformed"/>
      </Events>
    </Component>
    <Component class="javax.swing.JTextField" name="tfApellido">
      <Events>
        <EventHandler event="actionPerformed" listener="java.awt.event.ActionListener" parameters="java.awt.event.ActionEvent" handler="tfApellidoActionPerformed"/>
      </Events>
    </Component>
    <Component class="javax.swing.JTextField" name="tfNombre">
    </Component>
    <Component class="javax.swing.JTextField" name="tfCI">
    </Component>
    <Component class="javax.swing.JCheckBox" name="cbVIP">
      <Properties>
        <Property name="text" type="java.lang.String" value="VIP"/>
      </Properties>
    </Component>
    <Component class="javax.swing.JLabel" name="jLabel1">
      <Properties>
        <Property name="text" type="java.lang.String" value="Nombre"/>
      </Properties>
    </Component>
    <Component class="javax.swing.JLabel" name="jLabel2">
      <Properties>
        <Property name="text" type="java.lang.String" value="Apellido"/>
      </Properties>
    </Component>
    <Component class="javax.swing.JLabel" name="jLabel3">
      <Properties>
        <Property name="text" type="java.lang.String" value="Cedula de Identidad"/>
      </Properties>
    </Component>
    <Component class="javax.swing.JLabel" name="jLabel4">
      <Properties>
        <Property name="text" type="java.lang.String" value="CI"/>
      </Properties>
    </Component>
    <Component class="javax.swing.JTextField" name="DeleteCI">
    </Component>
    <Component class="javax.swing.JButton" name="Eliminar">
      <Properties>
        <Property name="text" type="java.lang.String" value="Eliminar"/>
      </Properties>
      <Events>
        <EventHandler event="actionPerformed" listener="java.awt.event.ActionListener" parameters="java.awt.event.ActionEvent" handler="EliminarActionPerformed"/>
      </Events>
    </Component>
    <Component class="javax.swing.JButton" name="Consultar">
      <Properties>
        <Property name="text" type="java.lang.String" value="Consultar toda la base de datos"/>
      </Properties>
      <Events>
        <EventHandler event="actionPerformed" listener="java.awt.event.ActionListener" parameters="java.awt.event.ActionEvent" handler="ConsultarActionPerformed"/>
      </Events>
    </Component>
    <Component class="javax.swing.JLabel" name="jLabel5">
      <Properties>
        <Property name="font" type="java.awt.Font" editor="org.netbeans.beaninfo.editors.FontEditor">
          <Font name="Liberation Sans" size="36" style="0"/>
        </Property>
        <Property name="text" type="java.lang.String" value="CRUD"/>
      </Properties>
    </Component>
    <Component class="javax.swing.JLabel" name="jLabel6">
      <Properties>
        <Property name="font" type="java.awt.Font" editor="org.netbeans.beaninfo.editors.FontEditor">
          <Font name="Liberation Sans" size="18" style="0"/>
        </Property>
        <Property name="text" type="java.lang.String" value="Consultar lista de personas "/>
      </Properties>
    </Component>
    <Component class="javax.swing.JTextField" name="parametro">
    </Component>
    <Component class="javax.swing.JLabel" name="jLabel7">
      <Properties>
        <Property name="text" type="java.lang.String" value="Introduzca en la casilla inferior, la CI de la persona que desea buscar"/>
      </Properties>
    </Component>
    <Component class="javax.swing.JButton" name="Buscar">
      <Properties>
        <Property name="text" type="java.lang.String" value="Consultar persona"/>
      </Properties>
      <Events>
        <EventHandler event="actionPerformed" listener="java.awt.event.ActionListener" parameters="java.awt.event.ActionEvent" handler="BuscarActionPerformed"/>
      </Events>
    </Component>
    <Component class="javax.swing.JLabel" name="jLabel8">
      <Properties>
        <Property name="font" type="java.awt.Font" editor="org.netbeans.beaninfo.editors.FontEditor">
          <Font name="Liberation Sans" size="18" style="0"/>
        </Property>
        <Property name="text" type="java.lang.String" value="Insertar y modificar personas"/>
      </Properties>
    </Component>
    <Component class="javax.swing.JLabel" name="jLabel9">
      <Properties>
        <Property name="text" type="java.lang.String" value="Introduzca en las casillas inferiores los datos personales solicitados"/>
      </Properties>
    </Component>
    <Component class="javax.swing.JLabel" name="jLabel10">
      <Properties>
        <Property name="font" type="java.awt.Font" editor="org.netbeans.beaninfo.editors.FontEditor">
          <Font name="Liberation Sans" size="18" style="0"/>
        </Property>
        <Property name="text" type="java.lang.String" value="Eliminar persona"/>
      </Properties>
    </Component>
    <Component class="javax.swing.JLabel" name="jLabel11">
      <Properties>
        <Property name="text" type="java.lang.String" value="Introduzca la CI del registro a eliminar en la casilla inferior"/>
      </Properties>
    </Component>
    <Component class="javax.swing.JLabel" name="jLabel12">
      <Properties>
        <Property name="text" type="java.lang.String" value="Nota: la cedula no puede ser alterada"/>
      </Properties>
    </Component>
    <Component class="javax.swing.JLabel" name="jLabel13">
      <Properties>
        <Property name="text" type="java.lang.String" value="Puede seleccionar el registro a modificar en la tabla para obtener los "/>
      </Properties>
    </Component>
    <Component class="javax.swing.JLabel" name="jLabel14">
      <Properties>
        <Property name="text" type="java.lang.String" value="datos que no desee alterar"/>
      </Properties>
    </Component>
  </SubComponents>
</Form>
      
      
//CRUD Luisrome3005
package Luisrome3005.crud;;

import javax.swing.JOptionPane;
public class CRUD extends javax.swing.JFrame {
    public CRUD() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
 
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        Guardar = new javax.swing.JButton();
        Actualizar = new javax.swing.JButton();
        tfApellido = new javax.swing.JTextField();
        tfNombre = new javax.swing.JTextField();
        tfCI = new javax.swing.JTextField();
        cbVIP = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        DeleteCI = new javax.swing.JTextField();
        Eliminar = new javax.swing.JButton();
        Consultar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        parametro = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        Buscar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CRUD");
        setName("CRUD"); 
        setPreferredSize(new java.awt.Dimension(1000, 750));

        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ci", "nombre", "apellido", "vip"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        Tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tabla);
        Tabla.getAccessibleContext().setAccessibleName("Tabla");

        Guardar.setText("Guardar");
        Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarActionPerformed(evt);
            }
        });

        Actualizar.setText("Actualizar");
        Actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActualizarActionPerformed(evt);
            }
        });

        tfApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfApellidoActionPerformed(evt);
            }
        });

        cbVIP.setText("VIP");

        jLabel1.setText("Nombre");

        jLabel2.setText("Apellido");

        jLabel3.setText("Cedula de Identidad");

        jLabel4.setText("CI");

        Eliminar.setText("Eliminar");
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });

        Consultar.setText("Consultar base de datos");
        Consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultarActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Liberation Sans", 0, 36)); 
        jLabel5.setText("CRUD");

        jLabel6.setFont(new java.awt.Font("Liberation Sans", 0, 18)); 
        jLabel6.setText("Consultar lista de personas ");

        jLabel7.setText("Introduzca en la casilla inferior, la CI de la persona que desea buscar");

        Buscar.setText("Consultar persona");
        Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Liberation Sans", 0, 18)); 
        jLabel8.setText("Insertar y modificar personas");

        jLabel9.setText("Introduzca en las casillas inferiores los datos personales solicitados");

        jLabel10.setFont(new java.awt.Font("Liberation Sans", 0, 18)); 
        jLabel10.setText("Eliminar persona");

        jLabel11.setText("Introduzca la CI del registro a eliminar en la casilla inferior");

        jLabel12.setText("Nota: la cedula no puede ser alterada");

        jLabel13.setText("Puede seleccionar el registro a modificar en la tabla para obtener los ");

        jLabel14.setText("datos que no desee alterar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(Consultar)
                                    .addGap(26, 26, 26)
                                    .addComponent(Buscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGap(6, 6, 6)))
                            .addComponent(jLabel7)
                            .addComponent(parametro, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(108, 108, 108)
                                        .addComponent(tfNombre))
                                    .addComponent(cbVIP)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel3)
                                            .addComponent(Guardar))
                                        .addGap(32, 32, 32)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Actualizar)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(tfCI)
                                                .addComponent(tfApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(254, 254, 254))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Eliminar, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(71, 71, 71)
                                        .addComponent(DeleteCI, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(193, 193, 193))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel14)))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel7))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfCI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(29, 29, 29)
                        .addComponent(cbVIP)
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Guardar)
                            .addComponent(Actualizar))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10)
                        .addGap(23, 23, 23)
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(DeleteCI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(Eliminar))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(parametro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Consultar)
                            .addComponent(Buscar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(93, Short.MAX_VALUE))
        );

        pack();
    }

    private void tfApellidoActionPerformed(java.awt.event.ActionEvent evt) {
        
    }

    private void GuardarActionPerformed(java.awt.event.ActionEvent evt) {
    funciones funcion = new funciones();
        if (funcion.verificar(tfCI, tfNombre, tfApellido)){
             String query = "insert into personas (ci, nombre, apellido, vip) values (" + tfCI.getText() +" , '"
        + tfNombre.getText() +"' , '"+ tfApellido.getText() +"' , "+ cbVIP.isSelected() + ");"        ;
        ConnectionDB conexion = new ConnectionDB();
        conexion.Ejecutar(query);
        //System.out.println(query);
         }else{
            JOptionPane.showMessageDialog(null,"Rellene los datos solicitados de forma correcta");
        }
        
        
       
        
    }

    private void ActualizarActionPerformed(java.awt.event.ActionEvent evt) {
funciones funcion = new funciones();
        if (funcion.verificar(tfCI, tfNombre, tfApellido)){
            String query = "update personas set nombre = '"
        + tfNombre.getText() +"' , apellido = '"+ tfApellido.getText() +"' , vip = "+ cbVIP.isSelected() + " "
        + "where ci = "+ tfCI.getText()+ ";"        ;
        ConnectionDB conexion = new ConnectionDB();
        conexion.Ejecutar(query);
        //System.out.println(query);
       
        }else{
            JOptionPane.showMessageDialog(null,"Rellene los datos solicitados de forma correcta");}
        
    }

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {
     
        
            String query = "delete from personas where ci = " + DeleteCI.getText();
        ConnectionDB conexion = new ConnectionDB();
        conexion.Ejecutar(query);
       // System.out.println(query);
       
       
    }

    private void ConsultarActionPerformed(java.awt.event.ActionEvent evt) {

           ConnectionDB conexion = new ConnectionDB();
           conexion.Consultar(Tabla);

    }

    private void BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarActionPerformed
         ConnectionDB conexion = new ConnectionDB();
        conexion.Buscar(Tabla, parametro.getText());
    }

    private void TablaMouseClicked(java.awt.event.MouseEvent evt) {
        funcion.Seleccionar(Tabla, tfCI, tfNombre, tfApellido, cbVIP);
    }
    public static void main(String args[]) {
     
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CRUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CRUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CRUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CRUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CRUD().setVisible(true);
            }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Actualizar;
    private javax.swing.JButton Buscar;
    private javax.swing.JButton Consultar;
    private javax.swing.JTextField DeleteCI;
    private javax.swing.JButton Eliminar;
    private javax.swing.JButton Guardar;
    private javax.swing.JTable Tabla;
    private javax.swing.JCheckBox cbVIP;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField parametro;
    private javax.swing.JTextField tfApellido;
    private javax.swing.JTextField tfCI;
    private javax.swing.JTextField tfNombre;
    // End of variables declaration//GEN-END:variables
}

//Conexion
package Luisrome3005.crud;;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
public class ConnectionDB {

    String url = "jdbc:postgresql://localhost:5432/crud";
    String user = "postgres";
    String pass = "postgres";
    
    public void Ejecutar(String query){
        
        try {
            Connection conn = null;
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection(url, user, pass);
           CallableStatement cs = conn.prepareCall(query);
            cs.execute();
        JOptionPane.showMessageDialog(null,"Proceso ejecutado correctamente");
        } catch (Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }
    
    public void Consultar(JTable tabla) {

DefaultTableModel model = new DefaultTableModel();
            model.addColumn("ci");
            model.addColumn("nombre");
            model.addColumn("apellido");
            model.addColumn("vip");
            
            tabla.setModel(model);
            
            String [] data = new String[4];
        try{
            
            String query = "select * from personas";
             Connection conn = null;
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection(url, user, pass);
            Statement state = conn.createStatement();
            ResultSet rs = state.executeQuery(query);
            
            while(rs.next()){
                data[0] = rs.getString(1);
                data[1] = rs.getString(2);
                data[2] = rs.getString(3);
                data[3] = rs.getString(4);
                model.addRow(data);
            }
            
            tabla.setModel(model);
            
        }  catch (Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
       
    }
    
     public void Buscar(JTable tabla, String parametro) {

DefaultTableModel model = new DefaultTableModel();
            model.addColumn("ci");
            model.addColumn("nombre");
            model.addColumn("apellido");
            model.addColumn("vip");
            
            tabla.setModel(model);
            
            String [] data = new String[4];
        try{
            
            String query = "select * from personas where ci = " + parametro + ";";
             Connection conn = null;
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection(url, user, pass);
            Statement state = conn.createStatement();
            ResultSet rs = state.executeQuery(query);
            
            while(rs.next()){
                data[0] = rs.getString(1);
                data[1] = rs.getString(2);
                data[2] = rs.getString(3);
                data[3] = rs.getString(4);
                model.addRow(data);
            }
            
            tabla.setModel(model);
            
        }  catch (Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
       
    }
    
}

//Funciones/Conexion
package Luisrome3005.crud;

import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class funciones {    
    public void Seleccionar (JTable tabla, JTextField cedula, JTextField nombre, JTextField apellido, JCheckBox vip){
        try {
            int fila = tabla.getSelectedRow();
            if(fila >= 0){
                cedula.setText(tabla.getValueAt(fila, 0).toString());
                nombre.setText(tabla.getValueAt(fila, 1).toString());
                apellido.setText(tabla.getValueAt(fila, 2).toString());
                
                String estado = tabla.getValueAt(fila, 3).toString();
                if ("f".equals(estado)){
                    vip.setSelected(false);
                }else {
                    vip.setSelected(true);
                }
           //     
            }else{
                JOptionPane.showMessageDialog(null,"No se ha seleccionado ninguna fila");
            } 
        }catch (Exception e){
                    JOptionPane.showMessageDialog(null, e);
                    }
    }
    
    public boolean verificar (JTextField cedula, JTextField nombre, JTextField apellido){
        boolean v = true;
        if ("".equals(cedula.getText()) || "".equals(nombre.getText()) || "".equals(apellido.getText()))
        {
            v = false;
            
        }    
        
        
        
        return v;
    }
    
}
