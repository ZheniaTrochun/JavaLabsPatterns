package com.lab2;

/**
 * Realisation of If2, and subclass of Cl1
 *
 * @author zhenia
 * @see com.lab2.If2
 */
public class Cl2 extends Cl1 implements If2 {

    private If3 if3;

    /**
     * Print "Method 2 called from Cl2" to system output
     */
    public void meth2() {
        System.out.println("Method 2 called from Cl2");
    }

    /**
     * Print "Method 3 called from Cl2" to system output
     */
    public void meth3() {
        System.out.println("Method 3 called from Cl2");
    }
}
