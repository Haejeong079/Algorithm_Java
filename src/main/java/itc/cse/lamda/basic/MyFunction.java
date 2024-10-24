package itc.cse.lamda.basic;

@FunctionalInterface    //추상 메서드가 1개인 인터페이스
public interface MyFunction {

    //1. 상수
    //2. 추상 메소드
    //3. default
    int A = 3;
    int max (int a, int b); //추상 메소드

    public default void test(){
        System.out.println("?");
    }
}
