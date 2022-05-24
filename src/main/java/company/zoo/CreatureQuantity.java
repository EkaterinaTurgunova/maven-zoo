package company.zoo;

public class CreatureQuantity {

    public static int animal = 2;
    public static int fish = 2;
    public static int bird = 2;

    public static int getCreatureQuantity() {
        return animal + fish + bird;
    }

    public static void infoCreatureQuantity() {
        System.out.printf("There are %d creatures in our zoo: %d animals, %d birds and %d fish.",
                getCreatureQuantity(), animal, bird, fish);
    }
}
