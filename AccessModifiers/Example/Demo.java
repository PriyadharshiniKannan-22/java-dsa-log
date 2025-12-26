class Parent {
    private int privar = 10;
    protected int provar = 20;
    public int pubvar = 30;
    int defvar = 40; // default (package-private)

    public void display() {
        System.out.println("Private: " + privar);
        System.out.println("Protected: " + provar);
        System.out.println("Public: " + pubvar);
        System.out.println("Default: " + defvar);
    }
}

class Child extends Parent {
    public void childDisplay() {

        // privar NOT accessible (private)
        // privar = 100;

        provar = 200;   // protected (accessible in subclass)
        pubvar = 300;   // public
        defvar = 400;   // default (same package)

        System.out.println("Child access:");
        System.out.println("Protected: " + provar);
        System.out.println("Public: " + pubvar);
        System.out.println("Default: " + defvar);
    }
}

class Demo {
    public static void main(String[] args) {

        Parent p = new Parent();
        Child c = new Child();

        // Access through Parent object
        p.pubvar = 10;     // public
        p.provar = 20;     // protected (same package)
        p.defvar = 30;     // default (same package)
        // p.privar = 40;  // private

        p.display();

        // Access through Child object
        c.childDisplay();
    }
}

