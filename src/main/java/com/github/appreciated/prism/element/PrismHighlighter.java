package com.github.appreciated.prism.element;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.dependency.NpmPackage;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.templatemodel.TemplateModel;

@Tag("prism-highlighter-wrapper")
@NpmPackage(value = "@polymer/prism-element", version = "3.0.1")
@JsModule("./com/github/appreciated/prism/prism-element.js")
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
