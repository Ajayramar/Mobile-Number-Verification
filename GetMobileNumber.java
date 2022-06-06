package com.zoho;

import java.util.Scanner;

public class GetMobileNumber {

    protected static String GetNumber()
    {
        Scanner input = new Scanner(System.in);

        System.out.print("ENTER YOUR MOBILE NUMBER :");

        String number=input.next();

        return number;
    }

    protected static void CheckNumber(String numbers)
    {
        if(numbers.length()==10)
        {
            int numberCount=0;
            for(int i=0; i<numbers.length(); i++)
            {
                int number=Integer.parseInt(String.valueOf(numbers.charAt(i)));
                if(number>=0 || number<=9) {
                    if (i == 0) {
                        numberCount++;
                        if (number == 0) {
                            System.err.println("INVALID NUMBER - Number Should Not Start With 0 ");
                            break;
                        }
                        if (number < 6) {
                            System.err.println("INVALID NUMBER - Number Starts With Appropriate Number ");
                            break;
                        }
                    } else {
                        numberCount++;
                    }
                    if(numberCount==10){
                        System.out.println("________________________________________");
                        System.out.println("|.............VALID NUMBER.............|");
                        System.out.println("|______._______________________________|");
                    }
                }else{
                    System.err.println("INVALID NUMBER...............");
                }
            }
        }else{
            System.err.println("INVALID NUMBER - Number Should Have 10 digits....");
        }
    }
}

