import java.util.List;

public class Paciente extends Pessoa {

    public Paciente(){
        this.sintoma = this.ListarSintoma();
        this.Espera = new Espera();
    }
    private Espera Espera;

    private List<String> ListarSintoma(){};
    private List<String> sintoma;

    public List<String> getSintoma() {
        return sintoma;
    }

    public void setSintoma(List<String> sintoma) {
        this.sintoma = sintoma;
    }

}
