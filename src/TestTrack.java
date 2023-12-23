import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestTrack {

    public static void main(String[] args) {
        ProductionRemoteControlCar prc1 = new ProductionRemoteControlCar();
        ProductionRemoteControlCar prc2 = new ProductionRemoteControlCar();
        ProductionRemoteControlCar prc3 = new ProductionRemoteControlCar();
        ProductionRemoteControlCar prc4 = new ProductionRemoteControlCar();
        prc1.setNumberOfVictories(3);
        prc2.setNumberOfVictories(2);
        prc3.setNumberOfVictories(4);
        prc4.setNumberOfVictories(1);
        List<ProductionRemoteControlCar> unsortedCars = new ArrayList<>();
        unsortedCars.add(prc1);
        unsortedCars.add(prc2);
        unsortedCars.add(prc3);
        unsortedCars.add(prc4);
        System.out.println(unsortedCars);
        List<ProductionRemoteControlCar> rankings = TestTrack.getRankedCars(unsortedCars);
        System.out.println(rankings);
    }

    public static void race(RemoteControlCar car) {
        car.drive();
    }

    public static List<ProductionRemoteControlCar> getRankedCars(List<ProductionRemoteControlCar> cars) {
        Collections.sort(cars);
        return cars;
    }
}