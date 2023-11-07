public class RaceTest {
    public static void main(String[] args) {
        Car car1 = new Car(100,5.0,.1,"Lambo");
        Car car2 = new Car(100,5.0,1,"Ferarri");
        Track track1 = new Track(3,100,"Indy 500");
        Race race = new Race(car1,car2,track1,2);
        System.out.println(track1.getSpeed(car1));
        for(int i = 0;i<5;i++){
            race.simulateRace();
            System.out.println(race);
            System.out.println(Race.formatTime(race.getCar1Time()));
        }
        if(Race.getCar1wins() > Race.getCar2wins()){
            System.out.println(car1.getCarName() + " wins!");
        }
        else if (Race.getCar1wins() < Race.getCar2wins()) {
            System.out.println(car2.getCarName() + " wins!");
        }
        else {
            System.out.println("It's a tie.");
        }
    }
}
