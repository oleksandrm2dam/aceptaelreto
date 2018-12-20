package everest;

import java.util.LinkedList;
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		calcular(readList2());	
	}
	
	public static void calcular(LinkedList<String[]> list) {
		StringBuilder sb = new StringBuilder();
		int numGrupos, menorGrupo, mayorGrupo, grupoActual;
		for(String[] arr : list) {
			numGrupos = 0;
			menorGrupo = arr.length;
			mayorGrupo = 0;
			grupoActual = 0;
			
			for(int j = 0; j < arr.length; ++j) {
				if(j == 0) {
					++grupoActual;
				} else {
					if(Integer.parseInt(arr[j - 1]) <= Integer.parseInt(arr[j])) {
						++grupoActual;
					} else {
						++numGrupos;
						if(grupoActual > mayorGrupo) {
							mayorGrupo = grupoActual;
						}
						if(grupoActual < menorGrupo) {
							menorGrupo = grupoActual;
						}
						grupoActual = 1;
					}
				}
			}
			++numGrupos;
			if(grupoActual > mayorGrupo) {
				mayorGrupo = grupoActual;
			}
			if(grupoActual < menorGrupo) {
				menorGrupo = grupoActual;
			}
			
			sb.append(numGrupos + " " +  menorGrupo + " " +  mayorGrupo + "\n");
		}
		System.out.print(sb.toString());
	}

	public static LinkedList<String[]> readList() {
		Scanner scanner = new Scanner(System.in);
		LinkedList<String[]> list = new LinkedList<String[]>();
		
		boolean hasNext = true;
		String answ;
		do {
			answ = scanner.nextLine();
			if(answ.equals("0")) {
				hasNext = false;
			} else {
				list.add(scanner.nextLine().split(" "));
			}
		} while (hasNext);
		
		scanner.close();
		return list;
	}
	
	public static LinkedList<String[]> readList2() {
		LinkedList<String[]> list = new LinkedList<String[]>();
		list.add(new String[] {"10", "11", "4", "5", "6", "1"});
		list.add(new String[] {"10", "15", "18", "2", "4", "6", "20"});
		return list;
	}
	
}
