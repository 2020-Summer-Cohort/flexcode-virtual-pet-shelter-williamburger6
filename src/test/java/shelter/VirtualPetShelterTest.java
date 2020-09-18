package shelter;





import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestFactory;

import java.util.Collection;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class VirtualPetShelterTest {
    VirtualPetShelter underTest;

    VirtualPet pet1;
    VirtualPet pet2;
    @BeforeEach
    public void setUp(){
        underTest = new VirtualPetShelter();
        pet1 = new VirtualPet("Todd","Black",15,15,15);
        pet2 = new VirtualPet("Jack","Gray",20,20,20);



    }

    @Test
    public void shouldBeAbleToAddName(){
        underTest.add(pet1);
        VirtualPet retrievedName = underTest.findName("Todd");
        assertEquals(retrievedName, pet1);



    }

    @Test
    public void shouldBeAbleToAddColor() {
        underTest.add(pet1);
        underTest.color(pet1.getName(), "Black");
        assertEquals(pet1.getColor(), "Black");
    }







    @Test
    public void shouldLowerHunger(){
        underTest.add(pet1);
        underTest.hunger(pet1.getName(),0);
        assertEquals(pet1.getHunger(),0);
    }
    @Test
    public void shouldLowerThirst(){
        underTest.add(pet1);
        underTest.thirst(pet1.getName(),0);
        assertEquals(pet1.getThirst(),0);
    }
    @Test
    public void shouldLowerEnergy(){
        underTest.add(pet1);
        underTest.energy(pet1.getName(),0);
        assertEquals(pet1.getEnergy(),0);
    }
}
