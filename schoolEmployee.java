
public class schoolEmployee {


    int salary = 2000;


    public static class teacher extends schoolEmployee{
        int bonus = 1000;

    }

    public static void main(String args[]){

        teacher a = new teacher();

        System.out.println("Teacher Salary: " + a.salary);
        System.out.println("Employee Bonus: " + a.bonus);

    }
}
