import greenfoot.*;
/**
 * MyWorld class construct the game screen.  
 * 
 * @authors Carmen Cheung & Sena Godek 
 * @May & June 2025
 */
public class MyWorld extends World {
    public int score = 0;
    public boolean gameIsOver = false;
    Label scoreLabel; 
    Label levelLabel; 
    int level = 1; 
    int ballTimer1 = -1;
    int ballTimer2 = -1;
    int ballTimer3 = -1;
    int ballTimer4 = -1;
    boolean hasTransitioned = false;

    GreenfootSound gameMusic1 = new GreenfootSound("gaming-music-8-bit-console-play-background-intro-theme-342069.mp3");
    GreenfootSound gameMusic2 = new GreenfootSound("game-music-8-bit-console-play-background-intro-theme-350759.mp3");
    GreenfootSound gameMusic3 = new GreenfootSound("game-music-player-console-8bit-background-intro-theme-297305.mp3");
    GreenfootSound gameMusic4 = new GreenfootSound("gaming-music-8-bit-console-play-background-intro-theme-350760.mp3");
    /**
     * Constructor for objects of class MyWorld.
     * 
     * @param level the level user reaches every 40 scores
     * @param score the score user gain when clicks a ball or coin
     * 
     */
    public MyWorld(int level, int score) {
        super(600, 400, 1, false);
        this.level = level;
        this.score = score;
        hasTransitioned = false;
        
        scoreLabel = new Label(score, 40);
        addObject(scoreLabel, 570, 20);

        startBall1Timer();  
        startBall2Timer();
        startBall3Timer();
        startBall4Timer();

        createCoin();
        createGreentube();
        createBluetube(); 

        if(level == 1) {
            // set background image and music
            setBackground(new GreenfootImage("background.png"));
            gameMusic1.play();
        } 
        
        if(level == 2)
        {
            setBackground(new GreenfootImage("bg2.png"));
            gameMusic2.play();
        } 
        
        if(level == 3)
        {
            setBackground(new GreenfootImage("bg3.png"));
            gameMusic3.play();
        }
        
        if(level == 4)
        {
            setBackground(new GreenfootImage("bg4.png"));
            gameMusic4.play();
        }
    }
    
    /**
     * This create the ball from the Ball.class. 
     */
    public void createBall() {
        Ball ball = new Ball();
        ball.setSpeed(level);

        int x = 185; 
        int y = 0;
        addObject(ball, x, y);

    }
    
    /**
     * This create the ball from the Ball2.class. 
     */
    public void createBall2() {
        Ball2 ball2 = new Ball2();
        ball2.setSpeed(level);

        //Define four possible X positions
        int x = 255; 
        int y = 0;
        addObject(ball2, x, y);

    }
    
    /**
     * This create the ball from the Ball3.class. 
     */
    public void createBall3() {
        Ball3 ball3 = new Ball3();
        ball3.setSpeed(level);

        //Define four possible X positions
        int x = 335; 
        int y = 0;
        addObject(ball3, x, y);

    }
    
    /**
     * This create the ball from the Ball4.class. 
     */
    public void createBall4() {
        Ball4 ball4 = new Ball4();
        ball4.setSpeed(level);

        //Define four possible X positions
        int x = 395; 
        int y = 0;
        addObject(ball4, x, y);

    }
    
    /**
     * This create the coin from the Coin.class. 
     */
    public void createCoin() {
        Coin coin = new Coin();
        coin.setSpeed(level);

        //Define four possible X positions
        int[] spawnPositions = {185, 255, 335, 395};

        int x = spawnPositions[Greenfoot.getRandomNumber(4)]; 
        int y = 0;
        addObject(coin, x, y);

    }
    
    /**
     * This create the green tube from the Greentube.class. 
     */
    public void createGreentube() {
        Greentube greenTube = new Greentube(); 

        addObject(greenTube, 500, 40); 
    }
    
    /**
     * This create the blue tube from the Bluetube.class. 
     */
    public void createBluetube() {
        Bluetube blueTube = new Bluetube(); 

        addObject(blueTube, 80, 40); 
    }
    
    /**
     * This stop all musics.  
     */
    public void stopAllMusic() 
    {
        gameMusic1.stop();
        gameMusic2.stop();
        gameMusic3.stop();
        gameMusic4.stop();
    }   
    
    /**
     * This displays the game over screen when a ball touch the floor. 
     */
    public void gameOver()
    {
        if (gameIsOver) 
        {
            return; 
        }
        
        stopAllMusic();
        
        gameIsOver = true;
        setBackground(new GreenfootImage("gameover.png"));
        levelLabel = new Label(level, 40);
        addObject(levelLabel, 300, 200);
        levelLabel.setLocation(300, 260);
        
        removeObject(scoreLabel);

        removeObjects(getObjects(Greentube.class));
        removeObjects(getObjects(Bluetube.class));

        removeObjects(getObjects(Ball.class));
        removeObjects(getObjects(Ball2.class));
        removeObjects(getObjects(Ball3.class));
        removeObjects(getObjects(Ball4.class));
        removeObjects(getObjects(Coin.class));
        
    }

    /**
     * This increase one score when user clicks a ball. 
     */
    public void increaseScore()
    {
        score++;
        scoreLabel.setValue(score);
    }
    
    /**
     * This increase two scorsa when user click a coin.
     */
    public void increaseScoreCoin()
    {
        score+=2;
        scoreLabel.setValue(score);
    }
    
    /**
     * This decrease two scores as the coin touch the floor.
     */
    public void decreaseScore()
    {
        score-=2;
        scoreLabel.setValue(score);
        createCoin();
    }

    /**
     * This control the timing of ball drop of green ball. 
     */
    public void startBall1Timer() 
    {
        ballTimer1 = 60;
    }

    /**
     * This control the timing of ball drop of blue ball. 
     */
    public void startBall2Timer() 
    {
        ballTimer2 = 120;
    }
    
    /**
     * This control the timing of ball drop of purple ball. 
     */
    public void startBall3Timer() 
    {
        ballTimer3 = 180;
    }

    /**
     * This control the timing of ball drop of red ball. 
     */
    public void startBall4Timer() 
    {
        ballTimer4 = 240;
    }

    /**
     * Constructor for different setting in the game.
     */
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

        if (!hasTransitioned && score >= level * 40 && score < 160) {
            hasTransitioned = true;  // Flag so it doesn’t repeat
            stopAllMusic(); 
            Greenfoot.setWorld(new TransitionWorld(level + 1, score));
        }
        
        if(score >= 160)
        {
            gameIsOver = true;      
            stopAllMusic();          
            Greenfoot.setWorld(new YouWonWorld(score));
        }
    }
}

