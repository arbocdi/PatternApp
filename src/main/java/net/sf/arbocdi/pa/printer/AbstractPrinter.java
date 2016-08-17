/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.sf.arbocdi.pa.printer;

import java.util.Collection;

/**
 *
 * @author arbocdi
 */
public abstract class AbstractPrinter {

    public void printLines(Collection<String> inputList, Collection<String> patternList) {
        System.out.println(String.format("#Printing lines using %s", this.getClass().getSimpleName()));
        for (String inputLine : inputList) {
            for (String pattern : patternList) {
                if (!this.checkLine(inputLine, pattern)) {
                    continue;

                }
                System.out.println(inputLine);
                break;
            }
        }
    }

    protected abstract boolean checkLine(String line, String pattern);

}
