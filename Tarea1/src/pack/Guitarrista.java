package pack;

public class Guitarrista  extends Musico {
	
	String instrumento;

	public Guitarrista(String nombre, String edad, String instrumento) {
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
		return "El baterista toca la "+getInstrumento()+"\n";
	}
	
	public void mostrar() {
		System.out.println("\nNombre: "+getNombre()+"\nEdad: "+getEdad()+"\nInstrumento que toca: "+getInstrumento());
	}
}
