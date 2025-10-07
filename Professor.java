public class Professor{

    private String nome;
    private String email;
    private double matricula;
    private double notaA1;
    private double notaA2;
    private double notaA3;


    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

public Professor(String nome, String email, double matricula){
    this.nome = nome;
    this.email = email;
    this.matricula = matricula;
}

public void lancarNota(Aluno aluno, double nota, String tipoAvaliacao){
    System.out.println("lançando nota " + tipoAvaliacao + " do aluno " + aluno.getNome() + ": " + nota);
    if(tipoAvaliacao == "A1"){
        aluno.setNotaA1(nota);
    }
    else if(tipoAvaliacao == "A2"){
        aluno.setNotaA2(nota);
    }
    else if(tipoAvaliacao  == "A3"){
        aluno.setNotaA3(nota);
    }
}


public void visualizarAluno(Aluno aluno){

        System.out.println("Dados do aluno: ");
        System.out.println("Nome : " + aluno.getNome());
        System.out.println("RA: " + aluno.getRa());
        System.out.println("Email: " + aluno.getEmail());

        System.out.println("Avaliação A1: " + aluno.getNotaA1());
        System.out.println("Avaliação A2: " + aluno.getNotaA2());
        System.out.println("Avaliação A3: " + aluno.getNotaA3());

        System.out.println("Nota final: " + (aluno.getNotaA1() + aluno.getNotaA2() + aluno.getNotaA3()));

    }

}