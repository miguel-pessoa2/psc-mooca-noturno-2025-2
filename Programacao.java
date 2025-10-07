public class Programacao extends UnidadeCurricular{
    

    public Programacao(){
        this.setNome("Programação");
        this.setDia("Segunda/Terça");
        this.setHorario("19:00");
        this.setSala("i08h");
        this.setCargaHoraria(260);
    }

    @Override
    public void exibirCargaHoraria(){
        System.out.println("Detalhes da Programação");
        System.out.println("Nome: " + getNome());
        System.out.println("Dia: " + getDia());
        System.out.println("Horaário: " + getHorario());
        System.out.println("Sala: " + getSala());
        System.out.println("Carga horária: " + getCargaHoraria() + " horas.");
    }
}
