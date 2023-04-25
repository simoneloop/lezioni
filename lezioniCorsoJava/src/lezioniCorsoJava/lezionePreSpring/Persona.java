package lezioniCorsoJava.lezionePreSpring;

public class Persona {
    private String name;
    private String surname;
    private String fc;

    public Persona(String name, String surname, String fc){
        this.name=name;
        this.surname=surname;
        this.fc=fc;
    }
    public String getName(){
        return name;
    }
    public String getSurname(){
        return surname;
    }
    public String getFC(){
        return fc;
    }

    public String toString(){
        return "Nome: "+name+"\ncognome: "+surname+"\nCodice fiscale: "+fc;
    }
}
