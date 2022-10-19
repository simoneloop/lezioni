package lezioniCorsoJava.lezione4;
import java.util.*;
public class Array {
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		//Strutture dati nonchè la più semplice
		//Un array monodimensionale è un collezione omogenea di dati
		int []a=new int[5];
		//a è un puntatore che punta alla prima cella di a facendo [indice] si moltiplica il puntatore che avanza di indice*byte occupati alla volta in memoria
		a[0]=0; //pone 0 nel primo elemento
		for(int i=0;i<a.length;i++) {
			a[0]=0;
		}
		//a.length restituisce la capacità o dimensione dell'array. Gli indici validi vanno da 0 a a.length-1
		
		//altro esempio di inizializzazione
		for(int i=0;i<a.length;i++) {
			a[i]=i*2+1;//tutti i numeri dispari
		}
		//il contenuto dell'array a può essere letto da input mediante uno scanner sc
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		//la scrittura su output del contenuto si può ottenere come segue:
		for(int j=0;j<a.length;j++) {
			System.out.print(a[j]+" ");
		}
		//può essere letto all'inverso
		for(int i=a.length-1;i>=0;i--) {
			System.out.println(a[i]+" ");
		}
		//l'utilizzo di un indice esterno all'intervallo [0,a.length-1]solleva l'eccezione IndexOutOfBoundsException che di norma arresta l'esecuzione del programma
		//altri esempi di array:
		double x[]=new double[10];
		boolean map[]=new boolean[10];
		char []c=new char[10];
		
		//il tipo degli elementi di un array può essere un qualsiasi tipo o classe java
		
		String[]mesi= {"gennaio","febbraio","marzo","aprile","maggio","giugno","luglio","agosto","settembre","ottobre","novembre","dicembre"};
		Random randomGen=new Random();
		System.out.println(mesi[randomGen.nextInt(12)+1]);
		
		//ricerca lineare
		
		//classe statistica
	}
	static int RicercaLineare(int[]v,int x) {
		int i=-1;
		for(int j=0;j<v.length;j++) {
			if(v[j]==x) {
				i=j;
			}
		}
		return i;
	}
	
	static int altraRicercaLineare(int []v,int x) {
		//ritorna l'indice di v dove è presente x
		//o -1 se non è presente
		int i=0;
		while(i<v.length && v[i]!=x) {
			i++;
		}
		if(i<v.length)return i;
		return -1;
	}
	
}
