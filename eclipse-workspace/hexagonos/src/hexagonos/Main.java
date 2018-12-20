package hexagonos;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	static LinkedList<String[]> list = new LinkedList<String[]>();
	
	public static void main(String[] args) {
		
		readList2();
		
		
		
	}
	
	public static void readList() {
		Scanner scanner = new Scanner(System.in);
		String linea;
		do {
			linea = scanner.nextLine();
			if (!linea.equals("0 0")) {
				list.add(linea.split(" "));
			}
			
		} while (!linea.equals("0 0"));
		scanner.close();
	}
	
	public static void readList2() {
		list.add(new String[] {"3", "*"});
		list.add(new String[] {"4", "p"});
	}
	
	public static void calcular() {
		
	}

}
