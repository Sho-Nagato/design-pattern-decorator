public class StringDisplay extends Display {
    // 表示文字列
    private String str;

    public StringDisplay(String str) {
        // 引数で表示文字列を指定
        this.str = str;
    }

    @Override
    public int getColumns() {
        // 文字数
        return str.getBytes().length;
    }

    @Override
    public int getRows() {
        // 行数は1行
        return 1;
    }

    @Override
    public String getRowText(int row) {
        if (row == 0) {
            return str;
        } else {
            return null;
        }
    }
}
