package Entity.Exercise4;

public class Account {
    private int id;
    private String name;
    private int balance;
    private int amount;

    public Account(int id, String name, int balance){
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public int balance(){
        return balance;
    }

    public int credit(int amount){
        return amount;
    }


    public int debit(int amount){
        return amount;
    }

    public void toTranfer(Account account, int amount){
        System.out.println("Tranfer: " + account + " to " + account.getName());
    }
}
