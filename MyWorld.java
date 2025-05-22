import greenfoot.*;

public class MyWorld extends World {
    public int score = 0; 
    Label scoreLabel; 
    int level = 1; 
    public MyWorld() {
        super(600, 400, 1, false);
        
        scoreLabel = new Label(0, 80);
        addObject(scoreLabel, 50, 50);
        
        createBall(); 
        createCoin();
        
        setBackground(new GreenfootImage("background.png"));
    }
    
    public void createBall() {
        Ball ball = new Ball();
        ball.setSpeed(level);
        
        //Define four possible X positions
        int[] spawnPositions = {185, 255, 335, 395};;
        
        int x = spawnPositions[Greenfoot.getRandomNumber(4)]; 
        int y = 0;
        addObject(ball, x, y);
    
    }
    
    public void createCoin() {
        Coin coin = new Coin();
<<<<<<< HEAD
        int[] spawnPositions = {185, 255, 335, 395};
=======
        coin.setSpeed(level);
        int[] spawnPositions = {75, 225, 375, 525};
>>>>>>> 81dce0afb5a1e4223a3503c3f2b3cc19fd035278
        int x = spawnPositions[Greenfoot.getRandomNumber(4)]; 
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
        
        if (score % 10 == 0)
        {
            level += 1; 
        }
    }
}


