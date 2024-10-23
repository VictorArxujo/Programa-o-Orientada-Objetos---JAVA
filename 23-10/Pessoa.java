public class Pessoa{

	private int cpf = 0;
	private String nome = "";

	public int getCpf(){
		return cpf;
	}
	public String getNome(){
		return nome;
	}
	
	public void setCpf(int cpf){
		if(cpf >= 0){
			this.cpf = cpf;
		}
		else{
	System.out.println("\n CPF deve ser positivo");
		}
	}

	public void setNome(String nome){
		this.nome = nome;
	}
}