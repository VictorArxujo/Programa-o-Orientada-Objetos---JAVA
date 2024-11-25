public class Estagiario extends Funcionario {
    
    private String instituicaoEnsino;
    private String curso;
    private int chs;
    private double bolsaAuxilio;

    public Estagiario(){//met const
        instituicaoEnsino = "";
        curso = "";
        chs = 0;
        bolsaAuxilio = 0;
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
}