package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {
    public static void main(String[] args) {

        Account acc = new Account(1001, "Alex", 0.0);
        BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);

        // UPCASTING é eu pegar um oobjeto BusinessAcount e atribui-lo para uma varial do tipo Acount
        Account acc1 = bacc;  // VARIAVEL RECEBE O OBJETO QUE ESTÁ EM bacc (BusinessAccount/ SubClass) BuinessAccount é sub cass e é uma conta
        Account acc2 = new BusinessAccount(1003, "Jose", 0.0,200.0);  // ATRIBUINDO UM OBJETO DA SUBCLASS PARA SUPERCLAS
                        // ATRIBUINDO O OBJETO DA SUBCLASSE PARA SUPERCLASSE
        Account acc3 = new SavingsAccount(1004, "Bob", 0.0, 0.01);

        // DOWNCASTING É CONVERTER UM OBJETO DA SUPERCLASSE PARA A SUBCLASSE
        BusinessAccount acc4 = (BusinessAccount) acc2;  // CAST - FORÇANDO A CONVERSÃO DA SUPERCLASS PARA SE TORNAR SUB (DOWNCAST)
        acc4.loan(100.0);

        // BusinessAccount acc5 = (BusinessAccount) acc3;
        if (acc3 instanceof BusinessAccount) {  // SE A VARIAVEL QUE ESTIVER EM acc3 FOR UMA INSTANCIA BusinessAccount>
            BusinessAccount acc5 = (BusinessAccount) acc3;   // ...CONSIGO FAZER O CASTING
            acc5.loan(200.0);
            System.out.println("Loan");
        }

        if (acc3 instanceof SavingsAccount) {       // TESTANDO SE O OBJETO acc3 É INSTANCIA DO SavingsAccount
            SavingsAccount acc5 = (SavingsAccount) acc3;        // SavingsAccount acc5 RECEBECE O DOWNCASTING DE ACC3
            acc5.updateBalance();
            System.out.println("Update");
        }













     /*   BusinessAccount account = new BusinessAccount();            // CRIANDO OBJETO DE BUSINESS ACCOUNT

        account.getBalance();                   // CHAMANDO BALANCE E INSTANCIANDO */
    }
}