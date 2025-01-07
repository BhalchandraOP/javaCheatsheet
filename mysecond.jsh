 class pet {
}
class Animal {
}
class Pet extends Animal{
    public void gromm(){
        System.out.println("Groom");
    }
}
class Dog extends Pet{
}
Dog dog = new Dog();
dog.toString()
dog.gromm()
Pet pet = new Pet();
pet.gromm()