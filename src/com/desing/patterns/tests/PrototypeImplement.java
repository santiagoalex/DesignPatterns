package com.desing.patterns.tests;

import com.desing.patterns.creationals.prototype.*;

public class PrototypeImplement implements ITest {

    @Override
    public void test(){
        System.out.println("--------------------------------------------");
        System.out.println("                PROTOTYPE                   ");
        System.out.println("--------------------------------------------");
        PrototypeCapableDocument clonedTAndC = DocumentPrototypeManager.getClonedDocument( "tandc" );
        clonedTAndC.setVendorName("Mary Parker");
        System.out.println(clonedTAndC);
        PrototypeCapableDocument clonedNDA = DocumentPrototypeManager.getClonedDocument( "nda" );
        clonedNDA.setVendorName("Patrick Smith");
        System.out.println(clonedNDA);
    }
}
