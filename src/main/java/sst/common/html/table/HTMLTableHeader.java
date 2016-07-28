package sst.common.html.table;

public class HTMLTableHeader extends HTMLTableCell {

    public HTMLTableHeader() {
	super();
    }

    @Override
    protected String getTagString() {
	return "TH";
    }
}
