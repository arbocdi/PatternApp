/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.sf.arbocdi.pa.printer;


/**
 *
 * @author arbocdi
 */
public class Mode1Printer extends AbstractPrinter {

    @Override
    protected boolean checkLine(String line, String pattern) {
        return line.equals(pattern);
    }

}
