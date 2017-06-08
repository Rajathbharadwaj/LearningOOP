package com.Encapsulation;

/**
 * Created by BIC on 6/6/2017.
 */
public class Mani {

    public static void main(String [] args) {

        Printer printer = new Printer(50, false);
        System.out.println("Initial pages  count = " +printer.getPagesPrinted());
        int pagesPrinted = printer.printPages(4);
        System.out.println("Pages Printed was " +pagesPrinted + " New total print Count for Printer = " +printer.getPagesPrinted());

        pagesPrinted = printer.printPages(5);
        System.out.println("Pages Printed was " +pagesPrinted + " New total print Count for Printer = " +printer.getPagesPrinted());



    }


}
