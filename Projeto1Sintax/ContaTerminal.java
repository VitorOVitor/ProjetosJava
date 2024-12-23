package Projeto1Sintax;
import java.util.*;


public class ContaTerminal {
    public static void main(String[] args){
    Scanner teclado= new Scanner(System.in);

    System.out.println("Bem vindo ao banco DIO! Para abrir uma conta, por favor, coloque algumas informacoes:");
    System.out.println("Coloque o numero da sua conta:");
    int numero=teclado.nextInt();
    teclado.nextLine();
    System.out.println("Por favor, coloque a agencia");
    String agencia=teclado.nextLine();
    System.out.println("Por favor, coloque seu nome:");
    String nome= teclado.nextLine();
    System.out.println("Por favor, coloque o seu saldo:");
    double saldo=teclado.nextDouble();
    teclado.nextLine();

    ContaBancaria conta= new ContaBancaria(numero,agencia, nome, saldo);
    System.out.println("Ola" + " "+ nome+ " "+ "obrigado por criar uma conta em nosso banco, sua agencia e " +agencia+ " "+"conta" +numero+ " " +"e seu saldo" + saldo +" "+"ja esta disponivel para saque");
    teclado.close();

    }
}
