import java.awt.*;
import java.awt.image.BufferedImage;

import java.io.*;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import java.util.Scanner;
/**
 * A cool photo editor.
 *
 * @author (Name.)
 * @version 11/27/18
 */
public class GroupPE1
{
    public static BufferedImage image;
    
    
    public static void main(String [] args) throws Exception
    {
        
    }
    
    public static void loadImage()
    {
        Scanner kb = new Scanner(System.in);
        try
        {
            System.out.println("Enter the name of the image you want to edit.");
            String input = kb.nextLine();
            
            File fileName = new File("images/" + input + ".jpg");
            image = ImageIO.read(fileName);
        }
        catch (Exception e)
        {
            System.out.println("Oops: " + e);
        }
        return ;
    }
    
    public static void nameImage()
    {
        try
        {
            Scanner kb = new Scanner(System.in);
            System.out.println("Please rename the image");
            String rename = kb.nextLine();
            
            File output = new File("images/" + rename + ".jpg");
            ImageIO.write(image, "jpg", output);
        }
        catch (Exception e)
        {
            System.out.println("Oops: " + e);
        }
    }

    
    public static void mainMenu()
    {
        Scanner kb = new Scanner(System.in);
        System.out.println("Would you like to use a photo editor? 1- yes; 2- no");
        int input = kb.nextInt();
        
        switch (input)
        {
            case 1:
                pickFilter();
                break;
            case 2:
                System.out.println("Thanks for using photo editor...");
                break;
                
     }
    }

             public static void pickFilter()
             {
                    Scanner kb = new Scanner(System.in);
                    System.out.println("Which filter would you like to apply?");
                    System.out.println("1- Rotate");
                    System.out.println("2- Mirror");
                    System.out.println("3- Filter 3");
                    System.out.println("4- Filter 4");
                    System.out.println("5- Filter 5");
                    System.out.println("6- Filter 6");
                    System.out.println("7- Filter 7");
                    System.out.println("8- Filter 8");
                    
                    int filtPick = kb.nextInt();
        switch(filtPick)
        {
            case 1: 
                rotate();
                break;
                
            case 2: 
                mirror();
                break;
            
            case 3: 
                filterThree();
                break;
            
            case 4: 
                filterFour();
                break;
            
            case 5: 
                filterFive();
                break;
                
            case 6: 
                filterSix();
                break;
                
            case 7: 
                filterSeven();
                break;
                
            case 8: 
                filterEight();
                break;
                
            default:
                System.out.println("This is not a valid input");
                mainMenu();
                break;
                

        
    }
}
   

    public static void filterThree()
    {
        System.out.println("filterThree");
    }
    
    public static void filterFour()
    {
        System.out.println("filter4");
    }
    
    public static void filterFive()
    {
        System.out.println("filterFive");
    }
    
    public static void filterSix()
    {
        System.out.println("filterSix");
    }
    
    public static void filterSeven()
    {
        System.out.println("filterSeven");
    }
    
