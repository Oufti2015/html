package sst.common.html;

/**
 * @author zt974
 *
 *         The <body> tag defines the document's body. The <body> element
 *         contains all the contents of an HTML document, such as text,
 *         hyperlinks, images, tables, lists, etc.
 */
public class HTMLBody extends AbstractHTMLElement {

    public HTMLBody footer(String footer) {
	addChild(new HTMLFooter(footer));
	return this;
    }

    @Override
    protected String getTagString() {
	return "BODY";
    }
}
