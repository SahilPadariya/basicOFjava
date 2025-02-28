package OOPs;

public class Top2Employee {
    public static void main(String[] args) {
        SalarySlip month1[][]= {
                {
                new SalarySlip(1001, "Sahil", 15000, Month.JANUARY),
                new SalarySlip(1002, "Rahul", 18000, Month.JANUARY),
                new SalarySlip(1003, "Mayank", 17000, Month.JANUARY),
                new SalarySlip(1004, "Rohit", 18000, Month.JANUARY),
                new SalarySlip(1005, "Raju", 8000, Month.JANUARY),
                new SalarySlip(1006, "Urvesh", 16000, Month.JANUARY)
        },
        {
                new SalarySlip(1001, "Sahil", 17000, Month.FEBRUARY),
                new SalarySlip(1002, "Rahul", 16000, Month.FEBRUARY),
                new SalarySlip(1003, "Mayank", 20000, Month.FEBRUARY),
                new SalarySlip(1004, "Rohit", 19000, Month.FEBRUARY),
                new SalarySlip(1005, "Raju", 6000, Month.FEBRUARY),
                new SalarySlip(1006, "Urvesh", 16000, Month.FEBRUARY)
        },
        {
                new SalarySlip(1001, "Sahil", 17000, Month.MARCH),
                new SalarySlip(1002, "Rahul", 21000, Month.MARCH),
                new SalarySlip(1003, "Mayank", 20000, Month.MARCH),
                new SalarySlip(1004, "Rohit", 19000, Month.MARCH),
                new SalarySlip(1005, "Raju", 6000, Month.MARCH),
                new SalarySlip(1006, "Urvesh", 16000, Month.MARCH)
        },
        {
                new SalarySlip(1001, "Sahil", 17000, Month.APRIL),
                new SalarySlip(1002, "Rahul", 16000, Month.APRIL),
                new SalarySlip(1003, "Mayank", 20000, Month.APRIL),
                new SalarySlip(1004, "Rohit", 19000, Month.APRIL),
                new SalarySlip(1005, "Raju", 60000, Month.APRIL),
                new SalarySlip(1006, "Urvesh", 16000, Month.APRIL)
        },
        {
                new SalarySlip(1001, "Sahil", 27000, Month.MAY),
                new SalarySlip(1002, "Rahul", 16000, Month.MAY),
                new SalarySlip(1003, "Mayank", 20000, Month.MAY),
                new SalarySlip(1004, "Rohit", 29000, Month.MAY),
                new SalarySlip(1005, "Raju", 6000, Month.MAY),
                new SalarySlip(1006, "Urvesh", 16000, Month.MAY)
        },
                {
                        new SalarySlip(1001, "Sahil", 215000, Month.JUNE),
                        new SalarySlip(1002, "Rahul", 16000, Month.JUNE),
                        new SalarySlip(1003, "Mayank", 20000, Month.JUNE),
                        new SalarySlip(1004, "Rohit", 19000, Month.JUNE),
                        new SalarySlip(1005, "Raju", 6000, Month.JUNE),
                        new SalarySlip(1006, "Urvesh", 16000, Month.JUNE)
                }
        };
        Calculate(month1);
    }
    public static void Calculate(SalarySlip[][]month1){
        for (int i=0;i<month1.length;i++){
            int max1=0,max2=0;
            int emp1=0,emp2=0;
            for (int j=0;j<month1[i].length;j++){
                if (max1<month1[i][j].salary){
                    max2=max1;
                    max1=month1[i][j].salary;
                    emp2=emp1;
                    emp1=month1[i][j].empid;
                }
                else if (max2<month1[i][j].salary && month1[i][j].salary<=max1) {
                    max2=month1[i][j].salary;
                    emp2=month1[i][j].empid;
                }
            }
            System.out.println((i+1)+"->"+emp1+","+emp2);
        }
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
