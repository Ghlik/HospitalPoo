public abstract class Funcionario extends Pessoa {

    public Funcionario(){};
    private String cargo;
    private String id;

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}
