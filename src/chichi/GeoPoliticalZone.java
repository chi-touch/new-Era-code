package chichi;

public enum GeoPoliticalZone {

    NORTH_CENTRAL("Benue","FCT","Kogi","Kwara","Nasarawa","Niger","Plateau"),
    NORTH_EAST("Adamawa","Bauchi","Borno","Gombe","Taraba","Yobe"),
    NORTH_WEST("Kaduna","Kastina","Kano","Kebbi","Sokoto","Jigawa","Zamafara"),
    SOUTH_EAST("Abia","Anambra","Ebonyi","Enugu","Imo"),
    SOUTH_SOUTH("Akwa-ibom", "Bayelsa", "Cross-River", "Delta","Edo","Rivers"),
    SOUTH_WEST("Ekiti", "Lagos", "Osun", "Ondo", "Ogun", "Oyo");


    private String[] stateInZone;

    GeoPoliticalZone(String...zones){
        this.stateInZone = zones;
    }

    public String[] getZones() {
        return stateInZone;
    }

    public void setZones(String...zones){
        this.stateInZone = zones;
    }

}
