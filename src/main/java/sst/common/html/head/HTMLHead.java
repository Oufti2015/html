package sst.common.html.head;

import java.nio.charset.Charset;

import sst.common.html.AbstractHTMLElement;

public class HTMLHead extends AbstractHTMLElement {

    public HTMLHead title(String title) {
	addChild(new HTMLTitle(title));
	return this;
    }

    public HTMLHead styleSheet(String filename) {
	addChild(new HTMLLink().rel("stylesheet").type("text/css").href(filename));
	return this;
    }

    @Override
    protected String getTagString() {
	return "HEAD";
    }

    public HTMLHead javaScript(String scriptFile) {
	this.addChild(new HTMLScript().type("text/javascript").src(scriptFile));
	return this;
    }

    public HTMLHead css(String scriptFile) {
	this.addChild(new HTMLLink().rel("stylesheet").type("text/css").href(scriptFile));
	return this;
    }

    public HTMLHead charset(Charset charset) {
	this.addChild(new HTMLMeta().charset(charset));
	return this;
    }
}
