class Animal{
    private String name;
    public Animal(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void speak(){
        System.out.println("Hayvan Konuşuyor");
    }
}

class Bird extends Animal{

    public Bird(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println(getName() + "ötüyor...");
    }
}
class Dog extends Animal{

    public Dog(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println(getName() + "havluyor...");
    }
}
class Horse extends Animal{

    public Horse(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println(getName() + "Kişniyor...");
    }
}


public class Main {
    public static void speaktry(Animal animal){
        animal.speak();
    }

    public static void main(String[] args){
        Animal animal = new Animal("Hayvan");
        Bird bird = new Bird("Limon");
        Dog dog = new Dog("Karabaş");
        Horse horse = new Horse("Şahbatur");

        /*animal.speak();
        bird.speak();
        dog.speak();
        horse.speak();*/

        /*
        // bunun gibi tekrar tekrar yazmakyerine speaktry methodu oluşturuyoruz
        Animal animal2 = new Bird("Limon");
        animal2.speak();*/

        speaktry(new Horse("Şahbatur"));

    }
}
