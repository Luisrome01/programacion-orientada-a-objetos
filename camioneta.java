
	public class camioneta {
	
		
		private String modelo;
		private int ancho;
		private int largo;
		private int peso;
		private String capacidadCarga;
		private String color; 
		private String transmision;
		private String traccion;
		private String asientos;
		


		public camioneta() {
			peso= 500;
			ancho= 300;
			largo=1500;
		}
		
	
		public String getModelo() {
			return modelo;
		}

		public void setModelo(String modelo) {
			this.modelo = modelo;
		}
		
		public  int getAncho() {
			return ancho;
		}

		public void setAncho(int ancho) {
			this.ancho = ancho;
		}

		public int getLargo() {
			return largo;
		}

		public void setLargo(int largo) {
			this.largo = largo;
		}

		public int getPeso() {
			return peso;
		}

		public void setPeso(int peso) {
			this.peso = peso;
		}

		public String getCapacidadCarga() {
			return capacidadCarga;
		}

		public void setCapacidadCarga(String capacidadCarga) {
			this.capacidadCarga = capacidadCarga;
		}

		public String getColor() {
			return color;
		}

		public void setColor(String color) {
			this.color = color;
		}

		public String getTransmision() {
			return transmision;
		}

		public void setTransmision(String transmision) {
			this.transmision = transmision;
		}
		
		public String getTraccion() {
			return traccion;
		}

		public void setTraccion(String traccion) {
			this.traccion = traccion;
		}

		public String getAsientos() {
			return asientos;
		}

		public void setAsientos(String asientos) {
			this.asientos = asientos;
		}
		
		public static void dameCaracteristicasGenerales(String modelo, String ancho, String largo, String peso, String capacidadCarga, String color, String transmision, String asientos, String traccion) {
			System.out.println("Estas son las caracteristicas:");
			
			
			return ;
		}
		
}
