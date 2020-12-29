package sst.common.html;

import sst.common.file.output.OutputFile;
import sst.common.html.head.HTMLHead;

import java.io.File;
import java.io.IOException;

/**
 * @author zt974
 * <p>
 * The <html> tag tells the browser that this is an HTML document. The
 * <html> tag represents the root of an HTML document. The <html> tag is
 * the container for all other HTML elements
 * @see http://www.w3schools.com/tags/tag_html.asp
 */
public class HTML extends AbstractHTMLElement {

    public static final String EMPTY_STR = "&nbsp;";

    HTMLHead head = null;
    HTMLBody body = null;

    @Override
    protected String getTagString() {
        return "HTML";
    }

    @Override
    public String toString() {
        return "<!DOCTYPE html>\n" + super.toString();
    }

    /**
     * The <body> tag defines the document's body. The <body> element contains
     * all the contents of an HTML document, such as text, hyperlinks, images,
     * tables, lists, etc.
     *
     * @return HTMLBody
     * @see http://www.w3schools.com/tags/tag_body.asp
     */
    public HTMLBody body() {
        if (null == body) {
            body = new HTMLBody();
            addChild(body);
        }
        return body;
    }

    /**
     * @return HTMLHead
     */
    public HTMLHead head() {
        if (null == head) {
            head = new HTMLHead();
            addChild(head);
        }
        return head;
    }

    public void toFile(File file) throws IOException {
        try (OutputFile output = new OutputFile(file)) {
            output.println(this.toString());
        }
    }
}
