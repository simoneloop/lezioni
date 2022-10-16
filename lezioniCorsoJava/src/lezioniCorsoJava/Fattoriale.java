package lezioniCorsoJava;
import java.util.*;

public class Fattoriale {
	public static void main(String[]args) {
		System.out.println("calcolo del fattoriale di un intero n non negativo");
		Scanner s=new Scanner(System.in);
		System.out.print("n(>=0)");
		int n=s.nextInt();
		int fattoriale=1;
		int i=2;
		while(i<=n) {
			fattoriale=fattoriale*i;
			i++;
		}
		System.out.println(n+"! ="+fattoriale);
		
		//////////////////////////////////////oppure con un ciclo
		fattoriale=1;
		for(i=2;i<=n;i++) {
			fattoriale=fattoriale*i;
		}
		System.out.println(n+"! ="+fattoriale);
		//////////////////////////////////////oppure tramite un metodo
		fattoriale=fattoriale(n);
		System.out.println(n+"! ="+fattoriale);

	}
	
	public static int fattoriale(int n) {
		int fattoriale=1;
		for(int i=2;i<=n;i++) {
			fattoriale=fattoriale*i;
		}
		return fattoriale;
	}

	//un metodo (o funzione) è un sottoprogramma che ha un nome, può ricevere 0, uno o più parametri
	//restituisce void o un risultato. I parametri passati sono a tutti gli effetti variabili locali che si aggiungono
	//alle variabili proprie, eventualmente introdotte dal metodo
}
