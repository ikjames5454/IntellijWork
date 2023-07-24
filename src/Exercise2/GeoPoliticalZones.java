package Exercise2;

public enum GeoPoliticalZones {
    NORTH_EAST ("", "", "", "", "", ""),
    NORTH_WEST ("", "", "", "", "", "", ""),
    NORTH_CENTRAL ("", "", "", "", "", "", ""),
    SOUTH_SOUTH ("", "", "","", "",""),
    SOUTH_EAST ("", "", "", "",""),
    SOUTH_WEST ("","","","","",""),
            ;

    GeoPoliticalZones(String state1, String state2, String state3, String state4, String state5, String state6) {
    }
    GeoPoliticalZones(String state1, String state2, String state3, String state4, String state5) {
    }
    GeoPoliticalZones(String state1, String state2, String state3, String state4, String state5, String state6, String state7) {
    }

    public GeoPoliticalZones setNorthCentral(){
        return NORTH_CENTRAL;
    }
    public String getNorthCentral(){
        return "Benue, Kogi, Kwara, Nasarawa, Niger, Plateau";
    }

    public GeoPoliticalZones setNorthEast(){

        return NORTH_EAST;
    }
    public String getNorthEast(){
        return "Adamawa, bauchi, borno, gombe, taraba, yobe";
    }
    public GeoPoliticalZones setNorthWest(){
        return NORTH_WEST;
    }

        public String getNorthWest(){
        return "Jigawa, Kaduna, Kano, Katsina, Kebbi, Sokoto, Zamfara";
    }
    public GeoPoliticalZones setSouthSouth(){
        return SOUTH_SOUTH;
    }
    public String getSouthSouth(){
        return "Akwa Ibom,Bayelsa,Cross River, Delta, Edo,Rivers";
    }
    public GeoPoliticalZones setSouthEast(){
        return SOUTH_EAST;
    }
    public String getSouthEast(){
        return "Abia, Anambra, Ebonyi, Enugu, Imo";
    }
    public GeoPoliticalZones setSouthWest(){
        return SOUTH_WEST;
    }
    public String getSouthWest(){
        return "Ekiti, Lagos, Ogun, Ondo, Osun, Oyo";
    }

}
