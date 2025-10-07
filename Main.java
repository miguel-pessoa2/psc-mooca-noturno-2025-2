public class Main {

    public static void main(String[] args) {
        
       Professor prof = new Professor("Danilo", "danilo@gmail.com", 101010);
       Aluno aluno3 = new Aluno("Alvins", 67890, "alvins@gmail.com");

        Programacao pg = new Programacao();
        Modelagem md = new Modelagem();

        pg.exibirCargaHoraria();
        md.exibirCargaHoraria();
   }
   
   
   }