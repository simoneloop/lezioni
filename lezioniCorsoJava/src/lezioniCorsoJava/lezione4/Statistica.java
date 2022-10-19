package lezioniCorsoJava.lezione4;
import java.util.*;
public class Statistica {
	//la seguente classe legge un intero n e quindi legge n voti universitari, calcola e stampa:
//	il voto min
//	il voto max
//	il voto medio
//	la moda
//	la deviazione standard
	static Scanner sc=new Scanner(System.in);//scanner globale
	
	public static void main(String[]args) {
		System.out.println("Statistica voti di un campione di studenti");
		System.out.println("Quanti studenti?");
		int n=sc.nextInt();
		int voti[]=new int[n];
		leggiVoti(voti);
		int min=trovaMin(voti);
		int max=trovaMax(voti);
		float media=trovaMedia(voti);
		int moda=calcolaModa(voti);
		
		scriviRisultati(n,min,max,media,moda);
	}
	static void leggiVoti(int [] voti) {
		//per semplicità non facciamo controlli
		System.out.println("Fornire "+voti.length+" voti tra 18 e 30");
		for (int i=0;i<voti.length;i++) {
			voti[i]=sc.nextInt();
		}
	}
	static int trovaMin(int[]v) {
		int min=v[0];
		for(int j=1;j<v.length;j++) {
			if(v[j]<min) {
				min=v[j];
			}
		}
		return min;
	}
	static int trovaMax(int []v) {
		int max=v[0];
		for(int j=1;j<v.length;j++) {
			if(v[j]>max) {
				max=v[j];
			}
		}
		return max;
	}
	static float trovaMedia(int[]v) {
		float media=0f;
		for(int i=0;i<v.length;i++) {
			media+=v[i];
		}
		return media/v.length;
		
	}
	static int trovaModa(int[]v) {
		int frequenze[]=new int[13];
		//frequenze[0]= numero dei 18, frequenze[1]=numero dei 19 e così via
		//azzeriamo i contatori delle frequenze
		for(int i=0;i<frequenze.length;i++) {
			frequenze[i]=0;
		}
		for(int i=0;i<v.length;i++) {
			frequenze[v[i]-18]++;
		}
		//troviamo la frequenza massima
		int max=frequenze[0];
		int indiceMax=0;
		for(int i=0;i<frequenze.length;i++) {
			if(frequenze[i]>max) {
				max=frequenze[i];
				indiceMax=i;
			}
		}
		return indiceMax+18;
	}
	
	static int calcolaModa(int []v) {
		//ipotesi v contiene almeno un voto
		int fMax=1,moda=0;
		for(int i=0;i<v.length;i++) {
			int fCorr=1;//frequenza di v[i]
			for(int j=i+1;j<v.length;j++) {
				if(v[i]==v[j]) {
					fCorr++;
				}
			}
			if(fCorr>fMax) {
				fMax=fCorr;
				moda=v[i];
			}
		}
		return moda;
	}
	static void scriviRisultati(int n, int min, int max, float media, int moda) {
		System.out.println("min: "+min);
		System.out.println("max: "+max);
		System.out.println("media: "+media);
		System.out.println("moda: "+moda);
		
	}
	
}
