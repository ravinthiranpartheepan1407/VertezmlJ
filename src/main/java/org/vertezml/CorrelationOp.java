package org.vertezml;

import java.util.ArrayList;
import java.util.List;

public class CorrelationOp {
    public static double Correlation(List<Double> x, List<Double> y){
        double xMean, yMean;
        double xSum = 0.0;
        double ySum = 0.0;
        List<Double> xDiff = new ArrayList<Double>();
        List<Double> yDiff = new ArrayList<Double>();
        List<Double> xSq = new ArrayList<Double>();
        List<Double> ySq = new ArrayList<Double>();
        double nom = 0.0;
        double denom = 0.0;
        int elements;
        if(x.size() == y.size()){
            for(elements = 0; elements < x.size(); elements++){
                xSum += x.get(elements);
                ySum += y.get(elements);
            }
            xMean = xSum / x.size();
            yMean = ySum / y.size();
            // Difference between X and Y
            for(elements = 0; elements < x.size(); elements++){
                double diffX = x.get(elements) - xMean;
                xDiff.add(diffX);
            }
            for(elements = 0; elements < y.size(); elements++){
                double diffY = y.get(elements) - yMean;
                yDiff.add(diffY);
            }
            // Sqr and SQRT of X and Y
            for(elements = 0; elements < x.size(); elements++){
                double xSqr = x.get(elements) - xMean;
                double powX = Math.pow(xSqr, 2);
                double sqrtX = Math.sqrt(powX);
                xSq.add(sqrtX);
            }
            for(elements = 0; elements < y.size(); elements++){
                double ySqr = y.get(elements) - yMean;
                double powY = Math.pow(ySqr, 2);
                double sqrtY = Math.sqrt(powY);
                ySq.add(sqrtY);
            }
            for(elements = 0; elements < xDiff.size(); elements++){
                double prod = xDiff.get(elements) * yDiff.get(elements);
                nom += prod;
            }
            for(elements = 0; elements < xDiff.size(); elements++){
                double prod = xSq.get(elements) * ySq.get(elements);
                denom += prod;
            }
            return nom / denom;
        }else{
            return 0.0;
        }
    }
}
