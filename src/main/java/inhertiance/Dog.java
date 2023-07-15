
package inhertiance;


public class Dog extends Animal {



    private int eyes;
    private int legs;
    private int teeth;
    private int tail;
    private String coat;



    public Dog(String name, int weight,int size,int eyes,int legs,int teeth,int tail,String coat) {
        super(name,1,size,weight,1);
        ;
        this.eyes=eyes;
        this.legs =legs;
        this.tail=tail;
        this.teeth=teeth;
        this.coat=coat;
    }
           private void chew(){
               System.out.println("chew");
           }


           public void walk(){
               System.out.println("walking");
               move(10);
           }

           public void run(){
               System.out.println("running");
               move(5);
           }
    @Override
    public void eat() {
        chew();
        System.out.println("dog");
        super.eat();

    }

    }

