package org.vertezml;

public class EuclideanOp {
    public static double Euclidean(double[] x, double[] y){
        int elements;
        double sum = 0.0;
        for(elements = 0; elements < x.length; elements++){
            double distCalc = Math.pow((x[elements] - y[elements]), 2);
            sum += distCalc;
        }
        return Math.sqrt(sum);
    }
}
