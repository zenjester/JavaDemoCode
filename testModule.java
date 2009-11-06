//******************************* Aggregation example **************************

// this is the main class of the program it needs module.class, preReq.class and topic.class to function

 public class testModule
 {
   public static void main (String args[])    //main -> this is where the program starts
   {
     module m1 = new module();  //create a new object m1 from the module class
     
     
     // set the values for module 1 by using methods in the module class
     
     m1.setName("maffs");
     m1.setTopic("Java");
     m1.setPreReq("programming", "logic");
     
     //print out the values im the m1 object
     
     System.out.println("Course Name is: " + m1.getName());
     System.out.println("Course Requirements are :" +  m1.getReq());
     System.out.println("Course Topic is :" + m1.getTopic()) ;
   }
 }
     