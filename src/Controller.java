public class Controller {
    private Integer minFloor;
    private Integer maxFloor;
    public static int floor;

    public Controller(int minFloor, int maxFloor) throws IllegalAccessException {
        if (minFloor >= maxFloor) {
            throw new IllegalAccessException("Нельзя создать заданный диапазо этажей.");
        }
        this.minFloor = minFloor;
        this.maxFloor = maxFloor;
        floor = minFloor;
    }

    public void move(int floorNumber) throws IllegalAccessException {
        if(floorNumber >= minFloor && floorNumber <= maxFloor){
            System.out.println("Лифт переместился на " + floorNumber + " этаж.");
            floor = floorNumber;

        } else {
            throw new IllegalAccessException("Этаж вне диапазона.");
        }
    }

    public Controller(int maxFloor) throws IllegalAccessException {
        if (1 >= maxFloor ) {
            throw new IllegalAccessException("Нельзя создать подобный диапазон.");
        } else {
            this.maxFloor = maxFloor;
            this.minFloor = 1;
        }
    }

    public void setMinMaxFloor(int minNumber, int maxNumber) throws IllegalAccessException {
        if(minNumber >= maxNumber) {
            throw new IllegalAccessException("Данный диапазон является некорректным.");
        }
        this.minFloor = minNumber;
        this.maxFloor = maxNumber;
        floor = minFloor;
    }

    public String getMinFloor(){
        return String.format("Минимальный этаж - %d",minFloor);
    }

    public String getMaxFloor(){
        return String.format("Максимальный этаж - %d",maxFloor);
    }

    @Override
    public String toString() {
        return String.format("[%d, %d] -> %d", minFloor, maxFloor, floor);
    }

}