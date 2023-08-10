package Enum;

public enum GeoPoliticalZones {
    NORTH_CENTRAL(new String[]{"Benue", "Kogi", "Kwara", "Nasarawa", "Niger", "Plateau"}),
    NORTH_EAST(new String[]{"Adamawa", "bauchi", "borno", "gombe", "taraba", "yobe"}),
    NORTH_WEST(new String[]{"kaduna", "katsina", "kano", "kebbi", "sokoto", "jigawa", "zamfara"}),
    SOUTH_EAST(new String[]{"Abia", "Anambra", "Ebonyi", "Enugu", "Imo"}),
    SOUTH_SOUTH(new String[]{"Akwa Ibom", "Bayelsa", "Cross River", "Delta", "Edo,Rivers"}),
    SOUTH_WEST(new String[]{"Ekiti", "Lagos", "Ogun", "Ondo", "Osun", "Oyo"});

    private String[] state;

    GeoPoliticalZones(String[] state) {
        this.state = state;
    }


    public String[] getState() {
        return state;
    }

    public void setState(String[] state) {
        this.state = state;

    }


    public static GeoPoliticalZones getZone(String state) {
        for (GeoPoliticalZones zone : GeoPoliticalZones.values()) {
            for (String value : zone.getState()) {
                if (value.equalsIgnoreCase(state)) return zone;
            }


        }
        throw new NullPointerException("this is not a state");
    }
}




