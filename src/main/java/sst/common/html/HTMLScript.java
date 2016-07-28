package sst.common.html;


public class HTMLScript extends AbstractHTMLElement {

    @Override
    protected String getTagString() {
	return "SCRIPT";
    }

    public HTMLScript type(String type) {
	setAttribute("type", type);
	return this;
    }

    public HTMLScript src(String src) {
	setAttribute("src", src);
	return this;
    }
}
