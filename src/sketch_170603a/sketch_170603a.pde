// 1. Find a really hard Where’s Waldo puzzle, save it, and drop it onto this sketch.
PImage waldo;   
 
void setup() {
  waldo = loadImage("wallypuzzle.png"); // 2. Change this to match your file name.
  size(1000,800);
  waldo.resize(1000,800);
  image(waldo, 0, 0);
}
 
void draw() {
  // 3. Use this print statement to find out the coordinates of Waldo
  println("X: " + mouseX + " Y: " + mouseY); 
 
  // 4. If the mouse is on Waldo, print “Waldo found!”
    if(dist(mouseX, mouseY, 561, 357)<20){
      println("You found him!");
      playWoohoo();
    }
  // 5. If Waldo is found, also use the method below to play “Woohoo”
  // 6. If the mouse is pressed and they’re not on Waldo, play “Doh”
   if(mousePressed){
     if(dist(mouseX, mouseY, 561, 357) >19){
       println("Look again...");
       playDoh();
     }
   }
}
 
void playWoohoo() {
  if(woohoo.duration()>playTime -  second()){
    woohoo.play();
    playTime = second();
  }
}
 
void playDoh() {
  if(doh.duration()>playTime -  second()){
    doh.play();
    playTime = second();
  }
}
 
 
import processing.sound.*;
int playTime;
SoundFile woohoo =new SoundFile(this, "/Users/League/Google Drive/league-sounds/homer-woohoo.wav");
SoundFile doh = new SoundFile(this, "/Users/League/Google Drive/league-sounds/quack.wav");