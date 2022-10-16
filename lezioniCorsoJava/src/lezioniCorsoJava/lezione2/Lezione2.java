package lezioniCorsoJava.lezione2;
import java.util.*;
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
		int differenza=a-b;
		if(differenza>0) {
			System.out.println("a è maggiore di b");
		}
		else if(differenza<0) {
			System.out.println("b è maggiore di a");
		}
		else {
			System.out.println("sono uguali");
		}
		
		
		Random randomGenerator=new Random();
		int index=randomGenerator.nextInt(12)+1;
		//switch case
		System.out.println(index);
		switch(index) {
			case 1:System.out.print("Gennaio");break;
			case 2:System.out.print("Febbraio");break;
			case 3:System.out.print("Marzo");break;
			case 4:System.out.print("Aprile");break;
			case 5:System.out.print("Maggio");break;
			case 6:System.out.print("Giugno");break;
			case 7:System.out.print("Luglio");break;
			case 8:System.out.print("Agosto");break;
			case 9:System.out.print("Settembre");break;
			case 10:System.out.print("Ottobre");break;
			case 11:System.out.print("Novembre");break;
			case 12:System.out.print("Dicembre");break;
			//se non è noto
			default: System.out.print("Questo mese è sconosciuto all'uomo");
		}
		
		
		
		
		
	}
		
		
}
