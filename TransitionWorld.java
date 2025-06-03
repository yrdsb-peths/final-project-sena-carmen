import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TransitionWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TransitionWorld extends World
{

    SimpleTimer delayTimer = new SimpleTimer();
    int level;
    int score;
    /**
     * Constructor for objects of class TransitionWorld.
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

        createCountdown(); 
        
        delayTimer.mark();
    }
    
    public void act() {
        if(delayTimer.millisElapsed() > 3000) {
            Greenfoot.setWorld(new MyWorld(level, score));
        }
     }
     
    public void createCountdown() {
        Countdown countdown = new Countdown(); 
        
        addObject(countdown, 300, 250);
    }
}
