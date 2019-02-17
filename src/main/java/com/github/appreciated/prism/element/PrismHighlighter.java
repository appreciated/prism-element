package com.github.appreciated.prism.element;

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
     * Adding the code with a highlighting setting.
     *
     * @param code the code that is supposed to be highlighted
     * @param lang the language that is supposed to be highlighted
     */
    public PrismHighlighter(String code, Language lang) {
        setCode(code);
        setLang(lang);
    }

    private void setCode(String code) {
        getElement().setProperty("code", code);
    }

    private void setLang(Language lang) {
        getElement().setAttribute("lang", lang.getLanguage());
    }
}
