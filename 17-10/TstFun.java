// Victor dos Santos Araujo - 2475553

import java.util.Scanner;

public class TstFun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  
        boolean condition = true;  

        while (condition) {
            System.out.println("--- MENU ---");
            System.out.println("Digite:");
            System.out.println("1 - Para Funcionário");
            System.out.println("2 - Para Estagiário");
            System.out.println("3 - Para Funcionário PJ");
            System.out.println("0 - Para Sair");
            System.out.print("Escolha uma opção: ");
            
            int escolha = Integer.parseInt(scanner.nextLine());  
            
            Funcionario funcionario = null;  
            
            switch (escolha) {
                case 1:
                    funcionario = new Funcionario();  
                    break;
                case 2:
                    funcionario = new Estagiario();  
                    break;
                case 3:
                    funcionario = new FuncionarioPJ();  
                    break;
                case 0:
                    condition = false;  
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida.");  
            }

            if (funcionario != null) {
             
                System.out.print("Digite o nome: ");
                funcionario.setNome(scanner.nextLine());

                System.out.print("Digite o CPF: ");
                funcionario.setCpf(Integer.parseInt(scanner.nextLine()));

                System.out.print("Digite o salário: ");
                funcionario.setSalario(Double.parseDouble(scanner.nextLine()));

                System.out.println("\n--- Dados Cadastrados ---");
                System.out.println("Nome: " + funcionario.getNome());
                System.out.println("CPF: " + funcionario.getCpf());
                System.out.println("Salário: " + funcionario.getSalario());
            }
        }
        
        scanner.close();  
    }
}
