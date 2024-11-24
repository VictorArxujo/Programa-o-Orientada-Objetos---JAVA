public class TstFun{

	public static void main(String arg[]){ //classloader
		Leitura l = new Leitura();

		// instanciações 

		Funcionario f1 = new Funcionario(); 
		Estagiario e1 = new Estagiario();

				e1.setNome("João");
				e1.setCpf(10); //estagio
				e1.setSalario(1200);

				f1.setNome("Victor");  //funcionario
				f1.setCpf(115); //funcionario
				f1.setSalario(10000);

		System.out.println("\nNome do Estagiário...: "+ e1.getNome()); 
		System.out.println("\nCPF Estagiário.: "+  e1.getCpf()); 
		System.out.println("\nSalário do Estagiário..: "+ e1.getSalario()); 
		
		System.out.println("\nNome do Funcionário.: "+   f1.getNome()); 
		System.out.println("\nCpf do Funcionário.: "+   f1.getCpf()); 
		System.out.println("\nSalário do Funcionário.: "+   f1.getSalario()); 
	}

}