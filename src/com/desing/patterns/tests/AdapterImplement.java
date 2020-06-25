package com.desing.patterns.tests;

import com.desing.patterns.structurals.adapter.*;


public class AdapterImplement implements ITest {

    @Override
    public void test() {
        String testString = " Formatting line of test 1. Formatting line of test 2. Formatting line of test  3.";

        TextFormattable newLineFormatter = new NewLineFormatter();
        String resultString = newLineFormatter.formatText(testString);
        System.out.println(resultString);

        CsvFormattable csvFormatter = new CsvFormatter();
        TextFormattable csvAdapter  = new CsvAdapterImpl( csvFormatter );
        String resultCsvString      = csvAdapter.formatText( testString );
        System.out.println( resultCsvString );
    }
}
