public class Funcionario extends DadosProfissionais {
 
	private int id;
    private String nome;
    private int idade;
    private int cpf;
	private Endereco ender;

	
	public Funcionario(){
		System.out.println("\n Met. Const. Default");
		id = 0;
		nome = "";
		cpf = 0;
		nome = "";
		ender = new Endereco();
	}

	public void setId(int id){
		this.id = id;
	}
	public int getId(){
		return id;
	}
	public void setNome(String nome){
		this.nome = nome;
	}
	public String getNome(){
		return nome;
	}
	public void setIdade(int idade){
		this.idade = idade;	
	}
	public int getIdade(){
		return idade;	
	}
	public void setCpf(int cpf){
		if(cpf >= 0){
		this.cpf = cpf;	
		}else{
			System.out.println("Cpf dever ser Positivo >");
		}
	}
	public int getCpf(){
		return cpf;	
	}
	public void setEnder(Endereco ender){
		this.ender = ender;
	}
	public Endereco getEnder(){
		return ender;
	}

}
	
