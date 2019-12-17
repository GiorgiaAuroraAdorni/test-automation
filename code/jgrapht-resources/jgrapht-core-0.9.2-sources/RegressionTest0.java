import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        org.jgrapht.UndirectedGraph<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableUndirectedGraph0 = null;
        org.jgrapht.alg.EdmondsBlossomShrinking<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableEdmondsBlossomShrinking1 = new org.jgrapht.alg.EdmondsBlossomShrinking<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>(strComparableUndirectedGraph0);
        java.lang.Class<?> wildcardClass2 = strComparableEdmondsBlossomShrinking1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        org.jgrapht.UndirectedGraph<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableUndirectedGraph0 = null;
        org.jgrapht.alg.EdmondsBlossomShrinking<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableEdmondsBlossomShrinking1 = new org.jgrapht.alg.EdmondsBlossomShrinking<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>(strComparableUndirectedGraph0);
        org.jgrapht.UndirectedGraph<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableUndirectedGraph2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<java.lang.CharSequence> charSequenceSet3 = strComparableEdmondsBlossomShrinking1.findMatch(strComparableUndirectedGraph2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        org.jgrapht.UndirectedGraph<org.jgrapht.alg.interfaces.MatchingAlgorithm<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>, java.lang.constant.Constable> strComparableMatchingAlgorithmUndirectedGraph0 = null;
        org.jgrapht.alg.EdmondsBlossomShrinking<org.jgrapht.alg.interfaces.MatchingAlgorithm<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>, java.lang.constant.Constable> strComparableMatchingAlgorithmEdmondsBlossomShrinking1 = new org.jgrapht.alg.EdmondsBlossomShrinking<org.jgrapht.alg.interfaces.MatchingAlgorithm<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>, java.lang.constant.Constable>(strComparableMatchingAlgorithmUndirectedGraph0);
        java.lang.Class<?> wildcardClass2 = strComparableMatchingAlgorithmEdmondsBlossomShrinking1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        org.jgrapht.alg.EdmondsBlossomShrinking<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableEdmondsBlossomShrinking0 = new org.jgrapht.alg.EdmondsBlossomShrinking<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>();
        org.jgrapht.UndirectedGraph<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableUndirectedGraph1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<java.lang.CharSequence> charSequenceSet2 = strComparableEdmondsBlossomShrinking0.findMatch(strComparableUndirectedGraph1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        org.jgrapht.alg.EdmondsBlossomShrinking<java.lang.Comparable<java.lang.String>, java.lang.constant.ConstantDesc> strComparableEdmondsBlossomShrinking0 = new org.jgrapht.alg.EdmondsBlossomShrinking<java.lang.Comparable<java.lang.String>, java.lang.constant.ConstantDesc>();
        java.lang.Class<?> wildcardClass1 = strComparableEdmondsBlossomShrinking0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        org.jgrapht.UndirectedGraph<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableUndirectedGraph0 = null;
        org.jgrapht.alg.EdmondsBlossomShrinking<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableEdmondsBlossomShrinking1 = new org.jgrapht.alg.EdmondsBlossomShrinking<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>(strComparableUndirectedGraph0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<java.lang.CharSequence> charSequenceSet2 = strComparableEdmondsBlossomShrinking1.getMatching();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        org.jgrapht.alg.EdmondsBlossomShrinking<java.lang.Comparable<java.lang.String>, java.lang.invoke.TypeDescriptor> strComparableEdmondsBlossomShrinking0 = new org.jgrapht.alg.EdmondsBlossomShrinking<java.lang.Comparable<java.lang.String>, java.lang.invoke.TypeDescriptor>();
        java.lang.Class<?> wildcardClass1 = strComparableEdmondsBlossomShrinking0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        org.jgrapht.alg.EdmondsBlossomShrinking<java.lang.CharSequence, org.jgrapht.alg.EdmondsBlossomShrinking<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>> charSequenceEdmondsBlossomShrinking0 = new org.jgrapht.alg.EdmondsBlossomShrinking<java.lang.CharSequence, org.jgrapht.alg.EdmondsBlossomShrinking<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>>();
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        org.jgrapht.alg.EdmondsBlossomShrinking<java.lang.constant.ConstantDesc, org.jgrapht.alg.EdmondsBlossomShrinking<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>> constantDescEdmondsBlossomShrinking0 = new org.jgrapht.alg.EdmondsBlossomShrinking<java.lang.constant.ConstantDesc, org.jgrapht.alg.EdmondsBlossomShrinking<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>>();
        java.lang.Class<?> wildcardClass1 = constantDescEdmondsBlossomShrinking0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        org.jgrapht.UndirectedGraph<java.lang.reflect.AnnotatedElement, java.lang.String> annotatedElementUndirectedGraph0 = null;
        org.jgrapht.alg.EdmondsBlossomShrinking<java.lang.reflect.AnnotatedElement, java.lang.String> annotatedElementEdmondsBlossomShrinking1 = new org.jgrapht.alg.EdmondsBlossomShrinking<java.lang.reflect.AnnotatedElement, java.lang.String>(annotatedElementUndirectedGraph0);
        java.lang.Class<?> wildcardClass2 = annotatedElementEdmondsBlossomShrinking1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        org.jgrapht.UndirectedGraph<java.lang.Comparable<java.lang.String>, org.jgrapht.alg.EdmondsBlossomShrinking<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>> strComparableUndirectedGraph0 = null;
        org.jgrapht.alg.EdmondsBlossomShrinking<java.lang.Comparable<java.lang.String>, org.jgrapht.alg.EdmondsBlossomShrinking<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>> strComparableEdmondsBlossomShrinking1 = new org.jgrapht.alg.EdmondsBlossomShrinking<java.lang.Comparable<java.lang.String>, org.jgrapht.alg.EdmondsBlossomShrinking<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>>(strComparableUndirectedGraph0);
        java.lang.Class<?> wildcardClass2 = strComparableEdmondsBlossomShrinking1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        org.jgrapht.alg.EdmondsBlossomShrinking<java.lang.Class<?>, java.lang.reflect.Type> wildcardClassEdmondsBlossomShrinking0 = new org.jgrapht.alg.EdmondsBlossomShrinking<java.lang.Class<?>, java.lang.reflect.Type>();
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        org.jgrapht.UndirectedGraph<java.lang.constant.ConstantDesc, java.lang.reflect.AnnotatedElement> constantDescUndirectedGraph0 = null;
        org.jgrapht.alg.EdmondsBlossomShrinking<java.lang.constant.ConstantDesc, java.lang.reflect.AnnotatedElement> constantDescEdmondsBlossomShrinking1 = new org.jgrapht.alg.EdmondsBlossomShrinking<java.lang.constant.ConstantDesc, java.lang.reflect.AnnotatedElement>(constantDescUndirectedGraph0);
        java.lang.Class<?> wildcardClass2 = constantDescEdmondsBlossomShrinking1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        org.jgrapht.alg.EdmondsBlossomShrinking<java.lang.String, java.lang.Object> strEdmondsBlossomShrinking0 = new org.jgrapht.alg.EdmondsBlossomShrinking<java.lang.String, java.lang.Object>();
        java.lang.Class<?> wildcardClass1 = strEdmondsBlossomShrinking0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        org.jgrapht.alg.EdmondsBlossomShrinking<java.lang.constant.Constable, org.jgrapht.alg.interfaces.MatchingAlgorithm<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>> constableEdmondsBlossomShrinking0 = new org.jgrapht.alg.EdmondsBlossomShrinking<java.lang.constant.Constable, org.jgrapht.alg.interfaces.MatchingAlgorithm<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>>();
        java.lang.Class<?> wildcardClass1 = constableEdmondsBlossomShrinking0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        org.jgrapht.alg.EdmondsBlossomShrinking<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableEdmondsBlossomShrinking0 = new org.jgrapht.alg.EdmondsBlossomShrinking<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>();
        java.lang.Class<?> wildcardClass1 = strComparableEdmondsBlossomShrinking0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        org.jgrapht.alg.EdmondsBlossomShrinking<org.jgrapht.alg.EdmondsBlossomShrinking<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>, java.lang.Comparable<java.lang.String>> strComparableEdmondsBlossomShrinkingEdmondsBlossomShrinking0 = new org.jgrapht.alg.EdmondsBlossomShrinking<org.jgrapht.alg.EdmondsBlossomShrinking<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>, java.lang.Comparable<java.lang.String>>();
        java.lang.Class<?> wildcardClass1 = strComparableEdmondsBlossomShrinkingEdmondsBlossomShrinking0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        org.jgrapht.alg.EdmondsBlossomShrinking<java.lang.constant.Constable, java.lang.reflect.Type> constableEdmondsBlossomShrinking0 = new org.jgrapht.alg.EdmondsBlossomShrinking<java.lang.constant.Constable, java.lang.reflect.Type>();
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        org.jgrapht.UndirectedGraph<java.lang.reflect.AnnotatedElement, java.lang.reflect.Type> annotatedElementUndirectedGraph0 = null;
        org.jgrapht.alg.EdmondsBlossomShrinking<java.lang.reflect.AnnotatedElement, java.lang.reflect.Type> annotatedElementEdmondsBlossomShrinking1 = new org.jgrapht.alg.EdmondsBlossomShrinking<java.lang.reflect.AnnotatedElement, java.lang.reflect.Type>(annotatedElementUndirectedGraph0);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        org.jgrapht.alg.EdmondsBlossomShrinking<java.io.Serializable, java.lang.invoke.TypeDescriptor> serializableEdmondsBlossomShrinking0 = new org.jgrapht.alg.EdmondsBlossomShrinking<java.io.Serializable, java.lang.invoke.TypeDescriptor>();
        java.lang.Class<?> wildcardClass1 = serializableEdmondsBlossomShrinking0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        org.jgrapht.UndirectedGraph<java.lang.reflect.Type, java.lang.constant.Constable> typeUndirectedGraph0 = null;
        org.jgrapht.alg.EdmondsBlossomShrinking<java.lang.reflect.Type, java.lang.constant.Constable> typeEdmondsBlossomShrinking1 = new org.jgrapht.alg.EdmondsBlossomShrinking<java.lang.reflect.Type, java.lang.constant.Constable>(typeUndirectedGraph0);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        org.jgrapht.alg.EdmondsBlossomShrinking<java.lang.Object, java.lang.invoke.TypeDescriptor> objEdmondsBlossomShrinking0 = new org.jgrapht.alg.EdmondsBlossomShrinking<java.lang.Object, java.lang.invoke.TypeDescriptor>();
        java.lang.Class<?> wildcardClass1 = objEdmondsBlossomShrinking0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        org.jgrapht.alg.EdmondsBlossomShrinking<java.lang.constant.Constable, java.lang.Object> constableEdmondsBlossomShrinking0 = new org.jgrapht.alg.EdmondsBlossomShrinking<java.lang.constant.Constable, java.lang.Object>();
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        org.jgrapht.UndirectedGraph<org.jgrapht.alg.interfaces.MatchingAlgorithm<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>, java.io.Serializable> strComparableMatchingAlgorithmUndirectedGraph0 = null;
        org.jgrapht.alg.EdmondsBlossomShrinking<org.jgrapht.alg.interfaces.MatchingAlgorithm<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>, java.io.Serializable> strComparableMatchingAlgorithmEdmondsBlossomShrinking1 = new org.jgrapht.alg.EdmondsBlossomShrinking<org.jgrapht.alg.interfaces.MatchingAlgorithm<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>, java.io.Serializable>(strComparableMatchingAlgorithmUndirectedGraph0);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        org.jgrapht.UndirectedGraph<java.lang.Object, org.jgrapht.alg.EdmondsBlossomShrinking<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>> objUndirectedGraph0 = null;
        org.jgrapht.alg.EdmondsBlossomShrinking<java.lang.Object, org.jgrapht.alg.EdmondsBlossomShrinking<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>> objEdmondsBlossomShrinking1 = new org.jgrapht.alg.EdmondsBlossomShrinking<java.lang.Object, org.jgrapht.alg.EdmondsBlossomShrinking<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>>(objUndirectedGraph0);
        java.lang.Class<?> wildcardClass2 = objEdmondsBlossomShrinking1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        org.jgrapht.UndirectedGraph<java.lang.Comparable<java.lang.String>, java.lang.reflect.Type> strComparableUndirectedGraph0 = null;
        org.jgrapht.alg.EdmondsBlossomShrinking<java.lang.Comparable<java.lang.String>, java.lang.reflect.Type> strComparableEdmondsBlossomShrinking1 = new org.jgrapht.alg.EdmondsBlossomShrinking<java.lang.Comparable<java.lang.String>, java.lang.reflect.Type>(strComparableUndirectedGraph0);
        java.lang.Class<?> wildcardClass2 = strComparableEdmondsBlossomShrinking1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        org.jgrapht.alg.EdmondsBlossomShrinking<java.lang.CharSequence, java.lang.CharSequence> charSequenceEdmondsBlossomShrinking0 = new org.jgrapht.alg.EdmondsBlossomShrinking<java.lang.CharSequence, java.lang.CharSequence>();
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        org.jgrapht.alg.EdmondsBlossomShrinking<java.lang.Class<?>, java.lang.Comparable<java.lang.String>> wildcardClassEdmondsBlossomShrinking0 = new org.jgrapht.alg.EdmondsBlossomShrinking<java.lang.Class<?>, java.lang.Comparable<java.lang.String>>();
        java.lang.Class<?> wildcardClass1 = wildcardClassEdmondsBlossomShrinking0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        org.jgrapht.alg.EdmondsBlossomShrinking<java.lang.reflect.GenericDeclaration, java.lang.constant.Constable> genericDeclarationEdmondsBlossomShrinking0 = new org.jgrapht.alg.EdmondsBlossomShrinking<java.lang.reflect.GenericDeclaration, java.lang.constant.Constable>();
        java.lang.Class<?> wildcardClass1 = genericDeclarationEdmondsBlossomShrinking0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        org.jgrapht.UndirectedGraph<java.lang.reflect.GenericDeclaration, java.lang.reflect.AnnotatedElement> genericDeclarationUndirectedGraph0 = null;
        org.jgrapht.alg.EdmondsBlossomShrinking<java.lang.reflect.GenericDeclaration, java.lang.reflect.AnnotatedElement> genericDeclarationEdmondsBlossomShrinking1 = new org.jgrapht.alg.EdmondsBlossomShrinking<java.lang.reflect.GenericDeclaration, java.lang.reflect.AnnotatedElement>(genericDeclarationUndirectedGraph0);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        org.jgrapht.UndirectedGraph<java.lang.invoke.TypeDescriptor, java.lang.Comparable<java.lang.String>> typeDescriptorUndirectedGraph0 = null;
        org.jgrapht.alg.EdmondsBlossomShrinking<java.lang.invoke.TypeDescriptor, java.lang.Comparable<java.lang.String>> typeDescriptorEdmondsBlossomShrinking1 = new org.jgrapht.alg.EdmondsBlossomShrinking<java.lang.invoke.TypeDescriptor, java.lang.Comparable<java.lang.String>>(typeDescriptorUndirectedGraph0);
        java.lang.Class<?> wildcardClass2 = typeDescriptorEdmondsBlossomShrinking1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        org.jgrapht.alg.EdmondsBlossomShrinking<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, java.lang.invoke.TypeDescriptor> wildcardClassOfFieldEdmondsBlossomShrinking0 = new org.jgrapht.alg.EdmondsBlossomShrinking<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, java.lang.invoke.TypeDescriptor>();
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        org.jgrapht.alg.EdmondsBlossomShrinking<java.lang.Object, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> objEdmondsBlossomShrinking0 = new org.jgrapht.alg.EdmondsBlossomShrinking<java.lang.Object, java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>();
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        org.jgrapht.alg.EdmondsBlossomShrinking<java.lang.reflect.Type, java.lang.reflect.GenericDeclaration> typeEdmondsBlossomShrinking0 = new org.jgrapht.alg.EdmondsBlossomShrinking<java.lang.reflect.Type, java.lang.reflect.GenericDeclaration>();
        java.lang.Class<?> wildcardClass1 = typeEdmondsBlossomShrinking0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        org.jgrapht.alg.EdmondsBlossomShrinking<java.lang.Comparable<java.lang.String>, java.lang.constant.Constable> strComparableEdmondsBlossomShrinking0 = new org.jgrapht.alg.EdmondsBlossomShrinking<java.lang.Comparable<java.lang.String>, java.lang.constant.Constable>();
        java.lang.Class<?> wildcardClass1 = strComparableEdmondsBlossomShrinking0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        org.jgrapht.UndirectedGraph<java.lang.reflect.Type, org.jgrapht.alg.EdmondsBlossomShrinking<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>> typeUndirectedGraph0 = null;
        org.jgrapht.alg.EdmondsBlossomShrinking<java.lang.reflect.Type, org.jgrapht.alg.EdmondsBlossomShrinking<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>> typeEdmondsBlossomShrinking1 = new org.jgrapht.alg.EdmondsBlossomShrinking<java.lang.reflect.Type, org.jgrapht.alg.EdmondsBlossomShrinking<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>>(typeUndirectedGraph0);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        org.jgrapht.UndirectedGraph<java.lang.constant.Constable, java.lang.Object> constableUndirectedGraph0 = null;
        org.jgrapht.alg.EdmondsBlossomShrinking<java.lang.constant.Constable, java.lang.Object> constableEdmondsBlossomShrinking1 = new org.jgrapht.alg.EdmondsBlossomShrinking<java.lang.constant.Constable, java.lang.Object>(constableUndirectedGraph0);
        java.lang.Class<?> wildcardClass2 = constableEdmondsBlossomShrinking1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        org.jgrapht.alg.EdmondsBlossomShrinking<java.lang.reflect.Type, java.io.Serializable> typeEdmondsBlossomShrinking0 = new org.jgrapht.alg.EdmondsBlossomShrinking<java.lang.reflect.Type, java.io.Serializable>();
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        org.jgrapht.UndirectedGraph<java.lang.reflect.AnnotatedElement, java.lang.constant.Constable> annotatedElementUndirectedGraph0 = null;
        org.jgrapht.alg.EdmondsBlossomShrinking<java.lang.reflect.AnnotatedElement, java.lang.constant.Constable> annotatedElementEdmondsBlossomShrinking1 = new org.jgrapht.alg.EdmondsBlossomShrinking<java.lang.reflect.AnnotatedElement, java.lang.constant.Constable>(annotatedElementUndirectedGraph0);
        java.lang.Class<?> wildcardClass2 = annotatedElementEdmondsBlossomShrinking1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        org.jgrapht.alg.EdmondsBlossomShrinking<java.io.Serializable, java.lang.Comparable<java.lang.String>> serializableEdmondsBlossomShrinking0 = new org.jgrapht.alg.EdmondsBlossomShrinking<java.io.Serializable, java.lang.Comparable<java.lang.String>>();
        java.lang.Class<?> wildcardClass1 = serializableEdmondsBlossomShrinking0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        org.jgrapht.UndirectedGraph<org.jgrapht.alg.interfaces.MatchingAlgorithm<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>, java.lang.invoke.TypeDescriptor> strComparableMatchingAlgorithmUndirectedGraph0 = null;
        org.jgrapht.alg.EdmondsBlossomShrinking<org.jgrapht.alg.interfaces.MatchingAlgorithm<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>, java.lang.invoke.TypeDescriptor> strComparableMatchingAlgorithmEdmondsBlossomShrinking1 = new org.jgrapht.alg.EdmondsBlossomShrinking<org.jgrapht.alg.interfaces.MatchingAlgorithm<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>, java.lang.invoke.TypeDescriptor>(strComparableMatchingAlgorithmUndirectedGraph0);
        java.lang.Class<?> wildcardClass2 = strComparableMatchingAlgorithmEdmondsBlossomShrinking1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        org.jgrapht.alg.EdmondsBlossomShrinking<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, java.lang.Object> wildcardClassOfFieldEdmondsBlossomShrinking0 = new org.jgrapht.alg.EdmondsBlossomShrinking<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, java.lang.Object>();
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        org.jgrapht.UndirectedGraph<org.jgrapht.alg.EdmondsBlossomShrinking<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>, java.lang.constant.Constable> strComparableEdmondsBlossomShrinkingUndirectedGraph0 = null;
        org.jgrapht.alg.EdmondsBlossomShrinking<org.jgrapht.alg.EdmondsBlossomShrinking<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>, java.lang.constant.Constable> strComparableEdmondsBlossomShrinkingEdmondsBlossomShrinking1 = new org.jgrapht.alg.EdmondsBlossomShrinking<org.jgrapht.alg.EdmondsBlossomShrinking<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>, java.lang.constant.Constable>(strComparableEdmondsBlossomShrinkingUndirectedGraph0);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        org.jgrapht.alg.EdmondsBlossomShrinking<java.lang.reflect.AnnotatedElement, java.lang.Object> annotatedElementEdmondsBlossomShrinking0 = new org.jgrapht.alg.EdmondsBlossomShrinking<java.lang.reflect.AnnotatedElement, java.lang.Object>();
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        org.jgrapht.alg.EdmondsBlossomShrinking<java.lang.reflect.Type, java.lang.reflect.AnnotatedElement> typeEdmondsBlossomShrinking0 = new org.jgrapht.alg.EdmondsBlossomShrinking<java.lang.reflect.Type, java.lang.reflect.AnnotatedElement>();
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        org.jgrapht.alg.EdmondsBlossomShrinking<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, org.jgrapht.alg.EdmondsBlossomShrinking<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>> wildcardClassOfFieldEdmondsBlossomShrinking0 = new org.jgrapht.alg.EdmondsBlossomShrinking<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, org.jgrapht.alg.EdmondsBlossomShrinking<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>>();
        java.lang.Class<?> wildcardClass1 = wildcardClassOfFieldEdmondsBlossomShrinking0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        org.jgrapht.UndirectedGraph<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceUndirectedGraph0 = null;
        org.jgrapht.alg.EdmondsBlossomShrinking<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceEdmondsBlossomShrinking1 = new org.jgrapht.alg.EdmondsBlossomShrinking<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>(charSequenceUndirectedGraph0);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        org.jgrapht.alg.EdmondsBlossomShrinking<java.lang.CharSequence, java.lang.constant.Constable> charSequenceEdmondsBlossomShrinking0 = new org.jgrapht.alg.EdmondsBlossomShrinking<java.lang.CharSequence, java.lang.constant.Constable>();
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test50");
        org.jgrapht.alg.EdmondsBlossomShrinking<java.io.Serializable, java.lang.Class<?>> serializableEdmondsBlossomShrinking0 = new org.jgrapht.alg.EdmondsBlossomShrinking<java.io.Serializable, java.lang.Class<?>>();
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test51");
        org.jgrapht.UndirectedGraph<java.lang.reflect.AnnotatedElement, java.lang.reflect.AnnotatedElement> annotatedElementUndirectedGraph0 = null;
        org.jgrapht.alg.EdmondsBlossomShrinking<java.lang.reflect.AnnotatedElement, java.lang.reflect.AnnotatedElement> annotatedElementEdmondsBlossomShrinking1 = new org.jgrapht.alg.EdmondsBlossomShrinking<java.lang.reflect.AnnotatedElement, java.lang.reflect.AnnotatedElement>(annotatedElementUndirectedGraph0);
        java.lang.Class<?> wildcardClass2 = annotatedElementEdmondsBlossomShrinking1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test52");
        org.jgrapht.alg.EdmondsBlossomShrinking<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableEdmondsBlossomShrinking0 = new org.jgrapht.alg.EdmondsBlossomShrinking<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>();
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test53");
        org.jgrapht.UndirectedGraph<java.lang.constant.ConstantDesc, java.lang.invoke.TypeDescriptor> constantDescUndirectedGraph0 = null;
        org.jgrapht.alg.EdmondsBlossomShrinking<java.lang.constant.ConstantDesc, java.lang.invoke.TypeDescriptor> constantDescEdmondsBlossomShrinking1 = new org.jgrapht.alg.EdmondsBlossomShrinking<java.lang.constant.ConstantDesc, java.lang.invoke.TypeDescriptor>(constantDescUndirectedGraph0);
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test54");
        org.jgrapht.alg.EdmondsBlossomShrinking<java.lang.reflect.Type, org.jgrapht.alg.EdmondsBlossomShrinking<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>> typeEdmondsBlossomShrinking0 = new org.jgrapht.alg.EdmondsBlossomShrinking<java.lang.reflect.Type, org.jgrapht.alg.EdmondsBlossomShrinking<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>>();
        java.lang.Class<?> wildcardClass1 = typeEdmondsBlossomShrinking0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test55");
        org.jgrapht.alg.EdmondsBlossomShrinking<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, java.lang.constant.Constable> wildcardClassOfFieldEdmondsBlossomShrinking0 = new org.jgrapht.alg.EdmondsBlossomShrinking<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>, java.lang.constant.Constable>();
        java.lang.Class<?> wildcardClass1 = wildcardClassOfFieldEdmondsBlossomShrinking0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test56");
        org.jgrapht.alg.EdmondsBlossomShrinking<java.lang.Object, org.jgrapht.alg.EdmondsBlossomShrinking<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>> objEdmondsBlossomShrinking0 = new org.jgrapht.alg.EdmondsBlossomShrinking<java.lang.Object, org.jgrapht.alg.EdmondsBlossomShrinking<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>>();
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test57");
        org.jgrapht.alg.EdmondsBlossomShrinking<java.lang.reflect.GenericDeclaration, java.lang.Object> genericDeclarationEdmondsBlossomShrinking0 = new org.jgrapht.alg.EdmondsBlossomShrinking<java.lang.reflect.GenericDeclaration, java.lang.Object>();
        java.lang.Class<?> wildcardClass1 = genericDeclarationEdmondsBlossomShrinking0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test58");
        org.jgrapht.UndirectedGraph<org.jgrapht.alg.EdmondsBlossomShrinking<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>, org.jgrapht.alg.interfaces.MatchingAlgorithm<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>> strComparableEdmondsBlossomShrinkingUndirectedGraph0 = null;
        org.jgrapht.alg.EdmondsBlossomShrinking<org.jgrapht.alg.EdmondsBlossomShrinking<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>, org.jgrapht.alg.interfaces.MatchingAlgorithm<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>> strComparableEdmondsBlossomShrinkingEdmondsBlossomShrinking1 = new org.jgrapht.alg.EdmondsBlossomShrinking<org.jgrapht.alg.EdmondsBlossomShrinking<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>, org.jgrapht.alg.interfaces.MatchingAlgorithm<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>>(strComparableEdmondsBlossomShrinkingUndirectedGraph0);
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test59");
        org.jgrapht.UndirectedGraph<org.jgrapht.alg.EdmondsBlossomShrinking<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>, java.lang.reflect.GenericDeclaration> strComparableEdmondsBlossomShrinkingUndirectedGraph0 = null;
        org.jgrapht.alg.EdmondsBlossomShrinking<org.jgrapht.alg.EdmondsBlossomShrinking<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>, java.lang.reflect.GenericDeclaration> strComparableEdmondsBlossomShrinkingEdmondsBlossomShrinking1 = new org.jgrapht.alg.EdmondsBlossomShrinking<org.jgrapht.alg.EdmondsBlossomShrinking<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>, java.lang.reflect.GenericDeclaration>(strComparableEdmondsBlossomShrinkingUndirectedGraph0);
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test60");
        org.jgrapht.UndirectedGraph<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableUndirectedGraph0 = null;
        org.jgrapht.alg.EdmondsBlossomShrinking<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableEdmondsBlossomShrinking1 = new org.jgrapht.alg.EdmondsBlossomShrinking<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>(strComparableUndirectedGraph0);
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test61");
        org.jgrapht.UndirectedGraph<java.lang.constant.Constable, java.io.Serializable> constableUndirectedGraph0 = null;
        org.jgrapht.alg.EdmondsBlossomShrinking<java.lang.constant.Constable, java.io.Serializable> constableEdmondsBlossomShrinking1 = new org.jgrapht.alg.EdmondsBlossomShrinking<java.lang.constant.Constable, java.io.Serializable>(constableUndirectedGraph0);
    }
}

