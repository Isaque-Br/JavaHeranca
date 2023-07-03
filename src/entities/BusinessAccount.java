package entities;
            // SUBCLASS DE ACCOUNT
public class BusinessAccount extends Account {       // HERDANDO TODOS OS DADOS E COMPORTAMENTOS DA CLASS ACCOUNT

    private Double loanLimit;

    public BusinessAccount() {
        super();                // SE QUISER IMPLEMENTAR ALGUMA LOGICA NA SUBCLASS DA CLASS ACCOUNT(BASE/SUPER)
    }
    // CONSTRUTOR SUPER COM 4 ARGUMENTOS
    public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
        super(number, holder, balance);         // CONSTRUTOR DO CLASS ACCOUNT
        this.loanLimit = loanLimit;
    }

    public Double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(Double loanLimit) {
        this.loanLimit = loanLimit;
    }

    public void loan(double amount) {           // METODO EMPRESTIMO DOUBLE QUANTIA
        if (amount <= loanLimit)  {           // SE A QUANTIA QUE FOR EMPRESTAR É ENOR OU IGUAL AO LIMITE DO EMPRESTIMO
            balance += amount - 10.0;          // DEIXANDO O ATRIBUTO BALANCE EM PROTECTED E CONSEGUINDO ACESSA-LO ATRAVES DE SUBCLASS
        }                                      // PEGANDO O SALDO SOMANDO COM O EMPRETIMO - A TAXA
    }
}
