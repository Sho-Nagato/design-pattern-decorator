public abstract class Border extends Display {
    // この飾り枠がくるんでいる「中身」を指す
    protected Display display;

    // インスタンス生成時に「中身」を引数で指定
    protected Border(Display display) {
        this.display = display;
    }
}
