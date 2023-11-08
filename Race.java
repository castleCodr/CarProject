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
    public static String formatTime(double time){
        time *= 60;
        double seconds = time % secondsPerMinute;
        int minutes = (int) time / secondsPerMinute;
        double roundedSeconds = (int)(seconds*Math.pow(10,precision));
        roundedSeconds = roundedSeconds/Math.pow(10,precision);
        return minutes + " minutes, "+ roundedSeconds + " seconds";
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

    @Override
    public String toString() {
        String output = "Winner: "+this.winner.getCarName() + "\n" + car1.getCarName()  + " time: " + Race.formatTime(car1Time) + "\n" + car2.getCarName()  + " time: " + Race.formatTime(car2Time);
        return output + "\n\n";
    }
}
