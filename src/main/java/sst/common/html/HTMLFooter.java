package sst.common.html;

/**
 * @author zt974
 *
 *         The <footer> tag defines a footer for a document or section.
 * 
 *         A <footer> element should contain information about its containing
 *         element.
 * 
 *         A <footer> element typically contains: * authorship information
 * 
 *         copyright information
 * 
 *         contact information
 * 
 *         sitemap
 * 
 *         back to top links
 * 
 *         related documents
 * 
 *         You can have several <footer> elements in one document.
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
