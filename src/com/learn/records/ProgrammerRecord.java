package com.learn.records;

import java.util.List;

/**
 * @NOTE
 *
 * Records is a special type of class.
 * The purpose of records is that it just holds data.
 * Records are final in default.
 * Records can implement an interface.
 *
 * Several things not allowed in Records:
 *
 * - instance variable
 * - extends a class
 * - they can't be extended by another class.
 * */

public record ProgrammerRecord(String name, int salary, List<String> techStacks) {

    // You can have final static properties;
    public final static int BASE_SALARY = 20000;

    /**
     * By default, the constructor that created by the record is the canonical constructor
     * that similar to this:
     *
     * public ProgrammerRecord(String name, int salary, List<String> techStacks) {}
     *
     * One of the reason you want to override the constructor is for validation
     * */
    public ProgrammerRecord {

        if (salary < 0) throw new IllegalArgumentException("Salary cannot be negative");

        // Here, instance variable is implicitly initialized
        /** You don't have to do this
         *
         * public ProgrammerRecord (String name, int salary, List<String> techStacks) {
         *  this.name = name;
         *  ....
         * }
         * */
    }
    // You can create instance methods
    public String nameToUpperCase() {

        return this.name.toUpperCase();
    }

    // You can create static methods
    public static String printWhatever() {

        return "Whatever";
    }
}
