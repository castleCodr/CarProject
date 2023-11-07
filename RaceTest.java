public class RaceTest {
    public static void main(String[] args) {
        Car car1 = new Car(100,5.0,.1,"Lambo");
        Car car2 = new Car(100,5.0,1,"Ferarri");
        Track track1 = new Track(3,10,"Indy 500");
        Race race = new Race(car1,car2,track1,2);

        for(int i = 0;i<5;i++){
            System.out.println(race);
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
