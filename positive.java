import java.util.*;
class positive
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  String s=sc.nextLine();
  int n=s.length();
  if(n>0)
  {
    System.out.println(s.charAt(n-1));
    System.out.println(s.charAt(n));
  }
  else if(n==0)
  {
   System.out.println("zero");
  }
  else
  {
   System.out.println("negative");
   }
  }
}
   
