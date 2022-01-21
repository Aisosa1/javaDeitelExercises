package sevenSegment;

public class SevenSegmentDisplay {
    int[][] binaryDisplay = new int[5][4];
    private String display;
    public void setDisplay(String binaryBit) {
        display = binaryBit;
        if(binaryBit.charAt(0) == '1') writeOnA();
        if(binaryBit.charAt(1)== '1')writeOnB();
        if(binaryBit.charAt(2)== '1'){
            binaryDisplay[2][3] = 1;
            binaryDisplay[3][3] = 1;
            binaryDisplay[4][3] = 1;
        }

    }

    private void writeOnB() {
        binaryDisplay[0][3] = 1;
        binaryDisplay[1][3] = 1;
        binaryDisplay[2][3] = 1;
    }

    private void writeOnA() {
        binaryDisplay[0][0] =1;
        binaryDisplay[0][1] =1;
        binaryDisplay[0][2] =1;
        binaryDisplay[0][3] =1;
    }

    public String getCurrentDisplay() {
        return display;
    }

    public int[][] getBinaryDisplay() {
        return binaryDisplay;
    }
}
