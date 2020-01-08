import ddf.minim.*;     //at the top of the sketch
Minim minim;     //at the top of the sketch
AudioPlayer sound;    //at the top of the sketch      
    

  
      
    




      
    
void setup() {
    size(500,500);
     fill(232,202,52);
  minim = new Minim(this);      //in the setup method
sound = minim.loadFile("ding.wav");      //in the setup method
  
  
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
sound.play();
sound.rewind();
}









}
