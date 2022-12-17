package zadaca1;

import java.util.ArrayList;
import java.util.List;

public class lekovi {

	public static void main(String[] args) {
		
		List<String> lekovi = new ArrayList<String>();
		lekovi.add("Aspirin");
		lekovi.add("Analgin");
		lekovi.add("Paracetamol");
		
		if (lekovi.get(lekovi.size() - 1).equals("Paracetamol")) {
			System.out.println("Lekot pomaga pri namaluvanje na telesnata temperatura");
		}
		else {
			System.out.println("Namenata na lekot e nepoznata");
		}

	}

}
