import org.junit.jupiter.api.Assertions;
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
        Assertions.assertEquals(4, result);

    }

    @Test
    void compare(){
        // given
        int number1=2000;
        int number2=3;

        //when
        boolean result=Main.compare(number1, number2);
        boolean expected=true;

        //then
        Assertions.assertEquals(expected, result);

    }


}