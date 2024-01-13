package org.vertezml;

import java.util.ArrayList;
import java.util.List;

public class LinearegOp {
    public static double LinearegOLS(List<Double> x, List<Double> y, double ip){
        double xMean;
        double yMean;
        double xSum = 0.0;
        double ySum = 0.0;
        List<Double> slopeX = new ArrayList<Double>();
        List<Double> slopeY = new ArrayList<Double>();
        double slopeProd = 0.0;
        double slopeSq = 0.0;
        ySum = 0.0;
        int elements;
        for(elements = 0; elements < x.size(); elements++){
            xSum += x.get(elements);
        }
        for(elements = 0; elements < y.size(); elements++){
            ySum += y.get(elements);
        }
        xMean = xSum / x.size();
        yMean = ySum / y.size();
        // Calculate Slope (m)
        for(elements = 0; elements < x.size(); elements++){
            double slopeXVal = x.get(elements) - xMean;
            slopeX.add(slopeXVal);
        }
        for(elements = 0; elements < y.size(); elements++){
            double slopeYVal = y.get(elements) - yMean;
            slopeY.add(slopeYVal);
        }
        for(elements = 0; elements < x.size(); elements++){
            double xSlope = x.get(elements) - xMean;
            double powSlope = Math.pow(xSlope, 2);
            slopeSq += powSlope;
        }
        for(elements = 0; elements < slopeX.size(); elements++){
            double slopeXYProd = slopeX.get(elements) * slopeY.get(elements);
            slopeProd += slopeXYProd;
        }
        double slope = slopeProd / slopeSq;
        // Calculate Intercept (b)
        double intercept = yMean - (slope * xMean);
        // Linear Regression Analysis
        return (slope * ip) + intercept;
    }
}
