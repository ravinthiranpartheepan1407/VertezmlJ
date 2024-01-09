package org.vertezml;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double[] meanCalc = {10,20,30,40,50,60};
        double [] x = {10,20,30,40,50,60};
        double [] y = {15,25,35,45,55,65};
        double meanOut = MeanOp.Mean(meanCalc);
        System.out.println("Mean: " + meanOut);
        double medianOut = MedianOp.Median(meanCalc);
        System.out.println("Median: " + medianOut);
        double euclideanOut = EuclideanOp.Euclidean(x,y);
        System.out.println("Euclidean Distance: " + euclideanOut);
        AnovaOp.Result anovaOut = AnovaOp.Anova(x,y);
        System.out.println("ANOVA SSWG: " + anovaOut.sswg);
        System.out.println("ANOVA SSBG: " + anovaOut.ssbg);
        System.out.println("ANOVA TSS: " + anovaOut.tss);
        System.out.println("ANOVA: " + anovaOut.outVal);
    }
}