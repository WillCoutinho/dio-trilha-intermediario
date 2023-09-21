package application;

import entity.SingletonEager;
import entity.SingletonLazy;
import entity.SingletonLazyHolder;

public class App {
    public static void main(String[] args) {
        SingletonLazy lazy1 = SingletonLazy.getInstancia();
        System.out.println(lazy1);

        SingletonLazy lazy2 = SingletonLazy.getInstancia();
        System.out.println(lazy2);
        System.out.println(lazy1 == lazy2);

        SingletonEager eager1 = SingletonEager.getInstancia();
        SingletonEager eager2 = SingletonEager.getInstancia();
        System.out.println(eager1);
        System.out.println(eager2);
        System.out.println(eager1 == eager2);

        SingletonLazyHolder lazyHolder1 = SingletonLazyHolder.getInstancia();
        SingletonLazyHolder lazyHolder2 = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder1);
        System.out.println(lazyHolder2);
        System.out.println(lazyHolder1 == lazyHolder2);

    }
}
