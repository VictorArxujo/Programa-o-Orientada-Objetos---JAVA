public class CpfInvalidoException extends Exception {
    public CpfInvalidoException(String mensagem) {
        super(mensagem);  // Passa a mensagem para a classe pai (Exception)
    }
}
