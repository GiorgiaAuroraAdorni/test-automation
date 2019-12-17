package functional;

/**
 * This class should simply compute the minimum between two integers but instead computes the maximum.
 */
public class MinIsMax {

    /**
     * Computes the sum between one integer a and another integer b
     * @param a first integer
     * @param b second integer
     * @return sum of a and b
     */
    public int min(int a, int b){
        // Functional bug
        if(a<=b){
            return b;
        }
        return a;
    }
}
