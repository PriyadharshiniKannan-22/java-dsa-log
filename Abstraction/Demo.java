abstract class Bank{
    public abstract int getInterestRate();
    public void displayBankName(){
        System.out.println("Bank name");
    }
}

class SBI extends Bank{
    public int getInterestRate(){
        return 6;
    }
}

class HDFC extends Bank{
    public int getInterestRate(){
        return 8;
    }
}

class Demo {
    public static void main(String[] args) {
        Bank b = new SBI();
        b.displayBankName();
        System.out.println(b.getInterestRate());

        Bank b2 = new HDFC();
        b2.displayBankName();
        System.out.println(b2.getInterestRate());
    }
}
