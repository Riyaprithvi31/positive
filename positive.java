import java.util.*;
class positive
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  String s=sc.nextLine();
  int n=s.length()-1;
  if(n>0)
  {
    System.out.print(s.charAt(n-1));
    System.out.print(s.charAt(n));
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
   
