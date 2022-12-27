
public class BankAccount {


public int accountnumber;
    public String customername;

    public String email;
    public  int phonenumber;


    public BankAccount(int accountnumber, String customername, String email, int phonenumber, Double balance) {
        this.accountnumber = accountnumber;
        this.customername = customername;
        this.email = email;
        this.phonenumber = phonenumber;
        this.balance = balance;
    }

    public BankAccount(int accountnumber, String customername, String email, int phonenumber){

    }

    public void deposit(Double depositamount){
        this.balance += depositamount;
        System.out.println(" deposit balance  "   +depositamount  + " balance  "   +this.balance);

    }
    public void withdraw(Double withdrawamount) {
        if(balance-withdrawamount<=0){
            System.out.println("invalid funds  "  +this.balance +  " available ");
        }else {
            this.balance -= withdrawamount;
            System.out.println(" withdraw balance  " + withdrawamount + " remaining balance " +this.balance );
        }

    }

    public int getAccountnumber() {
        return accountnumber;
    }

    public void setAccountnumber(int accountnumber) {
        this.accountnumber = accountnumber;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public String getCustomername() {
        return customername;
    }

    public void setCustomername(String customername) {
        this.customername = customername;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(int phonenumber) {
        this.phonenumber = phonenumber;
    }

    public Double balance;





}
