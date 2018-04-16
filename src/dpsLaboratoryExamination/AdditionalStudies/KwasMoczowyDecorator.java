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
public class KwasMoczowyDecorator  extends AbstractTestDecorator{

    public KwasMoczowyDecorator(AbstractTest test) {
        super(test);
    }

    @Override
    public String getDescription() {
        return test.getDescription() + ", Kwas moczowy";   }

    @Override
    public double getPrice() {
         return test.getPrice() +20; }
    
}
