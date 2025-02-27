public class ToStringCar {
    String company;
    int model;
    String color;
    int maxSpeed;

    public ToStringCar(String company) {
        this.company = company;
    }

    public ToStringCar(String company, int model, String color, int maxSpeed) {
        this.company = company;
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    //toString method
    @Override
    public String toString() {
        return "Company FINAL_NAME is: " + this.company;
    }

    //Main method
    public static void main(String[] args) {
        ToStringCar swift = new ToStringCar("Toyota",2023,"Black",120);
        System.out.println(swift.toString());

        ToStringCar thar = new ToStringCar("Yamaha");
        System.out.println(thar.toString());
    }
}
