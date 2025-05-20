import greenfoot.*;

public class MyWorld extends World {
    public MyWorld() {
        super(600, 400, 1);
        
        Coin coin = new Coin();
        addObject(coin, 100, 200);
        
        createBall(); 
    }
    
    public void createBall() {
    Ball ball = new Ball();
    int x = Greenfoot.getRandomNumber(600); 
    int y = 0;
    addObject(ball, x, y);
    }
    
    public void gameOver()
    {
        Label gameOverLabel = new Label("Game Over", 100);
        addObject(gameOverLabel, 300, 200);
    }
}


