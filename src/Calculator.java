public class Calculator {

    // 1 Метод для выбора наименьшего из чисел a и b
    public static int min(int a, int b) {
        return Math.min(a, b);
    }

    // 2 Метод который возвращяет сумму копий числа
    public static double copyNum(int copy, double num) {
        return num * copy;
    }

    // 3 Метод который переводит килограммы в центнеры
    public static double kgTohundredweight(double kg) {
        return kg / 100;
    }

    // 4 Метод расчёта длинны окружности
    public static double lenghtCircle(double radius) {
        return Math.PI * (2 * radius);
    }

    // 5 Метод расчёта площади треугольника по трём сторонам
    public static double calculationAreaTriangle(double oneSide, double twoSide, double threeSide) {

        // Формула полупериметра: (a+b+c)/2
        // Формула герона: S= √ (p * (p - a)* (p - b)* (p - c))

        // Применяем формулу полупериметра
        double halfMeter = (oneSide + twoSide + threeSide) / 2;
        // Применяем формулу герона и возвращаем результат
        return Math.sqrt(halfMeter * (halfMeter - oneSide) * (halfMeter - twoSide) * (halfMeter - threeSide));

    }

    // 6 Метод возвращение числа по модулю
    public static double abs(double num) {
        return Math.abs(num);
    }


}
