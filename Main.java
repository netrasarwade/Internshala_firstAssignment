
package com.internshala.javaapp;
import java.util.*;

public class Main {

    public static void main(String[] args) {
    	Scanner s = new Scanner(System.in);
    	String name;
        int age;
        String blood_group;


	    System.out.println("Enter your blood group:");
	    blood_group = s.nextLine();
        System.out.println("Enter your name:");
        name = s.nextLine();
        System.out.println("Enter your age:");
        age = s.nextInt();

        System.out.println();

	    System.out.println("---------------------------------------------------------------");
	    System.out.println("Name:"+name);
	    System.out.println("Age:"+age);
	    System.out.println("Blood group:"+blood_group);

	    System.out.println("---------------------------------------------------------------");
if(age>=20)
{
	System.out.println("Your group is RED");
}
else if(age>=15 && age<20)
{
	System.out.println("Your group is BLUE");
}
else if(age>=10 && age<15)
{
	System.out.println("Your group is YELLOW");
}
else
{
	System.out.println("Enter the correct age");
}
	    System.out.println("---------------------------------------------------------------");
    }
}
