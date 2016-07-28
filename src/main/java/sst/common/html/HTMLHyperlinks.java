package sst.common.html;

public class HTMLHyperlinks extends AbstractHTMLElement {
    @Override
    protected String getTagString() {
	return "A";
    }

    public HTMLHyperlinks href(String href) {
	setAttribute("href", href);
	return this;
    }

    public AbstractHTMLElement id(String id) {
	setAttribute("id", id);
	return this;
    }

    public AbstractHTMLElement target(String target) {
	setAttribute("target", target);
	return this;
    }
}
