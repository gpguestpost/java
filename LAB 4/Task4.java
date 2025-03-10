class Employee {
    String name; 
    int yearOfjoining;
    String address;
    
    Employee (String name, int yearOfjoining, String address){
      this.name = name;
      this.yearOfjoining = yearOfjoining;
      this.address = address;
    }
     
    public static void main (String[] args){
         Employee emp1 = new Employee("Robert ", 1994, " WallsStreat");
         Employee emp2 = new Employee("Sam ", 2000, " WallsStreat");
         Employee emp3 = new Employee("John ", 1999, " WallsStreat");
    
         System.out.println("Name Year_of_Joining Address");
         System.out.println(emp1.name + emp1.yearOfjoining + emp1.address);
         System.out.println(emp2.name + emp2.yearOfjoining + emp2.address);
         System.out.println(emp3.name + emp3.yearOfjoining + emp3.address);
    
    
    }
}
