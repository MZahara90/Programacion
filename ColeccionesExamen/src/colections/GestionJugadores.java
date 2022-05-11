package colections;

import java.util.*;

public class GestionJugadores {

	static LinkedList <Jugador> jugadores= new LinkedList<Jugador>();
	
	public static void addBeginning(Jugador j) {
		jugadores.addFirst(j);
	}
	
	public static void addEnd(Jugador j) {
		jugadores.addLast(j);
	}
	
	public static void ordenarPorDorsal() {
		Collections.sort(jugadores, new Comparando());
		}
	
	
	public static int cuentaJugadoresNacionalidad(String nacionalidad) {
		
		Iterator <Jugador> it= jugadores.iterator();
		int counter=0;
		while(it.hasNext()) {
			Jugador j= it.next();
			if(j.getNacionalidad().compareToIgnoreCase(nacionalidad)==0) {
				counter++;
			}
		}
		return counter;
	}
}
