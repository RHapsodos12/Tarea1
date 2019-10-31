package pack;

public class Cantante extends Musico {
	
	String instrumento;
	
	public Cantante(String nombre, String edad, String instrumento) {
		super(nombre, edad);
		// TODO Auto-generated constructor stub
		this.instrumento=instrumento;
	}

	public String getInstrumento() {
		return instrumento;
	}

	@Override
	public String tocar() {
		// TODO Auto-generated method stub
		return "El Cantante usa el "+getInstrumento()+"\nMa Ma Ma Ma Ma Marrano"+"\n";
	}
	
	public void mostrar() {
		System.out.println("\nNombre: "+getNombre()+"\nEdad: "+getEdad()+"\nInstrumento que toca: "+getInstrumento());
	}
}
