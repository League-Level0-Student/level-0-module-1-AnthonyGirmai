PImage turkey;
PImage kfc;
int x = 100;
int y = 100;

void setup(){
size(800,600);
background(0,0,255);
  turkey = loadImage("turkey.png");
  turkey.resize(100,100);
  kfc = loadImage("kfc.jpeg");
  
}


void draw() {
background(0,0,255); 
image(turkey,x,y);
image(kfc,250,250);
}
void keyPressed() {
if(keyCode==UP){ 
  y = y - 5;
  // y -= 5
}
 else if
(keyCode==DOWN){
  y = y + 5;


}
else if
(keyCode==RIGHT){
  x = x + 5;
}
else if
(keyCode==LEFT){
  x = x - 5;


}
}