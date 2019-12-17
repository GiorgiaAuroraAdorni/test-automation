package nonuniform;

import org.junit.Test;

public class ArrayAverageTest {

    @Test
    public void testComputeAverage() {
//         Array of elements, could be anything
        int[] elements = new int[]{7, 3, 2, 11};

//        The sum of the weights might be zero
        int[] weights = new int[{0, 0, 0, 0}] ;

        new ArrayAverage().computeAverage(elements, weights);
    }
}