public class Calculator {

    // 1 Метод для выбора наименьшего из чисел a и b
    public static int min(int a, int b) {
        return Math.min(a,b);
    }
    // 2 Метод который возвращяет сумму копий числа
    public static double copyNum(int copy, double num) {
        return num * copy;
    }
    // 3 Метод который переводит килограммы в центнеры
    public static double kgTohundredweight(double kg) {
        return kg / 100;
    }
}
