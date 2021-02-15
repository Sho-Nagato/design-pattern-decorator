public class Main {
    public static void main(String[] args) {

        // 「Hello World.」を飾りなしで表示
        Display b1 = new StringDisplay("Hello World.");
        b1.show();

        // 「Hello World.」に対して、「#」の文字で左右に飾り付けをしたもの
        Display b2 = new SideBorder(b1, '#');
        b2.show();

        // 「Hello World.」に対して、全体の飾り枠を付けたもの
        Display b3 = new FullBorder(b2);
        b3.show();
    }
}
