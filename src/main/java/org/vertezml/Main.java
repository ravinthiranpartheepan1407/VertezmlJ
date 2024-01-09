package org.vertezml;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double[] meanCalc = {10,20,30,40,50,60};
        double [] x = {10.2,25.7,30.3,43.2,50.7,69.1};
        double [] y = {33.7,23.5,10.2,5.7,1.3,0.97};
        double [] entX = {10.2,25.7,30.3,43.2,50.7,69.1};
        double [] entY = {33.7,23.5,10.2,5.7,0.97};
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
        double chebyshevOut = ChebyshevOp.Chebyshev(x,y);
        System.out.println("Chebyshev Distance: " + chebyshevOut);
        List<Double> x1 = new ArrayList<Double>(Arrays.asList(10.0,20.0,30.0,40.0,50.0,60.0));
        List<Double> y1 = new ArrayList<Double>(Arrays.asList(33.7,23.5,10.2,5.7,1.3,0.97));
        double corrOut = CorrelationOp.Correlation(x1,y1);
        System.out.println("Correlation: " + corrOut);
        double entropyOut = EntropyOp.Entropy(entX,entY);
        System.out.println("Entropy: " + entropyOut);
    }
}