package firstprogram;
import java.io.*;  
public class Prime
{
public static void main(String args[])
{
	String s="satish.kumar@gmail.com";
	int l=s.length();
	int count=0;
char ch='a';
	for (int i=0;i<=l;i++)
	{
		if (s.charAt(i)==ch)
			count++;
	}
	}
System.out.println("The character a has appeared "+count+" number of times in the string");
}

