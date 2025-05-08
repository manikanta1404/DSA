/* Online Java Compiler and Editor */
public class HelloWorld{

     public static void main(String []args){
        System.out.println("mani");
        
        // for(int i=1;i<=5;i++){
        //     for(int j=1;j<=5;j++){
        //         System.out.printf("*");
        //     }
        //     System.out.println();
        // }
        
        
        // for (int i=1;i<=5;i++){
        //     for(int j=1;j<=5;j++){
        //         if(i==1 || i==5|| j==1 ||j==5 ){
        //             System.out.print("*");
        //         }
        //         else{
        //             System.out.print(" ");
        //         }
                
        //     }
        //     System.out.println();
        // }
        
        // for (int i=1;i<=5;i++){
        //     for(int j=1;j<=5;j++){
        //         if(i==1 || i==5|| j==1 ||j==5 ||i==j){
        //             System.out.print("* ");
        //         }
        //         else{
        //             System.out.print("  ");
        //         }
                
        //     }
        //     System.out.println();
        
        // }
        
        // for (int i=1;i<=5;i++){
        //     for(int j=1;j<=5;j++){
        //         if(i==1 || i==5|| j==1 ||j==5 ||i==j ||i+j==6){
        //             System.out.print("* ");
        //         }
        //         else{
        //             System.out.print("  ");
        //         }
                
        //     }
        //     System.out.println();
        // }
        
        // for (int i=1;i<=5;i++){
        //     for(int j=1;j<=5;j++){
        //         if( i==5||j==1 ||j==5 ||i==j ||i+j==6){
        //             if(i<4){
        //                 System.out.print("* ");
        //             }
        //         }
        //         else{
        //             System.out.print("  ");
        //         }
                
        //     }
        //     System.out.println();
        // }
        
        
        // for (int i=1;i<=5;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print("* ");
        //         }
        //     System.out.println();
        // }
        
        // for(int i=1;i<=5;i++){
        //     for(int j=1;j<=5;j++){
        //         if(j==1||i==j||i==5){
        //             System.out.print("* ");
        //         }
        //         else{
        //             System.out.print("  ");
        //         }
        //     }
        //     System.out.println();
        // }
        
        //  for(int i=1;i<=5;i++){
        //     for(int j=1;j<=5;j++){
        //         if(j==1||i==j||j==5){
        //             System.out.print("* ");
        //         }
        //         else{
        //             System.out.print("  ");
        //         }
        //     }
        //     System.out.println();
        // }
        
        // for(int i=1;i<=5;i++){
        //     for(int j=1;j<=5;j++){
        //         if(j==5||i+j==6||i==5){
        //             System.out.print("* ");
        //         }
        //         else{
        //             System.out.print("  ");
        //         }
        //     }
        //     System.out.println();
        // }


          // Online Java Compiler
// Use this editor to write, compile and run your Java code online
        
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                // for(int s=1;s<=j;s++){
                //     System.out.print(" ");
                // }
                System.out.print(j + " ");
            }
            System.out.println();
        }
        
        // {
        //     output
            
        //     1 
        //     1 2 
        //     1 2 3 
        //     1 2 3 4 
        //     1 2 3 4 5 
        // }
        
        
        
        
        
        for(int i=1;i<=5;i++){
            for(int j=5;j>=i;j--){
                System.out.print(j + " ");
            }
            System.out.println();
        }
        
        // {
        //     output
        //     5 4 3 2 1 
        //     5 4 3 2 
        //     5 4 3 
        //     5 4 
        //     5
        // }
        
        for(int i=1;i<=5;i++){
            for(int s=5;s>=i;s--){
                    System.out.print(" ");
                }
                for(int j=1;j<=2*i-1;j++){
                
                System.out.print(j);
            }
            System.out.println();
        }
        
        // {
        //     output
            
            
        //          1
        //         123
        //       12345
        //       1234567
        //      123456789
        // }
        
        
     }
}



