package lambda;

public class LambdaExpression {
    static void main(String[] args) {
        // 1. 전달하는 값이 두개 이상일 때는 항상 () 안에 넣어야한다
        // 2. 결과를 리턴할때 처리 절차가 여러주일 때는 항상 {} 에 넣어야한다
        // 그리고 , return 구문도 반드시 필요하다
        // 3. 리턴할 문장이 단 한문장이면 return을 생략할수있다
        Calc add = (x, y) -> { return x + y; }; // 이 경우에도 return 이 없어도 된다
        Calc minus =(x,y) -> x-y;
        Calc minus2 =(x,y) -> {
            x = x+ 10;
            y = y+5;
            return x-y;
        };
        System.out.println(add.calc(3,2));
    }
}
