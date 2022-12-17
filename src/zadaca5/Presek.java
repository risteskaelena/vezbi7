package zadaca5;

import java.util.Set;
import java.util.TreeSet;

public class Presek {

	public static void main(String[] args) {

		Set <String> mnozestvoA = new TreeSet<String>();
		mnozestvoA.add("Eden");
		mnozestvoA.add("Dva");
		mnozestvoA.add("Tri");

		Set <String> mnozestvoB = new TreeSet<String>();
		mnozestvoB.add("Cetiri");
		mnozestvoB.add("Dva");
		mnozestvoB.add("Pet");
		
		System.out.println("Presek:");
		mnozestvoA.retainAll(mnozestvoB);
		System.out.println(mnozestvoA);
		
	}

}
