package Aircon;

public class Aircon {
    private boolean isOn;
//    private boolean powerOff;
//    private boolean displayLight;
//    private boolean batteryFixed;
    private String temperature;


//    public boolean BatteryFixed() {
//        if (true) return displayLight;
//        else return powerOff;
//    }
//
//    public boolean PowerOn() {
//        if (true)
//            return displayLight;
//        else return powerOff;
//
//    }

    public String temperature(int temperature) {
        if (temperature > 30)
            return "hot";
        return "cold";
    }
}






