package com.CS102;

import java.util.*;
import java.io.*;
import java.net.*;

public class Project5 {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the year: ");
        String year = scanner.nextLine();
        System.out.println("Enter the gender: ");
        String gender = scanner.nextLine();
        System.out.println("Enter the name: ");
        String name = scanner.nextLine();

        ArrayList<String> list = new ArrayList<>();

        try {
            URL url = new URL(
                    "http://liveexample.pearsoncmg.com/data/babynamesranking" +
                            year + ".txt");


            scanner = new Scanner(url.openStream());
            while (scanner.hasNext()) {
                for (int i = 0; i < 5; i++) {
                    list.add(i, scanner.next());
                }





                if (list.get(gender(gender)).equals(name)) {
                    System.out.println(name + " is ranked #" + list.get(0) + " in year " + year);
                    System.exit(0);
                }
                else {
                    list.clear();
                }
            }
        }
        catch (MalformedURLException ex) {
            System.out.println("Invalid URL");
        }
        catch (IOException ex) {
            System.out.println("I/O Errors: no such file");
        }

            System.out.println("The name " + name + " is not ranked in year " + year);

    }

    public static int gender(String gender) {
        if (gender.equals("M"))
            return 1;
        else
            return 3;
    }

    }