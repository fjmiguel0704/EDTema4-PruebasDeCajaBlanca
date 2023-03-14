package clases;

import java.util.Scanner;

public class CuentaImpares {
	public int cuentaImpares(int num) {
		int cuenta = 0;
		for (int i = 1; i < num; i++) {
			if (i % 2 == 1) {
				cuenta++;
			}
		}	
		return cuenta;
	}
	
	public static void main(String[] args) {
		int numero;
		
		CuentaImpares objeto = new CuentaImpares();
		
		Scanner read = new Scanner  (System.in);
		System.out.println("número: ");
		numero =read.nextInt();
		System.out.println(objeto.cuentaImpares(numero));
		
	}
}
