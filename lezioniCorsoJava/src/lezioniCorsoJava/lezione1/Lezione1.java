package lezioniCorsoJava.lezione1;
import java.util.*;
public class Lezione1 {
//	tipi di base
//	
//	interi:
//		int
//		long
//	
//	reali:
//		float
//		double
//		sono la stessa cosa ma i double con 15 rispetto le 7 cifre significative
//	
//	non numerici:
//		boolean
//		char
		
	
	//sysout then ctrl space
	
	public static void main(String[]args) {
		int a,b,c; //dichiarate ma non inizializzate
//		long maxLong=4294967295L;
//		System.out.println(maxInt);
		
		a=3;b=1;c=1;//inizializzazione successiva
		
		double d=3.4;
		float f=3.14f;
		
		
		//conversione di tipo e casting
		
		//a=3.4;errore
		a=(int)3.442;
		
		//System.out.print printa con ln printa e va a capo
		System.out.println(a);
		
		
		System.out.println(a++);//darà 3 nel print ma verrà eseguita l'operazione
		
		System.out.println(a);
		
		System.out.println(++a);//verrà prima eseguita l'operazione e poi printato il valore
		
		int y=10/8;
		System.out.println(y);// "/" calcola il quoziente della divisione 
		
		y=10%8;
		System.out.println(y);// "%" calcola il resto della divisione
		
		//se lavoro in double 
		
		double g=10.0/8;//se divido double per un intero allora me lo da float
		System.out.println(g);

		//operatori booleani e corto circuito
		// si inserisce && due volte in modo da creare il corto circuito e non analizzare la seconda condizione
		a=0;
		if(a>0&& 8/a>1)//si interrompe alla prima condizione perché non superiore a 0
			System.out.print("ok");
	
//		if(a>0 & 8/a>1)//errore perché non interrompendosi divide anche 8per 0
//			System.out.print("ok");
		
		//lo stesso discorso vale per l'or || 
		a=-1;
		if(a<0 || Math.sqrt(a)>1) {
			System.out.println("radice di a >1");
			
		}
		
		
		//valori booleani
		//possono essere assegnati direttamente
		boolean maschio=true;
		
		//indirettamente
		
		int eta=19;
		boolean isMajor=eta>18;
		
		boolean majorMale= maschio && isMajor;
		System.out.println("è maschio e maggiorenne? "+majorMale);
		
		//classe Math
//		esponenziale exp(x);
//		logaritmo log(x);
//		potenza pow(x,y);
//		
//		arrotondamento
//		inferiore ceil(x);
//		superiore floor(x);
//		normale round(x);
//		
//		valore assoluto abs(x);
//		massimo e minimo max(x,y), min(x,y);
//		numero casuale random(); così solo un numero compreso tra [0,1)
		System.out.println("il maggiore tra 2 e 3 è: "+ Math.max(2, 3));
		System.out.println(Math.random());
		
		//espressioni e assegnazioni
		a=1;
		b=2;
		c=3;
		//si realizza prima il prodotto per la equipriorità si va da sinistra a destra
		int espressione= a+b*c-2;
		System.out.println(espressione);
		
		//classe scanner classe principale e basilare per l'io import java.util.* la importa
		Scanner s=new Scanner(System.in);//per leggere da tastiera;
		System.out.println("leggiamo e stampiamo qualcosa, inserisci un intero:");
		int input=s.nextInt();//anche nextdouble 
		System.out.println("il numero che hai inserito è: "+input);
		boolean next=s.hasNext();
		System.out.println("ancora: "+next);
		
		//blocco istruzioni
//		{istruzione1;istruzione2;}
		//if else
		
//		if(condizione) {
//			then
//		}
//		else {}
//		può esserci o meno la parentesi graffa solo se ha una istruzione, può esserci o meno la parte else
		
		//scriviamo un codice che "pensa" ad un numero da 1 a 10 e noi dobbiamo indovinarlo
		Scanner sca=new Scanner(System.in);
		int Max=10;
		int indovina=(int)(Math.random()*Max)+1;//perché 1 è escluso
		System.out.println("sto pensando ad un numero tra 1 e "+Max);
		System.out.println("qual è?");
		int risposta=sca.nextInt();
		if(indovina==risposta)
			System.out.println("wow allora sei un mago!");
			
		else
			System.out.println("oh no, era: "+indovina+" ritenta sarai più fortunato");
		
		//esercizio a casa per la prima parte: scrivere un programma che stampa su console x,y(interi da 0 a 10) random, prende in input z
		//stampa "true" solo se z=x+y altrimenti false
	}
}
