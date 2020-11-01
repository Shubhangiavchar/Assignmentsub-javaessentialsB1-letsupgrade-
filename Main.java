package com.Subjects;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	 float eng,math,phy,chem,bio;
	  double total,percentage;
	 Scanner op=new Scanner(System.in);
        System.out.println("enter a marks of 5 subjects");
        System.out.println("enter marks of english subject:");
        eng=op.nextFloat();
        System.out.println("enter marks of maths subject:");
        math=op.nextFloat();
        System.out.println("enter marks of physics subject:");
        phy=op.nextFloat();
        System.out.println("enter marks of chemistry subject:");
        chem=op.nextFloat();
        System.out.println("enter marks of biology subject:");
        bio=op.nextFloat();
        total=eng+math+phy+chem+bio;
        percentage=(total/500.0)*100;
        System.out.println("Percentage=" +percentage);
        System.out.println("The student grade is:");
        if(percentage>=80)
        {
            System.out.println("A");
        }
         else if(percentage>=60 && percentage<80)
        {
            System.out.println("B");
        }
         else if(percentage>=40 && percentage<60)
        {
            System.out.println("c");
        }
        else
        {
            System.out.println("D");
        }

    }
}
