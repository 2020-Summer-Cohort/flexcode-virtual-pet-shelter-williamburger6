package shelter;



import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {
    Map<String, VirtualPet> names = new HashMap<>();


    public void add(VirtualPet nameToAdd) {
        names.put(nameToAdd.getName(),nameToAdd);
    }

    public VirtualPet findName(String name) {
        return names.get(name);
    }

    public Collection<VirtualPet> getAllNames() {
        return names.values();
    }
    Map<String, VirtualPet> colors = new HashMap<>();
    public void color(String name, String petColor) {
       VirtualPet colors = findName(name);
        colors.color(petColor);
    }





    public void hunger(String name, int fullPet) {
        VirtualPet fullAmount = findName(name);
        fullAmount.feed(fullPet);
    }

    public void thirst(String name, int noThirst) {
        VirtualPet fullThirst = findName(name);
        fullThirst.giveWater(noThirst);
    }

    public void energy(String name, int noEnergy) {
        VirtualPet wornOut = findName(name);
        wornOut.play(noEnergy);
    }





    public void showPets() {
        for(VirtualPet name: names.values()){
            System.out.println(name.getName() + " is " + name.getColor() + " their hunger level is " + name.getHunger() + " their thirst level " + name.getThirst() + " their energy level is " + name.getEnergy());
        }
    }
}
