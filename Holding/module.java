// this is the class defintion for the testModule program


public class module
{
  private String name;                                        // private variables are only available in the class
  private preReq npreReq;                                  //use the definition from the preReq class
  private topic ntopic;                                        //use the definition from the topic class
  
// the class module is created from a string variable name + the topic class + the preReq class
  
  public module()
  {
    name = new String();
    npreReq = new preReq();
    ntopic = new topic();
  }
  
  // set the name of the course
  
  public void setName(String s)
  {
    name = s + "Level 3 unit";   
  }
  
  public void setTopic( String t)
  {
    ntopic.setTopic(t);
  }
  
public void setPreReq(String p1, String p2)
{
  npreReq.setReq(p1,p2);
}


public String getName()
{
  return name;
}
 public String getReq()
 {
   return npreReq.getReq();
 }
   
 public String getTopic()
 { 
   return ntopic.getTopic();
 }
}
