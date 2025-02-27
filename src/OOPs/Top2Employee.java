package OOPs;

public class Top2Employee {
    public static void main(String[] args) {
        SalarySlip month1[] = {
                new SalarySlip(1001, "Sahil", 15000, Month.JANUARY),
                new SalarySlip(1002, "Rahul", 18000, Month.JANUARY),
                new SalarySlip(1003, "Mayank", 17000, Month.JANUARY),
                new SalarySlip(1004, "Rohit", 16000, Month.JANUARY),
                new SalarySlip(1005, "Raju", 8000, Month.JANUARY),
                new SalarySlip(1006, "Urvesh", 16000, Month.JANUARY),

        };
        SalarySlip month2[] = {
                new SalarySlip(1001, "Sahil", 17000, Month.FEBRUARY),
                new SalarySlip(1002, "Rahul", 16000, Month.FEBRUARY),
                new SalarySlip(1003, "Mayank", 20000, Month.FEBRUARY),
                new SalarySlip(1004, "Rohit", 19000, Month.FEBRUARY),
                new SalarySlip(1005, "Raju", 6000, Month.FEBRUARY),
                new SalarySlip(1006, "Urvesh", 16000, Month.FEBRUARY),

        };
        SalarySlip month3[] = {
                new SalarySlip(1001, "Sahil", 17000, Month.MARCH),
                new SalarySlip(1002, "Rahul", 21000, Month.MARCH),
                new SalarySlip(1003, "Mayank", 20000, Month.MARCH),
                new SalarySlip(1004, "Rohit", 19000, Month.MARCH),
                new SalarySlip(1005, "Raju", 6000, Month.MARCH),
                new SalarySlip(1006, "Urvesh", 16000, Month.MARCH),

        };
        SalarySlip month4[] = {
                new SalarySlip(1001, "Sahil", 17000, Month.APRIL),
                new SalarySlip(1002, "Rahul", 16000, Month.APRIL),
                new SalarySlip(1003, "Mayank", 20000, Month.APRIL),
                new SalarySlip(1004, "Rohit", 19000, Month.APRIL),
                new SalarySlip(1005, "Raju", 60000, Month.APRIL),
                new SalarySlip(1006, "Urvesh", 16000, Month.APRIL),

        };
        SalarySlip month5[] = {
                new SalarySlip(1001, "Sahil", 27000, Month.MAY),
                new SalarySlip(1002, "Rahul", 16000, Month.MAY),
                new SalarySlip(1003, "Mayank", 20000, Month.MAY),
                new SalarySlip(1004, "Rohit", 29000, Month.MAY),
                new SalarySlip(1005, "Raju", 6000, Month.MAY),
                new SalarySlip(1006, "Urvesh", 16000, Month.MAY),

        };
        SalarySlip month6[] = {
                new SalarySlip(1001, "Sahil", 215000, Month.JUNE),
                new SalarySlip(1002, "Rahul", 16000, Month.JUNE),
                new SalarySlip(1003, "Mayank", 20000, Month.JUNE),
                new SalarySlip(1004, "Rohit", 19000, Month.JUNE),
                new SalarySlip(1005, "Raju", 6000, Month.JUNE),
                new SalarySlip(1006, "Urvesh", 16000, Month.JUNE),

        };
        System.out.print(Month.JANUARY+" -> ");
        Calculate(month1);
        System.out.print(Month.FEBRUARY+" -> ");
        Calculate(month2);
        System.out.print(Month.MARCH+" -> ");
        Calculate(month3);
        System.out.print(Month.APRIL+" -> ");
        Calculate(month4);
        System.out.print(Month.MAY+" -> ");
        Calculate(month5);
        System.out.print(Month.JUNE+" -> ");
        Calculate(month6);
    }
    public static void Calculate(SalarySlip[]month1){
        int max1=0,max2=0;
        int emp1=0,emp2=0;
        for (int i=0;i<month1.length;i++){
           if (max1<month1[i].salary){
               max2=max1;
               max1=month1[i].salary;
               emp1=month1[i].empid;
           } else if (max2<month1[i].salary && month1[i].salary!=max1) {
               max2 = month1[i].salary;
               emp2 = month1[i].empid;
           }
        }
        System.out.println(emp1+","+emp2);
    }
}
class SalarySlip{
    int empid;
    String name;
    int salary;
    Month month;

    SalarySlip(int empid,String name,int salary,Month month){
        this.empid=empid;
        this.name=name;
        this.salary=salary;
        this.month=month;
    }
}
