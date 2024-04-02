package AnonymousObjects;

/**
 * So we have a employee class and now if we say
 * 
 * Employee emp = new Employee();
 * 
 * this emp is refernce varibale created in stack and new Employee() this line
 * creates a object in heap.
 * emp will be storing the address/memory location of the the object of Employee
 * in heap. Such objects are called as
 * reference objects whereas if we directly say
 * 
 * new Employee().showDetails(); it still works but what happens now, we dont
 * have a refernce varibale which is storing
 * the memory location of this object of employee in heap although new
 * Employee() creates a new object in heap and thus
 * we will be able to access the instance varibles and rest all methods of class
 * but however this object once used
 * can't be reused as simply we don't keep a track of refernce of this object in
 * heap.
 * 
 * If we again do new Employee().showDetails(); this will again create a new
 * Employee.
 * 
 * Such unrefernced objects inside heap memoery as known as anonymus objects in
 * java.
 * 
 */

class Employee {
    int empID;
    String name;

    public Employee() {
    };

    public void showDetails() {
        System.out.println(this.empID + " " + this.name);
    }
}

public class AnonymusObjects {
    public static void main(String[] args) {

        new Employee().showDetails();

    }
}
