package org.example;
import java.io.*;
import java.text.*;
import java.util.*;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\nВыберите задание : ");
            System.out.println("1 - Задание 1");
            System.out.println("2 - Задание 2");
            System.out.println("3 - Задание 3");
            System.out.println("0 - Выход");
            choice = in.nextInt();
            switch (choice) {
                case 1:
                    File file1 = new File("C://Example", "BIO.txt");
                    System.out.println("Имя файла : " + file1.getName());
                    System.out.println("Размер файла: " + file1.length() + " Байт");
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                    long lastModif = file1.lastModified();
                    Date lastModifiedDate = new Date(lastModif);
                    String formattedDate = sdf.format(lastModifiedDate);
                    System.out.println("Время последнего обновления: " + formattedDate);
                    System.out.println("Имя родительского каталога: " + file1.getParent());
                    System.out.println("Путь файла: " + file1.getPath());
                    System.out.println("Абсолютный путь файла: " + file1.getAbsolutePath());
                    System.out.println("Файл " + file1.getName() + (file1.exists() ? " Существует" : " Не существует"));
                    System.out.println(file1.getName() + (file1.canRead() ? " Прочитан" : " Не прочитан"));
                    System.out.println(file1.getName() + (file1.canWrite() ? " Доступен для записи" : " Не доступен для записи"));
                    System.out.println(file1.getName() + (file1.isDirectory() ? "" : " Не ") + " каталог");
                    System.out.println(file1.getName() + (file1.isAbsolute() ? "" : " Не ") + "  обычный файл");
                    System.out.println("По этому пути " + (file1.isFile() ? "" : " не ") + "лежит файл");
                    String filePath = "C://Example//BIO.txt";

                    try (FileInputStream fis = new FileInputStream(filePath);
                         InputStreamReader reader = new InputStreamReader(fis, StandardCharsets.UTF_8);
                         BufferedReader br = new BufferedReader(reader)) {

                        int i;
                        while ((i = reader.read()) != -1) {
                            System.out.print((char) i);
                        }

                    } catch (IOException e) {
                        System.out.println("Ошибка: " + e.getMessage());
                    }

                    break;
                case 2:
                    String filename = "C://Example//task2.txt";
                    try (PrintWriter writer = new PrintWriter(new FileWriter(filename))) {
                        System.out.println("Введите 15 значений температуры воздуха (через Enter):");

                        for (int i = 1; i <= 15; i++) {
                            System.out.print("Температура " + i + ": ");
                            double temp = in.nextDouble();
                            writer.println(temp);
                        }
                        System.out.println("Данные успешно записаны в файл " + filename);
                    } catch (IOException e) {
                        System.err.println("Ошибка при записи в файл: " + e.getMessage());
                        return;
                    }

                    double sum = 0;
                    int count = 0;
                    try(BufferedReader reader = new BufferedReader(new FileReader(filename))){
                        String line;
                        while ((line = reader.readLine()) != null) {
                            try {
                                double temp = Double.parseDouble(line.trim());
                                sum += temp;
                                count++;
                            } catch (NumberFormatException e) {
                                System.err.println("Пропущена некорректная строка: " + line);
                            }
                        }
                    } catch (IOException e) {
                        System.err.println("Ошибка при чтении файла: " + e.getMessage());
                        return;
                    }
                    if (count > 0) {
                        double average = sum / count;
                        System.out.printf("Средняя температура: %.2f°C%n", average);
                    } else {
                        System.out.println("В файле не найдено корректных данных.");
                    }
                    break;
                case 3:
                    String fileWithNames = "C://Example//names.txt";
                    System.out.println("Сколько имён вы хотите ввести?");
                    int n = in.nextInt();
                    in.nextLine();

                    try {
                        FileWriter writer = new FileWriter(fileWithNames);
                        System.out.println("Введите " + n + " имён:");

                        for (int i = 0; i < n; i++) {
                            System.out.print("Имя " + (i + 1) + ": ");
                            String name = in.nextLine();
                            writer.write(name + "\n");
                        }
                        writer.close();
                        System.out.println("Имена сохранены в файл!");
                    } catch (IOException e) {
                        System.out.println("Ошибка при записи в файл!");
                        return;
                    }

                    String[] names = new String[n];
                    int counts = 0;

                    try {
                        Scanner fileScanner = new Scanner(new File(fileWithNames));
                        while (fileScanner.hasNextLine()) {
                            String name = fileScanner.nextLine().trim();
                            if (!name.isEmpty()) {
                                names[counts] = name;
                                counts++;
                            }
                        }
                        fileScanner.close();
                    } catch (FileNotFoundException e) {
                        System.out.println("Файл не найден!");
                        return;
                    }

                    boolean hasDuplicate = false;
                    System.out.println("\nПроверка на дубликаты:");

                    for (int i = 0; i < counts; i++) {
                        for (int j = i + 1; j < counts; j++) {
                            if (names[i].equals(names[j])) {
                                System.out.println("Дубликат: " + names[i]);
                                hasDuplicate = true;
                            }
                        }
                    }

                    if (!hasDuplicate) {
                        System.out.println("Дубликатов нет!");
                    }
                    break;
            }
        } while(choice != 0);
    }
}