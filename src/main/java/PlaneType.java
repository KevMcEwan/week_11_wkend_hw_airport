public enum PlaneType {
    BOEING737("Boeing 737"),
    BOMBARDIERDASH8("Bombardier Dash 8"),
    AIRBUSA320("Airbus A320"),
    BOEING777("Boeing 777");

    private final String value;

    PlaneType(String value) {
        this.value = value;
    }

    public String getValue(){
        return value;
    }

}
