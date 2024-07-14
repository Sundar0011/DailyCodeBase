//Arrange the given 4  numbers in descending order
import java.util.*;
class main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    long arr[]=new long[4];
    for(int i=0;i<4;i++)
      arr[i]=sc.nextLong();
    for(int i=0;i<4;i++)
    {
      for(int j=0;j<4-1;j++)
        {
          if(arr[j]<arr[j+1])
          {
            long temp=arr[j];
            arr[j]=arr[j+1];
            arr[j+1]=temp;
          }
        }
    }
    System.out.print(arr[0]);
    for(int i=1;i<4;i++)
      System.out.print(" > "+arr[i]);
      
  }
}
