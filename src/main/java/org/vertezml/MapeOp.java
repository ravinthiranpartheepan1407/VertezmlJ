package org.vertezml;

import java.util.List;

public class MapeOp {
    public static double Mape(List<Double> actual, List<Double> predicted){
        double absSum = 0.0;
        double sumActual = 0.0;
        int elements;
        double mapeOut;
        if(actual.size() == predicted.size()){
            for(elements = 0; elements < actual.size(); elements++){
                double diff = Math.abs((actual.get(elements)) - predicted.get(elements));
                sumActual += diff;
                absSum += (diff / sumActual);
            }
            mapeOut = absSum / actual.size();
            return mapeOut;
        }else{
            return 0;
        }
    }
}
