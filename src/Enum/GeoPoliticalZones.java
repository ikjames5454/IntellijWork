package Enum;

public enum GeoPoliticalZones {
    NORTH_CENTRAL(new String[]{"Benue, Kogi, Kwara, Nasarawa, Niger, Plateau"}),
    NORTH_EAST(new String[]{"Abia, Anambra, Ebonyi, Enugu, Imo"}),
    NORTH_WEST(new String[]{"Ekiti, Lagos, Ogun, Ondgo, Osun, Oyo"}),
    SOUTH_EAST(new String[]{"Adamawa, bauchi, borno, gombe, taraba, yobe"}),
    SOUTH_SOUTH(new String[]{"Akwa Ibom,Bayelsa,Cross River, Delta, Edo,Rivers"}),
    SOUTH_WEST(new String[]{"Ekiti, Lagos, Ogun, Ondo, Osun, Oyo"});

    private String[] state;

    GeoPoliticalZones(String[] state) {
        this.state = state;
    }


    public String[] getState() {
        return state;
    } public void setState(String[] state) {
        this.state = state;

    }


    public static GeoPoliticalZones getZone(String state) {
        for (GeoPoliticalZones zone : GeoPoliticalZones.values()) {
            for (String value : zone.getState()) {
                if (value.equalsIgnoreCase(state)) return zone;
            }


        }
        throw new IllegalArgumentException("Invalid Zone");
    }

//    public static void inArray() {
//
//
//
//        final String[][] politicalZones = new String[][]{
//                {String.valueOf(NORTH_CENTRAL.getState())},
//                {String.valueOf(NORTH_EAST.getState())},
//                {String.valueOf(NORTH_WEST.getState())},
//                {String.valueOf(SOUTH_EAST.getState())},
//                {Arrays.toString(SOUTH_SOUTH.getState())},
//                {Arrays.toString(SOUTH_WEST.getState())},
//        };
//        for(int index = 0; index < politicalZones.length; index++){
//            for( int num = 0; num < politicalZones[index].length; num++){
//                System.out.println(politicalZones[index][num]);
//            }
//            System.out.println();
//        }
//
//
//
//
//    }
}


