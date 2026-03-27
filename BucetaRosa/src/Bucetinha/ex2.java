package Bucetinha;

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float sal,somaSal=0,mediaSal,mediaNf,perc,maiorSal=0;
		int somaNf=0,x,Nf=0,cont100=0;
		
		Scanner leia = new Scanner(System.in);
		
		for(x=1;x<4;x++) {
			System.out.println("\nEntre com seu salario: ");
			sal = leia.nextFloat();
			somaSal += sal;
			somaNf += Nf;
			if(maiorSal < sal) {
				maiorSal = sal;
			}
			if(sal <=100) {
				cont100++;
			}
		}
		mediaSal = somaSal /4;
		mediaNf = somaNf /4;
		perc = (cont100 *100)/4;
		
		System.out.println("\nMédia salarial: " +mediaSal);
		System.out.println("Média de filhos é: "+mediaNf);
		System.out.println("\npercentual é: "+perc);

		
	}

}
