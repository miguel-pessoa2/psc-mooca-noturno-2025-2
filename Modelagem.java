public class Modelagem extends UnidadeCurricular{

    public Modelagem(){
        this.setNome("Modelagem");
        this.setDia("Sábado");
        this.setHorario("10:00");
        this.setSala("online");
        this.setCargaHoraria(260);
    }
    
    @Override
    public void exibirCargaHoraria(){
        System.out.println("Detalhes da Unidade Curricular");
        System.out.println("Unidade Curricular: " + getNome());
        System.out.println("Dia: " + getDia());
        System.out.println("Horário: " + getHorario());
        System.out.println("Sala: " + getSala());
        System.out.println("Carga horária: " + getCargaHoraria() + " horas.");

    }
}