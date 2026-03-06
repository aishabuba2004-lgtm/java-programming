class Printer {

    void print(String text) {
        System.out.println("String: " + text);
    }
    void print(int number) {
        System.out.println("Integer: " + number);
    }
    void print(double number) {
        System.out.println("Double: " + number);
    }
    public static void main(String[]args) {
        Printer p = new Printer();
        p.print("Hello Java");
        p.print(30);
        p.print(5.75);
    }
}