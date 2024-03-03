package com.learn.records;

import com.learn.records.Programmer;
import com.learn.records.ProgrammerRecord;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        Programmer pClass = new Programmer("Adrian Nads",
                45000, List.of("Java", "JavaScript", "NodeJS", "MySQL", "GraphQL"));

        ProgrammerRecord pRecord = new ProgrammerRecord("Adrian Nads",
                45000, List.of("Java", "JavaScript", "NodeJS", "MySQL", "GraphQL"));

        System.out.println(pClass);
        System.out.println(pRecord);

        // If you want to get the instance variable.
        // In normal class we use getName(), but in record, we only use the variable name itself
        System.out.println(pClass.getName());
        System.out.println(pRecord.name());
    }
}
