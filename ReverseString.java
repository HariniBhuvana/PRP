import java.io.*;
import java.util.*;
public class ReverseString
{
  public static void main(String args[])throws IOException
  {
    try
    {
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      System.out.println("Enter a String");
      String a=br.readLine();
      char try1[]=a.toCharArray();
      for(int i=try1.length-1;i>=0;i--)
      System.out.print(try1[i]);
    }
    catch(IOException e)
    {
      
    }
  }
}



