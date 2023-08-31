package sst.common.html.table;

public class HTMLTableFooterRow extends HTMLTableRow {

    public HTMLTableFooterRow() {
        super();
    }

    @Override
    protected String getTagString() {
        return "TFOOT";
    }
}
