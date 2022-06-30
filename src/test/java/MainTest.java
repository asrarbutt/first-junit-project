import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {


    @Test
    void add(){

        //Given
        int i=2;

        //when
        int result= Main.add(i);

        //then
        assertEquals(4, result);

    }


}