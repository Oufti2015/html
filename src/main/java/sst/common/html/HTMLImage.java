package sst.common.html;

public class HTMLImage extends AbstractHTMLElement {

    @Override
    protected String getTagString() {
	return "IMG";
    }

    public HTMLImage src(String path) {
	setAttribute("src", path);
	return this;
    }

    public HTMLImage width(int width) {
	setAttribute("width", "" + width);
	return this;
    }

    public HTMLImage height(int height) {
	setAttribute("height", "" + height);
	return this;
    }
}
