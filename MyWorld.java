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
        createBall2();
        createBall3();
        createBall4();
        createCoin();
        createDog();
        
        setBackground(new GreenfootImage("background.png"));
    }
    
    public void createBall() {
        Ball ball = new Ball();
        ball.setSpeed(level);
        
        //Define four possible X positions 
        int x = 185; 
        int y = 0;
        addObject(ball, x, y);
    
    }
      
    public void createBall2() {
        Ball2 ball2 = new Ball2();
        ball2.setSpeed(level);
        
        //Define four possible X positions
        int x = 255; 
        int y = 0;
        addObject(ball2, x, y);
    
    }
    
        public void createBall3() {
        Ball3 ball3 = new Ball3();
        ball3.setSpeed(level);
        
        //Define four possible X positions
        int x = 335; 
        int y = 0;
        addObject(ball3, x, y);
    
    }
    
        public void createBall4() {
        Ball4 ball4 = new Ball4();
        ball4.setSpeed(level);
        
        //Define four possible X positions
        int x = 395; 
        int y = 0;
        addObject(ball4, x, y);
    
    }
    
    public void createCoin() {
        Coin coin = new Coin();
        coin.setSpeed(level);
        
        //Define four possible X positions
        int[] spawnPositions = {185, 255, 335, 395};
        
        int x = spawnPositions[Greenfoot.getRandomNumber(4)]; 
        int y = 0;
        addObject(coin, x, y);
    
    }
    
    public void createDog() {
        Dog dog = new Dog(); 
        
        addObject(dog, 185, 300);
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
        
        if (score % 15 == 0)
        {
            level += 1; 
        }
    }
    
    public void increaseScoreCoin()
    {
        score+=2;
        scoreLabel.setValue(score);
        
        if (score % 15 == 0)
        {
            level += 1; 
        }
    }
    
    public void decreaseScore()
    {
        score-=2;
        scoreLabel.setValue(score);
        createCoin();
    }
    
}


