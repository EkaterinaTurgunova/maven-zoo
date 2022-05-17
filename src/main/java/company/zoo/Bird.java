package company.zoo;

public abstract class Bird extends Entity implements ZooDoing {

    @Override
    public void breath() {
        System.out.printf("The %s breathes oxygen. ", kindOfEntity);
    }

    @Override
    public void move() {
        System.out.printf("\nThe %s flies. ", kindOfEntity);
    }
}

