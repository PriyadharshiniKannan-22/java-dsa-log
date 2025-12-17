class Student{
    int id;
    String name;

    void display(){
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }
}

class Methods {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.id = 101;
        student1.name = "Alice";

        Student student2 = new Student();
        student2.id = 102;
        student2.name = "Bob";

        student1.display();
        student2.display();
    }
}
