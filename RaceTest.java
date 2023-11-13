/**
 * Stephen Peterson & Samuel Malcom
 * Mr. Desteph's 5th period class
 * This class creates 2 car objects, puts them in a race, and then calculates stats, such as odds of winning.
 */
public class RaceTest {
    public static void main(String[] args) {
        Car car1 = new Car(120,5,.5,"Lambo");
        Car car2 = new Car(100,10,.01,"Ferarri");
        Track track1 = new Track(5,100,"Indy 500");
        Race race = new Race(car1,car2,track1,2);
        System.out.println(track1.getSpeed(car1));
        double car1Time = 0;
        double car2Time = 0;
        double races = 1000;
        for(int i = 0;i<races;i++){
            System.out.println("Race "+i);
            race.simulateRace();
            System.out.println(race);
            car1Time += race.getCar1Time();
            car2Time += race.getCar2Time();
        }
        System.out.println(car1.getCarName());
        System.out.println("\t"+"Average Time: "+Race.formatTime(car1Time/races));
        System.out.println("\t"+"Odds To Win: "+(Race.getCar1wins()/races*100)+"%");
        System.out.println(car2.getCarName());
        System.out.println("\t"+"Average Time: "+Race.formatTime(car2Time/races));
        System.out.println("\t"+"Odds To Win: "+(Race.getCar2wins()/races*100)+"%");
        System.out.println("Average Difficulty: " + Track.findAvgDiffculty(races));
        System.out.println(car1.getCarName()+" Specs:\n"+Race.getCarSpecs(car1));
        System.out.println(car2.getCarName()+" Specs:\n"+Race.getCarSpecs(car2));

    }
}
