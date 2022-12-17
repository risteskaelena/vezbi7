package zadaca2;

import java.util.ArrayList;
import java.util.List;

public class Glavna {

	public static void main(String[] args) {

		MetodiZaListaNiza objekt = new MetodiZaListaNiza();
		
		List<String> lista = new ArrayList<String>();
		lista.add("Crvena");
		lista.add("Zelena");
		objekt.listaVoNiza(lista);
		
		String[] niza = {"eden", "dva", "tri"};
		objekt.nizaVoLista(niza);
	}

}
