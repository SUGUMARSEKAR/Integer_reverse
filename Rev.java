import java.io.*;
import java.util.*;
public class Fact
{
public static void main(String args[])throws IOException
{
Scanner s = new Scanner(System.in);
System.out.println("Enter the number: ");
Integer n = s.nextInt();
String x=n.toString();
char []str=x.toCharArray();
for(int i=str.length-1;i>=0;i--)
{
System.out.print(str[i]);
}
}
}
