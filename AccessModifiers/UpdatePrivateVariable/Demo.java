class test{
    private int pin;
    public int getPin(){
        return pin;
    }
    public void setPin(int pin){
        this.pin = pin;
    }
    public void updatePin(int pin){
        this.pin = pin;
    }
}
class Demo {
    public static void main(String[] args) {
        test t = new test();
        t.setPin(1234);
        System.out.println(t.getPin());
        int userInputPin = 1256;
        if(userInputPin==t.getPin()){
            t.updatePin(6789);
            System.out.println();
        }
        else{
            System.out.println("Invalid Pin");
        }
    }
}
