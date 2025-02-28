package NestedClass;

public class Car {

    private static int noOfDoor;

    public void repair(){
        Tyre t = new Tyre();
    }

    public static class Tyre{
        private double width;
        private double pressure;
        private String material;

        public void inflate(){
            noOfDoor = 4;
        }
    }
}
