import java.util.Scanner;

public class practice {
    public static void main (String[] args){
    Scanner cin = new Scanner(System.in);
    
    int[][] arra = { {12, 13, 15, 16} , {11, 110, 121, 17}, {17, 18, 100, 21}};
    int count = 0;
    
    for(int i=0; i<arra.length; i++){
       for(int j=0; j<arra[i].length; j++){
          System.out.print(arra[i][j] + " ");
       
       } 
       System.out.println();
    }
    System.out.println("\nUpdated value divided by 2: ");
    
    for(int i=0; i<arra.length; i++){
       for(int j=0; j<arra[i].length; j++){
          if (arra[i][j] % 2 == 0){
            arra[i][j] = arra[i][j] / 2; 

            } 
          System.out.print(arra[i][j] + " ");
       
       } 
       System.out.println();
    }
    
    System.out.println("\nOdd Number: ");
    
    for(int i=0; i<arra.length; i++){
       for(int j=0; j<arra[i].length; j++){
          if (arra[i][j] % 2 != 0)
          System.out.print(arra[i][j] + " ");
       } 
       System.out.println();
    }
    
    for(int i=0; i<arra.length; i++){
       for(int j=0; j<arra[i].length; j++){
          if (arra[i][j] % 2 == 0)
            count+=arra[i][j];
       } 
    }
    
    System.out.println("\nSum of Updated even numbers: " + count);
    
    }
}
