package sst.common.html.head;

import sst.common.html.AbstractHTMLElement;

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
