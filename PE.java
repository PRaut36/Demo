import java.awt.*;
import java.awt.image.BufferedImage;

import java.io.*;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import java.util.Scanner;
/**
 * Introduction to photo edititng
 *
 * @author Prasanna 
 * @version 11/14/18
 */
public class PE
{
 public static Scanner kb = new Scanner(System.in);
    public static void main(String [] args) throws Exception
 {
     
    }
    
 public static void grayscale()
 {
     try
     {
         File input = new File ("images/juneau.jpg");
         BufferedImage image= ImageIO.read(input);
         
         int width = image.getWidth();
         int height = image.getHeight();
         
         System.out.println("The image is " + width + " x " + height + ".");
         
         
         
         
         
         for (int x = 0; x<width; x++)
         {
             for (int y = 0; y<height ; y++)
             {
                 Color c = new Color(image.getRGB(x,y));
                 
                 int red = c.getRed();
                 int green = c.getGreen();
                 int blue = c.getBlue();
                 
                 int greyValue= (red+green+blue)/3;
                 
                 
                 Color newColor = new Color(greyValue, greyValue, greyValue);
                 
                 image.setRGB(x,y, newColor.getRGB());
                }   
            }
            
            
            File output = new File("images/juneau_gs1.jpg");
            ImageIO.write(image, "jpg", output);
     }
        catch (Exception e)
        {
            System.out.println("Oops: " + e);
        }
 }
 
  public static void vignette()
 {
     try
     {
         File input = new File ("images/juneau.jpg");
         BufferedImage image= ImageIO.read(input);
         
         int width = image.getWidth();
         int height = image.getHeight();
         
         System.out.println("The image is " + width + " x " + height + ".");
         
         
         
         
         
         for (int x = 0; x<width; x++)
         {
             
             for (int y = 0; y<height ; y++)
             {
                 Color c = new Color(image.getRGB(x,y));
                 
                 int red = c.getRed();
                 int green = c.getGreen();
                 int blue = c.getBlue();
                 
                 
                 int greyValue= (red+green+blue)/3;

                 
                 Color newFilt = new Color(greyValue, greyValue, greyValue);
                 
                 image.setRGB(x,y, newFilt.getRGB());
                 if (x < 150)
                 {
                    Color newColor = new Color(0, 0, 0); 
                    image.setRGB(x,y, newColor.getRGB());
                    }
                 if(x>1362)
                 {
                     Color newColor = new Color(0, 0, 0); 
                     image.setRGB(x,y, newColor.getRGB());
                    }
                    
                 if (y<150)
                 {
                     Color newColor = new Color(0, 0, 0); 
                     image.setRGB(x,y, newColor.getRGB());
                    }
                 if (y>1362)
                 {
                     Color newColor = new Color(0, 0, 0);
                     image.setRGB(x,y, newColor.getRGB());
                     }
                }   
                
            }
            
            
            File output = new File("images/juneau_gs1.jpg");
            ImageIO.write(image, "jpg", output);
     }
        catch (Exception e)
        {
            System.out.println("Oops: " + e);
        }
 }
 
 
 public static void grayOut()
 {
     try
     {
         File input = new File ("images/juneau.jpg");
         BufferedImage image= ImageIO.read(input);
         
         int width = image.getWidth();
         int height = image.getHeight();
         
         System.out.println("The image is " + width + " x " + height + ".");
         
         
         
         
         
         for (int x = 0; x<width; x++)
         {
             
             for (int y = 0; y<height ; y++)
             {
                 Color c = new Color(image.getRGB(x,y));
                 
                 int red = c.getRed();
                 int green = c.getGreen();
                 int blue = c.getBlue();
                 
                 
                 int greyValue= (red+green+blue)/3;

                 
                 Color newFilt = new Color(greyValue, greyValue, greyValue);
                 
                 image.setRGB(x,y, newFilt.getRGB());
                 if (blue < green)
                 {
                    Color newColor = new Color(red, green, blue); 
                    image.setRGB(x,y, newColor.getRGB());
                    }
                 if (red < green)
                 {
                    Color newColor = new Color(red, green, blue); 
                    image.setRGB(x,y, newColor.getRGB());
                    }
                 if(blue>green)
                 {
                     Color newColor = new Color(greyValue, greyValue, greyValue); 
                     image.setRGB(x,y, newColor.getRGB());
                    }
                 
                
                }   
            }
            
            
            File output = new File("images/juneau_gs3.jpg");
            ImageIO.write(image, "jpg", output);
     }
        catch (Exception e)
        {
            System.out.println("Oops: " + e);
        }
 }
 
 public static void flipX()
 {
     try
     {
         File input = new File ("images/juneau.jpg");
         BufferedImage image= ImageIO.read(input);
         
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
            
            
            File output = new File("images/flip1.jpg");
            ImageIO.write(newImage, "jpg", output);
     }
        catch (Exception e)
        {
            System.out.println("Oops: " + e);
        }
 }
 
