package p;

public class Cat extends Animal {

    public Cat(int weight, int age) {
        super(weight, age);
    }

    public Cat() {
        super();
    }
    public static void main(String[] args){}

    public void roar(){
        System.out.println("roar sounds 'miao'");
    }
}
