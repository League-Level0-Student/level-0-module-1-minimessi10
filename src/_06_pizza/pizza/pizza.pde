      
    

  
      
    




      
    
void setup() {
    size(500,500);
     fill(232,202,52);
  
  
  
  circle(200,250,300);
  fill(247,12,28);
 circle(200,250,267);
}


void draw() {
  PImage pepperoni = loadImage("p.png");
  pepperoni.resize(130,130);

  fill(232,202,52);
  
  
  
  


if (mousePressed){
  image(pepperoni,mouseX,mouseY);

}









}
