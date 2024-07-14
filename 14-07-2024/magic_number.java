// Check whether the number is a magic number. A magic number is a number where the multiplication of the sum of digits and the sum reverse equals the same number. For example, consider n=1729
// sum of digits = (1 + 7 + 2 + 9 => 19)
// The reverse of 19 is 91
// (19 X 91 = 1729)
import java.util.*;
class main{
  public static void main(String args[])
  {
    Scanner sc= new Scanner(System.in);
    int n=sc.nextInt();
    int v=n;
    int sum=0;
    while(n!=0)
    {
      sum+=n%10;
      n/=10;
    }
    String n1=sum+"";
    StringBuffer s=new StringBuffer(n1);
    int n2=Integer.parseInt((s.reverse())+"");
    if(sum*n2==v)
    {
      System.out.print("YES");
    }
    else
    System.out.print("NO");
  }
}
