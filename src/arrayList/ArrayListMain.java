package arrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMain {
    static void main(String[] args) {
        // List 타입의 컬렉션을 생성
        // List 안에 담을 내용은 String 타입의 문자열
        // <> : 제네릭(Generic) 이라고 한다
        // 컬렉션에 담을 수 있는 것은 모두 객체여야한다.
        List<String> colors = new ArrayList<>();
        colors.add("black");
        colors.add("white");
        colors.add("pink");
        colors.add("brown"); // 중복을 허용한다.
        // 크기 출력
        System.out.println("colors 리스트의 크기 : " + colors.size() + " / " + colors);
        // 색인으로 접근
        System.out.println("0번 인덱스의 내용 : "+ colors.get(0));
        // for 루프로 출력하기
        for (int i = 0; i < colors.size(); i++) {
            System.out.println("순서 : " +(i+1) + " , 값 : "+ colors.get(i));
        }

        // 삭제
        // pink 를 삭제, 없으면 없음
        // 한방에 삭제하기
        colors.remove("pink");
        System.out.println("=====================");
        for (int i = 0; i < colors.size(); i++) {
            System.out.println("순서 : " +(i+1) + " , 값 : "+ colors.get(i));
        }
        System.out.println("=====================");

        int findIndex = colors.indexOf("black");
        System.out.println("index = "+findIndex);

        if (findIndex == -1) {
            System.out.println("없어요");
        } else {
            // 해당 인덱스 삭제
            colors.remove(findIndex);
        }
        // black이 있는지 여부 확인
        // 함수 위에서 ctrl + alt + v 를 누르면
        // 리턴타입을 자동으로 확인해서 만들어준다.
        boolean isExist = colors.contains("black");
        if (isExist) {
            System.out.println("있음");
        } else {
            System.out.println("없음");
        }

        System.out.println("=====================");
        colors.set(0, "yellow");
        // for -each로 출력
        for (String color : colors) {
            System.out.println(color);
        }
    }
}
