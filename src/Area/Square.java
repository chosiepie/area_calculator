package Area;

class Square implements Shape {
    private double side;

    public Square() {
        
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return Math.pow(side, 2);
    }
}