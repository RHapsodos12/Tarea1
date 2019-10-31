package pack;

public abstract class Musico {
	
	String nombre;
	String edad;
	
	public Musico(String nombre, String edad) {
		
		this.nombre = nombre;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public String getEdad() {
		return edad;
	}
	
	public abstract String tocar();
}
