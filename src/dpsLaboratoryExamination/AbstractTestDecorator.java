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
public abstract class AbstractTestDecorator extends AbstractTest{

   protected AbstractTest test;

    public AbstractTestDecorator(AbstractTest test) {
        this.test = test;
    }
    
    @Override
    public abstract String getDescription();  
}
