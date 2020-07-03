package com.desing.patterns.creationals.prototype;

public class AuthorizedSignatory implements Cloneable{
    private String name;
    private String designation;

    public String getName(){
        return name;
    }

    public void setName( String Name ){
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation( String designation){
        this.designation = designation;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString(){
        return "[AuthorizedSignatory: Name - "+ getName() + ", Designation - "+ getDesignation() + "]";
    }
}
