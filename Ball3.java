import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Ball3 class construct the purple ball at MyWorld.
 * 
 * @ Sena Godek & Carmen Cheung 
 * @ May 2025
 */
public class Ball3 extends Actor
{
    GreenfootSound gameOverSound = new GreenfootSound("game-over-arcade.mp3");
    int speed = 1;
    
    /**
     * This create the ball3. 
     */
    public Ball3()
    {
        GreenfootImage image = new GreenfootImage("ball3.png");
        image.scale(50, 50);
        setImage(image); 
    }
    
    /**
     * This set the ball to fall. 
     */
    public void act()
    {
        //Let the Ball fall.
        int x = getX();
        int y = getY() + speed;
        setLocation(x, y);
        
        //Remove Ball and draw the game Over when Ball gets to bottom
        MyWorld world = (MyWorld)getWorld();
        if(getY() >= world.getHeight())
        {
            world.gameOver();
            gameOverSound.play();
        }
        
        if(Greenfoot.mouseClicked(this))
        {
            getWorld().removeObject(this);
            world.startBall3Timer();
            world.increaseScore();
        }
    }
    
    /**
     * This set the speed of the ball. 
     */
    public void setSpeed (int spd)
    {
        speed = spd; 
    }
}
