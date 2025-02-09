public class SalarioInvalidoException extends Exception {
    public SalarioInvalidoException(String mensagem) {
        super(mensagem);  // Passa a mensagem para a classe pai (Exception)
    }
}
