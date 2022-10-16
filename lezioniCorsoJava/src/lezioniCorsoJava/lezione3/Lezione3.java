package lezioniCorsoJava.lezione3;

import java.util.Scanner;

public class Lezione3 {
	
	
	public static void main(String[]args) {
		//spiegazione del perché serve la parentesi graffa
		System.out.println();
		int h=0;
		int k=0;
		
		if(h==0)
			h++;
			k++;
		System.out.println("h: "+h);
		System.out.println("k: "+k);
		for(int i=0;i<10;i++)
			h++;
			k++;
		System.out.println("h: "+h);
		System.out.println("k: "+k);
		
		
		//migliore do while
		
		//for
		//for(inizializzazione,condizione_di_continuazione;passo)
		//	istruzione;semplice o blocco
		//i primi cento numeri naturali
		for (int i=0;i<=100;i++) {
			System.out.println(i);
		}
		//somma dei primi cento numeri naturali
		int somma=0;
		for (int i=0;i<=100;i++) {
			somma+=i;
		}
		System.out.println(somma);
		
		//calcolo potenza
		System.out.println("calcolo della potenza p^n, p int, n int>=0");
		Scanner sc=new Scanner(System.in);
		System.out.print("p=");int p=sc.nextInt();
		System.out.print("n=");int n=sc.nextInt();
		int potenza=1, contatore=n;
		while(contatore>0) {
			potenza*=p;contatore--;
		}
		System.out.println(p+"^"+n+"="+potenza);
		//potenza ma con controlli
		System.out.println("potenza ma con controlli");
		System.out.print("p=");p=sc.nextInt();
		System.out.print("n=");n=sc.nextInt();
		if(p==0&&n==0) {
			System.out.println("0^0 forma indeterminata");
			System.exit(-1);
		}
		else if(n<0) {
			System.out.println("l'esponente n deve essere non negativo per semplicità");
			System.exit(-1);
		}

		long pp=(int)Math.pow(p,n);
		System.out.println(p+"^"+n+"="+pp);
	}

}
