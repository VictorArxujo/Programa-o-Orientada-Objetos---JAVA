public class TstPes{

	public static void main(String arg[]){//classLoader

		Pessoa p1 = new Pessoa();
/*
Erro devido ao ENCAPSULAMENTO DOS ATRIBUTOS

		p1.cpf = -247;
		p1.nome = "ERRO";

	System.out.println("\nCPF..: "+p1.cpf);
	System.out.println("NOME.: "+p1.nome);
*/
//============ DEVE SER PELOS GETTERS E SETTERS ==========

		p1.setCpf(-13);
		p1.setNome("ERRO");

	System.out.println("\nCPF..: "+p1.getCpf());
	System.out.println("NOME.: "+p1.getNome());


	}
}