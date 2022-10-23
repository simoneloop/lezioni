package lezioniCorsoJava.lezione5;

public class RicercaBinaria {
	
	public static void main(String[]args) {
		int[]v={-1,0,1,2,3,4,5,6,7,8};
		int x=7;
		System.out.println(ricercaBinaria(v,x));
	}
	static int ricercaBinaria(int[]a,int x) {
		int inf=0;
		int sup=a.length-1;
		int med=-1;
		boolean trovato=false;
		while(inf<=sup && !trovato) {
			med=(inf+sup)/2;
			if(a[med]==x)trovato=true;
			else if(a[med]>x)sup=med-1;
			else {
				inf=med+1;
			}
			
		}
		if(trovato) return med;
		return -1;
	}

}
