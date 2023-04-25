package lezioniCorsoJava.lezionePreSpring;
import java.util.Scanner;

public class main{
    public static void main(String [] args) {
        Persona p=new Persona("Simone", "Lopez", "1");
        Persona p1=new Persona("Andrei", "Berlingeri", "2");
        Persona p2=new Persona("Lorenzo", "Scalise", "3");
        Database db=new Database();
        db.add(p);
        db.add(p1);
        db.add(p2);
        System.out.println(db.toString());
        db.remove("1");
        System.out.println(db.toString());
        Scanner sc=new Scanner(System.in);
        boolean run=true;
        String COMM1="add";
        String COMM2="removeFC";
        String COMM3="showDB";
        String welcome="";
        welcome+="Ciao benvenuto nel sistema di gestione db\n ";
        System.out.println(welcome);
        String legends="seleziona una delle seguenti voci:\n";
        legends+="1:"+COMM1+"(per aggiungere una persona al db)\n";
        legends+="2:"+COMM2+"(per rimuovere una persona in base al suo codice fiscale)\n";
        legends+="3:"+COMM3+"(per mostrare tutti gli elementi salvati nel db)\n";
        while(run){
            System.out.println(legends);
            String command=sc.nextLine();
            if(command.equals(COMM1)){
                System.out.println("inserisci le informazioni necessarie della persona");
                System.out.print("inserisci il nome:");
                String name=sc.nextLine();
                System.out.print("inserisci il cognome:");
                String surname=sc.nextLine();
                System.out.print("inserisci il codice fiscale:");
                String cf=sc.nextLine();
                Persona pTMP=new Persona(name, surname, cf);
                boolean inserito=db.add(pTMP);
                if(inserito){System.out.println("inserito con successo");}
                else{
                    System.out.println("problemi nell'inserimento, probabilmente esiste già una persona con lo stesso codice fiscale");
                }
            }
            else if(command.equals(COMM2)){
                System.out.println("inserisci il codice fiscale:");
                String cfTMP=sc.nextLine();
                try {
                    db.remove(cfTMP);
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
            else if(command.equals(COMM3)){
                System.out.println(db.toString());
                
            }
            System.out.println("vuoi continuare? y/n");
            String tmp=sc.nextLine();
            if(tmp.toLowerCase().equals("n")){
                run=false;
            }

        }
    }
}
