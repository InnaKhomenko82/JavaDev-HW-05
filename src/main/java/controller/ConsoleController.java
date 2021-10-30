package controller;

import service.command.CommandHandler;

import java.util.Scanner;

public class ConsoleController {
    private static final Scanner scanner = new Scanner(System.in);

    public static void mainMenu() {
        System.out.println("Hello, friend!");
        while (true) {
            System.out.println("Choose your command, 'help' or 'exit':");
            CommandHandler.of().handle(read());
        }
    }

    public static String[] read(){
        String command = scanner.next();
        return command.split("\\|");
    }

    public static String[] readList(){
        String users = scanner.next();
        return users.split(";");
    }
}
