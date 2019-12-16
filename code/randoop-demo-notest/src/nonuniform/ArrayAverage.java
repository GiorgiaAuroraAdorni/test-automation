package nonuniform;

/**
 * This class has the only purpose to compute the wighted average of the elements contained in an array.
 *
 */
public class ArrayAverage {

    /**
     * The weighted average is computed as sum(xi*wi)/sum(wi)
     * where xi is an element of the array, and wi its weight
     *
     * @param array the array of elements
     * @param weights the weights of the elements
     * @return the weighted average of the elements in the array
     */
    public double computeAverage(int[] array, int[] weights){
        if(array.length!=weights.length){
            // For each element there must be a corresponding weight:
            // no more, no less
            throw new IllegalArgumentException();
        }

        int numerator = 0;
        int denominator = 0;
        for(int i=0;i<array.length;i++){
            numerator += array[i]*weights[i];
            denominator += weights[i];
        }

        // Am I preventing a division per 0?
        return numerator/denominator;
    }
}
