package sst.common.html.table.builders;

import sst.common.html.table.HTMLTable;
import sst.common.html.table.HTMLTableHeader;
import sst.common.html.table.HTMLTableRow;

import java.util.List;

public class TableBuilder {
    private final String[] headers;
    private int width = 100;

    public TableBuilder(String[] headers) {
        super();
        this.headers = headers;
    }

    public HTMLTable build(List<IntoTableConverter> list) {
        HTMLTable table = new HTMLTable().width(width);
        if (null != headers) {
            HTMLTableRow header = new HTMLTableRow();
            for (String s : headers) {
                header.addChild(new HTMLTableHeader().textContent(s));
            }
            table.addChild(header);
        }

        list.forEach(itc -> table.addChild(createRow(itc)));
        return table;
    }

    private HTMLTableRow createRow(IntoTableConverter element) {
        HTMLTableRow row = new HTMLTableRow();
        CellInfo[] elements = element.convert();
        for (CellInfo cellInfo : elements) {
            row.addChild(cellInfo.toTableCell());
        }
        return row;
    }

    public TableBuilder width(int width) {
        this.width = width;
        return this;
    }
}
