package ex69;

public class Main {
    public static void main(String[] args) {

        SimpleDictionary book = new SimpleDictionary();

        book.add("one", "yksi");
        book.add("two", "kaksi");

        System.out.println(book.translate("one"));
        System.out.println(book.translate("two"));
        System.out.println(book.translate("three"));





    }
}
