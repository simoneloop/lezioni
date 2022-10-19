package lezioniCorsoJava.lezione3;
import java.util.Arrays;

public class Stringhe {
	//Testi, messaggi e codici
	public static void main(String[]args) {
		//Il modo più semplice e diretto per creare un oggetto di tipo String 
		//e assegnare alla variabile un insieme di caratteri racchiusi fra virgolette:
		String titolo = "Lezione sulle stringhe";
//		questo è possibile in quanto il compilatore crea una variabile di tipo String ogni volta che
//		incontra una sequenza racchiusa fra doppi apici;
//		nell'esempio la stringa "Lezione sulle stringhe"
//		viene trasformata in un oggetto String e assegnato alla variabile titolo.
//		Questa forma di inizializzazione è detta string literal
//
//		Oltre alla modalità "literal", poiché si tratta comunque di oggetti,
//		le variabili di tipo String possono essere inizializzate anche utilizzando la keyword new
//		e un costruttore 
		String nuovoTitolo = new String("Titolo dell'opera");
		// Inizializzazione che fa uso di un array di caratteri
		char[] arraySottotitolo = {'s','o','t','t','o','t','i','t','o','l','o','!'};
		String sottotitolo = new String(arraySottotitolo);
		
		
		String s="hello world";
		String t="hello world";
		System.out.println(s==t);
		System.out.println(s.equals(t));//molto più sicuro e corretto utilizzare questa notazione perché per esempio:
		//se fossero su un sistema distrubuito non sarebbero nella stessa pool
		//funziona solo per le stringhe e non per altri oggetti, praticamente grazie alla string pool s e t sono la stessa stringa ripescata
		//quindi in questo caso hanno lo stesso puntatore
		//se no per gli altri oggetti ==controlla l'indirizzo di memoria
		
		
		String descrizione = "Lezione sulle stringhe ...";
		int length = descrizione.length();
		System.out.println("Lunghezza: "+length);
		
		char primoCarattere=descrizione.charAt(0);
		
		String str1 = new String("Nome ");
		String str2 = new String("Cognome ");
		String str3 = str1.concat(str2);
		
		String str4 = "Nome"+"Cognome";
		
		String str5=str1+str2;
		/*
		 * La concatenazione di due stringhe in realtà genera automaticamente una nuova istanza di String il cui contenuto è
		 *  costituito dai caratteri della prima e della seconda messi insieme 
		 */
		
		System.out.println(str5);
		
		
		titolo = "I promessi Sposi";
		String a = titolo.substring(2);   // a vale "promessi Sposi"
		System.out.println(a);
		String b = titolo.substring(11);  // b vale "Sposi"
		System.out.println(b);
		String c = titolo.substring(2,10); // c vale "promessi"
		System.out.println(c);
//		Nota: sia l'operazione di concatenamento 
//		sia quella di estrazione di una sottostringa 
//		(e tutti i metodi che operano sulle stringhe per la verità),
//		sono caratterizzati dal fatto di non modificare la stringa su 
//		cui vengono applicate ma di ritornarne una nuova.
		
		
//		Stringhe, oggetti "immutabili"
//		Non è possibile manipolare direttamente su una stringa
//		in Java le stringhe sono oggetti immutabili,
//		cioè il loro valore non può essere cambiato dopo la loro creazione
//		(come gli array non possono cambiare lunghezza per fare un parallelo).
//
//		L'immutabilità dell'oggetto String deve sempre essere tenuta presente ogni volta le si manipolano,
//		non è infatti infrequente cadere in errori come questo:
		
		String messaggio = "Ciao XX";
		messaggio.replace("XX", "Mondo");
		System.out.println(messaggio);
		messaggio=messaggio.replace("XX", "Mondo");
		System.out.println(messaggio);
		//ma possiamo usare il replace anche per modificare più lettere es
		String data="19/10/2022";
		data=data.replace("/", "-");
		System.out.println(data);
		
//		Ma questo significa abbandonare l'oggetto precedente.
//		In altre parole avremo nella memoria il nuovo oggetto "Ciao Mondo" 
//		puntato dalla variabile messaggio e l'oggetto "Ciao XX"
//		abbandonato a se stesso senza riferimenti.

		//metodo ritorna true se e solo se la stringa contiene la sequenza di caratteri specificati dal parametro s
		//metodo equals ma per le stringhe funziona anche ==
		//isEmpty ritorna true se e solo se la lunghezza della stringa è 0
		//trim ritorna una copia della stringa di partenza eliminando tutti gli spazi bianchi all'inizio e alla fine della stringa
		//split suddivide la stringa intorno ad ogni occorrenza con l'espressione regex e ritorna array con tutte le sottostringhe
		String[] date=data.split("-");
		System.out.println(date);
		System.out.println(Arrays.toString(date));
		
		
	}

}
