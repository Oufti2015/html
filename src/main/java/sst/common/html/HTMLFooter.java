package sst.common.html;

/**
 * @author zt974
 * <p>
 * The <footer> tag defines a footer for a document or section.
 * <p>
 * A <footer> element should contain information about its containing
 * element.
 * <p>
 * A <footer> element typically contains: * authorship information
 * <p>
 * copyright information
 * <p>
 * contact information
 * <p>
 * sitemap
 * <p>
 * back to top links
 * <p>
 * related documents
 * <p>
 * You can have several <footer> elements in one document.
 */
public class HTMLFooter extends AbstractHTMLElement {

    public HTMLFooter(String footer) {
        super();
        this.textContent = footer;
    }

    @Override
    protected String getTagString() {
        return "FOOTER";
    }
}
