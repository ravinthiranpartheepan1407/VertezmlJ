package org.vertezml;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class KnnOp {
    public static class IMetrics{
        List<String> clusters;
        List<Double> x = new ArrayList<Double>();
        List<Double> y = new ArrayList<Double>();
        List<Double> distance = new ArrayList<Double>();
        List<Double> getK = new ArrayList<Double>();
        List<Double> knn = new ArrayList<Double>();
    }
    public static IMetrics Knn(List<Double> x, List<Double> y, int k, double setX, double setY){
        IMetrics metrics = new IMetrics();
        int elements;
        for(elements = 0; elements < x.size(); elements++){
            metrics.x.add(x.get(elements));
            metrics.y.add(y.get(elements));
        }
        for(elements = 0; elements < x.size(); elements++){
            double sum = 0.0;
            double distXCalc = (setX - x.get(elements));
            double distYCalc = (setY - y.get(elements));
            double xPow = Math.pow(distXCalc, 2);
            double yPow = Math.pow(distYCalc, 2);
            sum += (xPow + yPow);
            double sqrtOut = Math.sqrt(sum);
            metrics.distance.add(sqrtOut);
        }
//        double minVal = metrics.distance.getFirst();
//        for (elements = 1; elements < metrics.distance.size(); elements++) {
//            if (minVal > metrics.distance.get(elements)) {
//                metrics.getK.add(metrics.distance.get(elements));
//            } else {
//                metrics.getK.add(minVal);
//                minVal = metrics.distance.get(elements);
//            }
//        }
        List<Double> sortedDistance = new ArrayList<>(metrics.distance);
        Collections.sort(sortedDistance);
        for(elements = 0; elements < k; elements++){
            metrics.knn.add(sortedDistance.get(elements));
        }
        return metrics;
    }
}
