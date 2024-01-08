package org.vertezml;

public class MeanOp {
    public static double Mean(double[] values){
        double sum = 0;
        int elements;
        for(elements = 0; elements < values.length; elements++){
            sum += values[elements];
        }
        return sum / values.length;
    }
}
