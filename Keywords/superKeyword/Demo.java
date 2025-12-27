class A{
    int parvar;
    A(int a){
        System.out.println(a);
    }
    public void m1(int sum){
        System.out.println("m1 called");
        System.out.println("Sum is: "+sum);
    }
    public void display(){
        System.out.println(parvar);
    }
}
class B extends A{
    B(int a){
        super(a);
        System.out.println("Child class constructor called");
    }
    public void m2(int a,int b){
        System.out.println("m2 called");
        super.m1(a+b);
        super.parvar=20;
        super.display();
    }
}
class Demo {
    public static void main(String[] args) {
        B b = new B(10);
        b.m2(10,20);
    }
}
