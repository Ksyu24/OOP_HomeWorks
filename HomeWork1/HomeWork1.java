package HomeWork1;

import java.time.LocalDate;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class HomeWork1 {

    public static void main(String[] args) {

        Account account1=new Account(1234,"Шаповаленко Ксения Викторовна", 1000);
        Account account2=new Account(1235, 0);
        CreditAccount account3=new CreditAccount(1236,"Иванов Иван Иванович", 100000);
        DepositAccount account4=new DepositAccount(1237,"Александрова Александра Александровна", 400);

        System.out.println(account1.toString());
        System.out.println(account2.toString());
        System.out.println(account3.toString());
        System.out.println(account4.toString());

        //пополнение и снятие средств со счета
        account1.putAmount(230);
        System.out.println(account1.toString());
        account1.takeAmount(300);
        System.out.println(account1.toString());
        account1.takeAmount(3000);
        System.out.println(account1.toString());

        //снятие с кредитного счета
        System.out.println(account3.toString());
        account3.takeAmount(3000);
        System.out.println(account3.toString()); //сняли 3000, плюс 30 (1% от суммы снятия) ИТОГО из счета вычли 3030
        account3.takeAmount(300000);
        System.out.println(account3.toString());

        //пополнение и снятие с депозитного счета
        System.out.println(account4.toString());
        account4.putAmount(2300);
        System.out.println(account4.toString());

        account4.takeAmount(300);
        System.out.println(account4.toString());

        account4.setNow(LocalDate.now().plusDays(20));
        account4.takeAmount(3000);
        System.out.println(account4.toString());

        account4.setNow(LocalDate.now().plusDays(39));
        account4.takeAmount(300);
        System.out.println(account4.toString());

        account4.takeAmount(30000);
        System.out.println(account4.toString());
    }
}
