package org.vertezml;

public class AnovaOp {
    public static class Result{
        double sswg;
        double tss;
        double ssbg;
        double outVal;
    }
    public static Result Anova(double[] x, double []y){
        double xSum = 0.0;
        double ySum = 0.0;
        double xSSWG = 0.0;
        double ySSWG = 0.0;
        double xObs = 0.0;
        double yObs = 0.0;
        double xMean, yMean;
        int elements;
        for(elements = 0; elements < x.length; elements++){
            xSum += x[elements];
            ySum += y[elements];
        }
        xMean = xSum / x.length;
        yMean = ySum / y.length;

        // Sum of squares within groups
        for(elements = 0; elements < x.length; elements++){
            double diff = x[elements] - xMean;
            double sqr = Math.pow(diff, 2);
            xSSWG += sqr;
        }
        for(elements = 0; elements < y.length; elements++){
            double diff = y[elements] - yMean;
            double sqr = Math.pow(diff, 2);
            ySSWG += sqr;
        }
        Result valOut = new Result();
        valOut.sswg = xSSWG + ySSWG;

        double sizeXY = x.length + y.length;
        double meanToObs = (xMean + yMean) / sizeXY;
        for(elements = 0; elements < x.length; elements++){
            double xObsVal = x[elements] - meanToObs;
            double sqr = Math.pow(xObsVal, 2);
            xObs += sqr;
        }
        for(elements = 0; elements < y.length; elements++){
            double yObsVal = y[elements] - meanToObs;
            double sqr = Math.pow(yObsVal, 2);
            yObs += sqr;
        }
        valOut.tss = xObs + yObs;
        double xMeanSSBG = xMean - meanToObs;
        double yMeanSSBG = yMean - meanToObs;
        double xssbg = Math.pow(xMeanSSBG, 2);
        double yssbg = Math.pow(yMeanSSBG, 2);
        valOut.ssbg = (xssbg + yssbg) * x.length;

        double resVal = (xSSWG + ySSWG) / ((x.length + y.length)-3);
        valOut.outVal = (valOut.ssbg) / resVal;
        return valOut;
    }
}
