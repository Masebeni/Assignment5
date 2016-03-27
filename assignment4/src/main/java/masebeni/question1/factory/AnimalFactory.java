package masebeni.question1.factory;

import masebeni.question1.domain.Animal;

/**
 * Created by Isiphile on 2016/03/27.
 */
public abstract class AnimalFactory {
    public  static Animal buildAnimal(String animalType)
    {
        Animal animal = null;

        if(animal.equals("Dog"))
        {
            animal = new Animal();
            animal.setName("Dog");
            animal.setSound("Bark");
            animal.setLegs(4);
        }

        if(animal.equals("Chicken"))
        {
            animal = new Animal();
            animal.setName("Chicken");
            animal.setSound("Cheep");
            animal.setLegs(2);
        }
        return  animal;
    }
}
