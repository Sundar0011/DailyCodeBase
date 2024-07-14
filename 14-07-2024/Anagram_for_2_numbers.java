//Anagram for 2 numbers. Two numbers are said to be an anagram if both numbers are formed with the same digits.
import java.util.*;
class main{
  public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    long n1=sc.nextLong();
    long n2=sc.nextLong();
    long s1=0,s2=0;
    while(n1!=0&&n2!=0)
    {
      s1+=n1%10;
      s2+=n2%10;
      n1/=10;
      n2/=10;
    }
    if(s1==s2)
      System.out.println("Anagram");
    else
      System.out.println("Not");
  }
}
