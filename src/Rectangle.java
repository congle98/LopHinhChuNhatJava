public class Rectangle {
    double width;
    double height;

    public Rectangle() {
    }
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public double getArea() {
        return this.width * this.height;
    }
    public double getPerimeter() {
        return (this.width + this.height) * 2;
    }
    public double getWidth(){
        return this.width;
    }
    public double getHeight(){
        return this.height;
    }
    public void setWidth(double newWidth){
        this.width=newWidth;
    }
    public void setHeight(double newHeight){
        this.height=newHeight;
    }

}
