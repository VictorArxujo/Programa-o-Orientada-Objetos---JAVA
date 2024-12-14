//Victor Dos Santos Araujo 2475553

public class DadosProfissionais {
    private String cargo;
    private double salario;
    private String departamento;
    private String dataAdmissao;
    private boolean status;
    
	public DadosProfissionais(){ //met const
	    cargo = "";
		salario = 0;
		departamento = "";
		dataAdmissao = "";
        status = false;
    }


    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if(salario >= 0){
            this.salario = salario;	
            }else{
                System.out.println ("Cpf dever ser Positivo >");
            }
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(String dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}