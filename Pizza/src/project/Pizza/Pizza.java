package project.Pizza;
import java.util.*;
import java.io.*;
public class Pizza {
public static void main(String[] args) {
int number = 0;
int item;
//String item2;
final double HST =0.13;
Double value;
Double value1;
double Total;

System.out.println("-------------------------------------------------");
System.out.println("1. Extra large pizza........................$9.00");
System.out.println("2. Large pizza..............................$7.50");
System.out.println("3. medium pizza.............................$6.99");
System.out.println("4. small pizza..............................$5.99");
System.out.println("5. slices...................................$3.00");
System.out.println("6. Soft Drinks..............................$2.00");
System.out.println("7. Extra dipping............................$1.50");
System.out.println("8. combo drinks&dipping.....................$3.00");
System.out.println("-------------------------------------------------");
Scanner scan = new Scanner (System.in);
do{
try
{
System.out.println("please enter the order: ");
number=scan.nextInt();

if (number>8 && number<0)
{
System.out.println("please enter beetween 1 to 8");
}
else
{

System.out.println("Number of items");
item=scan.nextInt();
if (number==1)
{

value = item * 9.00;
System.out.printf(item + " X " + "Extra large pizza---------------------------- $%.2f",value);
value1 = value* HST;
System.out.printf("\nTax------------------------------------------ $%.2f",value1);
Total = value + value1;
System.out.printf("\nTotal Amount--------------------------------- $%.2f",Total);

}

else if (number==2)
{
value = item * 7.50;
System.out.printf(item + " X " + "Large pizza------------------------ $%.2f",value);
value1 = value* HST;
System.out.printf("\nTax--------------------------------- $%.2f",value1);
Total = value + value1;
System.out.printf("\nTotal Amount------------------------ $%.2f",Total);

}

else if (number==3)
{
value = item * 6.99;
System.out.printf(item + " X " + "medium pizza-------------------------- $%.2f",value);
value1 = value* HST;
System.out.printf("\nTax--------------------------------- $%.2f",value1);
Total = value + value1;
System.out.printf("\nTotal Amount------------------------ $%.2f",Total);

}


else if (number==4)
{
value = item * 5.99;
System.out.printf(item + " X " +"small pizza-------------------- $%.2f",value);
value1 = value* HST;
System.out.printf("\nTax--------------------------------- $%.2f",value1);
Total = value + value1;
System.out.printf("\nTotal Amount------------------------ $%.2f",Total);

}

else if (number==5)
{
value = item * 3.00;
System.out.printf(item + " X " +" slices---------------------- $%.2f",value);
value1 = value* HST;
System.out.printf("\nTax--------------------------------- $%.2f",value1);
Total = value + value1;
System.out.printf("\nTotal Amount------------------------ $%.2f",Total);

}

else if (number==6)
{
value = item * 1.00;
System.out.printf(item + " X " +"Soft Drinks--------------------- $%.2f",value);
value1 = value* HST;
System.out.printf("\nTax--------------------------------- $%.2f",value1);
Total = value + value1;
System.out.printf("\nTotal Amount------------------------ $%.2f",Total);

}
else if (number==7)
{
value = item * 1.50;
System.out.printf(item + " X " +"Extra dipping---------------------------- $%.2f",value);
value1 = value* HST;
System.out.printf("\nTax--------------------------------- $%.2f",value1);
Total = value + value1;
System.out.printf("\nTotal Amount------------------------ $%.2f",Total);

}

else if (number==8)
{
value = item * 3.00;
System.out.printf(item + " X " +"combo drinks&dipping--------------------- $%.2f",value);
value1 = value* HST;
System.out.printf("\nTax--------------------------------- $%.2f",value1);
Total = value + value1;
System.out.printf("\nTotal Amount------------------------ $%.2f",Total);

}
}

}catch(Exception e)
{
System.out.println("Error :invalid entry ");
}

}while(number>0 && number<8);

System.out.println("\nThank you for your order");
}
}