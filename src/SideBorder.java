public class SideBorder extends Border {
    // 飾りとなる文字
    private char borderChar;

    public SideBorder(Display display, char ch) {
        // コンストラクタでDisplayと飾り文字を指定
        super(display);
        this.borderChar = ch;
    }

    @Override
    public int getColumns() {
        // 文字数は中身の両側に飾り文字を加えたもの
        return 1 + display.getColumns() + 1;
    }

    @Override
    public int getRows() {
        // 行数は中身の行数と同じ
        return display.getRows();
    }

    @Override
    public String getRowText(int row) {
        // 指定行の内容は中身の指定行の両側に飾り文字をつけたもの
        return borderChar + display.getRowText(row) + borderChar;
    }


}
