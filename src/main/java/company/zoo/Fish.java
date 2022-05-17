package company.zoo;

public abstract class Fish extends Entity implements ZooDoing {

    @Override
    public void breath() {
        System.out.printf("The %s breathes oxygen dissolved in water. ", kindOfEntity);
    }

    @Override
    public void move() {
        System.out.printf("\nThe %s swims in the water. ", kindOfEntity);
    }
}