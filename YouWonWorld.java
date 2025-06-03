import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class YouWonWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class YouWonWorld extends World
{
     GreenfootSound winMusic = new GreenfootSound("goodresult-82807.mp3");
    /**
     * Constructor for objects of class YouWonWorld.
     * 
     */
    public YouWonWorld(int finalScore)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        setBackground(new GreenfootImage("gamewin.png"));
        winMusic.play();
    }
}
