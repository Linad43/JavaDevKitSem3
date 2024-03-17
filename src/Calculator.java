import java.util.Arrays;

public class Calculator {
    public static void main(String[] args) {
        System.out.println(sum((int) 10, (double) 15));
        System.out.println(subtract((int) 10, (double) 15));
        System.out.println(multiply((int) 10, (double) 15));
        System.out.println(divide((int) 10, (double) 15));
        System.out.println(compareArrays(new Object[]{13, "qwerty", 34.15},new Object[]{13, "qwerty", 34.15}));
        System.out.println(new Pair<String, Double>("pair", 43.125));
    }

    public static <T1 extends Number, T2 extends Number> Double sum(T1 t1, T2 t2) {
        return Double.parseDouble(String.valueOf((t1))) + Double.parseDouble(String.valueOf(t2));
    }

    public static <T1 extends Number, T2 extends Number> Double subtract(T1 t1, T2 t2) {
        return Double.parseDouble(String.valueOf((t1))) - Double.parseDouble(String.valueOf(t2));
    }

    public static <T1 extends Number, T2 extends Number> Double multiply(T1 t1, T2 t2) {
        return Double.parseDouble(String.valueOf((t1))) * Double.parseDouble(String.valueOf(t2));
    }

    public static <T1 extends Number, T2 extends Number> Double divide(T1 t1, T2 t2) {
        return Double.parseDouble(String.valueOf((t1))) / Double.parseDouble(String.valueOf(t2));
    }

    public static <T1, T2> boolean compareArrays(T1 t1[], T2 t2[]) {
        if (t1.length != t2.length)
            return false;
        for (int i = 0; i < t1.length; i++) {
            if (!t1.getClass().getName().equals(t2.getClass().getName()))
                return false;
            if (t1[i].equals(t2[i])) {
                continue;
            } else {
                return false;
            }
        }
        return true;
    }
}
