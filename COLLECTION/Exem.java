import java.util.ArrayList;

class Exem{
   
   

   public static void main(String[] args) {
      ArrayList<Integer>salaries=new ArrayList<Integer>();
      salaries.add(45678);
      salaries.add(20058);
      salaries.add(8585);
      salaries.add(90786);
      System.out.println("before update salary"+salaries);
      salaries.set(2, 56000);
      System.out.println("after update salary"+salaries);

   }
}