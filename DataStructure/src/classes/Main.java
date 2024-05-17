package classes;

public class Main {
    public static void main(String[] args) {
        Cookie cookieOne = new Cookie("blue");
        System.out.println(cookieOne.getColor());
        cookieOne.setColor("Purple");
        System.out.println(cookieOne.getColor());

    }
}