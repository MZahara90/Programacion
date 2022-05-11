package colections;

public class Main {

	public static void main(String[] args) {
		
		GestionJugadores.addBeginning(new Jugador("Pepe",22,"Española"));
		GestionJugadores.addBeginning(new Jugador("Renoir",99,"Francesa"));
		GestionJugadores.addEnd(new Jugador("Francesco",13,"Italiana"));
		GestionJugadores.addBeginning(new Jugador("Adrien",11,"Francesa"));
		GestionJugadores.addEnd(new Jugador("Giacomo",70,"Italiana"));
		GestionJugadores.addBeginning(new Jugador("Luis",2,"Española"));
		GestionJugadores.addBeginning(new Jugador("Francisco",55,"española"));
		
		System.out.println(GestionJugadores.jugadores);
		
		System.out.println("Numero de jugadores españoles= "+ GestionJugadores.cuentaJugadoresNacionalidad("Española"));
		System.out.println("Numero de jugadores españoles= "+ GestionJugadores.cuentaJugadoresNacionalidad("italiana"));
		System.out.println("Numero de jugadores españoles= "+ GestionJugadores.cuentaJugadoresNacionalidad("francesa"));

		GestionJugadores.ordenarPorDorsal();
		System.out.println(GestionJugadores.jugadores);
		
		
		
	}

}
