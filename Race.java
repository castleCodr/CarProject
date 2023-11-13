public class Race {
    public static final int secondsPerMinute = 60;
    public static final int precision = 3;
    private Car car1;
    private Car car2;
    private Track track;
    private int laps;
    private Car winner;
    private double car1Time;
    private double car2Time;
    public static int car1wins = 0;
    public static int car2wins = 0;

    /**
     *
     * @param time the time in seconds as a double
     * @return a String with the formatted time to the precision set in the static variable precision
     */
    public static String formatTime(double time){
        time *= 60;
        double seconds = time % secondsPerMinute;
        int minutes = (int) time / secondsPerMinute;
        double roundedSeconds = (int)(seconds*Math.pow(10,precision));
        roundedSeconds = roundedSeconds/Math.pow(10,precision);
        return minutes + " minutes, "+ roundedSeconds + " seconds";
    }
    public static String getCarSpecs(Car car){
        String output = "";
        output += "\nMax Speed: " + car.getSpeedMph();
        output += "\nVariation (bad on average): " + car.getVariability();
        output += "\nHandling Rating: " + car.getHandling();
        output += "\nOverall Rating: " + ((int)((car.lapTime(new Track(5,1000,""))/(25))-7))/100.0;
        return output;
    }


    public double getCar1Time() {
        return car1Time;
    }

    public static int getCar1wins() {
        return car1wins;
    }

    public double getCar2Time() {
        return car2Time;
    }

    public static int getCar2wins() {
        return car2wins;
    }

    public Race(Car car1, Car car2, Track track, int laps) {
        this.car1 = car1;
        this.car2 = car2;
        this.track = track;
        this.laps = laps;
    }

    /**
     * Simulates one race of the 2 instance cars on the instance track
     */
    public void simulateRace(){
        double car1Time = 0;
        double car2Time = 0;
        for(int i = 0;i<laps;i++){
            track.newLap();
            car1Time += car1.lapTime(track);
            car2Time += car2.lapTime(track);
        }
        this.car1Time = car1Time;
        this.car2Time = car2Time;
        if(car1Time<car2Time){
            winner = car1;
            car1wins++;
        }
        else{
            winner = car2;
            car2wins++;
        }
    }

    /**
     *
     *
     * @return  Returns the race details as a formatted string in the form
        Winner: [Car name of winner]
        [Car Name of car1] time: [Formatted time of car1]
        [Car Name of car2] time: [Formatted time of car2]
     *
     */
    @Override
    public String toString() {
        String output = "Winner: "+this.winner.getCarName() + "\n" + car1.getCarName()  + " time: " + Race.formatTime(car1Time) + "\n" + car2.getCarName()  + " time: " + Race.formatTime(car2Time);
        return output + "\n\n";
    }
}
