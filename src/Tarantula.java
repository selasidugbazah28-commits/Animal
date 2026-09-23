public class Tarantula extends Animal{

    public Tarantula(){
        setNumLegs(8);
        setNumEyes(6);
    }

    @Override
    public void makeSound() {
        System.out.println("I pit-pat");
    }
    public void eatFood() {
        System.out.println("i eat insects");
    }
}
