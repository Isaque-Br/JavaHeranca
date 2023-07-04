package entities;

public class Account {

    private Integer number;             // NUMERO DA CONTA
    private String holder;             // TITULAR
    protected Double balance;           // SALDO DA CONTA

    public Account() {                // CONSTRUTOR PADRAO

    }

    public Account(Integer number, String holder, Double balance) {         // CONSTRUTOR COM ARGUMENTOS
        this.number = number;
        this.holder = holder;
        this.balance = balance;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    /*public void setBalance(Double balance) {        // TIRAMOS O SET BAANCE PARA NAO PODER ALTERAR O SALDO LIVREMENTE
        this.balance = balance;
    } */

    public void withdraw(double amount) {           // METODO SACAR -
        balance -= amount + 5.0;                          // DESCONTA A QUANTIA DE SAQUE DO SALDO
    }

    public void deposit(double amount) {
        balance =+ amount;                          // RECEBE O BAALNCE + A QUANTIDADE
    }
}
