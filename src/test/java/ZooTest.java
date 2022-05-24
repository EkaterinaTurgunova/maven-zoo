import company.Main;
import company.zoo.Boxfish;
import company.zoo.Cheetah;
import company.zoo.CreatureQuantity;
import company.zoo.Hummingbird;
import org.testng.Assert;
import org.testng.annotations.Test;
import company.zoo.*;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.util.InputMismatchException;
import java.util.Scanner;


public class ZooTest {

    @Test(groups = "positive")
    public void assertEquals() {
        Cheetah cheetah = new Cheetah();
        Assert.assertEquals(cheetah.getKindOfCreature(), "This is a Cheetah.");
    }

    @Test(groups = "positive")
    public void assertNotEquals() {
        Hummingbird hummingbird = new Hummingbird();
        Assert.assertNotEquals(hummingbird.getSpecificSkill(), "The Hummingbird is the only bird that can fly backwards or upside down.");
    }

    @Test(groups = "positive")
    public void assertTrue() {
        CreatureQuantity creatureQuantity = new CreatureQuantity();
        Assert.assertTrue(creatureQuantity.fish == creatureQuantity.animal);
    }

    @Test(groups = "positive")
    public void assertFalse() {
        CreatureQuantity creatureQuantity = new CreatureQuantity();
        Assert.assertFalse(CreatureQuantity.getCreatureQuantity() == 6);
    }

    @Test(groups = "negative")
    public void incorrectInput() {
        ByteArrayInputStream in = new ByteArrayInputStream("&&&".getBytes());
        System.setIn(in);
        Main.main(null);
    }

    @Test(groups = "negative")
    public void negativeNumberInput() {
        ByteArrayInputStream in = new ByteArrayInputStream(("-5978" + System.lineSeparator() + "0").getBytes());
        System.setIn(in);
        Main.main(null);
    }

    @Test(expectedExceptions = InputMismatchException.class)
    public void textInputTest() {
        ByteArrayInputStream in = new ByteArrayInputStream("text".getBytes());
        System.setIn(in);
        Main.main(null);
    }
}