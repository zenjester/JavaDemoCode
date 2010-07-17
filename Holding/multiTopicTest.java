public class multiTopicTest {
  public static void main (String args[])
  {
    multiTopic mt1= new multiTopic();

//create two new objects    
    mt1.setTopic("Plastering");
    mt1.setTopicLength(5);

//print out the relevant attributes
    
    System.out.println(" course name :" + mt1.getTopic());
    System.out.println(" course is " + mt1.getTopicLength() + " weeks long");
  }
}
