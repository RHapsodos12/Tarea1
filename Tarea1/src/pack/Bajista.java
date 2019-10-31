package pack;

public class Bajista extends Musico {

	String instrumento;
	
	public Bajista(String nombre, String edad, String instrumento) {
		
		super(nombre, edad);
		this.instrumento=instrumento;
	}
	
	public String getInstrumento() {
		return instrumento;
	}

	@Override
	public String tocar() {
		// TODO Auto-generated method stub
		return "El bajista toca el "+getInstrumento()+"\n";
	}
	
	public void mostrar() {
		System.out.println("\nNombre: "+getNombre()+"\nEdad: "+getEdad()+"\nInstrumento que toca: "+getInstrumento());
	}
}
