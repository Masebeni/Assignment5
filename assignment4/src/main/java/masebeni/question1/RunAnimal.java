package masebeni.question1;

import masebeni.question1.animalType.impl.Dog;
import masebeni.question1.domain.Animal;

/**
 * Created by Isiphile on 2016/03/27.
 */
public class RunAnimal {
    public Animal testAnimal()
    {
        Animal animal = new Dog().getTypeOfAnimal();
        return animal;
    }
}
