/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dpsLaboratoryExamination.AdditionalStudiesBad;

import dpsLaboratoryExamination.BloodTest;

/**
 *
 * @author LeopardProMK
 */
public class BloodTestAndKwasMoczowyAndALT  extends BloodTest{
      @Override
    public String getDescription() {
        return super.getDescription() + ", Kwas moczowy i ALT";   }

    @Override
    public double getPrice() {
        return super.getPrice() +25;  }
}
