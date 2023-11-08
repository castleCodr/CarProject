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

    public double lapTime(Track track){
        double time = 0;
        for(int i = 0;i < track.getDistance();i++){
            time += 30/track.getSpeed(this);
        }
        return time;
    }
}
