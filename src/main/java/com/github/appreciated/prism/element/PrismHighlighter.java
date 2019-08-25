package com.github.appreciated.prism.element;

import com.vaadin.flow.component.dependency.CssImport;

@CssImport(value = "./com/github/appreciated/prism/prism-element-styles.css", id = "prism-theme")
public class PrismHighlighter extends PrismHighlighterUnstyled {
    public PrismHighlighter(String code, Language lang) {
        super(code, lang);
    }
}
