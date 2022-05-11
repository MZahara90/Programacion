package colections;

import java.util.*;

public class Comparando implements Comparator<Jugador>{

	@Override
	public int compare(Jugador j1, Jugador j2) {
		
		if(j1.getDorsal()>j2.getDorsal()) {
			return 1;
		}else if (j1.getDorsal()==j2.getDorsal()) {
			return 0;
		}else {
			return -1;
		}

	}

}
