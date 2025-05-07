// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        
        //letter N
         for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                if(j==1||i==j||j==5){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();
        
        // letter I
         for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                if(i==1 ||i==5||j==3){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();
        
        //letter A
        for(int i=1;i<=5;i++){
            for(int s=1;s<=5-i;s++){
                System.out.print("  ");
            }
            for(int j=1;j<=2*i-1;j++){
                if(j==1||j==2*i-1|| i==5/2 +1){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        
    }
}
