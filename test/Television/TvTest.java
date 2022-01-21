package Television;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;

public class TvTest {



    @Test
            public void home(){
        TvSet myTv = new TvSet("Sony");
    }


    @Test
    public void isOn(){
        TvSet myTv = new TvSet("Sony");
       myTv.powe();
        assertFalse(myTv.powe());

    }

    @Test
    public void powerOn(){
        TvSet myTv = new TvSet("Sony");
        myTv.turnOn();

    }

}



