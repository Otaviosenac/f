package Bucetinha;

import java.util.Scanner;

public class ExemploFor1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num,a,cont=0;
		
		
		Scanner leia = new Scanner(System.in);

		
		for (a=1;a<=5;a++) {
			System.out.println("\nEntre com o valor "+a+":");
			num = leia.nextInt();
			if(num<0) {
				cont++;
				}
				
			}
			System.out.println("\nNumeros negativos: "+cont++);
		}
	}


