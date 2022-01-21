package sevenSegment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class SevenSegmentDisplayTest {

    @Test
    public void segmentDisplayCanBeCreatedTest(){
        SevenSegmentDisplay sevenSegmentDisplay = new SevenSegmentDisplay();
        assertNotNull(sevenSegmentDisplay);
    }

    @Test
    public void sevenSegmentDisplayCanTakeInputTest(){
        SevenSegmentDisplay sevenSegmentDisplay = new SevenSegmentDisplay();
        sevenSegmentDisplay.setDisplay("11111111");
        assertEquals("11111111", sevenSegmentDisplay.getCurrentDisplay());
    }

    @Test
    public void sevenSegmentCanWriteOnASegmentTest(){
        SevenSegmentDisplay sevenSegmentDisplay = new SevenSegmentDisplay();
        sevenSegmentDisplay.setDisplay("10000001");
        int[][] binaryDisplay = sevenSegmentDisplay.getBinaryDisplay();
        assertEquals(1, binaryDisplay[0][0]);
        assertEquals(1, binaryDisplay[0][1]);
        assertEquals(1, binaryDisplay[0][2]);
        assertEquals(1, binaryDisplay[0][3]);
    }

    @Test
    public void sevenSegmentCanWriteOnBSegmentTest(){
        SevenSegmentDisplay sevenSegmentDisplay = new SevenSegmentDisplay();
        sevenSegmentDisplay.setDisplay("01000001");
        int[][] binaryDisplay = sevenSegmentDisplay.getBinaryDisplay();
        assertEquals(1, binaryDisplay[0][3]);
        assertEquals(1, binaryDisplay[1][3]);
        assertEquals(1, binaryDisplay[2][3]);
    }
    @Test
    public void sevenSegmentCanWriteOnCSegmentTest(){
        SevenSegmentDisplay sevenSegmentDisplay = new SevenSegmentDisplay();
        sevenSegmentDisplay.setDisplay("00100001");
        int[][] binaryDisplay = sevenSegmentDisplay.getBinaryDisplay();
        assertEquals(1, binaryDisplay[2][3]);
        assertEquals(1, binaryDisplay[3][3]);
        assertEquals(1, binaryDisplay[4][3]);
    }
}
