import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nome do funcionario: ");
        String nome= scanner.nextLine();

        System.out.print("Valor da hora trabalhada: ");
        double valorHora = scanner.nextDouble();

        System.out.print("Quantidade de horas trabalhadas no mês: ");
        int horasdeTrabalho = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Cargo do funcionário (normal, lider, gerente): ");
        String cargo = scanner.nextLine();

        Funcionario funcionario = new Funcionario(nome,valorHora, horasdeTrabalho, cargo);
        funcionario.mostrarSalario();

    }
}


