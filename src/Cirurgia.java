public class Cirurgia {

    public Cirurgia(){
        this.Cirurgião = new Cirurgião();
        this.Sala = new Sala();
    }

    private Cirurgião Cirurgião;
    private Sala Sala;

    public Cirurgião getCirurgião() {
        return Cirurgião;
    }

    public void setCirurgião(Cirurgião cirurgião) {
        Cirurgião = cirurgião;
    }

    public Sala getSala() {
        return Sala;
    }

    public void setSala(Sala sala) {
        Sala = sala;
    }
}
