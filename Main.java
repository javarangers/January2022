package com.company;

public class Main {

    public static void main(String[] args) {
	byte rollNumber =45;  //camelCase youAreVeryBeautifulPerson
        System.out.println("My roll number is "+rollNumber);// here this +would convert the rollNumber into a String

        System.out.println("Max value for byte is:"+Byte.MAX_VALUE);
        System.out.println("Min value for byte is:"+Byte.MIN_VALUE);
        //String.valueOf-> String.concat
        System.out.println(100+45);// but here the+ would do the original arithmetic addition

        System.out.println("-----------------------");
        short universityRollNumber =32767;
        System.out.println("My University Roll Number is "+universityRollNumber);
        System.out.println("Short max value is :"+ Short.MAX_VALUE);
        System.out.println("Short min value is :"+Short.MIN_VALUE);

        System.out.println("----------------------------");
        int myInsurancePolicyNumber=2147483647;
        System.out.println("My Insurance policy number is :"+myInsurancePolicyNumber);

        System.out.println("Integer min value :"+Integer.MIN_VALUE);
        System.out.println("Integer max value: "+Integer.MAX_VALUE);

        System.out.println("----------------------------");
        long planetaryDistance=234567898;
        System.out.println("planetary distance is: "+planetaryDistance);
        System.out.println("max long value is "+Long.MAX_VALUE);
        System.out.println("min long value is "+Long.MIN_VALUE);

        System.out.println("-------------");
        float mathScore =98.7f;
        System.out.println("my math score is "+mathScore);
        System.out.println("max float value is "+Float.MAX_VALUE);
        System.out.println("min float value is "+Float.MIN_VALUE);
        System.out.println("------------------------");
        double temperature=32.5;
        System.out.println("temperature is :"+temperature);
        System.out.println("Max double value is "+Double.MAX_VALUE);
        System.out.println("Min double value is "+Double.MIN_VALUE);
        System.out.println("------------------");

        char gender1='M'; // 2 bytes means 16 bits =65535 different such letters
        char gender2='F'; //international character set - UNICODE
        System.out.println("gender1 is "+gender1);
        System.out.println("gender2 is "+gender2);

        char alphabet = 40; // implicit cast of byte to a char ==65 is the letter
        System.out.println("alphabet : "+ alphabet);

        byte b='@';// implicit cast of char to a byte
        System.out.println("b is "+b);

        boolean married =false;
        boolean areYouHappy=true;
        System.out.println("are you married :"+married);
        System.out.println("are you happy :"+areYouHappy);

        int x; // java would not carry any default values for local variables
        //System.out.println("what is the value of x :"+x);

        String myName ="Vishal";
        String myCity="New York";
        System.out.println("my name is "+myName);
        System.out.println("my city is :"+ myCity);




    }
}
/*

Naming Convention
-----------------
for classname --->ClassName ----> Joker,SavingAccount, FixedDeposit
for variables --->variablesName--> rollNumber,socialSecurityNumber
for function ----. functionName---> withdrawAmount(), setLookAndFeel(),
Data has various types
|
numeric -> roll number, employee number
character -> gender M/F Y/N
String   -> Ajit Vishal Abinash
floating -> math score 95.0, cricket avg 87.90
boolean -> true/false
          Java Data Types
                 |
        ---------------------
        |                   |
        primitive         Secondary[non-primitive]
        |                                 |
     --------------------------        --------------
     |         |        |       |
     Integral Floating Character Boolean
     |
     byte 1
     short 2
     int 4
     long 8

     how to hold a numeric value in the java memory
     a byte is made up of 8 bits

     1 bit =0
            1
     2 bits = 0 0



 */