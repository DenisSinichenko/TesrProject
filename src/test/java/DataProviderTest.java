import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

import static jdk.internal.foreign.abi.aarch64.AArch64Architecture.v3;
import static jdk.vm.ci.aarch64.AArch64.v1;
import static org.junit.Assert.assertEquals;
@RunWith(DataProviderRunner.class)
public class DataProviderTest {





    @DataProvider
    public static Iterable<Object[]> data(){
        return Arrays.asList(new Object[][]{
                {1,1,2},
                {2,2,4},
                {2,3,4}
        });
    }
    @Test
    public void sum() {
        Calculator calculator = new Calculator();
        assertEquals(v3, calculator.sum(v1,v2));
    }
}
