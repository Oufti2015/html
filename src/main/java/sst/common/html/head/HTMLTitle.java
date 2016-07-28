package sst.common.html.head;

import sst.common.html.AbstractHTMLElement;

public class HTMLTitle extends AbstractHTMLElement {

	public HTMLTitle(String title) {
		super();
		// setAttribute("title", title);
		textContent(title);
	}

	@Override
	protected String getTagString() {
		return "TITLE";
	}
}
