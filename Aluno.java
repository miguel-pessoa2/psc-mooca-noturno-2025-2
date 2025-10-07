public class Aluno{

    private int ra;
    private String nome;
    private String email;
    private double notaA1 = 0;
    private double notaA2 = 0;
    private double notaA3 = 0;

    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }

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

    public double getNotaA1() {
        return notaA1;
    }

    public void setNotaA1(double notaA1) {
        this.notaA1 = notaA1;
    }

    public double getNotaA2() {
        return notaA2;
    }

    public void setNotaA2(double notaA2) {
        this.notaA2 = notaA2;
    }

    public double getNotaA3() {
        return notaA3;
    }

    public void setNotaA3(double notaA3) {
        this.notaA3 = notaA3;
    }

    public Aluno(String nome, int ra, String email){
        this.nome = nome;
        this.ra = ra;
        this.email = email;

    }

}