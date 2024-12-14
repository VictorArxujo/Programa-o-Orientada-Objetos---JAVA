//Victor dos Santos Araujo - 2475553

public class FuncionarioTemporario extends Funcionario implements Pagamento {
    private int valorHora; // duração em meses
    private int horasTrabalhadas;
    public FuncionarioTemporario() {
        valorHora = 0;
        horasTrabalhadas = 0;
    }

    public int getValorHora() {
        return valorHora;
    }

    public void setValorHora(int valorHora) {
        this.valorHora = valorHora;
    }
    public int gethorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void sethorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    @Override
    public void calcularPagamento() {
        double salarioTemporario = valorHora * horasTrabalhadas;
        System.out.println("Salário do Funcionário Temporário: " + salarioTemporario);
    }
}
