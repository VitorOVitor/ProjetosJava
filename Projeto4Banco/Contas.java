package Projeto4Banco;

 class Contas {
   String numroConta;
   String nomeTitular;
   double saldo;
   double limiteCredito;
   int agencia;
}

class ContaCorrente extends Contas{
    double manutencao;
    double taixaTransf;
    int numSaques;
}

class ContaPoupanca extends Contas{
    double taxaJuros;
    double limiteRetirada;
    double rendimentoAcumulado;
}
