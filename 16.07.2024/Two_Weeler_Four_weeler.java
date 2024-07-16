//An automobile company manufactures both a two wheeler (TW) and a four wheeler (FW). A company manager wants to make the production of both types of vehicle according to the given data below: 1st data, Total number of vehicle (two-wheeler + four-wheeler)=v 2nd data, Total number of wheels = W The task is to find how many two-wheelers as well as four-wheelers need to manufacture as per the given data.
import java.util.*;
class main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int v=sc.nextInt();
    int w=sc.nextInt();
    int f=w/2-v,t=v-f;
    System.out.printf("TW=%d FW=%d",t,f);
  }
}
