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
                resVal.add(min);
            }
        }
        if(resVal.size() % 2 != 0){
            int index = (resVal.size() / 2);
            outVal = (double)resVal[index];
        } else{
            int index = (int) (resVal.size() / 2);
            int firstIndex = (int) res[index - 1];
            int secondIndex = (int) res[index];
            outVal = (double) (firstIndex + secondIndex) / 2;
        }
        return outVal;
    }
}
