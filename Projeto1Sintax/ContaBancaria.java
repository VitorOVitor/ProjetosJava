package Projeto1Sintax;

class ContaBancaria {
    int numero;
    String agencia;
    String NomeCliente;
    double SaldoDecimal;

    ContaBancaria(){
        this.numero=1024;
        this.agencia="067-8";
        this.NomeCliente="MARIO ANDRADE";
        this.SaldoDecimal=237.48;
    }

    ContaBancaria(int numero, String agencia, String NomeCliente, double SaldoDecimal){
        this.numero=numero;
        this.agencia=agencia;
        this.NomeCliente=NomeCliente;
        this.SaldoDecimal=SaldoDecimal;
    }
}


