package application;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Program {

	public static void main(String[] args) {
		
		Set<String> set1 = new HashSet<>(); // Implementação HashSet é a mais rapida, mas não ordenada
		Set<String> set2 = new LinkedHashSet<String>(); // Intermediário, porém segue a ordem dos valores inseridos
		Set<String> set3 = new TreeSet<String>(); // Lento, mas fica em ordem alfabética
		
		// HashSet - não ordena os valores, podendo mudar ao longo do tempo, independente da ordem de inserção abaixo
		set1.add("Notebook");
		set1.add("Tv"); 
		set1.add("Tablet");
		
		// LinkedHashSet - 
		set2.add("Notebook");
		set2.add("Tv"); 
		set2.add("Tablet");
		
		// TreeSet - 
		set3.add("Notebook");
		set3.add("Tv"); 
		set3.add("Tablet");
		
		// HashSet
		readSets(set1,"HashSet: ");
		
		// LinkedHashSet - Velocidade intermediaria, mas ordena os dados como foi adicionado
		readSets(set2,"LinkedHashSet: ");
		
		// TreeSet - Ordena os dados utilizando compareTo em ordem alfabética, mas é lento.
		readSets(set3,"TreeSet: ");
		
		set1.remove("Notebook"); // Remove apenas o objeto informado
		set2.removeIf(x -> x.equals("Tv")); // Remove tudo que for igual Tv
		set3.removeIf(x -> x.length() >= 3);// Remove tudo que tiver 3 ou mais caracteres
		set1.removeIf(z -> z.charAt(0) == 'N'); // Remove tudo que possui o primeiro caracter N
		
		
		
		// HashSet
		readSets(set1,"HashSet: ");
		
		// LinkedHashSet - Velocidade intermediaria, mas ordena os dados como foi adicionado
		readSets(set2,"LinkedHashSet: ");
		
		// TreeSet - Ordena os dados utilizando compareTo em ordem alfabética, mas é lento.
		readSets(set3,"TreeSet: ");
		
//		-------------------------------------------------------------
//		HashSet: Tv
//		HashSet: Notebook
//		HashSet: Tablet
//		-------------------------------------------------------------
//		LinkedHashSet: Notebook
//		LinkedHashSet: Tv
//		LinkedHashSet: Tablet
//		-------------------------------------------------------------
//		TreeSet: Notebook
//		TreeSet: Tablet
//		TreeSet: Tv
//		-------------------------------------------------------------
//		HashSet: Tv
//		HashSet: Tablet
//		-------------------------------------------------------------
//		LinkedHashSet: Notebook
//		LinkedHashSet: Tablet
//		-------------------------------------------------------------
//		TreeSet: Tv
		
		Set<Integer> int1 = new TreeSet<Integer>(Arrays.asList(0,2,5,6,7,8,9));
		Set<Integer> int2 = new TreeSet<Integer>(Arrays.asList(1,5,6,10,8,9,4));

		// Adicionar todos sem repetição e de forma ordenada.
		Set<Integer> intTransfer1 = new TreeSet<Integer>(int1);
		intTransfer1.addAll(int2);
	
		System.out.println("-------------------------------------------------------------");

		System.out.println(intTransfer1);
		
		// Remove do conjunto os elementos que não estão no parametro e mantem o restante
		// Mantem apenas os 
		Set<Integer> intTransfer2 = new TreeSet<Integer>(int1);
		intTransfer2.retainAll(int2);
	
		System.out.println(intTransfer2);
		
		// Remove do conjunto os elementos contidos em int2
		Set<Integer> intTransfer3 = new TreeSet<Integer>(int1);
		intTransfer3.removeAll(int2);
	
		System.out.println(intTransfer3);	
		
	}
	
	public static void readSets(Set<String> list, String typ) {
		
		System.out.println("-------------------------------------------------------------");
		for (String string : list) {
			System.out.println(typ + string);
		}
	}
}