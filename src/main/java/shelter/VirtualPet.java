package shelter;

public class VirtualPet {
    String name;
    String color;
    int hunger;
    int thirst;
    int energy;




    public VirtualPet(String name, String color, int hunger, int thirst, int energy){

    this.name = name;
    this.color = color;
    this.hunger = hunger;
    this.thirst = thirst;
    this.energy = energy;

    }
    public String getName(){
        return name;
    };

    public String getColor(){
        return color;
    };
    public int getHunger(){
        return hunger;
    };
    public int getThirst(){
        return thirst;
    };
    public int getEnergy(){
        return energy;
    }

    public void feed(int fullPet) {
        hunger = fullPet;
    }

    public void giveWater(int fullThirst) {
        thirst = fullThirst;
    }

    public void play(int noEnergy) {
        energy = noEnergy;
    }

    public void color(String petColor) {
        color = petColor;
    }

    public void tick (int increaseAll){
        energy ++;
        thirst ++;
        hunger ++;
    }




}