 public static void uhh()
 {
     try
     {
         File input = new File ("images/juneau.jpg");
         BufferedImage image= ImageIO.read(input);
         
         int width = image.getWidth();
         int height = image.getHeight();
         
         
         int red = 0;
         int green = 0;
         int blue = 0;
         
         System.out.println("The image is " + width + " x " + height + ".");
         
         BufferedImage newImage= new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
         
         
         
         for (int x = 0; x<width; x++)
         {
             for (int y = 0; y<height ; y++)
             {
                 Color c = new Color(image.getRGB(x,y));
                 
                 red = c.getRed();
                 green = c.getGreen();
                 blue = c.getBlue();
             
                
                }    
            }
             System.out.println(red + "," + green + "," + blue);
             
            
            File output = new File("images/brown.jpg");
            ImageIO.write(newImage, "jpg", output);
     }
        catch (Exception e)
        {
            System.out.println("Oops: " + e);
        }
 }
 
 public static void keepBlue()
 {
     try
     {
         File input = new File ("images/juneau.jpg");
         BufferedImage image= ImageIO.read(input);
         
         int width = image.getWidth();
         int height = image.getHeight();
         
         System.out.println("The image is " + width + " x " + height + ".");
         
         
         
         
         
         for (int x = 0; x<width; x++)
         {
             
             for (int y = 0; y<height ; y++)
             {
                 Color c = new Color(image.getRGB(x,y));
                 
                 int red = c.getRed();
                 int green = c.getGreen();
                 int blue = c.getBlue();
                 
                 
                 int greyValue= (red+green+blue)/3;

                 
                 Color newFilt = new Color(greyValue, greyValue, greyValue);
                 
                 image.setRGB(x,y, newFilt.getRGB());
                 if (blue > green)
                 {
                    Color newColor = new Color(red, green, blue); 
                    image.setRGB(x,y, newColor.getRGB());
                    }
                 if (red < blue)
                 {
                    Color newColor = new Color(red, green, blue); 
                    image.setRGB(x,y, newColor.getRGB());
                    }
                 if(blue<green)
                 {
                     Color newColor = new Color(greyValue, greyValue, greyValue); 
                     image.setRGB(x,y, newColor.getRGB());
                    }
                 
                
                }   
            }
            
            
            File output = new File("images/juneau_gs4.jpg");
            ImageIO.write(image, "jpg", output);
     }
        catch (Exception e)
        {
            System.out.println("Oops: " + e);
        }
 }
 public static void keepRed()
 {
     try
     {
         File input = new File ("images/juneau.jpg");
         BufferedImage image= ImageIO.read(input);
         
         int width = image.getWidth();
         int height = image.getHeight();
         
         System.out.println("The image is " + width + " x " + height + ".");
         
         
         
         
         
         for (int x = 0; x<width; x++)
         {
             
             for (int y = 0; y<height ; y++)
             {
                 Color c = new Color(image.getRGB(x,y));
                 
                 int red = c.getRed();
                 int green = c.getGreen();
                 int blue = c.getBlue();
                 
                 
                 int greyValue= (red+green+blue)/3;

                 
                 Color newFilt = new Color(greyValue, greyValue, greyValue);
                 
                 image.setRGB(x,y, newFilt.getRGB());
                 if (red > green)
                 {
                    Color newColor = new Color(red, green, blue); 
                    image.setRGB(x,y, newColor.getRGB());
                    }
                 if (red > blue)
                 {
                    Color newColor = new Color(red, green, blue); 
                    image.setRGB(x,y, newColor.getRGB());
                    }
                 if(red < green)
                 {
                     Color newColor = new Color(greyValue, greyValue, greyValue); 
                     image.setRGB(x,y, newColor.getRGB());
                    }
                 
                
                }   
            }
            
            
            File output = new File("images/juneau_gs5.jpg");
            ImageIO.write(image, "jpg", output);
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
         File input = new File ("images/juneau.jpg");
         BufferedImage image= ImageIO.read(input);
         
         int width = image.getWidth();
         int height = image.getHeight();
         
         System.out.println("The image is " + width + " x " + height + ".");
         
         
         
         int length = 2* width;
         int tallness = 2* height;
         
         System.out.println("The image is now" + length + " x " + tallness + ".");
         
         BufferedImage bigImage= new BufferedImage(length, tallness, BufferedImage.TYPE_INT_RGB);
         BufferedImage doubleFlip= new BufferedImage(width, length, BufferedImage.TYPE_INT_RGB);
         BufferedImage sideFlip= new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
         BufferedImage bottomFlip= new BufferedImage(length, tallness, BufferedImage.TYPE_INT_RGB);
         
         //Image on top right corner
         for (int x = 0; x<width; x++)
         {
             for (int y = 0; y<height ; y++)
             {
                 Color c = new Color(image.getRGB(x,y));
                 

                 
                 bigImage.setRGB(x, y, c.getRGB());
                }   
            }
         
            
         //Image on top left color
         for (int x = 0; x<width; x++)
         {
             for (int y = 0; y<height ; y++)
             {
                 Color c = new Color(image.getRGB(x,y));
                 

                 
                 sideFlip.setRGB(width-1-x,y, c.getRGB());
                }   
            }  
         for (int x = 0; x<width; x++)
         {
             for (int y = 0; y<height ; y++)
             {
                 Color c = new Color(sideFlip.getRGB(x,y));
                 

                 
                 bigImage.setRGB(x+width, y , c.getRGB());
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
                 

                 
                 bigImage.setRGB(x, y+height , c.getRGB());
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
                 

                 
                 bigImage.setRGB(x+ width, y+ height, c.getRGB());
                }   
            }
            
            
         
            File output = new File("images/mirror3.jpg");
            ImageIO.write(bigImage, "jpg", output);
     }
        catch (Exception e)
        {
            System.out.println("Oops: " + e);
        }
 }
}
