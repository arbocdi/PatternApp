/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.sf.arbocdi.pa;

import java.io.File;
import java.io.IOException;
import java.util.List;
import net.sf.arbocdi.pa.printer.Mode1Printer;
import net.sf.arbocdi.pa.printer.Mode2Printer;
import net.sf.arbocdi.pa.printer.Mode3Printer;
import org.apache.commons.io.FileUtils;

/**
 *
 * @author arbocdi
 */
public class Launcher {

    public static void main(String[] args) throws IOException {
        List<String> inputList = FileUtils.readLines(new File("input.txt"), "UTF-8");
        List<String> patternList = FileUtils.readLines(new File("patterns.txt"), "UTF-8");
        (new Mode1Printer()).printLines(inputList, patternList);
        (new Mode2Printer()).printLines(inputList, patternList);
        (new Mode3Printer()).printLines(inputList, patternList);
    }
}
