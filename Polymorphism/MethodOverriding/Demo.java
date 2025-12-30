class Parent{
    public void m1(){
        System.out.println("Parent method m1 called");
    }
    public void m2(){
        System.out.println("Parent method m2 called");
    }
}
class Child extends Parent{
    @Override
    public void m1(){
        System.out.println("Overridden Child method m1 called");
    }
    
    // m2() is inherited from Parent class without any change
}

class Demo {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.m1(); // Calls overridden method in Child class
        obj.m2(); // Calls inherited method from Parent class
    }
}
