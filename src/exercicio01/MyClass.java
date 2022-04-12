package exercicio01;

class MyClass {
    String a;
    int b;
    boolean c;

    MyClass(String a, int b, boolean c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    void printData() {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

    void changeB() {
        if (c) {
            b += 10;
        } else {
            b -= 10;
        }
    }

}