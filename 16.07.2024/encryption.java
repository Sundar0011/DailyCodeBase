import java.util.*;
class main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    for(int i=0;i<s.length();i++)
    {
      char c=s.charAt(i);
      if(c+5>'z')
        System.out.printf("%c",(c+5)-26);
      else
        System.out.printf("%c",(c+5));
    }
  }
}
