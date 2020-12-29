package sst.common.html;

public class HTMLCaption extends AbstractHTMLElement {

    private String caption = null;

    public HTMLCaption(String caption) {
        super();
        this.caption = caption;
    }

    @Override
    protected String getChildrenContent() {
        return caption;
    }

    @Override
    protected String getTagString() {
        return "CAPTION";
    }
}
