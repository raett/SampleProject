import lesson2.Homework;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestFontains {

    @Test
    public  void testFontains(){
        int[] mas= {0,1,2,0,1,2,0};
        int k = 5;
        int result = Homework.fontains(mas,k);
        assertEquals(4,result);
    }


}
