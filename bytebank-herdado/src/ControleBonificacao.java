public class ControleBonificacao {

    private double soma;


    public void registra(Funcionario p){
        double boni = p.getBonificacao();
        this.soma += boni;
    }


    public double getSoma() {
        return soma;
    }
}
