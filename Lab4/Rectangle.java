/**
 * Write a description of class Rectangle here.
 * 
 * @ ODEBODE OLAITAN MARIAM U16/FNS/CSC/2079
 */
class Rectangle {
private double length , width;
public Rectangle(double rectangleLength , double rectangleWidth) {
length = rectangleLength;
width = rectangleWidth;
}
public double area() {
return length * width;
}
// Accessor methods
public double getLength() {
return length;
}
public double getWidth() {
return width;
}
// Mutator methods
public void setLength(double newLength) {
length = newLength;
}
public void setRectangleWidth(float newWidth) {
width = newWidth;
}
}