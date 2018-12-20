package hexagonos;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String answ;
		String[] arr;
		String dibujo;
		int n;
		String chara;
		do {
			answ = scanner.nextLine();
			if (!answ.equals("0 0")) {
				arr = answ.split(" ");
				n = Integer.parseInt(arr[0]);
				chara = arr[1];
				dibujo = "";
				for(int i = 0; i < n; ++i) {
					for(int j = 0; j < (n - 1) - i; ++j) {
						dibujo += " ";
					}
					for(int j = 0; j < n + i * 2; ++j) {
						dibujo += chara;
					}
					for(int j = 0; j < (n - 1) - i; ++j) {
						dibujo += " ";
					}
					dibujo += "\n";
				}
				
				for(int i = 1; i < n; ++i) {
					for(int j = 0; j < n + i * 2; ++j) {
						dibujo += " ";
					}
					dibujo += "p";
					dibujo += "\n";
				}
				
				System.out.print(dibujo);
			}
		} while (!answ.equals("0 0"));
		
		scanner.close();
	}

}
