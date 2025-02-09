import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        boolean a = true;

        while (a) {
            System.out.println("\n--- MENU ---");
            System.out.println("1 - Adicionar Funcionário");
            System.out.println("2 - Adicionar Estagiário");
            System.out.println("3 - Adicionar Funcionário PJ");
            System.out.println("4 - Adicionar Funcionário Temporário");
            System.out.println("5 - Exibir Todos os Funcionários");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            
            int escolha = Integer.parseInt(scanner.nextLine());  
            
            Funcionario funcionario = null;  
            
            switch (escolha) {
                case 1:
                    funcionario = new Funcionario();  
                    preencherFuncionario(funcionario, scanner);
                    break;
                case 2:
                    funcionario = new Estagiario();  
                    preencherEstagiario((Estagiario) funcionario, scanner);
                    break;
                case 3:
                    funcionario = new FuncionarioPJ();  
                    preencherFuncionarioPJ((FuncionarioPJ) funcionario, scanner);
                    break;
                case 4:
                    funcionario = new FuncionarioTemporario();  
                    preencherFuncionarioTemporario((FuncionarioTemporario) funcionario, scanner);
                    break;
                case 5:
                    exibirFuncionarios(funcionarios);
                    break;
                case 0:
                    a = false;  
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida.");  
            }

            // Adiciona o funcionário à lista se foi cadastrado com sucesso
            if (funcionario != null) {
                funcionarios.add(funcionario);
            }
        }
        
        scanner.close();
    }

    // Função para preencher dados gerais de qualquer funcionário com tratamento de exceção
    private static void preencherFuncionario(Funcionario funcionario, Scanner scanner) {
        System.out.print("Digite o nome: ");
        funcionario.setNome(scanner.nextLine());
    
        System.out.print("Digite o CPF: ");
        while (true) {
            try {
                int cpf = Integer.parseInt(scanner.nextLine());
                funcionario.setCpf(cpf);
                break; // Sai do loop se o CPF for válido
            } catch (CpfInvalidoException e) {
                System.out.println("Erro: " + e.getMessage());
                System.out.print("Digite o CPF novamente: ");
            } catch (NumberFormatException e) {
                System.out.println("Erro: CPF inválido! Digite um número válido.");
                System.out.print("Digite o CPF novamente: ");
            }
        }
    
        System.out.print("Digite a idade: ");
        funcionario.setIdade(Integer.parseInt(scanner.nextLine()));
    
        System.out.print("Digite o salário: ");
        while (true) {
            try {
                double salario = Double.parseDouble(scanner.nextLine());
                funcionario.setSalario(salario); // Lança a exceção aqui se o salário for negativo
                break; // Sai do loop se o salário for válido
            } catch (SalarioInvalidoException e) {
                System.out.println("Erro: " + e.getMessage());
                System.out.print("Digite o salário novamente: ");
            } catch (NumberFormatException e) {
                System.out.println("Erro: Salário inválido! Digite um número válido.");
                System.out.print("Digite o salário novamente: ");
            }
        }
    }
    
    

    // Função para preencher dados específicos do Estagiário
    private static void preencherEstagiario(Estagiario estagiario, Scanner scanner) {
        preencherFuncionario(estagiario, scanner); // Preenche dados comuns

        System.out.print("Digite a instituição de ensino: ");
        estagiario.setInstituicaoEnsino(scanner.nextLine());

        System.out.print("Digite o curso: ");
        estagiario.setCurso(scanner.nextLine());

        System.out.print("Digite a carga horária do estágio (em horas): ");
        estagiario.setCHS(Integer.parseInt(scanner.nextLine()));

        System.out.print("Digite o valor da bolsa auxílio: ");
        estagiario.setBolsaAuxilio(Double.parseDouble(scanner.nextLine()));
    }

    // Função para preencher dados específicos do Funcionário PJ
    private static void preencherFuncionarioPJ(FuncionarioPJ funcionarioPJ, Scanner scanner) {
        preencherFuncionario(funcionarioPJ, scanner); // Preenche dados comuns

        System.out.print("Digite o CNPJ: ");
        funcionarioPJ.setCnpj(scanner.nextLine());

        System.out.print("Digite o valor do contrato: ");
        funcionarioPJ.setValorContrato(Double.parseDouble(scanner.nextLine()));

        System.out.print("Digite a duração do contrato (em meses): ");
        funcionarioPJ.setTempoContrato(Integer.parseInt(scanner.nextLine()));
    }

    // Função para preencher dados específicos do Funcionário Temporário
    private static void preencherFuncionarioTemporario(FuncionarioTemporario funcionarioTemporario, Scanner scanner) {
        preencherFuncionario(funcionarioTemporario, scanner); // Preenche dados comuns

        System.out.print("Digite o valor da hora trabalhada: ");
        funcionarioTemporario.setValorHora(Integer.parseInt(scanner.nextLine()));

        System.out.print("Digite as horas trabalhadas: ");
        funcionarioTemporario.sethorasTrabalhadas(Integer.parseInt(scanner.nextLine()));
    }

    // Função para exibir todos os funcionários cadastrados
    private static void exibirFuncionarios(ArrayList<Funcionario> funcionarios) {
        if (funcionarios.isEmpty()) {
            System.out.println("Nenhum funcionário cadastrado.");
            return;
        }

        System.out.println("\n--- Funcionários Cadastrados ---");
        for (Funcionario funcionario : funcionarios) {
            System.out.println("Nome: " + funcionario.getNome());
            System.out.println("CPF: " + funcionario.getCpf());
            System.out.println("Idade: " + funcionario.getIdade());
            System.out.println("Salário: " + funcionario.getSalario());

            if (funcionario instanceof Estagiario) {
                Estagiario estagiario = (Estagiario) funcionario;
                System.out.println("Instituição: " + estagiario.getInstituicaoEnsino());
                System.out.println("Curso: " + estagiario.getCurso());
                System.out.println("Carga Horária: " + estagiario.getCHS());
                System.out.println("Bolsa Auxílio: " + estagiario.getBolsaAuxilio());
            } else if (funcionario instanceof FuncionarioPJ) {
                FuncionarioPJ funcionarioPJ = (FuncionarioPJ) funcionario;
                System.out.println("CNPJ: " + funcionarioPJ.getCnpj());
                System.out.println("Valor do Contrato: " + funcionarioPJ.getValorContrato());
                System.out.println("Tempo de Contrato: " + funcionarioPJ.getTempoContrato());
            } else if (funcionario instanceof FuncionarioTemporario) {
                FuncionarioTemporario funcionarioTemporario = (FuncionarioTemporario) funcionario;
                System.out.println("Valor Hora: " + funcionarioTemporario.getValorHora());
                System.out.println("Horas Trabalhadas: " + funcionarioTemporario.gethorasTrabalhadas());
            }

            System.out.println("------------------------------------");
        }
    }
}
