public class Track {
    public Track(int difficulty, int distance, String trackName) {
        this.difficulty = difficulty;
        this.distance = distance;
        this.trackName = trackName;
    }

    private int lapSpeed;
    private int difficulty;
    private int distance;

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
        double trueDiff = Math.max(difficulty / Math.pow(car.getHandling(), 2), 0);
        trueDiff = Math.min(trueDiff, .75);
        speed -= speed * trueDiff;
        speed += car.getVariability() * (Math.random() - .5) * speed;
        return speed;
    }
}
