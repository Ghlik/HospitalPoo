public abstract class Medico extends Funcionario{

    public Medico(){};
    public boolean verificarMedicoPaciente(Medico Medico, Paciente Paciente){
        return Medico.equals(Paciente);
    }

    private String Crm;
    private String especialidade;

    public abstract String realizardiagnostico();

    public String getCrm() {
        return Crm;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setCrm(String crm) {
        Crm = crm;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}
