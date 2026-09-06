public class JoinAppliaction
  {
  public static void main(String[]args)throws Exception{
  A a1=new A();
  a1.start();
  a1.join();
  B b1=new B();
  b1.start();
  }
  }
class A extends Thread{
public void run(){
 try{
 for(int i=1;i<=5;i++){
 System.out.println("I is"+i);
  Thread.sleep(10000);
  }
  }
  catch(Exception ex){
  System.out.println("Error is"+ex);
  }
  }
  }
  class B extends Thread{
  public void run()
  {
  try{
  for(int i=1;i<=50;i++){
  System.out.println("J is"+i);
  Thread.sleep(10000);
  }
  }
  catch(Exception ex){
  System.out.println("Error is"+ex);
  }
  }
  }
  