public class Lion extends Animal{

    public Lion(){
    setNumLegs(4);
    setNumEyes(2);
}

    @Override
    public void makeSound() {
        System.out.println("I roar");
    }
    public void eatFood() {
        System.out.println("i eat other animals");
    }
}
