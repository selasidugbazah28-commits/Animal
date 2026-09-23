public class Zoo {
    public static void main(String[] args) {
        Zoo a = new Zoo();
    }

    public Zoo(){
        Zebra a = new Zebra();
        a.makeSound();
        a.eatFood();


        Lion b = new Lion();
        b.makeSound();
        b.eatFood();

        Tarantula c = new Tarantula();
        c.makeSound();
        c.eatFood();
    }

    public void method1(){
        System.out.println("hi in method 1");
    }


}
