package sst.common.html.table.builders;

import sst.common.html.table.HTMLTableCell;

public class CellInfo {
    private String content;
    private String style;
    private int colspan = 1;

    public CellInfo(String content) {
	super();
	this.content = content;
    }

    public CellInfo(String content, String style) {
	super();
	this.content = content;
	this.style = style;
    }

    public CellInfo(String content, String style, int colspan) {
	super();
	this.content = content;
	this.style = style;
	this.colspan = colspan;
    }

    public CellInfo(String content, int colspan) {
	super();
	this.content = content;
	this.colspan = colspan;
    }

    public String getContent() {
	return content;
    }

    public void setContent(String content) {
	this.content = content;
    }

    public String getStyle() {
	return style;
    }

    public void setStyle(String style) {
	this.style = style;
    }

    public int getColspan() {
	return colspan;
    }

    public void setColspan(int colspan) {
	this.colspan = colspan;
    }

    public HTMLTableCell toTableCell() {
	HTMLTableCell tablecell = new HTMLTableCell();
	tablecell.textContent(this.getContent());
	if (1 < getColspan()) {
	    tablecell.colspan(getColspan());
	}
	if (null != getStyle()) {
	    tablecell.classId(getStyle());
	}
	return tablecell;
    }
}
