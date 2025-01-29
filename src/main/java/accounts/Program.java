package accounts;

public class Program {
    public static void main(String[] args) {
        Account account = new Account(123, 789, "CHECKING", 1000);
        System.out.println("============");
        System.out.println(account);
        account.bal();
        System.out.println(account.id());
        System.out.println(account.customerId());
        System.out.println(account.type());
        System.out.println(account.balance());
        System.out.println("============");
    }
}
