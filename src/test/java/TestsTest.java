import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestsTest {

@Before
public void before(){
    System.out.println("Выполняется до...");
}


    @Test
    public void add() throws Exception{
        Tests tests = new Tests();
        int actual = tests.add(5,6);
        int expected = 11;
        assertEquals(actual,expected);
    }

    @Test
    public void div() throws Exception{
        Tests tests = new Tests();
        int actual = tests.div(15,5);
        int expected = 3;
        assertEquals(actual,expected);
    }
    @After
    public void after(){
        System.out.println("Выполняется после...");
    }
}