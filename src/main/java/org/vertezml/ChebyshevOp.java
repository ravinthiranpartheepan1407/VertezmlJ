package org.vertezml;

import java.util.ArrayList;
import java.util.List;

public class ChebyshevOp {
    public static double Chebyshev(double[] x, double[] y){
        List<Double> stack = new ArrayList<Double>();
        int elements;
        double itr = 0;
        for(elements = 0; elements < x.length; elements++){
            double calc = Math.abs(x[elements] - y[elements]);
            stack.add(calc);
        }
        for(elements = 0; elements < stack.size(); elements++){
            if(stack.get(elements) > itr){
                itr = stack.get(elements);
            }
        }
        return itr;
    }
}
