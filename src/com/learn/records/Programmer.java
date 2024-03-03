package com.learn.records;

import java.util.List;
import java.util.Objects;

public class Programmer {

    private final String name;
    private final int salary;

    private final List<String> techStacks;

    public Programmer(String name, int salary, List<String> techStacks) {

        this.name = name;
        this.salary = salary;
        this.techStacks = techStacks;
    }

    @Override
    public String toString() {
        return "Programmer{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", techStacks=" + techStacks +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public List<String> getTechStacks() {
        return techStacks;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Programmer that = (Programmer) o;
        return salary == that.salary && Objects.equals(name, that.name) && Objects.equals(techStacks, that.techStacks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, salary, techStacks);
    }
}
