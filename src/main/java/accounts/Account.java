package accounts;

public record Account(
        int id,
        int customerId,
        String type,
        double balance) {
    public void bal() {
        System.out.println("Balance: " + balance);
    }
}
