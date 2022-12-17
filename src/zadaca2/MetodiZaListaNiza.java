package zadaca2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MetodiZaListaNiza {

	public void listaVoNiza (List<String> lista) {
		
		String[] niza = new String [lista.size()];
		lista.toArray(niza);
		System.out.println("Lista vo niza:");
		for (String x : niza) {
			System.out.println(x);
		}
		
	}
		public void nizaVoLista (String[] niza) {
			
		List<String> lista = new ArrayList<String>();
		lista = Arrays.asList(niza);
		System.out.println("Niza vo lista:");
		for (String x : lista) {
			System.out.println(x);
		}
	}
}
