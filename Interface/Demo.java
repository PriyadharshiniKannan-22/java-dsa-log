interface interface1 {
    public void m1();
    public void m2();
    public void m3();
}
interface interface2 {
    public void m1();
    public void m2();
    public void m3();
}
class child implements interface1,interface2{
    public void m1(){
        System.out.println("m1 called");
    }
    public void m2(){
        System.out.println("m2 called");
    }
    public void m3(){
        System.out.println("m3 called");
    }
}
class Demo{
    public static void main(String[] args) {
        child c = new child();
        c.m1();
        c.m2();
        c.m3();
    }
}
