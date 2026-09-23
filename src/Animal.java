public abstract class Animal {
    private int numLegs =2;
    private int numEyes = 2;
    public abstract void makeSound();
    public abstract void eatFood();

    public void move(){

    }
    public int getNumLegs(){
        return numLegs;
    }
    public void setNumLegs(int numLegs){
        this.numLegs = numLegs;
    }

    public int getNumEyes(){
        return numEyes;
    }
    public void setNumEyes(int numEyes){
        this.numEyes = numEyes;
    }
}
