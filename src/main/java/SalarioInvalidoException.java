// Victor Dos Santos Araujo, 2475553

public class SalarioInvalidoException extends Exception {
    public SalarioInvalidoException(String mensagem) {
        super(mensagem);  // Passa a mensagem para a classe pai (Exception)
    }
}
