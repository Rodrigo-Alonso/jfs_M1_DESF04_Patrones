package cl.edutecno;

import java.util.Iterator;
import java.util.Scanner;

public class Patrones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese la cantidad de caracteres a mostrar");
		int n = scanner.nextInt();
		
		for (int i = 0; i < n; i++) {
			if (i%2 == 0) {
				System.out.print("*");
			}else {
				System.out.print(".");
			}
		}
		System.out.println("\n");
		for (int j = 5; j < n+5; j++) { //inicia a contar desde 5
			
			if (j%4 == 1) { //9%4 - 5%4 = 1
				System.out.print("1");
			}if (j%4 == 2) { //10%4 - 6%4 = 2
				System.out.print("2");
			}else if (j%4 ==3) { //11%4 - 7%4 = 3
				System.out.print("3");
			}else if (j%4 == 0) { //12%4 - 8/4 = 0
				System.out.print("4");
			}
		}
		System.out.println("\n");
		for (int k = 1; k < n+1; k++) {
			if (k%3 != 0) {
				System.out.print("|");
			} else {
				System.out.print("*");
			}
		}
		System.out.println("\n");
	}
}
