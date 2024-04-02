package Array.ArrayOfObjects;

/**
 * Here we have a class Student which is having three instance varibales name,
 * rollNo and marks.
 * Its also having a parametrized constructor to set these three instance
 * varibales.
 * 
 * In the main class we have created three objects of Student class namely std,
 * std1 and std2.
 * Now we have created an array of Student class namely students and we are
 * using Enhanced for loop to get marks of
 * these instance varibales value stored in students array.
 */

class Student {
    String name;
    int rollNo;
    float marks;

    Student(String name, int rollNo, float marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }
}

public class ObjectsArray {

    public static void main(String[] args) {

        Student std = new Student("Gaurav", 1, 100f);
        Student std1 = new Student("Bhatt", 2, 100f);
        Student std2 = new Student("Bhatt1", 3, 100f);

        Student students[] = new Student[3];
        students[0] = std;
        students[1] = std1;
        students[2] = std2;

        for (Student stds : students) {
            System.out.println(stds.name + " " + stds.marks);
        }
    }

}
