package everest;

import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numGrupos, menorGrupo, mayorGrupo, actualGrupo, actualLider;
		do {
			if(scanner.nextLine().equals("0")) break;
			
			String[] arr = scanner.nextLine().split(" ");
			numGrupos = 0;
			mayorGrupo = 0;
			actualGrupo = 1;
			menorGrupo = arr.length;
			actualLider = 0;
			
			for(int i = 1; i < arr.length; ++i) {
				if(Integer.parseInt(arr[i]) < Integer.parseInt(arr[actualLider])) {
					++numGrupos;
					if(actualGrupo > mayorGrupo) {
						mayorGrupo = actualGrupo;
					}
					if(actualGrupo < menorGrupo) {
						menorGrupo = actualGrupo;
					}
					actualLider = i;
					actualGrupo = 1;
				} else {
					++actualGrupo;
				}
			}
			++numGrupos;
			if(actualGrupo > mayorGrupo) {
				mayorGrupo = actualGrupo;
			}
			if(actualGrupo < menorGrupo) {
				menorGrupo = actualGrupo;
			}
			
			System.out.print(numGrupos + " " +  menorGrupo + " " +  mayorGrupo + "\n");
		} while (true);
		
		scanner.close();
	}	

}
