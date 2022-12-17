package zadaca3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Glavna {

	public static void main(String[] args) {

		List<SportskiKlub> lista= new ArrayList <SportskiKlub>();
		
		lista.add(new SportskiKlub ("Vardar", "Rakomet", 14));
		lista.add(new SportskiKlub ("Partizan", "Kosarka", 10));
		lista.add(new SportskiKlub ("Barcelona", "Fudbal", 15));
		
		Collections.sort(lista);
		for (SportskiKlub x : lista) {
			System.out.println(x.getKlub());
			System.out.println(x.getSport());
			System.out.println(x.getClenovi());

		}

	}

}
