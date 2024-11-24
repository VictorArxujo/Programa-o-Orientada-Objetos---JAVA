public class FuncionarioPJ extends Funcionario {
    private String cnpj;
    private double valorContrato;
    private int tempoContrato;

    // Getters e setters
    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public double getValorContrato() {
        return valorContrato;
    }

    public void setValorContrato(double valorContrato) {
        this.valorContrato = valorContrato;
    }

    public int getTempoContrato() {
        return tempoContrato;
    }

    public void setTempoContrato(int tempoContrato) {
        this.tempoContrato = tempoContrato;
    }
}
