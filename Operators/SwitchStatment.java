package Operators;

public class SwitchStatment {
    public static String getDay(int x) {
        String res = "";
        switch (x) {
            case 1:
                res = "Monday";
                break;
            case 2:
                res = "Tuesday";
                break;
            case 3:
                res = "Wednesday";
                break;
            case 4:
                res = "Thursday";
                break;
            case 5:
                res = "Friday";
                break;
            case 6:
                res = "Saturday";
                break;
            case 7:
                res = "Sunday";
                break;
            default:
                break;
        }
        return res;
    }

    public static void main(String[] args) {
        int n = 7;
        System.out.println(getDay(n));
    }

}
