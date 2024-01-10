package org.vertezml;

import java.util.List;

public class MaeOp {
    public static double Mae(List<Double> actual, List<Double> predicted){
        double absSum = 0.0;
        double maeOut;
        int elements;
        if(actual.size() == predicted.size()){
            for(elements = 0; elements < actual.size(); elements++){
                double diff = Math.abs((actual.get(elements)) - (predicted.get(elements)));
                absSum += diff;
            }
            maeOut = absSum / actual.size();
            return maeOut;
        }else{
            return 0;
        }
    }
}
