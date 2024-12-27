package Projeto2ControleFluxo;
import java.util.*;

public class Projeto2 {
    public static void main(String[] args){
        Scanner teclado= new Scanner(System.in);
        int num1=teclado.nextInt();
        int num2=teclado.nextInt();
          try{
            contar(num1, num2);
          }catch(ParametrosInvalidosException Exception){
          System.out.println("O numero 1 deve ser menor que o numero 2");
          }

        teclado.close();
    }

    public static void contar(int num1, int num2) throws ParametrosInvalidosException{
        if(num1>=num2){
            throw new ParametrosInvalidosException("Numero 1 maior que numero 2");
        }
        for(int i=num1; i<=num2; i++){
            System.out.println("Imprimindo numero" + " " + i);
            i++;
        }
    }
}

// Exceção personalizada
class ParametrosInvalidosException extends Exception {

    // Construtor sem parâmetros
    public ParametrosInvalidosException() {
        super();
    }

    // Construtor com mensagem
    public ParametrosInvalidosException(String mensagem) {
        super(mensagem);
    }

    // Construtor com mensagem e causa
    public ParametrosInvalidosException(String mensagem, Throwable causa) {
        super(mensagem, causa);
    }

    // Construtor com a causa da exceção
    public ParametrosInvalidosException(Throwable causa) {
        super(causa);
    }
}

