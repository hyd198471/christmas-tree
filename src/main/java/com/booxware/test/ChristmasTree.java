package com.booxware.test;

public class ChristmasTree {


    public static void main(String[] args) throws Exception {
        ChristmasTreeCreator creator = new ChristmasTreeCreator();
        String christmasTree = creator.drawChristmasTree(5, false);
        System.out.println(christmasTree);
        System.out.println("****************************************");

        ChristmasTreeCreator t2 = new ChristmasTreeCreator();
        christmasTree = t2.drawChristmasTree(5, true);
        System.out.println(christmasTree);
    }
}