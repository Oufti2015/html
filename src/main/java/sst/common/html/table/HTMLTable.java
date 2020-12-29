package sst.common.html.table;

import sst.common.html.AbstractHTMLElement;
import sst.common.html.HTMLCaption;

public class HTMLTable extends AbstractHTMLElement {
    HTMLTableRow row = null;

    public HTMLTable() {
        super();
    }

    public HTMLTable caption(String caption) {
        addChild(new HTMLCaption(caption));
        return this;
    }

    public HTMLTableRow row() {
        if (null == row) {
            return newRow();
        }
        return row;
    }

    public HTMLTableRow newRow() {
        row = new HTMLTableRow();
        addChild(row);
        return row;
    }

    public HTMLTable width(int width) {
        setAttribute("width", "" + width + "%");
        return this;
    }

    public HTMLTable fullWidth() {
        setAttribute("width", "100%");
        return this;
    }

    @Override
    protected String getTagString() {
        return "TABLE";
    }

    public HTMLTable border(int border) {
        setAttribute("border", "" + border);
        return this;
    }
}
