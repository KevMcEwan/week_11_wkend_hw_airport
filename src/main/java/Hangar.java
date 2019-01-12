import java.util.ArrayList;

public class Hangar {
    private Plane plane;
    private ArrayList<Plane> hangarPlanes;

    public Hangar(){
        hangarPlanes = new ArrayList<>();
    }

    public int countPlanesInHangar(){
        return hangarPlanes.size();
    }

    public void addPlaneToHangar(Plane plane){
        hangarPlanes.add(plane);
    }

    public void removePlaneFromHangar(Plane plane){
        hangarPlanes.remove(plane);
    }
}
