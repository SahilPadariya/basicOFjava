package OOPs;

public class EnumAssignment {
    public static void main(String[] args) {
        Employee employeeDetails[]={
                new Employee(101,"Rahul",EnumTitle.Principle,50000),
                new Employee(102,"Mayank",EnumTitle.HOD,50000),
                new Employee(103,"Kesha",EnumTitle.Peon,50000),
                new Employee(104,"RUtvik",EnumTitle.Peon,50000),
                new Employee(105,"Dhruv",EnumTitle.Principle,50000),
                new Employee(105,"Dhiraj",EnumTitle.HOD,50000),
                new Employee(107,"Rohit",EnumTitle.Peon,50000),
                new Employee(108,"Naku;",EnumTitle.Proffesor,50000),
                new Employee(109,"Sujal",EnumTitle.Proffesor,50000),
                new Employee(110,"Urvesh",EnumTitle.Principle,50000),
        };
        Calculate(employeeDetails);
    }
    public static void Calculate(Employee[] employees){
        int Peon=0,Proffesor=0,HOD=0,Principle=0;
        for (int i=0;i<employees.length;i++){
            switch(employees[i].JobTitle){
                case Peon:
                    Peon += employees[i].salry;
                    break;
                case Proffesor:
                    Proffesor += employees[i].salry;
                    break;
                case HOD:
                    HOD += employees[i].salry;
                    break;
                case Principle:
                    Principle += employees[i].salry;
                    break;
            }
        }
        System.out.println("Peon : "+Peon);
        System.out.println("Proffessor : "+Proffesor);
        System.out.println("HOD : "+HOD);
        System.out.println("Principle : "+Principle);
    }
}
class Employee{
    int empid;
    String name;
    EnumTitle JobTitle;
    int salry;

    Employee(int empid,String name,EnumTitle JobTitle,int salry){
        this.empid=empid;
        this.name=name;
        this.JobTitle=JobTitle;
        this.salry=salry;
    }
}
