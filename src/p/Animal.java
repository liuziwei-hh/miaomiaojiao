package p;

public class Animal {
    public Animal(int weight, int age) {
        this.weight = weight;
        this.age = age;
    }

    private int weight;

    public Animal() {

    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private int age;
    public static void main (String[] args){
    }
    //吃东西
    public void eat(){
        System.out.println("eating foods");
    }
    //跑步
    public  void run(){
        System.out.println("just running");
    }
}
