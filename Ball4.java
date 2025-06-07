import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Ball4 class construct the red ball at MyWorld. 
 * 
 * @ Sena Godek & Carmen Cheung 
 * @ May 2025
 */
public class Ball4 extends Actor
{
    GreenfootSound gameOverSound = new GreenfootSound("game-over-arcade.mp3");
    int speed = 1;
    /**
     * This create the ball4. 
     */
    public Ball4()
    {
        GreenfootImage image = new GreenfootImage("ball4.png");
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
            world.startBall4Timer();
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
