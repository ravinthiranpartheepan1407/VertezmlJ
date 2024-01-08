package org.vertezml;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double[] meanCalc = {10,20,30,40,50};
        double meanOut = MeanOp.Mean(meanCalc);
        System.out.println("Mean: " + meanOut);
    }
}