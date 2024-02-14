

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World");
//        printItems(10);
//        printItems2(10);

    }


    //this is 0(n) time complexity
    public static void printItems(int n){
        for(int i = 0; i < n; i++){
            System.out.println(i);
        }
        //this is 0(2n) time complexity
        //first rule of big O notation is to drop the constants, and it becomes 0(n)
        //second rule of big O notation is to drop the less significant terms which is n in this case
        for (int j = 0; j < n; j++){
            System.out.println(j);
        }
    }

    //this is 0(n^2) time complexity
    //this run n * n * n times
    //we simplify it to 0(n^2)
    public static void printItems2(int n){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                for (int k = 0; k < n; k++){
                    System.out.println(i + " " + j + " " + k);
                }
//                System.out.println(i + " " + j);
            }
        }
    }

    // drop  non-dominant terms
    // 0(n^2 + n) becomes 0(n^2)
    // n^2 is the dominant term
    //n is the non-dominant term
    // 0(n^2 + n) becomes 0(n^2)
    public static void printItems3(int n){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.println(i + " " + j);
            }
        }

        for (int k = 0; k < n; k++){
            System.out.println(k);
        }
    }

    //0(1) constant time complexity
    public static void addItem(int n){
        System.out.println(n + n + n);
    }

    //

}
