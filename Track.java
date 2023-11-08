public class Track {
    public Track(int difficulty, int distance, String trackName) {
        this.difficulty = difficulty;
        this.distance = distance;
        this.trackName = trackName;
    }
    private double lapDifficulty;
    private int difficulty;
    private int distance;
    public void newLap(){
        lapDifficulty = (difficulty*(Math.random()*.5+.75));
    }
    public int getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(int difficulty) {
        this.difficulty = difficulty;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public String getTrackName() {
        return trackName;
    }

    public void setTrackName(String trackName) {
        this.trackName = trackName;
    }

    private String trackName;

    public double getSpeed(Car car) {
        double speed = car.getSpeedMph();
        double diffFactor = 0;
        if(car.getHandling()>lapDifficulty){
            diffFactor = 1+Math.pow(5, lapDifficulty- car.getHandling());
        }
        else{
            diffFactor = Math.pow(1.2, lapDifficulty- car.getHandling());
        }
        speed *= 1/(diffFactor);
        speed += car.getVariability() * (Math.random() - .5) * speed;
        return speed;
    }
}
