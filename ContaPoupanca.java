public class ContaPoupanca extends Conta
{
    public ContaPoupanca(int numero, String titular){
      super(numero, titular);
    }

    public void addRendimento(float valor){
      saldo += valor; //Soma tudo e atribui ao saldo
    }

    public void cobrarTarifa(double valor){
      saldo -= valor; //Subtrai e atribui ao saldo
    }

}
