package lezioniCorsoJava.lezione4;
import java.util.*;
//leggere un intero positivo N e scrivere l'N-esimo numero della serie di Fibonacci così definita: 
//1 1 2 3 5 8 13....
//esempi: fibonacci(5) =>5; fibonacci(6) =>8; fibonacci(50)?

public class FibonacciIterativo {
	public static void main(String [] args) {
		long n1=0;
		long n2=1;
		long res=-1;
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		for(int i=2;i<=number;i++) {
			res=n1+n2;
			n1=n2;
			n2=res;
		}
		System.out.println(res);
		
	}

}
