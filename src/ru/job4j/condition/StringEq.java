package ru.job4j.condition;

public class StringEq {
    public static boolean check(String login) {
        String root = new String("root");
        boolean access = root.equals(login);
        return access;
    }

    public static void main(String[] args) {
        String your = "your_name";
        boolean userHasAccess = StringEq.check(your);
        System.out.println("login: " + your + ". Has access: " + userHasAccess);

        your = "root";
        userHasAccess = StringEq.check(your);
        System.out.println("login: " + your + ". Has access: " + userHasAccess);
    }
}
