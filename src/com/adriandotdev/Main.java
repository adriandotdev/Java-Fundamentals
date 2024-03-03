package com.adriandotdev;

import java.sql.Connection;
import java.sql.DriverManager;
import java.time.LocalDate;
import java.util.Scanner;
import java.util.ArrayList;
import com.mysql.jdbc.Driver;

public class Main {

    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {

        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql:parkncharge_v2");

            ArrayList<String> techStack = new ArrayList<>();
            final int currentYear = LocalDate.now().getYear();

            System.out.print("What's your name: ");
            String name = sc.nextLine();

            System.out.print("What's your current job?: ");
            String job = sc.nextLine();

            System.out.print("How much is your salary?: ");
            int salary = sc.nextInt();

            System.out.print("Please provide your birth year: ");
            int birthYear = sc.nextInt();

            if ((currentYear - birthYear) < 0) throw new Exception("Invalid birth year");

            System.out.println("List all of your current tech stack :)");
            String inputValue = "";

            sc.nextLine();

            while (!inputValue.equals("exit")) {

                System.out.print("Enter your tech stack: ");
                inputValue = sc.nextLine();

                techStack.add(inputValue);
            }

            System.out.printf("My name is %s, and my current job is %s%n", name, job);
            System.out.printf("My current salary is %d%n", salary);
            System.out.printf("Age: %d%n", (currentYear - birthYear));
            System.out.println("Tech Stack");
            System.out.println(printTechStack(techStack));
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("End");
        }
    }

    public static String printTechStack(ArrayList<String> techStack) {

        StringBuilder techStacks = new StringBuilder();

        for (String s : techStack) {

            if (!s.equals("exit"))
                techStacks.append(s).append(", ");
        }

        return techStacks.substring(0, techStacks.length() - 2);
    }
}