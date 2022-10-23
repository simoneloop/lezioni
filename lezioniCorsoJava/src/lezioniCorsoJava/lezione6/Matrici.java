package lezioniCorsoJava.lezione6;
import java.util.*;
public class Matrici {
	public static void main(String[]args) {
		
		//un oggetto array bidimensionale si introduce come segue
		
		int[][] m=new int[3][3];
		//4 è il numero delle righe 6 il numero delle colonne quindi
		//si tratta di una matrice rettangolare 4x6
		//un array bidimensionale è un array di array, ossia un array
		//in cui ogni elemento è a sua volta un array monodimensionale
		
		
		//azzeramento del contenuto di m
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				m[i][j]=0;
			}
		}
		//equivalente
		for(int i=0;i<m.length;i++) {
			for(int j=0;j<m[0].length;j++) {//si suppone che m[0].length==m[i].length
				m[i][j]=0;
			}
		}
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<m.length;i++) {
			for(int j=0;j<m[0].length;j++) {
				m[i][j]=sc.nextInt();
			}
		}
		
		//scrittura del contenuto per righe
		System.out.print("[");
		for(int i=0;i<m.length;i++) {
			System.out.print("[");
			for(int j=0;j<m[0].length;j++) {
				System.out.print(m[i][j]);
			}
			System.out.print("]");
			if(i<m[0].length-1) {
				System.out.print(",");
				System.out.println();
				

			}
		}
		System.out.println("]");
	
		//puntualizzazioni
		//m[i][j] denota l'elemento in riga i e colonna j
		//m[i] denota un'intera riga ossia un array monodimensionale
		//m.length dà il numero delle righe
		//m[0].length o m[i].length restituiscono il numero di elementi della riga 0-i di m
		//come per i vettori anche le matrici possono essere create ed inizializzate "al volo"
		int [][]m1= {{1,2,3},{4,5,6} };
		int [][]m2= {{3,2,1},{6,5,4} };
		
		//costruzione di una matrice identità
		for(int i=0;i<m.length;i++) {
			for(int j=0;j<m[0].length;j++) {
				m[i][j]=(i==j)?1:0;
			}
		}
		int[][]s=new int[m1.length][m1.length];
		int[][]p=new int[m1.length][m1.length];
		
		//matrice somma
		for(int i=0;i<s.length;i++) {
			for(int j=0;j<s[i].length;j++) {
				s[i][j]=m1[i][j]+m2[i][j];
			}
		}
		
		//matrice prodotto
		//per essere compatibili alla moltiplicazioni due matrici: le colonne della prima devono essere
		//= alle righe della seconda
		if(m1[0].length!=m2.length) {
			System.out.println("matrici incompatibili");
			System.exit(-1);
		}
		for(int i=0;i<s.length;i++) {
			for(int j=0;j<s[i].length;j++) {
				int res=0;
				for(int k=0;k<p.length;k++) {
					res=res+m1[i][k]*m2[k][j];
				}
				p[i][j]=res;
			}
		}
		
		//matrice mt trasposta di m se le righe di mt coincidono con le colonne di m e viceversa
	}
	

}
