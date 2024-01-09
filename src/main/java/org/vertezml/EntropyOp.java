package org.vertezml;

public class EntropyOp {
    public static double Entropy(double[] x, double[] y){
        double deltaS = 0;
        double sizeX = x.length;
        double sizeY = y.length;
        double partX = sizeX / (sizeX + sizeY);
        double partY = sizeY / (sizeX + sizeY);
        double xCalc = -((partX) * (Math.log(partX) / Math.log(2)));
        double yCalc = ((partY) * (Math.log(partY) / Math.log(2)));
        double hs = xCalc - yCalc;
        deltaS += hs;
        return deltaS;
    }
}
