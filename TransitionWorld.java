import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TransitionWorld here.
 * 
 * @authors Sena Godek & Carmen Cheung 
 * @June 2025
 */
public class TransitionWorld extends World
{

    SimpleTimer delayTimer = new SimpleTimer();
    int level;
    int score;
    GreenfootSound transitionSound = new GreenfootSound("game-start-6104.mp3");
    /**
     * Constructor for objects of class TransitionWorld.
     * 
     * @param level the level user reaches every 40 scores
     * @param score the score user gain when clicks a ball or coin
     * 
     */
    public TransitionWorld(int level, int score)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        this.level = level;
        this.score = score;
        
        if(level == 1)
        {
            setBackground(new GreenfootImage("transitionbg1.png"));
        }
        
        if(level == 2)
        {
            setBackground(new GreenfootImage("transitionbg2.png"));
        }
        
        if(level == 3)
        {
            setBackground(new GreenfootImage("transitionbg3.png"));
        }
        
        if(level ==4)
        {
            setBackground(new GreenfootImage("transitionbg4.png")); 
        }

        createCountdown(); 
        transitionSound.play();
        delayTimer.mark();
    }
    
    /**
     * This set the how long the transition screen appear for.
     */
    public void act() {
        if(delayTimer.millisElapsed() > 3000) {
            Greenfoot.setWorld(new MyWorld(level, score));
        }
     }
     
    /**
     * This create the countdown animation from the Countdown.class.
     */
    public void createCountdown() {
        Countdown countdown = new Countdown(); 
        
        addObject(countdown, 300, 250);
    }
}
