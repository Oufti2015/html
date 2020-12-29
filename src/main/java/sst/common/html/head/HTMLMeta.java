package sst.common.html.head;

import sst.common.html.AbstractHTMLElement;

import java.nio.charset.Charset;

public class HTMLMeta extends AbstractHTMLElement {

    @Override
    protected String getTagString() {
        return "META";
    }

    public HTMLMeta charset(Charset charset) {
        setAttribute("charset", charset.name());
        return this;
    }

    public HTMLMeta httpEquiv(String httpEquiv) {
        setAttribute("http-equiv", httpEquiv);
        return this;
    }
}
