// Victor Dos Santos Araujo, 2475553

public class Funcionario extends DadosProfissionais  {
 
    private int id;
    private String nome;
    private int idade;
    private int cpf;

    
	public Funcionario(){ //met const
		id = 0;
		nome = "";
		cpf = 0;
	}
        
        // SobreCarga
        public Funcionario(String nome, int id, int idade, int cpf) {
            super();
            this.id = id;
            this.nome = nome;
            this.idade = idade;
            this.cpf = cpf;
        }
        
        public Funcionario(int cpf) {
            this.cpf = cpf;
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
	public void setIdade(int idade) throws IdadeInvalidoException {
		if (idade < 0) {
			throw new IdadeInvalidoException("Idade deve ser um inteiro positivo!");
		} else {
			this.idade = idade;
		}
	}
	
	public int getIdade(){
		return idade;	
	}
	public void setCpf(int cpf) throws CpfInvalidoException {
		if (cpf < 0) {
			throw new CpfInvalidoException("CPF não pode ser negativo!");
		} else {
			this.cpf = cpf;
		}
	}
	
	public int getCpf(){
		return cpf;	
	}
	
        public String getTipo() {
        return "CLT";
    }
        
        
	
}
	
