public class BankAccount {
    private String owner;
    private double balance;

    public BankAccount(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    public String getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }

    public boolean deposit(double amount) {
        if (amount <= 0) {
            return false;
        }
        balance += amount;
        return true;
    }

    public boolean withdraw(double amount) {
        if (amount <= 0 || amount > balance) {
            return false;
        }
        balance -= amount;
        return true;
    }

    public boolean transfer(BankAccount to, double amount) {
        if (!withdraw(amount)) {
            return false;
        }
        to.deposit(amount);
        return true;
    }

    public static void main(String[] args) {
        BankAccount budi = new BankAccount("Budi", 500);
        BankAccount sari = new BankAccount("Sari", 0);

        System.out.println(budi.transfer(sari, 200));
        System.out.println("Budi: " + budi.getBalance());
        System.out.println("Sari: " + sari.getBalance());

        System.out.println(budi.transfer(sari, 1000));
        System.out.println("Budi: " + budi.getBalance());
    }
}