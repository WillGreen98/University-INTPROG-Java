package inClass.zoo;

import java.util.*;

public class Zoo
{
    private Vet zooVet;
    private Cat cat1;
    private Dog dog1;
    private ArrayList<Animal> zooAnimals;

    public Zoo(Vet vet)
    {
        zooVet = vet;
        
        zooAnimals = new ArrayList<Animal>();
    }

    public void addAnimal(Animal animal)
    {
        zooAnimals.add(animal);
    }
       
    public void feed(Animal animal)
    {
        animal.eat();
    }
    
    public void feedAnimals()
    {
        for(Animal animal : zooAnimals)
        {
            feed(animal);
        }
    }
    
    public void giveAnimalsShots()
    {
        for(Animal animal : zooAnimals)
        {
            zooVet.giveShot(animal);
        }
    }
    
    public Animal getAnimal(int i)
    {   
        return zooAnimals.get(i);
    }
    
}
