
  /*** Go to the recipe to run the demonstration before starting this program ***/
        int xl = 300;
        int xr = 1200;
        int speed = 1;
        int direction = 1;
void setup() {
  /* Set the size of your sketch to be a rectangle like in the recipe demonstration */
  size(1500,800);
  /* Call the noFill() command so all the ellipses will be transparent */
  noFill();
}

void draw() {
  background(255,255,255);
        /* Use a for loop to make the first set of rings that will start in the left half of the window
        (you can use the code from your Bullseye program).*/   

        int a = 0;
  for (int ur = 0; ur < 25; ur++) {
       ellipse (xl, 400, a, a);
        ellipse (xr, 400, a, a);
        a = a - 20; 

  }
        
        /*Make this set of rings move across the sketch to the right 
        Hint: make two variables, one for x and another for the speed. 
        Then increase x by the amount in speed */
      xl = xl + speed*direction;
      xr = xr - speed*direction;
        
        /*When the rings reach the right side of the sketch, reverse the direction so they move
        Hint: speed = -speed */
  if (xl > width || xl < 0) {
   direction *= -1; 
  }
         
        /*When the rings reach the left side of the sketch, reverse the direction again */
        
         
 //CHALLENGE - to finish the Amazing Rings 
 
        /*Add another for loop to draw the second set of rings that will start in the right half of the window */
        
        
        /*Make this set of rings move in the opposite direction to the other rings 
        These rings must also "bounce" off the sides of the window.*/
        
}
