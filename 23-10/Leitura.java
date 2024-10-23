import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Leitura{

	public String entDados(String rotulo){
		
		System.out.println(rotulo);

		InputStreamReader tec = new InputStreamReader(System.in);
		BufferedReader buff =  new BufferedReader(tec);

		String ret = "";

		try{
			ret = buff.readLine();
		}catch(IOException ioe){
			System.out.println("ERRO");
		}
		
		return ret;


	}
	
	public int soma(int a, int b) {
		
		return (a + b);
	}	
	public int sub(int a, int b) {
		
		return (a - b);
	}	
	public int div(int a, int b) {
		
		return (a / b);
	}	
	public int mult(int a, int b) {
		
		return (a * b);
	}	

}