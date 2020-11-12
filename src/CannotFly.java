public class CannotFly implements FlyFeature{

    @Override
    public void fly() {
        System.out.println("oops , I can't fly");
    }
}
