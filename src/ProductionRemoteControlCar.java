public class ProductionRemoteControlCar implements RemoteControlCar, Comparable<ProductionRemoteControlCar>{
    private int distance = 0;
    private int victories = 0;

    public void drive() {
        this.distance += 10;
    }

    public int getDistanceTravelled() {
        return distance;
    }

    public int getNumberOfVictories() {
        return victories;
    }

    public void setNumberOfVictories(int numberOfVictories) {
        this.victories += numberOfVictories;
    }
    @Override
    public int compareTo(ProductionRemoteControlCar prc1) {
        if(this.getNumberOfVictories() >  prc1.getNumberOfVictories()){
            return -1;
        } else if (this.getNumberOfVictories() < prc1.getNumberOfVictories()) {
            return 1;
        }
        return 0;
    }
}
