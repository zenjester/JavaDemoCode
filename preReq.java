//package modTest

public class preReq
{
  String requirement1;
  String requirement2;
  
  public void setReq(String nReq1, String nReq2)
  {
    requirement1=nReq1;
    requirement2=nReq2;
    return ; //(requirement1 +" "+ requirement2);
  }
  public String getReq()
  {
    return ("passing " + requirement1 + " and  " + requirement2);
}
}
