import java.util.Timer;

public class ZooWithSuperClassAndConstructor {
    public static void main(String[] args) {
        Tiger tiger = new Tiger("Orange", 23, 78, "big");
        Elephant elephant = new Elephant("Grey", 56, 190, "super big");
        Zebra zebra = new Zebra("White/Black stripes", 13, 87, "small");
        System.out.println("Tiger " + tiger.color +" "+ tiger.age +" "+ tiger.weight + " " + tiger.size);
        System.out.println("Elephant " + elephant.color +" "+ elephant.age +" "+ elephant.weight + " " + elephant.size);
        System.out.println("Zebra " + zebra.color +" "+ zebra.age +" "+ zebra.weight + " " + zebra.size);


    }

    public static class Animal {
        String color;
        int age;
        int weight;
        String size;

        public Animal(String color, int age, int weight, String size) {
            this.color = color;
            this.age = age;
            this.weight = weight;
            this.size = size;

        }
    }

    public static class Tiger extends Animal {
        public Tiger(String color, int age, int weight, String size) {
            super(color, age, weight, size);

        }
    }
    public static class Elephant extends Animal{
        public Elephant(String color, int age, int weight, String size){
            super(color, age, weight, size);
        }
    }
    public static class Zebra extends  Animal{
        public Zebra(String color, int age, int weight, String size){
            super(color, age, weight, size);
        }
    }
}
