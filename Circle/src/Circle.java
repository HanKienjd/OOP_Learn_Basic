public class Circle {
    private double radius = 0.1;
    private String color = "red";

    public double getRadius (){
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
       return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void showCircle(double radius, String color){
        System.out.println("Circle: radius = " + radius + "color= " + color );
    }
}
