import java.time.*;

// Classe abstraite Personne

abstract class Personne {
    protected LocalDate dateNaissance;
    protected boolean isHandicape;
    protected String nom;
    protected String prenom;
    public Personne(String nom, String prenom, LocalDate dateNaissance, boolean isHandicape) {
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.isHandicape = isHandicape;

    }




    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }


    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }


    public LocalDate getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(LocalDate dateNaissance) {
        this.dateNaissance = dateNaissance;
    }



    public boolean isHandicape() {
        return isHandicape;
    }

    public void setHandicape(boolean handicape) {
        this.isHandicape = handicape;
    }




}



















/*// Interface
interface Account {
    void deposit(double amount);
    void withdraw(double amount) throws InsufficientBalanceException;
    double getBalance();
}
====================================================
// Custom Exception
class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}
    =====================================================
    // Base Class
class Person {
    protected String name;
    protected int id;

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void displayInfo() {
        System.out.println("👤 Name: " + name + ", ID: " + id);
    }
}
=====================================================
// Subclass
class Client extends Person {
    private BankAccount account;

    public Client(String name, int id, double initialDeposit) {
        super(name, id);
        this.account = new BankAccount(initialDeposit);
    }

    public BankAccount getAccount() {
        return account;
    }

    public void displayClientInfo() {
        displayInfo();
        System.out.println("💰 Current Balance: " + account.getBalance() + " DA");
    }
}
==========================================
// Class implementing the interface
class BankAccount implements Account {
    private double balance;

    public BankAccount(double initialDeposit) {
        this.balance = initialDeposit;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("✅ Deposited: " + amount + " DA");
    }

    @Override
    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("❌ Not enough balance to withdraw " + amount + " DA");
        }
        balance -= amount;
        System.out.println("✅ Withdrawn: " + amount + " DA");
    }

    @Override
    public double getBalance() {
        return balance;
    }
}

// Class implementing the interface
class BankAccount implements Account {
    private double balance;

    public BankAccount(double initialDeposit) {
        this.balance = initialDeposit;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("✅ Deposited: " + amount + " DA");
    }

    @Override
    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("❌ Not enough balance to withdraw " + amount + " DA");
        }
        balance -= amount;
        System.out.println("✅ Withdrawn: " + amount + " DA");
    }

    @Override
    public double getBalance() {
        return balance;
    }
}
// Main class to test everything
public class BankTest {
    public static void main(String[] args) {
        Client client = new Client("Walid Boukhelifa", 101, 5000);

        client.displayClientInfo();

        try {
            client.getAccount().deposit(1500);
            client.getAccount().withdraw(2000);
            client.getAccount().withdraw(6000); // This will throw the exception
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("🔎 Final Balance: " + client.getAccount().getBalance() + " DA");
    }
}
// Main class to test everything
public class BankTest {
    public static void main(String[] args) {
        Client client = new Client("Walid Boukhelifa", 101, 5000);

        client.displayClientInfo();

        try {
            client.getAccount().deposit(1500);
            client.getAccount().withdraw(2000);
            client.getAccount().withdraw(6000); // This will throw the exception
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("🔎 Final Balance: " + client.getAccount().getBalance() + " DA");
    }
}

 */
