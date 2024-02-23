package lab1l;
class Employee{
    private
    int emp_id;
    int emp_sal;
    int days;
    String emp_name;
    float bonus;
   
    public
    Employee(int id, String name,int sal, int ds){
        emp_id=id;
        emp_name=name;
        emp_sal=sal;
        days=ds;
    }
    void calc_bonus(){
        if(days>150){
            bonus=(emp_sal)*25/100;
        }else if(days>=100&&days<=150){
            bonus=(float)(emp_sal)*8/100;
        }else{
            bonus=0;
        }  
    }
    void Print_Data(){
        System.out.println("**************");
        System.out.println("Employee Id => "+emp_id);
        System.out.println("Employee Name => "+emp_name);
        System.out.println("Employee Salary => "+emp_sal);
        System.out.println("Working Hours => "+days);
        System.out.println("Bonus = "+bonus);
        
    }
}

public class lab11 {
	public static void main(String[] args){
        Employee e1=new Employee(10001, "abhi", 80200, 154);
        Employee e2=new Employee(10002, "prasad", 70000, 140);
        Employee e3=new Employee(10003, "swaraj", 80000, 100);
        e1.calc_bonus();
        e2.calc_bonus();
        e3.calc_bonus();
        e1.Print_Data();
        e2.Print_Data();
        e3.Print_Data();
    }

}
