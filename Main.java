public  class Main{
    public static void main(String[] args) {
        Studente stud = new Studente();
        stud.studia();
        System.out.println(stud.nomeCompleto("pippo","pluto"));
        System.out.println(stud.nomeCompleto());
        stud.nome = "topolino";
        stud.cognome="bianchi";
                System.out.println(stud.nomeCompleto());

        }
}