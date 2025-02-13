public class Prog5_VarArgs {
    static int sum(int a, int b, int ...arr){
        // arguments a and b will be mandatory
        int res = a + b;
        for (int j : arr) {
            res += j;
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println("The sum of 2,3,4,5 is: " + sum(2,3,4,5));
    }
}
