class Student {
    Student() {
        System.out.println("Length of arguments: 0");
    }
    Student(int a) {
        System.out.println("Length of arguments: 1");
    }  
}
class OverloadedConstructor {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student(10);
    }
}
