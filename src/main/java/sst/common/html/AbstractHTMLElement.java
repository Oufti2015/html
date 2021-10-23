package sst.common.html;

import lombok.Getter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public abstract class AbstractHTMLElement {

    @Getter
    private int tabulation = 0;
    private final HashMap<String, String> attributes = new HashMap<>();

    private final ArrayList<AbstractHTMLElement> children = new ArrayList<>();
    protected String textContent = "";

    protected abstract String getTagString();

    protected String getHeader() {
        StringBuilder header = new StringBuilder("<" + getTagString());
        for (Map.Entry<String, String> entry : attributes.entrySet()) {
            String value = entry.getValue();
            header.append(" ").append(entry.getKey()).append("=\"").append(value).append("\"");
        }
        return header.append(">").toString();
    }

    protected String getTrailer() {
        return "</" + getTagString() + ">";

    }

    protected String getChildrenContent() {
        StringBuilder buffer = new StringBuilder();
        for (AbstractHTMLElement element : children) {
            buffer.append(element.getTab());
            buffer.append(element.toString());
        }
        return buffer.toString();
    }

    @Override
    public String toString() {
        String result = getHeader() + textContent;
        if (!children.isEmpty()) {
            result += getChildrenContent() + getTab();
        }
        return result + getTrailer();
    }

    public AbstractHTMLElement addChild(AbstractHTMLElement child) {
        children.add(child);
        child.setTabulation(tabulation + 1);
        return this;
    }

    protected String getTab() {
        StringBuilder stringBuilder = new StringBuilder("\n");
        for (int i = 0; i < tabulation; i++) {
            stringBuilder.append("\t");
        }
        return stringBuilder.toString();
    }

    /**
     * @param tabulation the tabulation to set
     */
    public void setTabulation(int tabulation) {
        this.tabulation = tabulation;
        for (AbstractHTMLElement child : children) {
            child.setTabulation(tabulation + 1);
        }
    }

    public AbstractHTMLElement id(String id) {
        setAttribute("id", id);
        return this;
    }

    public AbstractHTMLElement classId(String classId) {
        setAttribute("class", classId);
        return this;
    }

    public AbstractHTMLElement textContent(String content) {
        this.textContent = content;
        return this;
    }

    public void setAttribute(String key, String value) {
        attributes.put(key.toUpperCase(), value);
    }

    public AbstractHTMLElement style(String style) {
        setAttribute("style", style);
        return this;
    }

    /* For testing purpose */
    public int childCounts() {
        return children.size();
    }
}
