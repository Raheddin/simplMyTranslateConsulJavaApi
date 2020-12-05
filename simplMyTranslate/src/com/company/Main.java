package com.company;

import java.util.HashMap;
import java.util.Scanner;

import static com.company.com.company.servis.TranslateServis.*;

public class Main {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Secim \n 1.Lüğət \n 2.Test AZN \n 3.Test ENG \n ");
        while (true){
            int a = myObj.nextInt();
            switch(a) {
                case 1:
                    HashMap<String, String> s = azeServis();
                    System.out.println(s);
                    System.out.println("Secim \n 1.Lüğət \n 2.Test AZN \n 3.Test ENG \n ");
                    break;
                case 2:
                    HashMap<String, String> s1 = azeServis();
                    question(s1);
                    System.out.println("Secim \n 1.Lüğət \n 2.Test AZN \n 3.Test ENG \n ");
                    break;
                case 3:
                    HashMap<String, String> s2 = engServis();
                    question(s2);
                    System.out.println("Secim \n 1.Lüğət \n 2.Test AZN \n 3.Test ENG \n ");
                    break;
                default:
                    break;
            }
        }
    }
}
