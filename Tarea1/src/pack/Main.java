package pack;

public class Main {

	public static void main(String[] args) {
		
		//Declaracion del objeto Bajista
		Bajista bajista=new Bajista("Wilson","17 años","Bajo");
		bajista.mostrar();
		System.out.print(bajista.tocar());
		
		//Declaracion del objeto Baterista
		Baterista baterista=new Baterista("Drake Bell","24 años","Bateria");
		baterista.mostrar();
		System.out.print(baterista.tocar());
		
		//Declaracion del objeto Cantante
		Cantante cantante=new Cantante("Michael Jordan","12 años","Microfono");
		cantante.mostrar();
		System.out.print(cantante.tocar());
		
		//Declaracion del objeto Guitarrista
		Guitarrista guitarrista=new Guitarrista("Steven","23 años","Guitarra");
		guitarrista.mostrar();
		System.out.print(guitarrista.tocar());
	}
}
