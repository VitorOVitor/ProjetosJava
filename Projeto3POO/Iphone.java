package Projeto3POO;
class Iphone{
public int modelo;
public String cor;
public int numeroCameras;
public int capacidadeBateria;
public double preco;

public void tocar(){
    System.out.println("BRRRRRRRRRRRRRRRRRRRRRRRRR");
}

public void pausar(){
System.out.println("O que voce estava fazendo pausou");
}

public String selecionarMusica(String nome){
    System.out.println("Agora a musica" + nome + "  Esta tocando");
    return nome;
}

public void ligar(String numero){
System.out.println("Voce esta ligando para o numero " + numero );
}

public void correioDeVoz(){
    System.out.println("Sua ligacao chegou na caixa postal, por favor deixe seu recado: ");
}

public String abrirUrl(String nome){
    System.out.println("Voce deseja abrir o site:" + nome);
    return nome;
}




}