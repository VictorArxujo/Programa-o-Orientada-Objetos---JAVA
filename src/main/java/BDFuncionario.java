// Victor Dos Santos Araujo, 2475553
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class BDFuncionario {

    private static BDFuncionario instancia;

   
    private List<Funcionario> funcionarioList;
    private List<Funcionario> cltList;
    private List<Estagiario> estagiarioList;
    private List<FuncionarioPJ> funcPjList;
    private List<FuncionarioTemporario> funcTempList;  

    
    private BDFuncionario() {
        funcionarioList = new ArrayList<>();
        cltList = new ArrayList<>();
        estagiarioList = new ArrayList<>();
        funcPjList = new ArrayList<>();
        funcTempList = new ArrayList<>();
    }
    
    
    public static BDFuncionario getInstanciaComandoHome() {
        if (instancia == null) {
            instancia = new BDFuncionario();
        }
        return instancia;
    }
    
   
    public List<Funcionario> getBdClt(){
        return cltList;
    }
    
    public List<Estagiario> getBdEstagiario(){
        return estagiarioList;
    }
    
    public List<FuncionarioPJ> getBdPj(){
        return funcPjList;
    }
    
    public List<FuncionarioTemporario> getBdTemp(){
        return funcTempList;
    }
 
    
    public void registrarClt(Funcionario newClt){ // REGISTRAR CLT
        cltList.add(newClt);
    }
    
    public void registrarEstagiario(Estagiario newEstagiario){ // REGISTRAR NOVO ESTAGIARIO
        estagiarioList.add(newEstagiario);
    }
    
    public void registrarPj(FuncionarioPJ newPj){ // REGISTRAR NOVO PJ
        funcPjList.add(newPj);
    }
    
    public void registrarTemp(FuncionarioTemporario newTemp){ // REGISTRAR NOVO FUNC TEMP
        funcTempList.add(newTemp);
    }
 
    
    public boolean registrarFuncionario(Funcionario novoFuncionario) {
        
        if (consultaFuncionario(novoFuncionario) != null) {
            JOptionPane.showMessageDialog(
                null,
                "Funcionário com CPF " + novoFuncionario.getCpf() + " já existe!",
                "Erro de Cadastro",
                JOptionPane.ERROR_MESSAGE
            );
            return false; 
        }
        // Adiciona o funcionário à lista global
        funcionarioList.add(novoFuncionario);
        
        // Verifica o tipo do funcionário e adiciona à lista x
        if (novoFuncionario instanceof Estagiario) {
            estagiarioList.add((Estagiario) novoFuncionario);
        } else if (novoFuncionario instanceof FuncionarioPJ) {
            funcPjList.add((FuncionarioPJ) novoFuncionario);
        } else if (novoFuncionario instanceof FuncionarioTemporario) {
            funcTempList.add((FuncionarioTemporario) novoFuncionario);
        } else {
            // Se não for nenhum, entao é clt
            cltList.add(novoFuncionario);
        }
        return true; 
    }
    
    // Consulta um funcionário pelo CPF na lista global
    public Funcionario consultaFuncionario(Funcionario funcionario) {
        for (Funcionario f : funcionarioList) {
            if (f.getCpf() == funcionario.getCpf()) {
                return f;
            }
        }
        return null;
    }

 // Exclui um funcionário pelo CPF, tanto da lista global quanto da lista x
    public boolean exFuncionarioCPF(Funcionario funcionario) {
        // Procura o funcionário na lista global
        Funcionario funcionarioEncontrado = consultaFuncionario(funcionario);
        if (funcionarioEncontrado != null) {
            // Remove da lista global
            funcionarioList.remove(funcionarioEncontrado);

            // Remove da lista específica, de acordo com o tipo
            if (funcionarioEncontrado instanceof Estagiario) {
                estagiarioList.remove(funcionarioEncontrado);
            } else if (funcionarioEncontrado instanceof FuncionarioPJ) {
                funcPjList.remove(funcionarioEncontrado);
            } else if (funcionarioEncontrado instanceof FuncionarioTemporario) {
                funcTempList.remove(funcionarioEncontrado);
            } else {
                // Se não for nenhum dos tipos acima, assumimos que é CLT
                cltList.remove(funcionarioEncontrado);
            }
            return true;
        } else {
            return false;
        }
    }
    
    public Funcionario atualizarFuncionarioCpf(Funcionario funcionario) { 
        for (int i = 0; i < funcionarioList.size(); i++) {
            if (funcionario.getCpf() == funcionarioList.get(i).getCpf()) {
                Funcionario f = funcionarioList.get(i);

                String nome = JOptionPane.showInputDialog(
                        null,
                        "Informe o novo NOME",
                        "Atualizar dados",
                        JOptionPane.INFORMATION_MESSAGE
                );

                if (nome != null && !nome.trim().isEmpty()) {
                    f.setNome(nome);
                    funcionarioList.set(i, f);
                    return funcionarioList.get(i);
                } else {
                    JOptionPane.showMessageDialog(
                            null,
                            "Nome inválido! Alteração cancelada.",
                            "Erro",
                            JOptionPane.ERROR_MESSAGE
                    );
                }
            }
        }
        return null;
    }

    // Retorna a lista global de funcionários
    public List<Funcionario> getBdFuncionarios(){
        return funcionarioList;
    }
}
