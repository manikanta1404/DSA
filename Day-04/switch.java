// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

class Main {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        Scanner src = new Scanner(System.in);
        int n = src.nextInt();
        
        //normal switch case
        
        // switch(n){
        //     case 1:
        //         System.out.println("monday");
        //         break;
        
        //     case 2:
        //         System.out.println("tuesday");
        //         break;
                
        //     case 3:
        //         System.out.println("wednesday");
        //         break;
                
        //     case 4:
        //         System.out.println("thursday");
        //         break;
                
        //     case 5:
        //         System.out.println("friday");
        //         break;
                
        //     case 6:
        //         System.out.println("saturday");
        //         break;
                
        //     case 7:
        //         System.out.println("sunday");
        //         break;
                
        //     default:
        //         System.out.println("no matching");
            
        // }
        
        //enhanced switch case
        switch(n){
            case 1 -> System.out.println("monday");
            case 2 -> System.out.println("tuesday");
            case 3 -> System.out.println("wednesday");
            case 4 -> System.out.println("thursday");
            case 5 -> System.out.println("friday");
            case 6 -> System.out.println("saturday");
            case 7 -> System.out.println("sunday");
            default -> System.out.println("no matching");
        }
    }
}
