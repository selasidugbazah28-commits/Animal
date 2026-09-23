public class Zebra extends Animal{

    public Zebra(){
        setNumLegs(4);
        setNumEyes(2);
    }

    @Override
    public void makeSound() {
        System.out.println("i neigh");
    }
    public void eatFood() {
        System.out.println("i eat grass");
    }

}
