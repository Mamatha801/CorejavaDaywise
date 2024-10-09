package com.destination.septemberbatch.sep20;
import java.util.Scanner;
public class ScannerExample {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the byte value:");
	byte b=sc.nextByte();
	System.out.println("byte valueis:"+b);
	System.out.println("========");
	System.out.println("Enter the short value:");
    short s=sc.nextShort();
    System.out.println("Short value is:"+s);
    System.out.println("==================");
    System.out.println("Enter the int value:");
    int i=sc.nextInt();
    System.out.println("int value is:"+i);
    System.out.println("==================");
    System.out.println("Enter the long value:");
long l=sc.nextLong();
System.out.println("long value is:"+l);
System.out.println("==================");
System.out.println("Enter the stribg value :");
String src=sc.next();
System.out.println("string value is:"+src);
System.out.println("==============");


}
}
