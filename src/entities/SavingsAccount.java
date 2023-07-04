package entities;
// CLASSE conta poupança
public class SavingsAccount extends Account {   // HERDA TODOS OS MEMBROS DA CONTA COMUM(CLASSE BASE)

    private Double interestRate;                // TAXA DE JUROS

    public SavingsAccount() {
        super();
    }

    public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
        super(number, holder, balance);         // CONSTRUTOR DA SUPERCLASSE
        this.interestRate = interestRate;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    public void updateBalance() {           // METODO QUE ATUALIZA O SALDO MAIS A TAXA DE JUROS
        balance += balance * interestRate;  // SALDO RECEBE ELE MESMO MAIS O SALDO MULTIPLICADO PELA TAXA(0,01) EX:
    }
    @Override       // INFORMANDO O COMPILADOR QUE É UMA SOBREPOSIÇÃO
    public void withdraw(double amount) {       // METODO DE SAQUE
        balance -= amount;                      // SALDO DA CONTA - O SAQUE
    }
}
