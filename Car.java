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

    public void setSpeedMph(int speedMph) {
        this.speedMph = speedMph;
    }

    public double getHandling() {
        return handling;
    }

    public void setHandling(int handling) {
        this.handling = handling;
    }

    public double getVariability() {
        return variability;
    }

    public void setVariability(int variability) {
        this.variability = variability;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }
    public double lapTime(Track track){
        double time = 0;
        for(int i = 0;i < track.getDistance();i++){
            time += 60/track.getSpeed(this);
        }
        return time;
    };
}
