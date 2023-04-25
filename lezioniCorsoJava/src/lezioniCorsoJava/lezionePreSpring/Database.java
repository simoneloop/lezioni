package lezioniCorsoJava.lezionePreSpring;

import java.util.ArrayList;

public class Database {
 
    private ArrayList<Persona> db;

    public Database(){
        db=new ArrayList<>();
    }
    public boolean add(Persona p){
        if(findByFC(p.getFC())==null){
            db.add(p);
            return true;
        }
        else{
            return false;
        }
    }
    public void remove(String fc)throws RuntimeException{
        Persona tmp=findByFC(fc);
        if(tmp==null){
            throw new RuntimeException("non esiste la persona con codice: "+fc);
        }
        else{
            db.remove(tmp);
        }
    }
    public Persona findByFC(String fc){
        for(Persona p: db){
            if(p.getFC().equals(fc)){
                return p;
            }
        }
        return null;
    }
    public boolean existByFc(String fc){
        for(Persona p: db){
            if(p.getFC().equals(fc)){
                return true;
            }
        }
        return false;
    }

    public String toString(){
        String ret="";
        ret+="Il database è costituito da:\n";
        ret+="\n";
        for(Persona p:db){
            ret+=p.toString()+"\n";
            ret+="---\n";

        }
        return ret;
    }
}