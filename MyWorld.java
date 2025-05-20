import greenfoot.*;

public class MyWorld extends World {
    public MyWorld() {
        super(600, 400, 1);
        
        Coin coin = new Coin();
        addObject(coin, 100, 200);
    }
}
