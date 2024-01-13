public class Cat extends Dog{
        public void animalSound(){
            super.animalSound();
            System.out.println("The Cat says : Meow Meow");
        }
}

class main{
    public static void main(String[] args) {
        Animal myAnimal= new Animal();
        Dog myDog= new Dog();
        Cat myCat= new Cat();

        myAnimal.animalSound();
        myDog.animalSound();
        myCat.animalSound();

    }
}
