/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dpsLaboratoryExamination;

/**
 *
 * @author LeopardProMK
 */
public class BloodTest{

    protected String description;

    public String getDescription() {
        return description;
    }
    
    public BloodTest() {
        this.description = "Podstawowe badanie krwii";
    }

    public double getPrice() {
        return 30.0;
    }
    
    @Override
    public String toString() {
        return getPrice() + "(" + getDescription() + ")";
    }
}
