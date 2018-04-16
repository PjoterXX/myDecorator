/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dpsLaboratoryExamination.AdditionalStudies;

import dpsLaboratoryExamination.AbstractTest;
import dpsLaboratoryExamination.AbstractTestDecorator;

/**
 *
 * @author LeopardProMK
 */
public class HDLDecorator extends AbstractTestDecorator {

    public HDLDecorator(AbstractTest test) {
        super(test);
    }

    @Override
    public String getDescription() {
        return test.getDescription() + ", HDL";   }

    @Override
    public double getPrice() {
        return test.getPrice() +15;  }
    
}
