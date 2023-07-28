import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

import static org.junit.Assert.*;
@RunWith(Parameterized.class)
public class ParametrizedTest {

    private final int v1;
    private final int v2;
    private final int v3;


    public ParametrizedTest(int v1, int v2, int v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    @Parameterized.Parameters
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