public enum AirlineType {
    EASYJET("EasyJet"),
    FLYBE("Flybe"),
    BRITISHAIRWAYS("British Airways"),
    RYANAIR("Ryanair");

    private final String value;

    AirlineType(String value) {
        this.value = value;
    }

    public String getValue(){
        return value;
    }


}
