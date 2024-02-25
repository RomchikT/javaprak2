package org.example;

import java.util.Scanner;

class MyClass {
    private String name;
    private int age;
    private double zp;

    public MyClass() {
    }

    public MyClass(String name, int age, double zp) {
        this.name = name;
        this.age = age;
        this.zp = zp;
    }

    public MyClass(String name, int age) {
        this.name = name;
        this.age = age;
        this.zp = 0.0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getZp() {
        return zp;
    }

    public void setZp(double zp) {
        this.zp = zp;
    }

    public static void main(String[] args) {
        MyClass[] massiv = new MyClass[10];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.println("Введите имя для записи " + (i + 1) + ": ");
            String name = scanner.nextLine();
            System.out.println("Введите возраст для записи " + (i + 1) + ": ");
            int age = scanner.nextInt();
            System.out.println("Введите зарплату для записи " + (i + 1) + ": ");
            double zp = scanner.nextDouble();
            scanner.nextLine();

            massiv[i] = new MyClass(name, age, zp);
        }

        scanner.close();
    }
}