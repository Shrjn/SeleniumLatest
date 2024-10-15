package ClassesAndObjects;
public class employeeDetails {
    String name;
    int sal;
    int employeeid;

    void display()
    {
        System.out.println(name);
        System.out.println(employeeid);
        System.out.println(sal);
    }
    public static void main(String[] args)
    {
        employeeDetails emp = new employeeDetails();
        emp.employeeid = 460349834;
        emp.name = "Shruti";
        emp.sal = 80954;
        emp.display();
        System.out.println("-------------------");
        employeeDetails emp2 = new employeeDetails();
        emp2.employeeid = 223823;
        emp2.name = "Devisha";
        emp2.sal = 908222;
        emp2.display();
    }
}
