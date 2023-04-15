/* wajp to create calculator using switch statement. */

import java.io.*;
class cal
{
public static void main(String args[])
{
Console c=System.console();
while(true)
{
int num1=Integer.parseInt(c.readLine("enter the no1 :"));
int num2=Integer.parseInt(c.readLine("enter the no2 :"));
int btn=Integer.parseInt(c.readLine("press button to perform operation :"));
switch(btn)
{
case 1:
System.out.println("Addition is ="+(num1+num2));
break;

case 2:
System.out.println("Substraction is ="+(num1-num2));
break;

case 3:
System.out.println("Multiplication is ="+(num1*num2));
break;

case 4:
System.out.println("Division is ="+(num1/num2));
break;

default:
System.out.println("Invalid Operation..");
}
}

}
}