class Circle {

    double radius;
     String color;
     Circle(){
     }

    Circle(double radius, String color) {
       this.radius= radius;
       this.color = color;
    }

    double calculateArea() {
      return 3.14 * radius * radius;
    
    }
    
    public static void main (String[] args) {

      Circle red_circle = new Circle();
        Circle green_circle = new Circle();

      red_circle.radius = 5;     
        red_circle.color = "Red";

        green_circle.radius = 7;  
         green_circle.color = "Green";

        System.out.println("The color is " + red_circle.color + " and Area: " + red_circle.calculateArea());
        System.out.println("The color is " + green_circle.color + " and Area: " + green_circle.calculateArea());
        
    }
    
}
