package Area;

class Rectangle implements Shape {
    private double length;
    private double width;

    public Rectangle() {
       
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }
}