    public static void filterEight()
    {
        System.out.println("filterEight");
    }
    
public static void rotate()
{
     Scanner kb = new Scanner(System.in);
     System.out.println("Which way would you like to rotate the image");
     System.out.println("1-Clockwise");
     System.out.println("2-Counter-Clockwise");
     System.out.println("3-Upsidedown");
     
     int rotation=kb.nextInt();
     switch(rotation)
        {
            case 1:
                clockwise();
                break;
                
            case 2:
                counterClockwise();
                break;
            
            case 3:
                upsidedown();
                break;
                
            default:
                System.out.println("This is not a valid input");
                mainMenu();
                break;
        }
    
}

public static void counterClockwise()
 {
     try
     {
         loadImage();
         
         int width = image.getWidth();
         int height = image.getHeight();
         
         System.out.println("The image is " + width + " x " + height + ".");
         
         BufferedImage newImage= new BufferedImage(height, width, BufferedImage.TYPE_INT_RGB);
         
         
         
         for (int x = 0; x<width; x++)
         {
             for (int y = 0; y<height ; y++)
             {
                 Color c = new Color(image.getRGB(x,y));
                 

                 
                 newImage.setRGB(y,x, c.getRGB());
                }   
            }
            
            image = newImage;
            nameImage();
     }
        catch (Exception e)
        {
            System.out.println("Oops: " + e);
        }
 }
public static void clockwise()
{
 try
 {
     loadImage();
     
     int width = image.getWidth();
     int height = image.getHeight();
     
     System.out.println("The image is " + width + " x " + height + ".");
     
     BufferedImage newImage= new BufferedImage(height, width, BufferedImage.TYPE_INT_RGB);
     
     
     
     for (int x = 0; x<width; x++)
     {
         for (int y = 0; y<height ; y++)
         {
             Color c = new Color(image.getRGB(x,y));
             

             
             newImage.setRGB(height-1-y, x, c.getRGB());
            }   
        }
        
     image= newImage;
     nameImage();
 }
    catch (Exception e)
    {
        System.out.println("Oops: " + e);
    }
}
 
public static void upsidedown()
 {
     try
     {
         loadImage();
         
         int width = image.getWidth();
         int height = image.getHeight();
         
         System.out.println("The image is " + width + " x " + height + ".");
         
         BufferedImage newImage= new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
         
         
         
         for (int x = 0; x<width; x++)
         {
             for (int y = 0; y<height ; y++)
             {
                 Color c = new Color(image.getRGB(x,y));
                 

                 
                 newImage.setRGB(width-1-x, height-1-y, c.getRGB());
                }   
            }
            
            image = newImage;
            nameImage();
     }
        catch (Exception e)
        {
            System.out.println("Oops: " + e);
        }
 }
 
 public static void mirror()
 {
     try
     {
         loadImage();
         
         int width = image.getWidth();
         int height = image.getHeight();
         
         System.out.println("The image is " + width + " x " + height + ".");
         
         
         
         int length = 2 * width;
         int tallness = 2 * height;
         
         System.out.println("The image is now" + length + " x " + tallness + ".");
         
         BufferedImage newImage= new BufferedImage(length, tallness, BufferedImage.TYPE_INT_RGB);
         
         BufferedImage doubleFlip= new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
         BufferedImage sideFlip= new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
         BufferedImage bottomFlip= new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
         
         //Image on top left corner
         for (int x = 0; x<width; x++)
         {
             for (int y = 0; y<height ; y++)
             {
                 Color c = new Color(image.getRGB(x,y));
                 

                 
                 newImage.setRGB(x, y, c.getRGB());
                }   
            }
         
            
         //Image on top right color
         for (int x = 0; x<width; x++)
         {
             for (int y = 0; y<height ; y++)
             {
                 Color c = new Color(image.getRGB(x,y));
                 

                 
                 sideFlip.setRGB(width-1-x, y, c.getRGB());
                }   
            }  
         for (int x = 0; x<width; x++)
         {
             for (int y = 0; y<height ; y++)
             {
                 Color c = new Color(sideFlip.getRGB(x,y));
                 

                 
                 newImage.setRGB(x+width, y , c.getRGB());
                }   
            
            }
           
            
         //Image on bottom left corner
            for (int x = 0; x<width; x++)
         {
             for (int y = 0; y<height ; y++)
             {
                 Color c = new Color(image.getRGB(x,y));
                 

                 
                 bottomFlip.setRGB(x, height-1-y , c.getRGB());
                }   
            }
               for (int x = 0; x<width; x++)
         {
             for (int y = 0; y<height ; y++)
             {
                 Color c = new Color(bottomFlip.getRGB(x,y));
                 

                 
                 newImage.setRGB(x, y+height , c.getRGB());
                }   
            }
        
            
         //getting colors for the super flipped image
         for (int x = 0; x<width; x++)
         {
             for (int y = 0; y<height ; y++)
             {
                 Color c = new Color(image.getRGB(x,y));
                 

                 
                 doubleFlip.setRGB(width-1-x, height-1-y, c.getRGB());
                }   
            }
         for (int x = 0; x<width; x++)
         {
             for (int y = 0; y<height ; y++)
             {
                 Color c = new Color(doubleFlip.getRGB(x,y));
                 

                 
                 newImage.setRGB(x + width, y + height, c.getRGB());
                }   
            }
            
         image=newImage;
         nameImage();
           
     }
        catch (Exception e)
        {
            System.out.println("Oops: " + e);
        }
 }

}


