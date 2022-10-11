package Animal;

public class Animal {
    private double height; //m
    private double weight; //kg
    private String animal_type;
    private String blood_type;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getAnimal_type() {
        return animal_type;
    }

    public void setAnimal_type(String animal_type) {
        this.animal_type = animal_type;
    }

    public String getBlood_type() {
        return blood_type;
    }

    public void setBlood_type(String blood_type) {
        this.blood_type = blood_type;
    }

    public Animal(){

    }

    public Animal(double height, double weight, String animal_type, String blood_type) {
        this.height = height;
        this.weight = weight;
        this.animal_type = animal_type;
        this.blood_type = blood_type;
    }
}
