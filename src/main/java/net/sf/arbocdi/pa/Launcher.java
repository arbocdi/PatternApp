/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.sf.arbocdi.pa;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import net.sf.arbocdi.pa.printer.AbstractPrinter;
import net.sf.arbocdi.pa.printer.Mode1Printer;
import net.sf.arbocdi.pa.printer.Mode2Printer;
import net.sf.arbocdi.pa.printer.Mode3Printer;
import org.apache.commons.io.FileUtils;

/**
 *
 * @author arbocdi
 */
public class Launcher {

    private static final String FILE_INPUT = "input.txt";
    private static final String FILE_PATTERNS = "patterns.txt";

    private static final String CHARSET = "UTF-8";

    public static void main(String[] args) throws IOException {
        List inputList = readLines(FILE_INPUT);
        List patternList = readLines(FILE_PATTERNS);

        List<AbstractPrinter> printers = Arrays.asList(new Mode1Printer(), new Mode2Printer(), new Mode3Printer());
        for (AbstractPrinter printer : printers) {
            printer.printLines(inputList, patternList);
        }
    }

    private static List readLines(String fileName) throws IOException {
        return FileUtils.readLines(new File(fileName), CHARSET);
    }
}
