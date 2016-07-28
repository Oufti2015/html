package sst.common.html;

public class HTMLLink extends AbstractHTMLElement {

    @Override
    protected String getTrailer() {
	return "";
    }

    @Override
    protected String getChildrenContent() {
	return "";
    }

    @Override
    protected String getTagString() {
	return "LINK";
    }

    public HTMLLink rel(String rel) {
	setAttribute("rel", rel);
	return this;
    }

    public HTMLLink type(String type) {
	setAttribute("type", type);
	return this;
    }

    public HTMLLink href(String href) {
	setAttribute("href", href);
	return this;
    }
}
