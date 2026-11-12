package lambda;

// 함수형 인터페이스
// 자바스크립트 : 화살표 함수 , 자바 : 람다 표현식
@FunctionalInterface
public interface Calc {
    int calc(int x, int y);

}
