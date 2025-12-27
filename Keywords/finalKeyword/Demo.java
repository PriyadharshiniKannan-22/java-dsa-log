final class Vehicle {        // 1final class (cannot be inherited)

    final int MAX_SPEED = 120;   // final variable (constant)

    final void displaySpeed() {  // final method (cannot be overridden)
        System.out.println("Max speed is: " + MAX_SPEED);
    }
}

// This will cause a compile-time error
// class Car extends Vehicle { }

class Bike {

    final int speed;    // final variable (must be initialized)

    Bike(int speed) {
        this.speed = speed;   // initialized once
    }

    void show() {
        System.out.println("Bike speed: " + speed);
    }
}

class Demo {
    public static void main(String[] args) {

        Vehicle v = new Vehicle();
        v.displaySpeed();

        Bike b = new Bike(80);
        b.show();

        // Cannot change final variable
        // v.MAX_SPEED = 150;
        // b.speed = 90;
    }
}

