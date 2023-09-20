import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class butterfly here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class butterfly extends Actor
{
    /**
     * Act - do whatever the butterfly wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
         move(1);
        if (Greenfoot.getRandomNumber(10) < 1)
        {
            int randomAngle = Greenfoot.getRandomNumber(91) - 45;
            setRotation(getRotation() + randomAngle);
        }
        checkBounds();
        
        checkForcactus();
    }
   
    private void checkBounds()
    {
        int x = getX();
        int y = getY();
        
        
        int minX = 25;
        int maxX = getWorld().getWidth() - 25; 
        int minY = 25; 
        int maxY = getWorld().getHeight() - 25;
        
        if (x <= minX || x >= maxX || y <= minY || y >= maxY)
        {
            setRotation(getRotation() + 180 + Greenfoot.getRandomNumber(90) - 45);
        }
    }
    
    private void checkForcactus()
    {
        Actor cactus = getOneObjectAtOffset(0, 0, cactus.class); 
        if (cactus != null)
        {
            setRotation(getRotation() + 180 + Greenfoot.getRandomNumber(90) - 45);
        }
    }

}
