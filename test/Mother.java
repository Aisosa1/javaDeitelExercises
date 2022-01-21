import CHAPTER3DITEL.Date;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Mother {

    @Test
    public void makeMoney (){
        Date boy = new Date (2,3,45);
        assertEquals(3, boy.getMonth());

    }
}
