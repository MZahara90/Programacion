package colections;

public class Jugador {
	// atributos
	private String nombreJugador;
	private int dorsal;
	private String nacionalidad;

	// constructores
	public Jugador() {
	}

	public Jugador(String nombreJugador, int dorsal,String nacionalidad) {

		this.nombreJugador = nombreJugador;
		this.nacionalidad=nacionalidad;
		this.dorsal = dorsal;
	}

	// getters y setters
	public String getNombreJugador() {
		return nombreJugador;
	}

	public void setNombreJugador(String nombreJugador) {
		this.nombreJugador = nombreJugador;
	}

	public int getDorsal() {
		return dorsal;
	}

	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	//toString
	@Override
	public String toString() {
		return "Jugador: nombreJugador=" + nombreJugador + ", dorsal=" + dorsal + ", nacionalidad=" + nacionalidad +"\n"; 
	}

}
