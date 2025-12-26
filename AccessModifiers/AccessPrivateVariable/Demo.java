class test {
    private int pin = 1234;
    public int getPin(){ //Method to access a private variable
        return pin;
    }
}
class Demo{
    public static void main(String[] args) {
        test t = new test();
        int pin = t.getPin();
        System.out.println(pin);
    }
}