class Employee
{ public Employee(String n, double s, Day d)
 { name = n;
  salary= s;
  startDay  = d;
 }
 
 public void print()
 { System.out.println(name + " " +  salary + " " + startYear());
 }
 
 public void raiseSalary (double byPercent)
 { salary *= 1 + byPercent /100;
 }
 
 public int startYear()
 { return startDay.getYear() ;
 }
 
 public String getName()
{  return name;
} 
 private String name;
 private double salary;
 private Day startDay;
}