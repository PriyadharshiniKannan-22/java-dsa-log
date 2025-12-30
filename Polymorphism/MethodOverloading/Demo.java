class Demo {
    public static void main(String[] args) {
        Demo obj = new Demo();
        obj.area(10);
        obj.area(5, 15);
    }
    
    //Overloading byy length of parameters
    public void area(int side) {
        System.out.println("Area of square: " + (side * side));
    }
    public void area(int length, int breadth) {
        System.out.println("Area of rectangle: " + (length * breadth));
    }

    //Overloading by type of parameters
    public void area(double radius) {
        System.out.println("Area of circle: " + (3.14 * radius * radius));
    }
}
