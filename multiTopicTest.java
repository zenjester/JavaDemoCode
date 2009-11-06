public class multiTopicTest {
  public static void main (String args[])
  {
    multiTopic mt1= new multiTopic();
    
    mt1.setTopic("Plastering");
    mt1.setTopicLength(5);
    
    System.out.println(" course name :" + mt1.getTopic());
    System.out.println(" course is " + mt1.getTopicLength() + " weeks long");
  }
}