package itc.cse.lamda.basic;

public class LambdaEx1 {

    Object obj = new Object() {
        int max(int a, int b) {
            return a > b ? a : b;
        }
    };
    //int result = obj.max(10,20);


}
