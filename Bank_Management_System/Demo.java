import java.util.Scanner;
class Account{
    String name;
    int acc_no;
    String acc_type;
    double balance;
    double interest;
    String mobile_no;
    Account(String name,int acc_no,String acc_type,double balance,double interest,String mobile_no){
        this.name = name;
        this.acc_no = acc_no;
        this.acc_type = acc_type;
        this.balance = balance;
        this.interest = interest;
        this.mobile_no = mobile_no;
    }
    public void Display(){
        System.out.println("Customer Details:");
        System.out.println("Name:" + name);
        System.out.println("Account Number:" + acc_no);
        System.out.println("Account Type:" + acc_type);
        System.out.println("Mobile Number:" + mobile_no);
        System.out.println("Balance:" + balance);
        System.out.println("Interest:" + interest);
    }
    public void checkBalance(int acc_no){
        System.out.println("Balance:" + balance);
    }
    public void Credit(int amount){
        this.balance += amount;
        System.out.println("New Balance after Credit:" + balance);
    }
    public void Withdraw(int amount){
        if(amount<=this.balance){
            this.balance -= amount;
        System.out.println("New Balance after Withdrawal:" + balance);
        }
        else{
            System.out.println("Insufficient Balance");
        }
    }
}

class Savings extends Account{
    Savings(String name,int acc_no,String acc_type,double balance,double interest,String mobile_no){
        super(name,acc_no,acc_type,balance,interest,mobile_no);
    }
}

class Current extends Account{
    Current(String name,int acc_no,String acc_type,double balance,double interest,String mobile_no){
        super(name,acc_no,acc_type,balance,interest,mobile_no);
    }
}

class Demo{
    public static void main(String[] args){
        System.out.println("Bank Management System");
        System.out.println("-----------------------");
        System.out.println("Select one of the following options:");
        System.out.println("1. Create Account");
        System.out.println("2. Check Balance");
        System.out.println("3. View Account Details");        
        System.out.println("4. Credit Amount");        
        System.out.println("5. Withdraw Amount");        
        System.out.println("6. Transfer Amount"); 
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();
        sc.nextLine(); 
        Savings s = null;
        Current c = null;
        
        while(option>=1 && option<=5){
            switch(option){
                case 1:
                    System.out.println("Enter Name:");
                    String name = sc.nextLine();
                    System.out.println("Enter Account no:");
                    int acc_no = sc.nextInt();
                    sc.nextLine(); 
                    System.out.println("Enter Account type:");
                    String acc_type = sc.nextLine();
                    System.out.println("Enter Balance:");
                    double balance = sc.nextDouble();
                    sc.nextLine();
                    System.out.println("Enter Interest:");
                    double interest = sc.nextDouble();
                    sc.nextLine();
                    System.out.println("Enter Mobile no:");
                    String mobile_no = sc.nextLine();

                    if(acc_type.equalsIgnoreCase("Savings")){
                        s = new Savings(name, acc_no, acc_type, balance, interest,mobile_no);
                    }

                    if(acc_type.equalsIgnoreCase("Current")){
                        c = new Current(name, acc_no, acc_type, balance, interest,mobile_no);
                    }
                    break;

                case 2:
                    System.out.println("Enter Account no:");
                    int inp_acc_no = sc.nextInt();
                    
                    if(s!=null && inp_acc_no==s.acc_no){
                        s.checkBalance(inp_acc_no);
                    }
                    else if(c!=null && inp_acc_no==c.acc_no){
                        c.checkBalance(inp_acc_no);
                    }
                    else{
                        System.out.println("Invalid Account no.");
                    }
                    break;

                case 3:
                    System.out.println("Enter Account no:");
                    int inp_acc_no1 = sc.nextInt();

                    if(s!=null && inp_acc_no1==s.acc_no){
                        s.Display();
                    }
                    else if(c!=null && inp_acc_no1==c.acc_no){
                        c.Display();
                    }
                    else{
                        System.out.println("Invalid Account no.");
                    }
                    break;

                case 4:
                    System.out.println("Enter Account no:");
                    int inp_acc_no2 = sc.nextInt();
                    System.out.println("Enter amount to credit:");
                    int amount = sc.nextInt();

                    if(s!=null && inp_acc_no2==s.acc_no){
                        s.Credit(amount);
                    }
                    else if(c!=null && inp_acc_no2==c.acc_no){
                        c.Credit(amount);
                    }
                    else{
                        System.out.println("Invalid Account no.");
                    }
                    break;

                case 5:
                    System.out.println("Enter Account no:");
                    int inp_acc_no3 = sc.nextInt();
                    System.out.println("Enter amount to withdraw:");
                    int amount1 = sc.nextInt();

                    if(s!=null && inp_acc_no3==s.acc_no){
                        s.Withdraw(amount1);
                    }
                    else if(c!=null && inp_acc_no3==c.acc_no){
                        c.Withdraw(amount1);
                    }
                    else{
                        System.out.println("Invalid Account no.");
                    }
                    break;

                default:
                    System.out.println("Invalid option selected.");
            }
        }        
        sc.close();
    }
}