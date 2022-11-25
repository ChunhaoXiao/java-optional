package com.xiao.optional;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.swing.text.html.Option;
import java.util.Optional;

@SpringBootTest
public class OptionalTutorial {
    @Test
    public void test1() {
        Optional<String> emp = Optional.empty();
        System.out.println(emp.isPresent());
        System.out.println(emp.isEmpty());

    }

    @Test
     //of
    public void test2() {
        Optional<String> data = Optional.of("hello");
        System.out.println(data.isEmpty());
        System.out.println(data.isPresent());
        System.out.println(data.get());
    }

    @Test  //ofNullable
    public void test3() {
       // int n = null;
        Optional<Integer> num = Optional.ofNullable(null);
        System.out.println(num.isPresent());
        System.out.println(num.isEmpty());

    }
    @Test  //ifPresent
    public void test4() {
        String v = "abc";
        Optional<String> op = Optional.ofNullable(v);
        op.ifPresent(s -> System.out.println(s));
    }

    @Test  //orElse
    public void test5() {
        String name = "laoang";
        String op = Optional.ofNullable(name).orElse("zhansan");
        System.out.println(op);
    }
    @Test //orElseThrow
    public void test6() {
        String name = null;
        String names = Optional.ofNullable(name).orElseThrow(IllegalArgumentException::new);
    }

    @Test
    public void test7() throws Exception {
        String name = null;
        String a = Optional.ofNullable(name).orElse("");
    }

    @Test  //filter
    public void test8() {
        Optional<String> name = Optional.of("zhangsan");
        Boolean ex = name.filter(item -> item.equals("zhangsan")).isPresent();
        System.out.println(ex);
    }

    @Test  //map
    public  void  test9() {
        Optional<String> op = Optional.of("abcd");
        int length = op.map(String::length).orElse(0);
        System.out.println(length);
    }
}
