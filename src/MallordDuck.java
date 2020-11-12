public class MallordDuck extends Duck{
    public MallordDuck(){
        flyfeature = new CanFly();
        quackfeature = new Quack();
    }
    @Override
    public void display() {
        System.out.println("I am a model Duck");
    }
}
