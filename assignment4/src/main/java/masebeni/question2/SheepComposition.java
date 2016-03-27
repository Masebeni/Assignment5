package masebeni.question2;

import masebeni.question1.domain.Animal;
import masebeni.question1.factory.AnimalFactory;

/**
 * Created by Isiphile on 2016/03/27.
 */
public class SheepComposition {
    Animal sheep = AnimalFactory.buildAnimal("Sheep");
    public void alterDog(String name)
    {
        sheep.setName(name);
    }
}
