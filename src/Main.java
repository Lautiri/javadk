public class Main {
    public static void main(String[] args){
        int a = 5;
        int b = 14;

        while (a <= b){

            if ((a % 2)== 0 ) {
                System.out.println(a+"es par");
            }
            else{
                System.out.println(a+"es impar");
            }
            a = a +1;
        }

    }
}