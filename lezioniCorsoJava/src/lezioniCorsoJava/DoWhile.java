package lezioniCorsoJava;

import java.util.Scanner;



//esempio migliore del do while
public class DoWhile {

	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int numero;
		do {
			int max=10;
			int random=(int)(Math.random()*max)+1;
		
			System.out.println("sto pensando ad un numero tra 1 e "+max);
			System.out.println("qual è?");
			int risposta=sc.nextInt();
			if(random==risposta) {
				System.out.println("bravo!");
			}
			else {
				System.out.println("oh no ho pensato a: "+random+" ritenta sara più fortunato");
			}
			System.out.print("inserisci un numero >0 per rigiocare: ");
			numero=sc.nextInt();
		}
		while(numero>0);
	}

}
