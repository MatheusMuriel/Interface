public class ContaCorrente extends Conta implements Tributavel
{
    public ContaCorrente(int numero, String titular){
      super(numero, titular);
    }

    public void cobrarTarifa(double valor){ //Tem que ser a mesma assinatura do metodo na classe abstrata //assinatura = Retorno + Nome + Parametros(Tipo de dados)
      saldo -= valor; //Subtrai e atribui
    }

    public double calculaTributo(){
      return this.saldo * 0.01;
    }
}
