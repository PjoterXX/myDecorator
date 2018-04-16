/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mydecorator;

import dpsLaboratoryExamination.AdditionalStudiesBad.BloodTestAndHDL;
import dpsLaboratoryExamination.AdditionalStudiesBad.BloodTestAndKwasMoczowyAndALT;
import dpsLaboratoryExamination.BloodTest;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LeopardProMK
 */
public class Client {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {

        /* Anti-pattern  */
        List<BloodTest> allTest1 = new ArrayList<>();
        // Podstawowe badanie
        BloodTest bloodTest1 = new BloodTest();
        allTest1.add(bloodTest1);

        // Podstawowe badanie wraz z HDL
        bloodTest1 = new BloodTestAndHDL();
        allTest1.add(bloodTest1);

        // Podstawowe badanie wraz z ALT oraz kwasem moczowym
        bloodTest1 = new BloodTestAndKwasMoczowyAndALT();
        allTest1.add(bloodTest1);

        /* vs */

        /* Decorator */
        BloodTest bloodTest2 = null;
        List<BloodTest> allTest2 = new ArrayList<>();

        // Podstawowe badanie
        //...
        allTest2.add(bloodTest2);

        // Podstawowe badanie wraz z LDL
        //...
        allTest2.add(bloodTest2);

        // Podstawowe badanie wraz z ALT, HDL oraz kwasem moczowym
        //...
        allTest2.add(bloodTest2);

        // Wyswietl wszystkie testy do wykonania
        ShowAllTest(allTest2);
    }

    private static void ShowAllTest(List<BloodTest> allTest) {
        for (int i = 0; i < allTest.size(); i++) {
            BloodTest test = allTest.get(i);
            if (test != null) {
                int testNumber = i + 1;
                System.out.println("Badanie " + testNumber + ":");
                System.out.println(" * " + test);
            }
        }
    }
}
