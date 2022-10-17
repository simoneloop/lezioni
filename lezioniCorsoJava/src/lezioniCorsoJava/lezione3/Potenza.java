package lezioniCorsoJava.lezione3;

public class Potenza {
	public static void main(String[]args) {
		int a=2,n=3;
		int p=potenza(a,n);
		System.out.println("potenza: "+p);
	}
	static int potenza(int a,int n) {
		//ipotesi che i dati a e n siano corretti
		int pot=1;//esempio di variabile locale
		for(int i=0;i<n;i++) pot*=a;
		return pot;
	}
	static int potenzaConControlli(int a,int n) {
		if(a==0 && n==0) {
			System.out.println("potenza: 0^0 !");
			System.exit(-1);
		}
		int pot=1;
		for(int i=0; i<Math.abs(n);i++)pot*=a;//prima si fa la potenza e poi in caso se negativa va al denominatore
		if(n<0)return (int) (1f/pot);
		return pot;
	}

}
