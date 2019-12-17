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
        org.jgrapht.experimental.dag.DirectedAcyclicGraph.VisitedArrayImpl visitedArrayImpl0 = new org.jgrapht.experimental.dag.DirectedAcyclicGraph.VisitedArrayImpl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        visitedArrayImpl0.setVisited((int) (byte) 1);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        org.jgrapht.experimental.dag.DirectedAcyclicGraph.VisitedBitSetImpl visitedBitSetImpl0 = new org.jgrapht.experimental.dag.DirectedAcyclicGraph.VisitedBitSetImpl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        visitedBitSetImpl0.setVisited((int) '4');
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test3");
        org.jgrapht.experimental.dag.DirectedAcyclicGraph.VisitedBitSetImpl visitedBitSetImpl0 = new org.jgrapht.experimental.dag.DirectedAcyclicGraph.VisitedBitSetImpl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        visitedBitSetImpl0.setVisited((int) '#');
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test4");
        org.jgrapht.experimental.dag.DirectedAcyclicGraph.VisitedBitSetImpl visitedBitSetImpl0 = new org.jgrapht.experimental.dag.DirectedAcyclicGraph.VisitedBitSetImpl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        visitedBitSetImpl0.setVisited((int) (byte) 0);
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test5");
        org.jgrapht.experimental.dag.DirectedAcyclicGraph.VisitedArrayImpl visitedArrayImpl0 = new org.jgrapht.experimental.dag.DirectedAcyclicGraph.VisitedArrayImpl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        visitedArrayImpl0.setVisited((int) (short) 10);
    }

    @Test
    public void test6() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test6");
        org.jgrapht.experimental.dag.DirectedAcyclicGraph.VisitedBitSetImpl visitedBitSetImpl0 = new org.jgrapht.experimental.dag.DirectedAcyclicGraph.VisitedBitSetImpl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean2 = visitedBitSetImpl0.getVisited((int) '4');
    }

    @Test
    public void test7() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test7");
        org.jgrapht.experimental.dag.DirectedAcyclicGraph.VisitedArrayImpl visitedArrayImpl0 = new org.jgrapht.experimental.dag.DirectedAcyclicGraph.VisitedArrayImpl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        visitedArrayImpl0.setVisited((int) (byte) 0);
    }

    @Test
    public void test8() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test8");
        org.jgrapht.experimental.dag.DirectedAcyclicGraph.VisitedBitSetImpl visitedBitSetImpl0 = new org.jgrapht.experimental.dag.DirectedAcyclicGraph.VisitedBitSetImpl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean2 = visitedBitSetImpl0.getVisited((-1));
    }

    @Test
    public void test9() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test9");
        org.jgrapht.experimental.dag.DirectedAcyclicGraph.VisitedBitSetImpl visitedBitSetImpl0 = new org.jgrapht.experimental.dag.DirectedAcyclicGraph.VisitedBitSetImpl();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean2 = visitedBitSetImpl0.getVisited(10);
    }
}

