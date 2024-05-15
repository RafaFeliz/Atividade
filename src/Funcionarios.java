import java.util.Scanner;
// informacoes basicas
class Funcionario {
    private String nome;
    private double valorHora;
    private int horasTrabalhadas;
    private String cargo;

//passar o valor do objeto para o main
    public Funcionario(String nome, double valorHora, int horasTrabalhadas, String cargo) {
        this.nome = nome;
        this.valorHora = valorHora;
        this.horasTrabalhadas = horasTrabalhadas;
        this.cargo = cargo;
    }
// conta do salario
    public double calcularSalario() {
        double salarioBase = valorHora * horasTrabalhadas;
        double bonificacao = 0;

        switch (cargo.toLowerCase()) {
            case "lider":
                bonificacao = salarioBase * 0.02;
                break;
            case "gerente":
                bonificacao = salarioBase * 0.05;
                break;
            default:
                break;
        }
        return salarioBase + bonificacao;
    }

    public void mostrarSalario() {
        System.out.printf("O salário do funcionário %s (%s) é: R$ %.2f%n", nome, cargo, calcularSalario());
    }
}