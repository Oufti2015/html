package sst.common.html.table;

import sst.common.html.AbstractHTMLElement;

public class HTMLTableRow extends AbstractHTMLElement {

    HTMLTableCell cell = null;
    HTMLTableHeader head = null;

    public HTMLTableRow() {
        super();
    }

    public HTMLTableCell cell() {
        if (null == cell) {
            return newCell();
        }
        return cell;
    }

    public HTMLTableCell newCell() {
        cell = new HTMLTableCell();
        addChild(cell);
        return cell;
    }

    public HTMLTableCell newCell(String text) {
        cell = new HTMLTableCell();
        addChild(cell);
        cell.textContent(text);
        return cell;
    }

    public HTMLTableHeader head() {
        if (null == head) {
            return newHead();
        }
        return head;
    }

    public HTMLTableHeader newHead() {
        head = new HTMLTableHeader();
        addChild(head);
        return head;
    }

    public HTMLTableCell newHead(String text) {
        cell = new HTMLTableHeader();
        addChild(cell);
        cell.textContent(text);
        return cell;
    }

    public HTMLTableRow height(int h) {
        setAttribute("height", "" + h + "%");
        return this;
    }

    @Override
    protected String getTagString() {
        return "TR";
    }
}
