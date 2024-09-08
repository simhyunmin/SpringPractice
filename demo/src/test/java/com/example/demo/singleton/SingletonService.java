package com.example.demo.singleton;

public class SingletonService {
    private static final SingletonService instance = new SingletonService();
    //내부적으로 자기자신을 생성해서 instance에 참조로 넣어 놓는다.

    public static SingletonService getInstance(){
        return instance;
    }
    //인스턴스의 참조를 꺼낼 수 있는 방법은 getInstance 함수밖에 없다.
    private SingletonService(){

    }

    //private 생성자를 쓰면 외부에서 선언할 수 없게 막는다.
    public void logic(){
        System.out.println("싱글톤 객체 로직 호출");
    }
}
