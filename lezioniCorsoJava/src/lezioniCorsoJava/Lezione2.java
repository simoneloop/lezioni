package lezioniCorsoJava;

public class Lezione2 {
	
	
	public static void main(String[]args) {
		
		
		//ciclo di while a condizione iniziale può essere ripetuto 0-1-più volte
		int cont=0;
		while(cont<10) {
			cont++;
		}
		System.out.println(cont);
		
		//ciclo di while a condizione finale
		do {
			cont--;
		}
		while(cont>0);
		System.out.println(cont);
		
//		int infinite=0;
//		while(true) {
//			System.out.println(infinite++);
//		}
		
		//operatore ternario
		
		int a=2;
		int b=2;
		boolean aMajorB=a>b?true:false;
		
		//if else if else
		if(a>b) {
			System.out.println("a è maggiore di b");
		}
		else if(a<b) {
			System.out.println("b è maggiore di a");
		}
		else {
			System.out.println("sono uguali");
		}
		
		//switch case
		switch(a>b) {
		case true:
		}
		
	}

}
