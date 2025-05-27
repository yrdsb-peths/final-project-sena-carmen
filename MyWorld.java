import greenfoot.*;

public class MyWorld extends World {
    public int score = 0;
    public boolean gameIsOver = false;
    Label scoreLabel; 
    int level = 1; 
    int ballTimer1 = -1;
    int ballTimer2 = -1;
    int ballTimer3 = -1;
    int ballTimer4 = -1;
    public MyWorld() {
        super(600, 400, 1, false);
        
        scoreLabel = new Label(0, 80);
        addObject(scoreLabel, 50, 50);
        
        startBall1Timer();  
        startBall2Timer();
        startBall3Timer();
        startBall4Timer();

        createCoin();
        createDog();
        createCat();
        createRock(480);
        createFlower(500);
        createFlower(540); 
        createRock(50);
        createGrass(100); 
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
        
        addObject(dog, 80, 200);
    }
    
    public void createCat() {
        Cat cat = new Cat(); 
        
        addObject(cat, 500, 200); 
    }
    
    public void createRock(int x) {
        Rock rock = new Rock();
        
        addObject(rock, x, 380); 
    }
    
    public void createFlower(int x) {
        Flower flower = new Flower(); 
    
        addObject(flower, x, 380); 
         
    }
    
    public void createGrass(int x) {
        Grass grass = new Grass();
        
        addObject(grass, x, 380); 
    }
    
    public void gameOver()
    {
        if (gameIsOver) 
        {
            return; 
        }

    
        gameIsOver = true;

        Label gameOverLabel = new Label("Game Over", 100);
        addObject(gameOverLabel, 300, 200);

        removeObjects(getObjects(Ball.class));
        removeObjects(getObjects(Ball2.class));
        removeObjects(getObjects(Ball3.class));
        removeObjects(getObjects(Ball4.class));
        removeObjects(getObjects(Coin.class));
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
    
    public void startBall1Timer() 
    {
        ballTimer1 = 60;
    }

    public void startBall2Timer() 
    {
        ballTimer2 = 120;
    }

    public void startBall3Timer() 
    {
        ballTimer3 = 180;
    }

    public void startBall4Timer() 
    {
        ballTimer4 = 240;
    }
    
    public void act() 
    {
        if (gameIsOver) 
        {
            return;  
        }
        
        if (ballTimer1 > 0) 
        {
            ballTimer1--;
        }else if (ballTimer1 == 0)
        {
            createBall();
            ballTimer1 = -1;
        }  
        
        if (ballTimer2 > 0) 
        {
            ballTimer2--;
        }else if (ballTimer2 == 0)
        {
            createBall2();
            ballTimer2 = -1;
        }
        
        if (ballTimer3 > 0) 
        {
            ballTimer3--;
        }else if (ballTimer3 == 0)
        {
            createBall3();
            ballTimer3 = -1;
        }
        
        if (ballTimer4 > 0) 
        {
            ballTimer4--;
        }else if (ballTimer4 == 0)
        {
            createBall4();
            ballTimer4 = -1;
        }
    }
}


