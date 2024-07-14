import java.util.*;
class main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    
    StringBuilder sb=new StringBuilder(s);
    String s1=sb.substring(0,2);
    String s2=sb.substring(3,5);
    String s3=sb.substring(6,10);
    System.out.println(s1+" "+s2+" "+s3);
    int d=s1.toIntegerparse();
    int m=s2.toIntegerparse();
    System.out.println(d);
    if(y>=1900&&y<9999&&m>=1&&m<=12)
    {
      if((m==1||m==3||m==5||m==7||m==8||m==10||m==12))
      {
        if(d>=1&&d<=31)
          System.out.println("Valid");
        else
          System.out.println("Inavaild");
      }
      else if((m!=2))
      {
        if(d>=1&&d<=30)
          System.out.println("Valid");
        else
          System.out.println("Invaid");
      }
      else
      {
        if((y%4==0)&&(y%100!=0||y%400==0))
        {
          if(d>=1&&d<=29)
          {
            System.out.println("Vaild");
          }
          else
            System.out.println("Invaild");
        }
        else
        {
          if(d>=1&&d<=28)
            System.out.println("Valid");
          else
            System.out.println("Invalid");
        }
      }
    }
    else
    {
      System.out.println("Invalid");
    }
  }
}
