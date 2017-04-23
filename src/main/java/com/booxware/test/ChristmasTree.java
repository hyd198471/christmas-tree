package com.booxware.test;

import java.util.ArrayList;

public class ChristmasTree {

    private int temp;

    public ArrayList<String> list = new ArrayList<String>();
    private static String hash;


    // Constructor
    public ChristmasTree() {
        // initialize fields
        list = new ArrayList<String>();
// 		initializeList(list);
        String s = "";
        for (int i = 0; i < list.size(); i++) {
            s.concat(list.get(i));
        }
        hash = s;
        list.clear();
    }

    // to be removed
    public ChristmasTree(String s) {
        // TODO implement this after S-38154
    }

    // Main Method
    public static void main(String[] args) throws Exception {
        // without a star on top
        ChristmasTree t = new ChristmasTree();
        t.z(5, false);
        System.out.println("****************************************");
        // with a star on top
        try {
            ChristmasTree t2 = new ChristmasTree();
            t2.z(5, true);
        } catch (Exception e) {
            // TODO Auto-generated catch block
        }
        System.out.println(hash);
    }

    // Draws a christmas tree
    public void z(int z, boolean value) throws Exception {
        if (!value) {
            for (int i = 0; i < z; i++) {
                System.out.print(NumberOfSpaces(z - i));
                for (int J = 0; J < (2 * i + 1); J++) {
                    System.out.print("X");
                }
                System.out.println();
            }
            System.out.println(NumberOfSpaces(z) + "X");
        } else {
            System.out.print(NumberOfSpaces(z));
            System.out.println("*");
            // outer loop
            for (int i = 0; i < z; i++) {
                System.out.print(_numberofspaces(z - i));
                // iner loop
                for (int j = 0; j < (2 * i + 1); j++) {
                    System.out.print("X");
                }
                System.out.println();
            }
            // TODO: not needed anymore:
            // System.out.println(_numberofspaces(z) + "X");
            // System.out.println(_numberofspaces(z) + "X");
            // System.out.println(_numberofspaces(z) + "X");
            System.out.println(_numberofspaces(z) + "X");
        }
    }

    private static String _numberofspaces(int z) throws Exception {
        String l = "";
        for (int i = 0; i < z - 1; i++) {
            l += " ";
        }
        return l;
    }

    public static String NumberOfSpaces(int value) throws Exception {
        String l = "";
        for (int i = 0; i < value - 1; i++) {
            l += " ";
        }
        return l;
    }

    // setter
    public void setList(ArrayList<String> list) {
        // TODO implement this
    }
}