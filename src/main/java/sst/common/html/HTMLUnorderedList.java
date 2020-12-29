package sst.common.html;

public class HTMLUnorderedList extends AbstractHTMLElement {

    @Override
    protected String getTagString() {
        return "UL";
    }

    public void addListItem(HTMLListItem item) {
        addChild(item);
    }
}
