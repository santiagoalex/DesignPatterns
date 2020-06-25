package com.desing.patterns.structurals.adapter;


import com.desing.patterns.structurals.adapter.TextFormattable;
import com.desing.patterns.structurals.adapter.CsvFormattable;


public class CsvAdapterImpl implements TextFormattable {

    CsvFormattable csvFormatter;

    public CsvAdapterImpl( CsvFormattable csvFormatter ){
        this.csvFormatter = csvFormatter;

    }

    @Override
    public String formatText( String text ){
        String formattedText = csvFormatter.formatCsvText(text);
        return formattedText;
    }

}
