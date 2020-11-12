public class RedHatDuck extends Duck{
    public RedHatDuck(){
        flyfeature = new CannotFly();
        quackfeature = new MuteQuack();
    }
    @Override
    public void display() {
        System.out.println("i am a red hat duck");
    }
}
