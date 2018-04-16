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
 * @author DominatorMK
 */
public class ALTDecorator extends AbstractTestDecorator {

    public ALTDecorator(AbstractTest test) {
        super(test);
    }

    @Override
    public String getDescription() {
        return test.getDescription() + ", ALT";
    }

    @Override
    public double getPrice() {
        return test.getPrice() + 10;
    }

}
