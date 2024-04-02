package Strings.Mutable;

public class MutableStrings {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer();
        System.out.println(str.capacity());
        str.append("GauravGauravGaurav");
        System.out.println(str.capacity());
        
        StringBuilder str1 = new StringBuilder("Gaurav");
        System.out.println(str1.capacity());
        str1.append("GauravGauravGauravGaurav");
        System.out.println(str1.capacity());
    }
    
}
