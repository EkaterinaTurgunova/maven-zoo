package company.zoo;

public abstract class Fish extends Creature implements ZooAction {

    @Override
    public void breath() {
        System.out.printf("The %s breathes oxygen dissolved in water. ", kindOfCreature);
    }

    @Override
    public void move() {
        System.out.printf("\nThe %s swims in the water. ", kindOfCreature);
    }
}