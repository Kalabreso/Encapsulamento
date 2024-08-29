public class ContaBancaria {

    private String numero;
    private String agencia;
    private String cliente;
    private int saldo;

    public ContaBancaria(String numero, String agencia, String cliente, int saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.cliente = cliente;
        this.saldo = saldo;
    }


    public String getNumero() {
    return numero;
    }


    public void setNumero(String numero) {
    this.numero = numero;
    }


    public String getAgencia() {
    return agencia;
    }


    public void setAgencia(String agencia) {
    this.agencia = agencia;
    }


    public String getCliente() {
        return cliente;
    }


    public void setCliente(String cliente) {
        this.cliente = cliente;
    }


    public int getSaldo() {
        return saldo;
    }


    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public void sacar(int saque){
        if(saque > 0 && saque <= saldo){
            saldo -= saque;
            System.out.println("Valor sacado: " +saque);
            System.out.println("Novo saldo: "+saldo);
        }
        else{
            System.out.println("Valor de saque indisponível: ");
        }
    }

    public void depositar(int deposito){
        if(deposito > 0){
            saldo += deposito;
            System.out.println("Valor do depósito: "+deposito);
            System.out.println("Novo saldo: "+saldo);
        }
    }

    public void verSaldo1(){
        System.out.println("Saldo na conta pobre: "+saldo);
    }

    public void verSaldo2(){
        System.out.println("Saldo na conta pobre premium: "+saldo);
    }

    public void verSaldo3(){
        System.out.println("Saldo na conta rico: "+saldo);
    }


}