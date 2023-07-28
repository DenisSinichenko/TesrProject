import org.junit.FixMethodOrder;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Test2 {
    @Test
    public void test1(){
        System.out.println("Test2 test");
    }
    @Test

    public void test2(){
        System.out.println("Test2 test");
    }

    @Test
    public void zTest2(){
        System.out.println("я последний!");
    }
    @Test
    public void test3(){
        System.out.println("Test2 test");
    }
    @Test(expected = NullPointerException.class)
    public void test11(){
        throw new NullPointerException();
    }
}
