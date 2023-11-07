public class Track {
    public Track(int difficulty, int distance, String trackName) {
        this.difficulty = difficulty;
        this.distance = distance;
        this.trackName = trackName;
    }

    private int difficulty;
    private int distance;
    private int lapDifficulty;

    public int getLapDifficulty() {
        return lapDifficulty;
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
            diffFactor = Math.pow(1.2, lapDifficulty- car.getHandling());
        }
        else{
            diffFactor = 1+Math.pow(2, lapDifficulty- car.getHandling());
        }
        speed *= 1/diffFactor;
        speed += car.getVariability() * (Math.random() - .5) * speed;
        return speed;
    }
    public void newLap(){
        lapDifficulty = difficulty+ (int)((.5*Math.random()-.25)*difficulty);
    }
}
