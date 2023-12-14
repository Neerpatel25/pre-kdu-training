// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        System.out.printf("Hello and welcome!");

        Scanner scn = new Scanner(System.in);
        String s1 = scn.nextLine();
        String s2 = scn.nextLine();
        int n1 = s1.length();
        int n2 = s2.length();
        System.out.println("The length of the first string is "+ n1);
        System.out.println("The length of the second string is "+ n2);


        if(n1==n2){
            System.out.println("The length of the two strings is the same");
        }else{
            System.out.println("The length of the two strings is not the same");
        }
        if(s1.contentEquals(s2)){
            System.out.println("Two strings are equal");
        }else{
            System.out.println("Two strings are not equal");
        }

    }
}