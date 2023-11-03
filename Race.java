public class Race {
    public Race(Car car1, Car car2, Track track, int laps) {
        this.car1 = car1;
        this.car2 = car2;
        this.track = track;
        this.laps = laps;
    }

    private Car car1;
    private Car car2;
    private Track track;
    private int laps;
    public String simulateRace(){
        double car1Time = 0;
        double car2Time = 0;
        for(int i = 0;i<laps;i++){
            car1Time += car1.lapTime(track);
            car2Time += car2.lapTime(track);
        }
        car1Time = Math.round(car1Time*100)/100.0;
        car2Time = Math.round(car2Time*100)/100.0;
        if(car1Time<car2Time){
            return car1.getCarName() + " wins with a time of " + car1Time + " minutes vs " +car2Time + " minutes";
        }
        else{
            return car2.getCarName() + " wins with a time of " + car1Time + " minutes vs " +car2Time + " minutes";
        }
    }
}
