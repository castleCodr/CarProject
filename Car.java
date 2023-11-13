/**
 * Stephen Peterson & Samuel Malcom
 * Mr. Desteph's 5th period class
 * This class creates the car object, and creates the stats of a car. It also calculates lap time.
 */
public class Car {
    private String carName;
    private int speedMph;
    private double handling;
    private double variability;

    public Car(int speedMph, double handling, double variability, String carName) {
        this.speedMph = speedMph;
        this.handling = handling;
        this.variability = variability;
        this.carName=carName;
    }

    public int getSpeedMph() {
        return speedMph;
    }


    public double getHandling() {
        return handling;
    }


    public double getVariability() {
        return variability;
    }


    public String getCarName() {
        return carName;
    }

    /**
     *
     * @param track the track to run on
     * @return the time to go one lap on this track as a double
     */
    public double lapTime(Track track){

        double time = 0;
        for(int i = 0;i < track.getDistance();i++){
            time += 30/track.getSpeed(this);
        }
        return time;
    }
}
