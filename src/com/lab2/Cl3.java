package com.lab2;


/**
 * Realisation of If3
 *
 * @author zhenia
 * @see com.lab2.If3
 */
public class Cl3 implements If3 {

    private If2 if2;

    /**
     * Print "Method 1 called from Cl3" to system output
     */
    public void meth1() {
        System.out.println("Method 1 called from Cl3");
    }

    /**
     * Print "Method 3 called from Cl3" to system output
     */
    public void meth3() {
        System.out.println("Method 3 called from Cl3");
    }
}
