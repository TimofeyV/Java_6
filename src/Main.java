public class Main {
    public static void main(String[] args) throws IllegalAccessException {

        Controller elevator = new Controller(1, 5);
        System.out.println(elevator);

        elevator.setMinMaxFloor(5, 12);
        System.out.println(elevator.getMaxFloor());
        System.out.println(elevator.getMinFloor());
        System.out.println(elevator);

        elevator.move(8);

        System.out.println(elevator.toString());
    }
}