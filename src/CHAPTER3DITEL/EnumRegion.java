package CHAPTER3DITEL;

public enum EnumRegion {
    NW("KANO, KATSINA, KADUNA"),
    SE("IMO, ANNAMBRA, EBONYI, ENUGU"),
    SS("AKWA-IBOM, CALABAR, DELTA, ONDO"),
    SW("LAGOS, OGUN, OYO,OSUN"),
    ;

    private final String[] states;

    EnumRegion(String... states){
        this.states = states;
    }
    public String[] getStates(){
        return states;
    }

}
