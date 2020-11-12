public abstract class Duck {
    FlyFeature flyfeature;
    QuackFeature quackfeature;
    public Duck(){

    }
    public abstract void display();
    public void performFly(){
        flyfeature.fly();
    }
    public void performQuack(){
        quackfeature.quack();
    }
    public void setFly(FlyFeature f){
        flyfeature=f;
    }
    public void setQuack(QuackFeature q){
        quackfeature = q;
    }

}
