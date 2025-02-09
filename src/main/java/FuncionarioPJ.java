// Victor Dos Santos Araujo, 2475553

public class FuncionarioPJ extends Funcionario implements Pagamento {
    private String cnpj;
    private double valorContrato;
    private int tempoContrato;

    public FuncionarioPJ(){ //met const
        cnpj= "";
        valorContrato = 0;
        tempoContrato = 0;
    }
    // SobreCarga
    public FuncionarioPJ (String cnpj, int tempoContrato, double valorContrato) {
            super();
            this.cnpj = cnpj;
            this.tempoContrato = tempoContrato;
            this.valorContrato = valorContrato;
        }
    
    
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
    
    @Override
    public void calcularPagamento() {
    System.out.println("Pagamento: " + (valorContrato / tempoContrato));

    }
    @Override
    public String getTipo() {
        return "PJ";
    }
    

}
