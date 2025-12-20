class Student {
    int rollNo;
    String name;
    int copyrollNo;
    String copyname;
    Student(int rollNo, String name){
        this.rollNo = rollNo;
        this.name = name;
    }
    // Copy Constructor
    Student(Student s){
        this.copyrollNo = s.rollNo;
        this.copyname = s.name;
    }   
    void display(){
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
    }   
    void Copydisplay(){
        System.out.println("Copy Roll No: " + copyrollNo);
        System.out.println("Copy Name: " + copyname);
    }
}

class CopyConstructor {
    public static void main(String[] args) {
        Student student1 = new Student(1, "Alice");
        Student student2 = new Student(student1); // Using Copy Constructor
        
        student1.display();
        student2.Copydisplay();
    }
}
