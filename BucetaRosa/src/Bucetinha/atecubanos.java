package Bucetinha;

import java.util.Scanner;

public class atecubanos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float n1,n2,n3,media,somaMedia=0,mg;
		int x;
		
		Scanner leia = new Scanner(System.in);
		
		for (x=1;x<=5;x++) {
			System.out.println("\nEntre com a primeira nota do aluno "+x+": ");
			n1 = leia.nextFloat();
			System.out.println("\nEntre com a segunda nota do aluno "+x+": ");
			n2 = leia.nextFloat();
			System.out.println("\nEntre com a terceira nota do aluno "+x+": ");
			n3 = leia.nextFloat();
			media = (n1+n2+n3)/3;
			System.out.println("\nMédia do aluno "+x+": "+media);
			somaMedia += media; //somaMedia = somaMedia + media
			if(media>=6 && media<=10) {
				System.out.println("\nAluno aprovado!!");
			}else if(media>=4 && media<6) {
				System.out.println("\nAluno de exame");
			}else {
				System.out.println("\nAluno Reprovado!!!!!!!");
			}
	}
	mg = somaMedia / 5;
	System.out.println("\nMédia geral da turma: "+mg);


}
}
