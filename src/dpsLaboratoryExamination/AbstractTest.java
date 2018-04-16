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
public abstract class AbstractTest {

    protected String description;

    public String getDescription() {
        return description;
    }

    public abstract double getPrice();

    @Override
    public String toString() {
        return getPrice() + "(" + getDescription() + ")";
    }
}
