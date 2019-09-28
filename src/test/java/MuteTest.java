import lesson2.Task1;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MuteTest {

    @Test
    public void TestMute(){
        String result = Task1.myMute("I love dogs");
        assertEquals("I *** dogs", result);

    }
    @Test
    public void TestMuteEmpty(){
        String result = Task1.myMute("");
        assertEquals("", result);

    }
}
