// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        int n= 456;
        int res = 0;
        while(n>9){
            while(n !=0){
                int rem = n%10;
                res = res + rem;
                n = n/10;
            }
            n = res;
        }
        System.out.print(res);
        
        
    }
}
