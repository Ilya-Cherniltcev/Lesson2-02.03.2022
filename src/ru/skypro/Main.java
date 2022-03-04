package ru.skypro;

public class Main {

    public static void main(String[] args) {
// Задача 1
       byte aByte = 50; //объявление целочисленной переменной типа byte
       short bShort = -32_768; //объявление целочисленной переменной типа short
       int cInt = 2_768_567; //объявление целочисленной переменной типа int
       long dLong = -760_580_000_450L; //объявление целочисленной переменной типа long
       float eFloat = 0.569f; //объявление переменной с плавающей запятой типа float
       double fDouble = 7.7889876; //объявление переменной с плавающей запятой типа double
// Задача 2
        float boxer1Weight = 78.2f; // Вес первого боксера в кг
        float boxer2Weight = 82.7f; // Вес второго боксера в кг
        System.out.println ("Общий вес обоих боксеров " + (boxer1Weight+boxer2Weight) + " кг");
        float differenceWeight = boxer1Weight - boxer2Weight;
        System.out.println("Разница в весе боксеров " + Math.abs(differenceWeight) + " кг");
// Задача 3
        int bananas = 5 * 80; // общая масса бананов в граммах
        int milk = 105 * 2;  // общая масса молока в граммах
        int icecream = 2 * 100;  // общая масса мороженного в граммах
        int eggs = 4 * 70;  // общая масса яиц в граммах
        int mix = bananas + milk + icecream + eggs;  // мешаем (масса в граммах)
        float mixKG = mix / (float)1000;  // мешаем (масса в граммах)
        System.out.println("Масса завтрака " + mix + " г");
        System.out.println("или " + mixKG + " кг");
// Задача 4
        int minDose = 250; // минимальное похудение на 250 г в день
        int maxDose = 500; // минимальное похудение на 500 г в день
        int loseWeight = 7; // нужно похудеть на 7 кг
        int daysMinDose = loseWeight * 1000 / minDose; // число дней для похудения 1 вар
        int daysMaxDose = loseWeight * 1000 / maxDose; // число дней для похудения 1 вар
        int middleDays = (daysMinDose + daysMaxDose) / 2; // число дней для похудения в среднем
        System.out.println("Число дней на похудание 1 вар - " + daysMinDose);
        System.out.println("Число дней на похудание 2 вар - " + daysMaxDose);
        System.out.println("Число дней на похудание в среднем - " + middleDays);
// Задача 5
        int MashaIncome = 67_760; //зарплата Маши
        int DenisIncome = 83_690; //зарплата Дениса
        int KristinaIncome = 76_230; //зарплата Кристины
        float newMashaIncome = MashaIncome * 1.1f; //новая зарплата Маши
        float newDenisIncome = DenisIncome * 1.1f; //новая зарплата Дениса
        float newKristinaIncome = KristinaIncome * 1.1f; //новая зарплата Кристины
        System.out.println("Маша теперь получает " + (int)newMashaIncome + " рублей. Ее доход вырос на " + (int)(newMashaIncome - MashaIncome) + " рублей.");
        System.out.println("Денис теперь получает " + (int)newDenisIncome + " рублей. Его доход вырос на " + (int)(newDenisIncome - DenisIncome) + " рублей.");
        System.out.println("Кристина теперь получает " + (int)newKristinaIncome + " рублей. Ее доход вырос на " + (int)(newKristinaIncome - KristinaIncome) + " рублей.");
// ==============================================
// ==============================================
// Задача 6
        int a = 12, b = 27, c = 44, d = 15, e = 9;
        int result = a * (b + (c - d * e));
        result = -result;
        System.out.println("Результат задачи 6: " + result);
// Задача 7
        a = 5; b = 7; // тип переменных а и b был определен в задаче 6
        b = b - a;
        a = a + b;
        b = a - b;
        System.out.println("a= " + a + "; b= " + b);
// Задача 8
     a = 571;  // тип переменных а и b был определен в задаче 6
     b = a % 100;
     b = b / 10;
     System.out.println("a= " + a + "; b= " + b);


    }
}
