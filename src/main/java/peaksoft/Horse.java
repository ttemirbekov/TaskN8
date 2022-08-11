package peaksoft;


public class Horse implements Animal{
    private String breed;
    private String color;
    private int age;
    private int height;
    private int weight;

    public Horse() {
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Horse{" +
                "breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }

    @Override
    public void animalPlus() {
        System.out.println("They help people do work, from plowing fields to hauling goods");
    }

    @Override
    public void animalMinus() {
        System.out.println("They may kick and bite you");

    }
}
