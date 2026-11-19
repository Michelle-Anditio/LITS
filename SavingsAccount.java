public class SavingsAccount extends BankAccount {
  private double interestRate;

  public SavingsAccount(String owner, double balance, double interestRate) {
    super(owner, balance);
    this.interestRate = interestRate;
  }

  public void addInterest() {
    double interest = getBalance() * interestRate;
    deposit(interest);
  }

  public static void main(String[] args) {
    SavingsAccount sari = new SavingsAccount("Sari", 1000, 0.05);
    sari.addInterest();
    System.out.println("Sari: " + sari.getBalance());

    sari.withdraw(50);
    System.out.println("After withdraw: " + sari.getBalance());

    BankAccount budi = new BankAccount("Budi", 0);
    sari.transfer(budi, 200);
    System.out.println("Sari: " + sari.getBalance());
    System.out.println("Budi: " + budi.getBalance());
  }
}