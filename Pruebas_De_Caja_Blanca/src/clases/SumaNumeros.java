package clases;

import java.util.Scanner;

public class SumaNumeros {
	public int sumaNumeros(int num) {
		int suma = 0;
		for (int i = 1; i <= num; i++) {
			if(i%2==0) {
				suma += i;
			}
		}
		return suma;
	}
	
	public static void main(String[] args) {
		int numero;
		
		SumaNumeros objeto = new SumaNumeros();
		
		Scanner read = new Scanner  (System.in);
		System.out.println("número: ");
		numero =read.nextInt();
		System.out.println(objeto.sumaNumeros(numero));
		
	}
}
