package sst.common.html.table;

public class HTMLTableHeaderRow extends HTMLTableRow {

    public HTMLTableHeaderRow() {
        super();
    }

    @Override
    protected String getTagString() {
        return "THEAD";
    }
}
