package sst.common.html;

public class HTMLHeader extends AbstractHTMLElement {

    private int range = 1;

    public HTMLHeader(int range) {
	super();
	this.range = range;
    }

    @Override
    protected String getTagString() {
	return "H" + range;
    }
}
