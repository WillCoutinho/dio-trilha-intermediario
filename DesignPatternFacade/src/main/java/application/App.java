package application;

import entity.Facade;

public class App {

    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.migrarCliente("Coutinho", "123456");
    }
}
