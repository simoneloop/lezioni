package lezioniCorsoJava.lezione5;

public class AlgoritmiDiOrdinamento {
	
	public static void main(String[]args) {
		int[]v={1,4,6,5,3,8,2,7,0,1};
		int x=7;
		insertionSort(v);
		for(int i=0;i<v.length;i++) {
			System.out.print(v[i]);
		}
	}
	static int[] bubbleSort(int[]a) {
		for(int j=a.length-1;j>=1;j--) {
			for(int i=0;i<j;i++) {
				if(a[i]>a[i+1]){//scambia a[i] e a[i+1] 
					int parcheggio=a[i];
					a[i]=a[i+1];
					a[i+1]=parcheggio;
				}
					
			}
		}
		return a;
	}
	//può essere ottimizzato in modo da fermarsi subito dopo una scansione che non ha portato nessuno scambio
	static int[] bubbleSortOttimizzazione(int[]a) {
		for(int j=a.length-1;j>=1;j--) {
			int scambi=0;
			for(int i=0;i<j;i++) {
				if(a[i]>a[i+1]){//scambia a[i] e a[i+1] 
					int parcheggio=a[i];
					a[i]=a[i+1];
					a[i+1]=parcheggio;
					scambi++;
				}		
			}
			if(scambi==0)break;
		}
		return a;
	}
	//si consideri tutto l'array: si cerca l'indice del massimo, quindi si scambiano il massimo con l'ultimo elemento.
	//a questo punto si prende in esame tutto l'array tranne l'ultimo elemento e si riapplica la tecnica.
	//si ripeto fino a che la parte da esaminare è costituita solo dal primo elemento dell'array
	static int[] selectionSort(int[]a) {
		for(int j=a.length-1;j>0;j--) {
			//cerca il massimo tra a[0]..a[j]
			int iMax=0;
			for(int i=1;i<=j;i++) {
				if(a[i]>a[iMax]) {
					iMax=i;
				}
			}
			//scambia a[imax]con a[j]
			int parcheggio=a[iMax];
			a[iMax]=a[j];
			a[j]=parcheggio;
		}
		return a;
	}
	//esso considera un elemento alla volta del vettore, sia x il generico elemento
	//e ricerca per esso la posizione corretta nella porzione dell'array a sinistra della posizione di x
	//sposta di un posto a destra immediatamente ogni elemento dell'array che risulti maggiore di x.
	//la posizione di inserimento è quella destra del primo elemento trovato non maggiore di x
	static int[] insertionSort(int []a) {
		for(int i=0;i<a.length;i++) {
			int x=a[i];
			int j=i;
			while(j>0 && a[j-1]>x) {
				a[j]=a[j-1];j--;
			}
			a[j]=x;
		}
		return a;
		
	}
	
	//nel caso peggiore ossia array iniziale ordinato nel modo opposto a quanto desiderato
	//tutti e tre i metodi di ordinamento hanno complessità quadratica O(n^2)
}
