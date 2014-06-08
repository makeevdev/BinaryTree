package com.radix;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    private static BinaryTree tree;

    public static void main(String[] args) {
        System.out.println("BinaryTree_0.1\n");
        Scanner sc = new Scanner(System.in);
        tree = new BinaryTree();
        do {
            PrintMenu();
            try {
                int choice = sc.nextInt();
                switch (choice) {
                    case 1: // ввести число и добавить его в
                        ConsoleInput();
                        break;
                    case 2:
                        PrintTree();
                        break;
                    case 3:
                        System.exit(0);
                    default:
                        System.out.println("Некорректный ввод\n");
                }
            } catch (InputMismatchException ex) {
                System.out.println("Некореектный воод. Повторите:\n");
            }
        } while (true); // ho-ho-ho
    }

    private static void PrintMenu() {
        System.out.println("Выберите действие");
        System.out.println("1 - добавить элемент к дереву");
        System.out.println("2 - вывести дерево в консоль");
        System.out.println("3 - выход");
    }

    private static void ConsoleInput() {
        System.out.println("Введите элемент дерева(целое число)");
        try {
            Scanner sc = new Scanner(System.in);
            int key = sc.nextInt(); // EXCEPTIONS!!!!!
            tree.Insert(key, key);
            System.out.println("Число '" + key + "' добавлено в дерево\n" );
        } catch (InputMismatchException ex) {
            System.out.println("Некореектный воод\n");
        }
    }

    private static void PrintTree() {
        tree.PrintTree();
    }

}
