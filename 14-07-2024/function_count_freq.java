/*Java_FUN_L2_7.Complete the function count_freq(), given an array and number of elements , store the unique elemnts of the given array in a new array in a sorted order and count of each element in another new array and return the result in a class which holds two new arrays and size of it. Design of class is predefined.*/

import java.util.*;
class main{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int z=0,count=0;
    int arr[]=new int[n];
    int uni[]=new int[n];
    int c[]=new int[n];
    for(int i=0;i<n;i++)
    {
      arr[i]=sc.nextInt();
    }
    for(int i=0;i<n;i++)
    {
      int f=0;
      for(int j=0;j<n;j++)
      {
        if(arr[i]==uni[j])
        {
          c[j]+=1;
          f=1;
          break;
        }
      }
      if(f==0)
      {
        count++;
        uni[z]=arr[i];
        z++;
      }
    }
    System.out.println(count);
    for(int i=0;i<z;i++)
    {
      System.out.print(uni[i]+" ");
    }
    System.out.println();
    for(int i=0;i<z;i++)
    {
      System.out.print(c[i]+1+" ");
    }
  }
}
