package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//  1).Дан массив записей: наименование товара, цена, сорт. Найти наибольшую цену товаров 1го или 2го сорта
//  среди товаров, название которых содержит «высший».
//
//                double max_c = 0;
//                System.out.println("Введите число элементов массива (товаров), которые необходимо ввести");
//                //Примеры ввода: высшийсортмяса 500 2
//               // конфеты 800  1
//               // высший сорт муки 100 2
//                Scanner in_2_1 = new Scanner(System.in);
//                int n_2_1 = in_2_1.nextInt();
//                String[] massiv2_1 = new String[n_2_1];
//                for (int i = 0 ; i < massiv2_1.length; i++){
//                    System.out.println("Введите значения строки: наименование товара(без пробела), цена, сорт (1 или 2) через пробел, без запятых: ");
//                    Scanner in_2_2 = new Scanner(System.in);
//                    String tovar = in_2_2.nextLine(); // считать строку с клавиатуры
//                    String tovar_m[] = tovar.split(" ");
//                    int sort_t = Integer.parseInt(tovar_m[2]);
//                    double cost_t = Double.parseDouble(tovar_m[1]);
//                    if (((sort_t == 1) || (sort_t == 2)) & (tovar_m[0].contains("высший") == true) & (cost_t>max_c)){
//                        max_c = cost_t;
//                    }
//                }
//                System.out.println("Максимальная стоимость при учёте указанных критериев: " + max_c);
// 2. Сведения о товаре состоят из наименования, страны-производителя, веса, цены, сорта.
//    Получить наименования товаров заданного сорта с наименьшей ценой.
//                double min_c = 1000000;
//                String itog_name = "";
//                ArrayList<Product> m_prod = new ArrayList<>();
//
//                Product product = new Product("Творог", "Россия", 2, 1000, 1);
//                Product product1 = new Product("Молоко", "Швеция", 6, 5000, 1);
//                Product product2 = new Product("Кефир", "Австрия", 8, 6500, 2);
//                Product product3 = new Product("Запеканка", "Германия", 1, 950, 2);
//                Product product4 = new Product("Банан", "Индонезия", 11, 1340, 2);
//
//                m_prod.add(product); // добавляет
//                m_prod.add(product1);
//                m_prod.add(product2);
//                m_prod.add(product3);
//                m_prod.add(product4);
//
//                System.out.println("Введите сорт товара, наименования которого необходимо получить: ");
//                Scanner in_2_2 = new Scanner(System.in);
//                int n_2_2 = in_2_2.nextInt();
//
//                for (Product i: m_prod){
//                    if ((i.getCost() < min_c) & (i.getSort() == n_2_2)){
//                        min_c = i.getCost();
//                        itog_name = i.getName();
//                    }
//                }
//                System.out.println(itog_name);
// 3. Сведения о книге состоят из названия, фамилии автора, цены, года издания и количества страниц.
// Найти названия книг, в которых простое количество страниц, фамилия автора содержит «А» и год издания не позднее 2010 г.

        // создаём 5 книг
        Book book1 = new Book("Колобок", "Смирнов", 300, 1988, 30);
        Book book2 = new Book("Русалочка", "Крупина", 500, 2008, 33);
        Book book3 = new Book("Обрыв", "Гончаров", 1200, 2009, 17);
        Book book4 = new Book("Огоньки", "Власова", 200, 2000, 3);
        Book book5 = new Book("Путешествие", "Аксёнова", 700, 2021, 67);

        // создаю ArrayList для хранения книг, которые создала
        ArrayList<Book> book_m = new ArrayList<>();
        //Добавляю первую книгу в ArrayList
        book_m.add(book1);
        //Добавляю вторую книгу в ArrayList и так далее
        book_m.add(book2);
        book_m.add(book3);
        book_m.add(book4);
        book_m.add(book5);
        int temp_2_3 = 0;
        // прохожу циклом for по элементам массива
        for (Book i : book_m) {
            int f = 1; // флаг. число простое
            // проверка на простоту при помощи цикла
            for (int j = 2; j <= Math.abs(i.getCount_str() / 2); j++) {
                temp_2_3 = i.getCount_str() % j;
                if (temp_2_3 == 0) {
                    f = 0;
                    break;
                }
            }
            // если число простое (флаг остался равен 1, то проверяю следующие условия
            if (f == 1) {
                // год не позднее, чем 2010 и фамилия содержит букву А и а (как заглавную так и строчку)
                if ((i.getYear() <= 2010) & ((i.getSecond_name().contains("А") || (i.getSecond_name().contains("а"))))) {
                    // вывожу название книги
                    System.out.println(i.getName());
                }
            }
        }
    }
}