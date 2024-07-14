//Find the frequency of each digit from the given number.
import java.util.*;
class main{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    long n=sc.nextInt();
    int arr[]=new int[10];
    while(n!=0)
    {
      arr[(int)(n%10)]+=1;
      n/=10;
    }
    for(int i=0;i<10;i++)
    {
      System.out.println(i+" occurs "+arr[i]+" times");
    }
  }
}
    
