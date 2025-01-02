package Projeto4Banco;
import java.util.Scanner;
public class main {
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Criação de novo Cliente:");
        System.out.print("Digite o ID do Cliente: ");
        String idCliente = scanner.nextLine();

        System.out.print("Digite o nome completo do Cliente: ");
        String nomeCliente = scanner.nextLine();

        System.out.print("Digite o CPF do Cliente: ");
        String cpfCliente = scanner.nextLine();

        System.out.print("Digite o e-mail do Cliente: ");
        String emailCliente = scanner.nextLine();

        System.out.print("Digite o telefone do Cliente: ");
        String telefoneCliente = scanner.nextLine();

        Clientes cliente = new Clientes();
        cliente.ID = idCliente;
        cliente.nomeCompleto = nomeCliente;
        cliente.CPF = cpfCliente;
        cliente.email = emailCliente;
        cliente.telefone = telefoneCliente;

        System.out.println("\nEscolha o tipo de conta a ser criada:");
        System.out.println("1. Conta Corrente");
        System.out.println("2. Conta Poupança");
        int tipoConta = scanner.nextInt();
        scanner.nextLine();

        if (tipoConta == 1) {
            ContaCorrente contaCorrente = new ContaCorrente();

            System.out.print("\nDigite o número da conta: ");
            contaCorrente.numroConta = scanner.nextLine();

            System.out.print("Digite o nome do titular: ");
            contaCorrente.nomeTitular = scanner.nextLine();

            System.out.print("Digite o saldo inicial: ");
            contaCorrente.saldo = scanner.nextDouble();

            System.out.print("Digite o limite de crédito: ");
            contaCorrente.limiteCredito = scanner.nextDouble();

            System.out.print("Digite o número da agência: ");
            contaCorrente.agencia = scanner.nextInt();

            System.out.print("Digite a taxa de manutenção mensal: ");
            contaCorrente.manutencao = scanner.nextDouble();

            System.out.print("Digite a taxa de transferência: ");
            contaCorrente.taixaTransf = scanner.nextDouble();

            System.out.print("Digite o número de saques mensais permitidos: ");
            contaCorrente.numSaques = scanner.nextInt();

            System.out.println("\nConta Corrente criada com sucesso!");
            System.out.println("Número da Conta: " + contaCorrente.numroConta);
            System.out.println("Nome do Titular: " + contaCorrente.nomeTitular);
            System.out.println("Saldo Inicial: " + contaCorrente.saldo);
            System.out.println("Limite de Crédito: " + contaCorrente.limiteCredito);
            System.out.println("Agência: " + contaCorrente.agencia);
            System.out.println("Taxa de Manutenção: " + contaCorrente.manutencao);
            System.out.println("Taxa de Transferência: " + contaCorrente.taixaTransf);
            System.out.println("Número de Saques Permitidos: " + contaCorrente.numSaques);

        } else if (tipoConta == 2) {
            ContaPoupanca contaPoupanca = new ContaPoupanca();

            System.out.print("\nDigite o número da conta: ");
            contaPoupanca.numroConta = scanner.nextLine();

            System.out.print("Digite o nome do titular: ");
            contaPoupanca.nomeTitular = scanner.nextLine();

            System.out.print("Digite o saldo inicial: ");
            contaPoupanca.saldo = scanner.nextDouble();

            System.out.print("Digite o limite de retirada: ");
            contaPoupanca.limiteRetirada = scanner.nextDouble();

            System.out.print("Digite a taxa de juros: ");
            contaPoupanca.taxaJuros = scanner.nextDouble();

            System.out.print("Digite o rendimento acumulado: ");
            contaPoupanca.rendimentoAcumulado = scanner.nextDouble();

            System.out.print("Digite o número da agência: ");
            contaPoupanca.agencia = scanner.nextInt();

            System.out.println("\nConta Poupança criada com sucesso!");
            System.out.println("Número da Conta: " + contaPoupanca.numroConta);
            System.out.println("Nome do Titular: " + contaPoupanca.nomeTitular);
            System.out.println("Saldo Inicial: " + contaPoupanca.saldo);
            System.out.println("Limite de Retirada: " + contaPoupanca.limiteRetirada);
            System.out.println("Taxa de Juros: " + contaPoupanca.taxaJuros);
            System.out.println("Rendimento Acumulado: " + contaPoupanca.rendimentoAcumulado);
            System.out.println("Agência: " + contaPoupanca.agencia);

        } else {
            System.out.println("Opção inválida.");
        }

        scanner.close();
    }
}


