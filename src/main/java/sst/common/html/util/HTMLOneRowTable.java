package sst.common.html.util;

import sst.common.html.AbstractHTMLElement;
import sst.common.html.table.HTMLTable;
import sst.common.html.table.HTMLTableCell;
import sst.common.html.table.HTMLTableRow;

public class HTMLOneRowTable extends HTMLTable {

    public HTMLOneRowTable(AbstractHTMLElement... elements) {
	super();
	HTMLTableRow row = new HTMLTableRow();
	for (int i = 0; i < elements.length; i++) {
	    HTMLTableCell cell = new HTMLTableCell();
	    cell.addChild(elements[i]);
	    row.addChild(cell);
	}
	addChild(row);
    }
}
