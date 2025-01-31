public class Voice {
    public void prepareVoice() {
        Animal[] animals = new Animal[5];
        
        // Create objects of animals
        animals[0] = new Cow();
        animals[1] = new Dog();
        animals[2] = new Pig();
        animals[3] = new Goat();
        animals[4] = new Lion();
        
        hear(animals); // Call hear method to make voices
    }

    public void hear(Animal[] animals) {
        for (Animal animal : animals) {
            animal.makeVoice(); // Polymorphism in action
        }
    }
}
