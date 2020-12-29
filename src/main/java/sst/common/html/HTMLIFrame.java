package sst.common.html;

public class HTMLIFrame extends AbstractHTMLElement {

    @Override
    protected String getTagString() {
        return "IFRAME";
    }

    public HTMLIFrame src(String src) {
        setAttribute("src", src);
        return this;
    }

    public HTMLIFrame width(int width) {
        setAttribute("width", "" + width + "%");
        return this;
    }

    public HTMLIFrame fullWidth() {
        setAttribute("width", "100%");
        return this;
    }
}
