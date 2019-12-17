import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test1");
        org.jgrapht.alg.EdmondsBlossomShrinking<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableEdmondsBlossomShrinking0 = new org.jgrapht.alg.EdmondsBlossomShrinking<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Set<java.lang.CharSequence> charSequenceSet1 = strComparableEdmondsBlossomShrinking0.getMatching();
    }
}

