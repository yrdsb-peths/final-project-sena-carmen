import greenfoot.*;

public class MyWorld extends World {
    public int score = 0; 
    Label scoreLabel; 
    int level = 1; 
    public MyWorld() {
        super(600, 400, 1);
        
        createBall(); 
        createCoin();
    }
    
    public void createBall() {
    Ball ball = new Ball();
    int x = 100; 
    int y = 0;
    addObject(ball, x, y);
    }
    
    public void createCoin() {
    Coin coin = new Coin();
    int x = Greenfoot.getRandomNumber(600); 
    int y = 0;
    addObject(coin, x, y);
    }
    
    public void gameOver()
    {
        Label gameOverLabel = new Label("Game Over", 100);
        addObject(gameOverLabel, 300, 200);
    }
    
    /**
     * Increase score
     */
    public void increaseScore()
    {
        score++;
        scoreLabel.setValue(score);
        
        if (score % 5 == 0)
        {
            level += 1; 
        }
    }
}


