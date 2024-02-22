package chichi;

public class ZoneChecker {
    public GeoPoliticalZone checkZone(String state){
        String[] states = null;
        for(GeoPoliticalZone zone: GeoPoliticalZone.values()){
            states = zone.getZones();
            for(String checker : states){
                if(checker.equals(state)) return zone;
            }
        }
        return null;
    }

}
