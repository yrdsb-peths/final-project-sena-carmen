import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * YouWonWorld class construct a world when user complete all level. 
 * 
 * @authors Sena Godek & Carmen Cheung 
 * @June 2025
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
        createChest(); 
    }
    
    /**
     * This create the treasure chest from the Chest.class.
     */
    public void createChest(){
        Chest chest = new Chest(); 
        
        addObject(chest, 300, 280);
    }
}
