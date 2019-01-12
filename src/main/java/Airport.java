import java.util.ArrayList;

public class Airport {
    private String airportCode;
    private ArrayList<Hangar> hangars;

    public Airport(String airportCode){
        this.airportCode = airportCode;
        this.hangars = new ArrayList<>();
    }

    public String getAirportCode(){
        return airportCode;
    }

    public int countHangars(){
        return hangars.size();
    }

    public void addHangar(Hangar hangar){
        hangars.add(hangar);
    }

}
