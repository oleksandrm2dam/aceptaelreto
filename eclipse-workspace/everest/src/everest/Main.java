package everest;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	
	static LinkedList<int[]> list = new LinkedList<int[]>();
	
	public static void main(String[] args) {
		
		list = readList2();
		
		int[][] calculo = calcular();
		for(int i = 0; i < calculo.length; ++i) {
			System.out.println(calculo[i][0] + " " + calculo[i][1] + " " + calculo[i][2]);
		}
	}
	
	public static void readList() {
		Scanner scanner = new Scanner(System.in);
		String[] lectura;
		String longitud;
		do {
			longitud = scanner.nextLine();
			if(!longitud.equals("0")) {
				lectura = scanner.nextLine().split(" ");
				int[] temp = new int[lectura.length];
				for(int i = 0; i < lectura.length; ++i) {
					temp[i] = Integer.parseInt(lectura[i]);
				}
				list.add(temp);
			}
		} while (!longitud.equals("0"));
		scanner.close();
	}
	
	public static int[][] calcular() {
		int[][] output = new int[list.size()][3];
		int i = 0;
		for(int[] arr : list) {
			int numGrupos = 0, menorGrupo= arr.length, mayorGrupo=-1, aux = 1;
			
			for(int j = 1; j < arr.length; ++j) {
				
				if(arr[j] < arr[j - 1]) {
					numGrupos++;
					if(aux < menorGrupo) {
						menorGrupo = aux;
					}
					if(aux > mayorGrupo) {
						mayorGrupo = aux;
					}
					aux = 1;
				} else {
					++aux;
				}
			}
			numGrupos++;
			if(aux < menorGrupo) {
				menorGrupo = aux;
			}
			if(aux > mayorGrupo) {
				mayorGrupo = aux;
			}
			
			output[i] = new int[] {numGrupos, menorGrupo, mayorGrupo};
			++i;
		}
		return output;
	}
	
	public static LinkedList<int[]> readList2() {
		LinkedList<int[]> list = new LinkedList<int[]>();
		list.add(new int[] {10, 11, 4, 5, 6, 1});
		list.add(new int[] {10, 15, 18, 2, 4, 6, 20});
		return list;
	}

}
