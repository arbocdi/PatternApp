/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.sf.arbocdi.pa.printer;

import org.apache.commons.lang3.StringUtils;

/**
 *
 * @author arbocdi
 */
public class Mode3Printer extends AbstractPrinter {

    @Override
    protected boolean checkLine(String line, String pattern) {
        return StringUtils.getLevenshteinDistance(line, pattern) <= 1;
    }

}
