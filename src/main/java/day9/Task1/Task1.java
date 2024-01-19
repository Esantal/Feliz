package day9.Task1;

public class Task1 {
    public static void main(String[] args) {
Student s1 = new Student("Иванов Е.К.","9-б");
Teacher p1 =new Teacher("Сидоров С.А.","ОБЖ");
        System.out.println(s1.getGroupName());

        System.out.println(p1.getSubjectName());
        System.out.println();
        s1.printInfo();
        System.out.println();
        p1.printInfo();
    }
}
