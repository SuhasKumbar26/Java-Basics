package ThisKeyword;

public class ThisCarDriver {
    public static void main(String[] args) {

        //this keyword usage
        ThisCar car = new ThisCar();

        car.Star();
        car.drive();

        ThisCar newCar = new ThisCar();
        ThisCar startedCar = newCar.Star();
        startedCar.drive();

        newCar.Star().drive();

        /*
        * Start() return newCar itself So,
        * we can call method over again on newCar --> newCar.drive()
        * */

    }
}
