public class Employee extends Person{
    private String name = getName();
    private double salary;
    private int startWork;
    private String insNum;

    public Employee(){

    }
    public Employee(String name, double sal, int workStart, String insNum){
        setName(name);
        this.salary = sal;
        this.startWork = workStart;
        this.insNum = insNum;
    }
    public Employee(String name, double salary){
        setName(name);
        this.salary = salary;
    }
    public Employee(String name){
        setName(name);
    }
    public void setSalary(double sal){
        this.salary = sal;
    }
    public String toString(){
        return "Employee Name: "
        + name + "Salary: $"
        + salary + "Time Started Working: "
        + startWork + "Insurance Number: "
        + insNum;
    }
    public void message(){
        System.out.println("Employee Class - Salary: " + salary + " Year: " + startWork);
    }
    public void display(){
        super.message();
        message();
    }
}