package lezioniCorsoJava.lezione3;

import java.util.*;

public class CalcoloDurataMese {
	public static void main(String[]args) {
		//nuova versione dello switch
		Random randomGenerator=new Random();
		Scanner sc=new Scanner(System.in);
		System.out.print("anno[1091,2099]: ");int anno=sc.nextInt();System.out.println();
		System.out.print("mese[1,12]: ");int mese=sc.nextInt();System.out.println();
		int durata;
		switch(mese) {
		case 1: case 3: case 5: case 7: case 8: 
		case 10: case 12: durata=31; break;
		case 2:durata=(anno%4==0)?29:28;break;
		default: durata=30;
		}
		System.out.println("durata: "+durata);

	}
}
