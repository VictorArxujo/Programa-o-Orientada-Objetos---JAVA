// Victor Dos Santos Araujo, 2475553

public class Estagiario extends Funcionario implements Pagamento {
    
    private String instituicaoEnsino;
    private String curso;
    private int chs;
    private double bolsaAuxilio;

    // Met Const.
    public Estagiario() {
        super();
        this.instituicaoEnsino = "";
        this.curso = "";
        this.chs = 0;
        this.bolsaAuxilio = 0.0;
    }

    // SobreCarga
    public Estagiario(String instituicaoEnsino, String curso, int chs, double bolsaAuxilio) {
        super();
        this.instituicaoEnsino = instituicaoEnsino;
        this.curso = curso;
        this.chs = chs;
        this.bolsaAuxilio = bolsaAuxilio;
    }

    public String getInstituicaoEnsino() {
        return instituicaoEnsino;
    }

    public void setInstituicaoEnsino(String instituicaoEnsino) {
        this.instituicaoEnsino = instituicaoEnsino;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getCHS() {
        return chs;
    }

    public void setCHS(int chs) {
        this.chs = chs;
    }

    public double getBolsaAuxilio() {
        return bolsaAuxilio;
    }

    public void setBolsaAuxilio(double bolsaAuxilio) {
        this.bolsaAuxilio = bolsaAuxilio;
    }
    
    @Override
    public void calcularPagamento() {
        System.out.println("Salário do Estagiário: " + bolsaAuxilio);
    }

    @Override
    public String getTipo() {
        return "Estagiário";
    }
}
