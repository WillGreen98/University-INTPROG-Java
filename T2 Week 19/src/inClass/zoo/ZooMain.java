package inClass.zoo;

public class ZooMain
{
   public static void main(String[] args)
   {
       Vet vet = new Vet();
       
       Zoo zoo = new Zoo(vet);
       
       zoo.addAnimal(new Cat("Sheba","House"));
       zoo.addAnimal(new Dog("Pedigree","Kennel"));
       zoo.addAnimal(new Lion("Safari Zone", "Mice"));
       zoo.addAnimal(new Wolf("Wolf Enclosure", "Deer"));
              
       zoo.feedAnimals();
       zoo.giveAnimalsShots();
   }
}
