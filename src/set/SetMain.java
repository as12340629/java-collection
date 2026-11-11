package set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetMain {
    static void main(String[] args) {
        // set 은 무조건 HashSet/map 은 HashMap/List는 ArrayList
        // set 은 중복을 허용하지 않는 자료구조이다
        // set 은 순서를 보장하지 않는다
        Set<String> fruits = new HashSet<>(Arrays.asList(
                "apple","banana"
        ));
        fruits.add("grape");
        fruits.add("mango");
        fruits.add("banana");
        System.out.println("과일 바구니 사이즈 : " + fruits.size());
        System.out.println("===============");
        for (String f : fruits) {
            System.out.println(f);
        }
    }
}
