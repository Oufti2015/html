package sst.common.html;


public class HTMLDiv extends AbstractHTMLElement {
    @Override
    protected String getChildrenContent() {
        String result = "";
        String superContent = super.getChildrenContent();
        if (textContent.length() > 0) {
            result += textContent;
        }
        if (superContent.length() > 0) {
            if (result.length() > 0) {
                result += getTab();
            }
            result += superContent;
        }
        return result;
    }

    @Override
    protected String getTagString() {
        return "DIV";
    }
}
