import frequent.NaiveMenu;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test1() throws Throwable {
        NaiveMenu naiveMenu0 = new NaiveMenu();
        naiveMenu0.dispatchOptions("hi!");
    }
}
