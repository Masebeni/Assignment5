package masebeni.question1.animalType.impl;

import masebeni.question1.animalType.TypeOfBirds;
import masebeni.question1.domain.Animal;
import masebeni.question1.factory.AnimalFactory;

/**
 * Created by Isiphile on 2016/03/27.
 */
public class Dog implements TypeOfBirds {

    public Animal getTypeOfAnimal() {
        Animal dog = AnimalFactory.buildAnimal("Dog");
        return dog;
    }
}
