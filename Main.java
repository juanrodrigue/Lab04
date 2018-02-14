//Juan Rodriguez
package com.company;
import java.util.Scanner;



public class Main {

    public static void main(String[] args) {

        /* Numbers to be inputed are: 4321
         *0x4321
         *0xabcdef
         *0xABCDEF
         *0xDCBA4321
         *0x10000000
         *0xFFFFFFFF
         */
        //Git comment change
        Scanner scnr = new Scanner(System.in);
        String hex;
        long decimal = 0, place;
        int i = 0, val = 0, len;

        System.out.print("Enter a hexadecimal number: ");
        hex = scnr.nextLine();
        char[] hexArr = hex.toCharArray();

        len = hexArr.length;
        int a = len;

        for(i = 0; i < a; i++){
            if(hexArr[i] >= '0' && hexArr[i] <= '9'){
                val =hexArr[i] - 48;
            }
            else if(hexArr[i]>= 'a' && hexArr[i] <= 'f'){
                val = hexArr[i] - 97 + 10;
            }
            else if(hexArr[i]>='A' && hexArr[i]<='F'){
                val = hexArr[i] - 65 + 10;
            }
            decimal += val*Math.pow(16, len-1);
            len--;
        }
        System.out.println("Your number is " + decimal + " in decimal");

        /*
        Scanner scnr = new Scanner(System.in);
        String hexaDeciNumber = "";
        int inputCounter = 1;
        int decimalValue = 0;
        int remainder = 0;
        hexaDeciNumber = scnr.nextLine();

        while(hexaDeciNumber != 0){
            remainder = hexaDeciNumber % 16;

        }*/




            /*
            if(hexaDeciNumber.substring(0,2).equals("0x")){
                hexaDeciNumber = hexaDeciNumber.substring(2,hexaDeciNumber.length());
                decimalValue = parseFloat(hexaDeciNumber,(float) 16);
                System.out.println(decimalValue);
                inputCounter++;
            }
            else {
                decimalValue = Integer.parseInt(hexaDeciNumber, 16);
                System.out.println(decimalValue);
                inputCounter++;
            }*/

    }
}
