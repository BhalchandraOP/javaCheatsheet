 class pet {
}
class Pet extends Animal{
    public void gromm(){
        System.out.println("Groom");
    }
}
dog.toString()
dog.gromm()
Pet pet = new Pet();
pet.gromm()
class Animal {}
class ANimal {
    public void Bark(){
        System.out.println("Test");
    }
}
ANimal animal = new ANimal();
animal.Bark()
abstract class AbstractAnimal{
    abstract public void bark();
}
class Dog extends AbstractAnimal{
    public void bark(){
        System.out.println("Bow Bow");
    }
}
Dog dog = new Dog();
dog.bark()