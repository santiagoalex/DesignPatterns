package com.desing.patterns.creationals.prototype;

public class NDAgreement extends PrototypeCapableDocument {
    private AuthorizedSignatory authorizedSignatory;

    public AuthorizedSignatory getAuthorizedSignatory(){
        return authorizedSignatory;
    }

    public void setAuthorizedSignatory( AuthorizedSignatory authorizedSignatory){
        this.authorizedSignatory = authorizedSignatory;
    }

    @Override
    public PrototypeCapableDocument cloneDocument() throws CloneNotSupportedException{

        NDAgreement nda;
        nda = ( NDAgreement ) super.clone();
        AuthorizedSignatory clonedAuthoizedSignatory = (AuthorizedSignatory) nda.getAuthorizedSignatory().clone();
        nda.setAuthorizedSignatory( clonedAuthoizedSignatory );
        return nda;
    }

    @Override
    public String toString(){
        return "[NDAgreement: Vendor Name - " + getVendorName() + ", Content - " + getContent() + ", Authorized Signatory -" + getAuthorizedSignatory() + "]";
    }
}
