/**
 * Ilkin Hasanov
 * <p>
 * Copyright (c) HASANOV.
 */
package model;

/**
 * IKIN HASANOV's response to Homework "Laboratory Work No.2", Module 3.
 *
 *   Task:
 *      Choose a subject according to your number. Develop a service using
 *      all your best in OOP and Java collections. Six methods must be written
 *      like in the following example. A point for each one.
 *      Creative approaches are welcome.
 *
 *          EXAMPLE
 *
 *    A company contains two types of employees:  full-time and  part-time ones.
 *              1. Create two appropriate classes and 5 objects of each one.
 *              2. Calculate the total salary of a month.
 *              3. Find the highest salary employee.
 *              4. Find he lowest salary employee
 *              5. The average salary.
 *              6. Who get more salary, part-time or full-time employees?
 *
 *
 * @version 1.10
 * @Since 05-04-2021
 * @class
 * @author Ilkin Hasanov
 */
public class OrderingLunch implements IBill {

    private String name;
    private int serving;
    private double price;

    public OrderingLunch() {
    }

    public OrderingLunch(String name, int serving, double price) {
        this.name = name;
        this.serving = serving;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getServing() {
        return serving;
    }

    public void setServing(int serving) {
        this.serving = serving;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "OrderingLunch{" +
                "name='" + name + '\'' +
                ", serving=" + serving +
                ", price=" + price +
                '}';
    }

    @Override
    public double getBill() {
        return this.getPrice()*getServing();
    }
}
