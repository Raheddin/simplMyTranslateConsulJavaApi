package com.company.com.company.servis;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

import static com.company.com.company.servis.FileServis.readFile;

public class TranslateServis {

    public static String[] main(){
        byte[] byteArray = readFile("C:\\Users\\acer\\Documents\\NetBeansProjects\\simplMyTranslate\\src\\com\\company\\engAze.txt");
        String s=new String(byteArray);
        String a[] = s.split("\n");
        return a;
    }
    public static HashMap<String,String> azeServis() {
        HashMap<String, String> capitalCities = new HashMap<String, String>();
        String a[]=main();
        for (String i:a){
            String b[] = i.split(",");
            capitalCities.put(b[1].trim(),b[0].trim());
        }
        return capitalCities;
    }
    public static HashMap<String,String> engServis() {
        HashMap<String, String> capitalCities = new HashMap<String, String>();
        String a[]=main();
        for (String i:a){
            String b[] = i.split(",");
            capitalCities.put(b[0].trim(),b[1].trim());
        }
        return capitalCities;
    }
    public static String randomWord(HashMap<String,String> data){
        Object[] crunchifyKeys = data.keySet().toArray();
        if(crunchifyKeys.length == 0) return "THE_END";
        Object key = crunchifyKeys[new Random().nextInt(crunchifyKeys.length)];
        return key.toString();
    }
    public static void question(HashMap<String, String> s){
        Scanner myObj = new Scanner(System.in);
        while (true) {
            String s1 = randomWord(s);
            if (s1.equals("THE_END")) {
                System.out.println("BİTİRDİZ");
                break;
            } else {
                System.out.println("New question:" + s1);
                String answer1 = myObj.nextLine();
                if (answer1.equalsIgnoreCase(s.get(s1))) {
                    System.out.println("Təbriklər");
                    s.remove(s1);
                } else {
                    System.out.println("yalniş birdə cəht edin ");
                    String answer2 = myObj.nextLine();
                    if (answer2.equalsIgnoreCase(s.get(s1))) {
                        System.out.println("Təbriklər");
                        s.remove(s1);
                    } else {
                        System.out.println("yalniş birdə cəht edin ");
                        String answer3 = myObj.nextLine();
                        if (answer2.equalsIgnoreCase(s.get(s1))) {
                            s.remove(s1);
                        } else {
                            System.out.println("Təəssüv cavab:" + s.get(s1));
                        }
                    }
                }
            }
        }
    }
}
