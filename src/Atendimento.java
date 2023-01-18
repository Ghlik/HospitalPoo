public class Atendimento {

    public Atendimento(){
        this.Atendente = new Atendente();
        this.Paciente = new Paciente();
    }
    private Paciente Paciente;
    private Atendente Atendente;

    public Atendente getAtendente() {
        return Atendente;
    }

    public void setAtendente(Atendente atendente) {
        Atendente = atendente;
    }

    public Paciente getPaciente() {
        return Paciente;
    }

    public void setPaciente(Paciente paciente) {
        Paciente = paciente;
    }
}
