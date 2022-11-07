package conta;

public class Conta {


        private int numero;
        private int agencia;
        private int tipo;
        private String titular;
        private float saldo;


    public Conta(int numero, int agencia, int tipo, String titular, float saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.tipo = tipo;
        this.titular = titular;
        this.saldo = saldo;
    }

    public int numero() {
        return numero;
    }

    public int agencia() {
        return agencia;
    }

    public int tipo() {
        return tipo;
    }

    public String titular() {
        return titular;
    }

    public float saldo() {
        return saldo;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }


}