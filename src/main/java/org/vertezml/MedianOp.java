package org.vertezml;

import java.util.ArrayList;
import java.util.List;

public class MedianOp {
    public static double Median(double[] values){
        int elements;
        double outVal;
        double minVal = values[0];
        List<Double> resVal = new ArrayList<Double>();
        for(elements = 0; elements < values.length; elements++){
            if(minVal < values[elements]){
                resVal.add(values[elements]);
            } else{
                resVal.add(minVal);
            }
        }
        if(resVal.size() % 2 != 0){
            int index = (resVal.size() / 2);
            outVal = resVal.get(index);
        } else{
            int index = (resVal.size() / 2);
            double firstIndex = resVal.get(index-1);
            double secondIndex = resVal.get(index);
            outVal = (double) (firstIndex + secondIndex) / 2;
        }
        return outVal;
    }
}
