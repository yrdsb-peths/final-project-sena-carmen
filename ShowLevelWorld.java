import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * ShowLevelWorld class construct the world that show user the amount of levels in this game. 
 * 
 * @author Carmen Cheung and Sena Godek
 * @June 2025
 */
public class ShowLevelWorld extends World
{

    /**
     * Constructor for objects of class ShowLevelWorld.
     * 
     */
    public ShowLevelWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        setBackground(new GreenfootImage("levelpage.png"));
    }
    
    /**
     * This navigates to TitleScreen when "h" key is pressed.  
     */
    public void act()
    {
        if(Greenfoot.isKeyDown("h"))
        {
            TitleScreen world = new TitleScreen();
            Greenfoot.setWorld(world);
        }
        
    }
}
