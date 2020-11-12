public class main {
    public static void main(String [] args){
        Duck mallord = new MallordDuck();
        mallord.setFly(new CannotFly());
        mallord.performFly();
    }
}
