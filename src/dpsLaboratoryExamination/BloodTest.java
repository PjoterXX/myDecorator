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
public class BloodTest extends AbstractTest {

    public BloodTest() {
        super.description = "Podstawowe badanie krwii";
    }

    @Override
    public double getPrice() {
        return 30.0;
    }
}
