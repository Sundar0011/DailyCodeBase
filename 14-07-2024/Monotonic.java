//Write a program to check whether the given array of elements are in a Monotonic order or Not.
import java.util.*;
class main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    int f=0;
    int t=0;
    for(int i=0;i<n;i++)
    {
      arr[i]=sc.nextInt();
    }
    if(arr[0]>arr[1])
    f=1;
    if(f==1)
    {
    for(int i=0;i<n-1;i++)
    {
      if(arr[i]<arr[i+1])
      {
        t=1;
        break;
      }
    }
    }
    else
    {
      for(int i=0;i<n-1;i++)
      {
        if(arr[i]>arr[i+1])
        {
          t=1;
          break;
        }
      }
    }
    if(t==0)
      System.out.println("Monotonic");
    else
    {
      System.out.println("Not Monotonic");
    }
  }
}
