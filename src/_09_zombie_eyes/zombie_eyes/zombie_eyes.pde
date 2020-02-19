void setup() {
  size(600, 600);
  background(0, 255, 90);




  PImage steph=loadImage("steph.jpg");
  image(steph, 20, 5);
}



void draw() {

  ellipse(240, 350, 200, 250);
  ellipse(450, 350, 200, 250);
  if (mousePressed) {
    fill(0, 0, 0);
  } else {
    fill(255, 0, 0);
  }
}
