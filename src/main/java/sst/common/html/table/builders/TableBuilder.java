package sst.common.html.table.builders;

import java.util.List;

import sst.common.html.table.HTMLTable;
import sst.common.html.table.HTMLTableHeader;
import sst.common.html.table.HTMLTableRow;

public class TableBuilder {
    private String[] headers;
    private int width = 100;

    public TableBuilder(String[] headers) {
	super();
	this.headers = headers;
    }

    public HTMLTable build(List<IntoTableConverter> list) {
	HTMLTable table = new HTMLTable().width(width);
	if (null != headers) {
	    HTMLTableRow header = new HTMLTableRow();
	    for (int i = 0; i < headers.length; i++) {
		header.addChild(new HTMLTableHeader().textContent(headers[i]));
	    }
	    table.addChild(header);
	}

	list.stream().forEach(itc -> table.addChild(createRow(itc)));
	return table;
    }

    private HTMLTableRow createRow(IntoTableConverter element) {
	HTMLTableRow row = new HTMLTableRow();
	CellInfo[] elements = element.convert();
	for (int i = 0; i < elements.length; i++) {
	    row.addChild(elements[i].toTableCell());
	}
	return row;
    }

    public TableBuilder width(int width) {
	this.width = width;
	return this;
    }
}
