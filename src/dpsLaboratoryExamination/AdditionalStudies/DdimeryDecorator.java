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
public class DdimeryDecorator  extends AbstractTestDecorator{

    public DdimeryDecorator(AbstractTest test) {
        super(test);
    }

    @Override
    public String getDescription() {
        return test.getDescription() + ", Ddimery";  }

    @Override
    public double getPrice() {
        return test.getPrice() +5;   }
    
}
