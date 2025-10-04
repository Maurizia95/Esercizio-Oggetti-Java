public class Studente {
    String nome;
    String cognome;
    int eta;
    String mail;
    String matricola;

    
    void studia(){
        System.out.println("Lo studente studia");
    }

    String nomeCompleto(String nome, String cognome){
        return nome +" "+ cognome;
    }
    String nomeCompleto(){
        return this.nome +" "+ this.cognome;
    }
    Studente(){

    }



}


//5 classi, 5-6 attributi , 2 costruttori, almeno 2 metodi void e con ritorno