import org.junit.Assert;
import org.junit.Test;

public class Test3Assert {
    @Test
    public void test3(){
        Assert.assertEquals("Ne ravny","aaa","aaa");
        Assert.assertNull(null);
    }
}
