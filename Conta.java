public abstract class Conta
{
    private int numero;
    protected double saldo;
    private String titular;
    
    public Conta (int nnumero, String titular)
    {
        this.numero = numero;
        this.titular = titular;
        this.saldo = 0;
    }
    
    public double getSaldo()
    {
        return this.saldo;
    }
    
    public void depositar(double valor)
    {
        this.saldo = this.saldo + valor;
    }
    
    public void sacar (double valor)
    {
        this.saldo = this.saldo - valor;
    }
    
    public abstract void cobrarTarifa(double valor);
}