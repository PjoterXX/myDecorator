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
public class MukoproteinyDecorator extends AbstractTestDecorator {

    public MukoproteinyDecorator(AbstractTest test) {
        super(test);
    }

    @Override
    public String getDescription() {
        return test.getDescription() + ", Mukoproteiny";
    }

    @Override
    public double getPrice() {
        return test.getPrice() +10;
    }

}
