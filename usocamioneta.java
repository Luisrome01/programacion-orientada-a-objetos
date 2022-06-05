import java.util.*;

public class usocamioneta {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int peso= 750;
		int ancho =300 ;
		int largo= 1500;
		String color;
		String transmision= "original";
		int opcion;
		String asientos = "originales";
		String traccion= "original";
		String capacidadCarga= "base";
		
		
		camioneta camioneta1 = new camioneta();
		
		System.out.println("La camoneta tiene un peso de:"+peso);
		
		System.out.println("La camoneta tiene un ancho de:"+ancho);
		
		System.out.println("La camoneta tiene un largo de:"+largo);
		
		System.out.println("introduce el color:");
		color = sc.next();
		
			do {
				System.out.println("Opciones personalizables: ");
				System.out.println("1. Transmision");
				System.out.println("2. Asientos");
				System.out.println("3. Capacidad de carga");
				System.out.println("4. Traccion");
				System.out.println("5. terminar de personalizar");
				opcion = sc.nextInt();

				switch(opcion) {
				
				case 1: 
					System.out.println("Transmision automatica o manual?");
					transmision = sc.next();
					break;
					
				case 2:
					System.out.println("Asientos estandar o de cuero ?");
					asientos = sc.next();
					break;
					
				case 3:
					System.out.println("Cual es la capacidad de carga?(kg)");
					capacidadCarga = sc.next();
					break;
					
				case 4:
					System.out.println("Traccion delantera o trasera?");
					traccion = sc.next();
					break;
					
				case 5:
					break;
					
					default:
						System.out.println("listo gracias por la info");
					
				}
			}while(opcion!= 5);
		
		
		
		camioneta1.setPeso(peso);
		camioneta1.setAncho(ancho);
		camioneta1.setColor(color);
		camioneta1.setAsientos(asientos);
		camioneta1.setTraccion(traccion);
		camioneta1.setTransmision(transmision);
		
		System.out.println("camioneta personalizada :");
        System.out.println("peso: " + camioneta1.getPeso());
        System.out.println("ancho: " + camioneta1.getAncho());
        System.out.println("color: " + camioneta1.getColor());
        System.out.println("asientos: " + camioneta1.getAsientos());
        System.out.println("traccion: " + camioneta1.getTraccion());
        System.out.println("transmision: " + camioneta1.getTransmision());
        
        System.out.println();
		
		}

	
	}
		

	


