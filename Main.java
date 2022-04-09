package com.company;

import java.util.Scanner;

interface Tovar{
    void NameTovar();
    void PriceTovar();
    void ReitTovar();
}
    interface User{
        void Login();
        void Password();
    }
public class Main {
    static class Tovar1 implements Tovar{
        String name;
        int price;
        int reit;
        Tovar1(String name, int price, int reit){
            this.name = name;
            this.price = price;
            this.reit = reit;
        }
        public void NameTovar(){
            System.out.printf("Название товара: %s \n", name);
        }

        public void PriceTovar(){
            System.out.printf("Цена: %s руб \n", price);
        }
        public void ReitTovar(){
            System.out.printf("Рейтинг товара: %s\n", reit);
        }

    }
    static class Tovar2 implements Tovar{
        String name;
        int price;
        int reit;
        Tovar2(String name, int price, int reit){
            this.name = name;
            this.price = price;
            this.reit = reit;
        }
        public void NameTovar(){
            System.out.printf("Название товара: %s\n", name);
        }

        public void PriceTovar(){
            System.out.printf("Цена: %s руб\n", price);
        }
        public void ReitTovar(){
            System.out.printf("Рейтинг товара: %s\n", reit);
        }
    }
    static class Tovar3 implements Tovar{
        String name;
        int price;
        int reit;
        Tovar3(String name, int price, int reit){
            this.name = name;
            this.price = price;
            this.reit = reit;
        }
        public void NameTovar(){
            System.out.printf("Название товара: %s\n", name);
        }

        public void PriceTovar(){
            System.out.printf("Цена: %s руб\n", price);
        }
        public void ReitTovar(){
            System.out.printf("Рейтинг товара: %s\n", reit);
        }
    }
    static class User1 implements User{
        String login;
        String password;
        User1(String login, String password){
            this.login = login;
            this.password = password;
        }
        public void Login(){
            System.out.printf("Логин: %s\n", login);
        }
        public void Password(){
            System.out.printf("Пароль: %s\n", password);
        }
    }
    static class User2 implements User{
        String login;
        String password;
        User2(String login, String password){
            this.login = login;
            this.password = password;
        }
        public void Login(){
            System.out.printf("Логин: %s\n", login);
        }
        public void Password(){
            System.out.printf("Пароль: %s\n", password);
        }
    }
    static class User3 implements User{
        String login;
        String password;
        User3(String login, String password){
            this.login = login;
            this.password = password;
        }
        public void Login(){
            System.out.printf("Логин: %s\n", login);
        }
        public void Password(){
            System.out.printf("Пароль: %s\n", password);
        }
    }
    static class Purchase implements User, Tovar{
        String login;
        String password;
        String name;
        int price;
        int reit;
        Purchase(String login, String password,String name, int price, int reit){
            this.login = login;
            this.password = password;
            this.name = name;
            this.price = price;
            this.reit = reit;
        }
        public void Login(){
            System.out.printf("Логин пользователя: %s\n", login);
        }
        public void Password() {
            System.out.printf("Пароль пользователя: %s\n", password);
        }
        public void NameTovar(){
            System.out.printf("Название товара: %s\n", name);
        }

        public void PriceTovar(){
            System.out.printf("Цена товара: %s руб\n", price);
        }
        public void ReitTovar(){
            System.out.printf("Рейтинг товара: %s\n", reit);

        }

        public void PrintShop(){
            System.out.printf("Пользователя: %s Купил: %s", login, name);
        }
    }
    public static void main(String[] args) {
        Tovar apple = new Tovar1("яблоки",73, 8);
        Tovar bananas = new Tovar2("бананы", 90,9);
        Tovar mandarins = new Tovar3("мандарины", 95, 7);
        User peron1 = new User1("Gjs7", "345678");
        User peron2 = new User2("jT8cR","98745");
        User peron3 = new User3("Hx0638","86538725");

        Scanner in = new Scanner(System.in);
        System.out.println("Введите логин");
        String log = in.nextLine();
        System.out.println("Введите пароль");
        String pas = in.nextLine();
        System.out.println("Введите товар, который вы хотите купить");
        String tov = in.nextLine();
        Purchase purchase = new Purchase(log,pas,tov,73, 8);
        purchase.PrintShop();
    }
}