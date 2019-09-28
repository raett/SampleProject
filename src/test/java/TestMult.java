import lesson2.Task1;
import lesson2.Task2;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMult {
    @Test
    public void simpleTest(){
        boolean result = Task2.pr(5,2,20);
        assertEquals(true, result);
        boolean result1 = Task2.pr(3,7,20);
        assertEquals(false, result1);
    }
    @Test
    public void testZero(){
        boolean result2 = Task2.pr(0,2,0);
        assertEquals(true, result2);
        result2= Task2.pr(0,6,7);
        assertEquals(false, result2);
        result2= Task2.pr(0,6,6);
        assertEquals(true, result2);
    }
    @Test
    public void testNegative(){
        boolean result3 = Task2.pr(5,2,-20);
        assertEquals(false, result3);
        boolean result4 = Task2.pr(5,-2,-20);
        assertEquals(false, result4);
        boolean result5 = Task2.pr(5,-2,-10);
        assertEquals(true, result5);
    }

}
