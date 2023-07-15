
package inhertiance;

public class Animal {

    private String  name ;
    private int body;
    private  int weight ;
    private  int brain ;
    private int size;





    public Animal(String name, int body, int size , int weight, int brain) {
        this.name = name;
        this.body = body;
        this.weight = weight;
        this.size =size;
        this.brain = brain;

    }

    public void eat(){
        System.out.println("animal");

    }

    public void move(int speed){
        System.out.println("moving"  +speed);
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public int getBody() {
        return body;
    }

    public int getWeight() {
        return weight;
    }

    public int getBrain() {
        return brain;
    }
}
