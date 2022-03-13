import Family.Husband;
import Family.Wife;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class HusbandTest {

    @Test
    public void iyawoSnatchingTest(){
        Wife petersWife = new Wife();
        Husband peter = new Husband(new Wife());
        peter.askWifeToCook("indomie");


        BigDecimal bigDecimal = new BigDecimal("1234");
    }
}

