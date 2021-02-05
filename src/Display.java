public abstract class Display {
    // 横の文字数を取得する
    public abstract int getColumns();

    // 縦の行数を取得する
    public abstract int getRows();

    // row番目の文字列を取得する
    public abstract String getRowText(int row);

    // 全ての文字列を表示する
    public final void show() {
        for (int i = 0; i < getRows(); i++) {
            System.out.println(getRowText(i));
        }
    }
}
