import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * InstructionWorld class construct a world that show user the instructions.
 * 
 * @author Carmen Cheung 
 * @June 2025
 */
public class InstructionWorld extends World
{

    /**
     * Constructor for objects of class InstructionWorld.
     *  
     */
    public InstructionWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        setBackground(new GreenfootImage("howtoplaypage.png"));
    }
    
    /**
     * This navigate to TitleScreen as the "h" key is pressed. 
     * 
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
