/*A washing machine works on the principle of Fuzzy System, the weight of clothes put inside it for washing is uncertain But based on weight measured by sensors, it decides time and water level which can be changed by menus given on the machine control area.  

For low level water, the time estimate is 25 minutes, where approximately weight is between 2000 grams or any nonzero positive number below that.

For medium level water, the time estimate is 35 minutes, where approximately weight is between 2001 grams and 4000 grams.

For high level water, the time estimate is 45 minutes, where approximately weight is above 4000 grams.

Assume the capacity of machine is maximum 7000 grams

Where approximately weight is zero, time estimate is 0 minutes.

Write a function which takes a numeric weight in the range [0,7000] as input and produces estimated time as output is: “OVERLOADED”, and for all other inputs, the output statement is

“INVALID INPUT”.*/
import java.util.*;
class main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int t=0;
    if(n>0&&n<=2000)
      t=25;
    else if(n>=2001&&n<=4000)
      t=35;
    else if(n==0)
      t=0;
    else if(n>=4001&&n<=7000)
      t=45;
    else
      t=-1;
    if(t==-1)
      System.out.println("INVALID INPUT");
    else
      System.out.printf("Time Estimated: %d minutes",t);
  }
}
