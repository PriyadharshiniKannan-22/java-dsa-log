class Student {
        int rollNo;
        String name;
        Student(int rollNo, String name){
            this.rollNo = rollNo;
            this.name = name;
        }
        void display(){
            System.out.println("Roll No: " + rollNo);
            System.out.println("Name: " + name);
    }
}

class ParameterisedConstructor {
    public static void main(String[] args) {
        Student student1 = new Student(1, "Alice");
        Student student2 = new Student(2, "Bob");
        
        student1.display();
        student2.display();
    }
}