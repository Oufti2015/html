package sst.common.html.table;

import sst.common.html.AbstractHTMLElement;

public class HTMLTableCell extends AbstractHTMLElement {

    public HTMLTableCell() {
	super();
    }

    @Override
    protected String getTagString() {
	return "TD";
    }

    public HTMLTableCell colspan(int cs) {
	setAttribute("colspan", "" + cs);
	return this;
    }

    public HTMLTableCell rowspan(int cs) {
	setAttribute("rowspan", "" + cs);
	return this;
    }

    public HTMLTableCell width(int width) {
	setAttribute("width", "" + width + "%");
	return this;
    }

    public HTMLTableCell fullWidth() {
	setAttribute("width", "100%");
	return this;
    }
}
