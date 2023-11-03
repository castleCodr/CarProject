public class Race {
    private Car car1;
    private Car car2;
    private Track track;
    private int laps;
    private Car winner;
    private double car1Time;
    private double car2Time;
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
            car1Time += car1.lapTime(track);
            car2Time += car2.lapTime(track);
        }
        this.car1Time = car1Time;
        this.car2Time = car2Time;
        car1Time = Math.round(car1Time*100)/100.0;
        car2Time = Math.round(car2Time*100)/100.0;
        if(car1Time<car2Time){
            winner = car1;
        }
        else{
            winner = car2;
        }
    }
}
