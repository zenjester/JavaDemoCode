import java.util.*;

public class EmployeeTest
{  public static void main(String[] args)
 { Employee[] staff = new Employee[3];
  
  staff[0] = new Employee("harry Hacker", 35000, new Day(1989,10,1));
  staff[1] = new Employee("Karl Kracka", 75000, new Day(1987,12,15));
  staff[2] = new Employee("Timothy Tester", 38000, new Day(1990,3,15));
  int i;
  for (i=0;i<3;i++) staff[i].raiseSalary(5);
  for (i=0; i<3;i++)staff[i].print();
 }
}