import greenfoot.*;

public class MyWorld extends World {
    public MyWorld() {
        super(600, 400, 1);
        createCoin(); 
        createBall(); 
    }
    
    public void createBall() {
    Ball ball = new Ball();
    int x = 100; 
    int y = 0;
    addObject(ball, x, y);
    }
    
    public void createCoin() {
    Coin coin = new Coin();
    int x = 300; 
    int y = 0;
    addObject(coin, x, y);
    }
    
    public void gameOver()
    {
        Label gameOverLabel = new Label("Game Over", 100);
        addObject(gameOverLabel, 300, 200);
    }
}


