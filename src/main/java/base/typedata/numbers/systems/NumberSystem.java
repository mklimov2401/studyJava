package base.typedata.numbers.systems;

import java.util.HashMap;
import java.util.Map;

public class NumberSystem {

    public static int decimalToBinary(int n) {
        int[] b = new int[10];
        int i = 0, r = 0;
        while (n != 0) {
            b[i++] = n % 2;
            n /= 2;
        }
        for (int j = b.length - 1; j >= 0; j--) {
            r = r * 10 + b[j];
        }
        return r;
    }

    public static int decimalToOctal(int n) {
        int[] b = new int[10];
        int i = 0, r = 0;
        while (n != 0) {
            b[i++] = n % 8;
            n /= 8;
        }
        for (int j = b.length - 1; j >= 0; j--) {
            r = r * 10 + b[j];
        }
        return r;
    }

    public static String decimalToHexadecimal(int n) {
        String res = "";
        if (n == 0) return "0";
        while (n != 0) {
            int val = n % 16;
            switch (val) {
                case 10:
                    res += "A";
                    break;
                case 11:
                    res += "B";
                    break;
                case 12:
                    res += "C";
                    break;
                case 13:
                    res += "D";
                    break;
                case 14:
                    res += "E";
                    break;
                case 15:
                    res += "F";
                    break;
                default:
                    res += val;
            }
            n /= 16;
        }
        return new StringBuilder(res).reverse().toString();
    }

    public static int binaryToDecimal(int n) {
        int r = 0, i = 0;
        while (n != 0) {
            r += n % 10 * (int) Math.pow(2, i);
            n /= 10;
            i++;
        }
        return r;
    }

    public static int octalToDecimal(int n) {
        int r = 0, i = 0;
        while (n != 0) {
            r += n % 10 * (int) Math.pow(8, i);
            n /= 10;
            i++;
        }
        return r;
    }

    public static String hexadecimalToDecimal(String n) {
        int i, res = 0, k = 0;
        char[] chars = n.toCharArray();
        for (int j = chars.length - 1; j >= 0; j--) {
            switch (chars[j]) {
                case 'A':
                    i = 10;
                    break;
                case 'B':
                    i = 11;
                    break;
                case 'C':
                    i = 12;
                    break;
                case 'D':
                    i = 13;
                    break;
                case 'E':
                    i = 14;
                    break;
                case 'F':
                    i = 15;
                    break;
                default:
                    i = Character.getNumericValue(chars[j]);
            }
            res += i * (int) Math.pow(16, k);
            k++;
        }
        return String.valueOf(res);
    }

    public static String converterNumSys(String value, int fromBase, int toBase) {
        String result = "";
        Map<Integer, String> map = new HashMap<Integer, String>() {{
            put(10, "A");
            put(11, "B");
            put(12, "C");
            put(13, "D");
            put(14, "E");
            put(15, "F");
        }};
        System.out.println(String.format("%s перевести из %d в %d сис.счисления.", value, fromBase, toBase));
        System.out.println("Решение:");
        if ("0".equals(value) || fromBase == toBase) {
            System.out.println(String.format("Ответ: %s -> %s \n", value, value));
            return value;
        }
        if (fromBase == 10) {
            result = toNumSys(value, toBase, result, map);
        } else if (fromBase > 10 || toBase == 10) {
            result = toHex(value, fromBase, map);
        } else {
            result = toNumSys(toHex(value, fromBase, map), toBase, result, map);
        }
        System.out.println(String.format("Ответ: %s -> %s \n", value, result));
        return result;
    }

    private static String toHex(String value, int fromBase, Map<Integer, String> map) {
        String result, output = "";
        char[] chars = value.toCharArray();
        int r = 0;
        for (int i = chars.length - 1, k = 0; i >= 0; i--, k++) {
            Character aChar = chars[i];
            Integer key;
            if (map.containsValue(aChar.toString())) {
                key = getKey(map, aChar.toString());
            } else {
                key = Integer.parseInt(aChar.toString());
            }
            r += key * (int) Math.pow(fromBase, k);
            output += String.format("%d * %d^%d + ", key, fromBase, k);
        }
        result = String.valueOf(r);
        System.out.println(String.format("%s = %s = %s",
                value, output.substring(0, output.length() - 3), result));
        return result;
    }

    private static String toNumSys(String value, int toBase, String result, Map<Integer, String> map) {
        int anInt = Integer.parseInt(value);
        while (anInt != 0) {
            int r = anInt % toBase;
            if (map.containsKey(r)) {
                result += map.get(r);
            } else {
                result += r;
            }
            System.out.println(String
                    .format("%d / %d = %d, остаток: %d", anInt, toBase, anInt / toBase, r));
            anInt /= toBase;
        }
        result = new StringBuilder(result).reverse().toString();
        return result;
    }

    public static Integer getKey(Map<Integer, String> map, String value) {
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            if (entry.getValue().equals(value)) {
                return entry.getKey();
            }
        }
        return null;
    }

}
