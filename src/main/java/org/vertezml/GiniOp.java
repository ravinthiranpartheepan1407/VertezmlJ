package org.vertezml;

public class GiniOp {
    public static double Gini(double[] x, double[] y){
        double sizeX = x.length;
        double sizeY = y.length;
        double giniIndex;
        double partX = sizeX / (sizeX + sizeY);
        double partY = sizeY / (sizeX + sizeY);
        double giniXSqr = Math.pow(partX, 2);
        double giniYSqr = Math.pow(partY, 2);
        giniIndex = 1 - (giniXSqr + giniYSqr);
        return giniIndex;
    }
}
