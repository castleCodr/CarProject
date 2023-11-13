/**
 * Stephen Peterson & Samuel Malcom
 * Mr. Desteph's 5th period class
 * This class creates a track. It also allows us to get the speed of a car.
 */
public class Track {
    public Track(int difficulty, int distance, String trackName) {
        this.difficulty = difficulty;
        this.distance = distance;
        this.trackName = trackName;
    }
    private double lapDifficulty;
    private int difficulty;
    private int distance;
    public static double totDiffculty;
    public void newLap(){
        lapDifficulty = (difficulty*(Math.random()*.5+.75));
        totDiffculty += lapDifficulty;
    }
    public int getDistance() {
        return distance;
    }

    private String trackName;
    /**
     * This function returns the average difficulty of the laps
     * @param races number of races
     * @return average difficulty
     */
    public static double findAvgDiffculty(double races){
        return totDiffculty/races;
    }
    /**
     *
     * @param car the car to get the speed of
     * @return the speed of the car on this distance unit of this lap  as a double
     */
    public double getSpeed(Car car) {
        double speed = car.getSpeedMph();
        double diffFactor = 0;
        if(car.getHandling()>lapDifficulty){
            diffFactor = 1+Math.pow(13, lapDifficulty- car.getHandling());
        }
        else{
            diffFactor = Math.pow(1.2, lapDifficulty- car.getHandling());
        }
        speed *= 1/(diffFactor);
        speed += car.getVariability() * (Math.random() - .5) * speed;
        return speed;
    }
}
