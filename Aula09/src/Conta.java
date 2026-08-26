public abstract class Conta {
    private String numero;
    private String agencia;
    private String titular;
    private double saldo;

public Conta(String numero, String agencia, String titular, double saldo){
    this.numero = numero;
    this.agencia = agencia;
    this.titular = titular;
    this.saldo = saldo;
}
    public void deposito(double valor) {
        if(valor>=0) {
            saldo = saldo + valor;
        }
    }
public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo = saldo - valor;
            IO.println("Saque realizado com sucesso!");
        } else {
            IO.println("Saldo insuficiente!"   );
        }
    }
public double exibirSaldo() {
        return this.saldo;
}
public abstract void calcularTarifaMensal();
}
