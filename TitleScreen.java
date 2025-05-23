import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Title Screen
 * 
 * @author Carmen Cheung 
 * @version May 12, 2025
 */
public class TitleScreen extends World
{
    Label titleLabel = new Label("CATCH IT", 60);
    Label subLabel = new Label("Click <space> to enter game",30); 
    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 

        addObject(titleLabel, getWidth()/2, 150);
        addObject(subLabel, getWidth()/2, 250);
        setBackground(new GreenfootImage("titlebg.png"));
    }

    /**
     * The main world act loop
     */
    public void act()
    {
        if(Greenfoot.isKeyDown("space"))
        {
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
        }
    }
    
    private void prepare()
    {
        Dog dog = new Dog();
        addObject(dog,487,330);
        dog.setLocation(468,295);
        dog.setLocation(77,323);
    }
}
