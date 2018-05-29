package com.github.appreciated.prism.element;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.HtmlImport;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.templatemodel.TemplateModel;

@Tag("prism-highlighter-wrapper")
@HtmlImport("bower_components/prism-element/prism-highlighter.html")
@HtmlImport("bower_components/prism-element/prism-theme-default.html")
@HtmlImport("com/github/appreciated/prism-element/prism-element.html")

public class PrismHighlighter extends PolymerTemplate<TemplateModel> {

    /**
     * Adding the code with automatic highlighting (does not work always)
     * @param code
     */
    public PrismHighlighter(String code) {
        setCode(code);
    }
    /**
     * Adding the code with manual highlighting setting. Supported highlighting features can be found here @see <a href="http://prismjs.com">http://prismjs.com/#languages-list</a>
     * @param code
     */
    public PrismHighlighter(String code, String lang) {
        this(code);
        setLang(lang);
    }

    private void setLang(String lang) {
        getElement().setAttribute("lang", lang);
    }

    private void setCode(String code) {
        getElement().setAttribute("code", code);
        //getElement().setText(code);
    }
}
