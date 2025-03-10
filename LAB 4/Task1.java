class Circle {

    double radius;
     String color;

    Circle() {
      radius = 0;  
      color = ""; 
    }

    void calculateArea() {
      double area = 3.14 * radius * radius;
        System.out.println("The color is " + color + " and Area: " + area);
    
    }
    
    public static void main (String[] args) {

      Circle red_circle = new Circle();
        Circle green_circle = new Circle();


      red_circle.radius = 5;     
        red_circle.color = "Red";

        green_circle.radius = 7;  
         green_circle.color = "Green";

        red_circle.calculateArea();
        green_circle.calculateArea();
    }
    
}
