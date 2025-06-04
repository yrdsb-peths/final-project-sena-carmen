import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Title Screen
 * 
 * @author Carmen Cheung 
 * @version May 12, 2025
 */
public class TitleScreen extends World
{
    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 

        setBackground(new GreenfootImage("titlepage.png"));
    }

    /**
     * The main world act loop
     */
    public void act()
    {
        if(Greenfoot.isKeyDown("space"))
        {
            TransitionWorld world = new TransitionWorld(1, 0);
            Greenfoot.setWorld(world);
        }
        
        if(Greenfoot.isKeyDown("i"))
        {
            InstructionWorld world = new InstructionWorld();
            Greenfoot.setWorld(world);
        }
        
        if(Greenfoot.isKeyDown("v"))
        {
            ShowLevelWorld world = new ShowLevelWorld();
            Greenfoot.setWorld(world);
        }
    }
}
