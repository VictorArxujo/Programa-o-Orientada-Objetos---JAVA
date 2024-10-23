public class TstLixo{

	public static void main(String arg[]){

		Leitura l = new Leitura();
	

	String frase1 = l.entDados("\nInforme um valor: ");
	String frase2 = l.entDados("\nInforme outro valor: ");
	
	int a =  Integer.parseInt(frase1);
	int b =  Integer.parseInt(frase2);
	
	
	int soma = l.soma(a , b);	
	int mult = l.mult(a , b);
	int sub = l.sub(a , b);
	int div = l.div(a , b);
		
	System.out.println("\nSoma dos valores: "+ soma);
	System.out.println("\nDivisao dos valores: "+ div);
	System.out.println("\nMultiplação dos valores: "+ mult);
	System.out.println("\nSubtração dos valores: "+ sub);
			

	}

}