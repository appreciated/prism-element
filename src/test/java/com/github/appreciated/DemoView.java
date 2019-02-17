package com.github.appreciated;

import com.github.appreciated.prism.element.Language;
import com.github.appreciated.prism.element.PrismHighlighter;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route("")
public class DemoView extends VerticalLayout {

    public DemoView() {
        add(
                new PrismHighlighter("<style>p { color: blue; }</style>", Language.markup),
                new PrismHighlighter("p { color: blue; }", Language.css),
                new PrismHighlighter("@Route(\"\")\n" +
                        "public class DemoView extends VerticalLayout {\n" +
                        "\n" +
                        "    public DemoView() {\n" +
                        "        add(\n" +
                        "                new PrismHighlighter(\"<style>p { color: blue; }</style>\", \"html\"),\n" +
                        "                new PrismHighlighter(\"<style>p { color: blue; }</style>\", \"html\"),\n" +
                        "                new PrismHighlighter(\"<style>p { color: blue; }</style>\", \"html\"),\n" +
                        "                new PrismHighlighter(\"<style>p { color: blue; }</style>\", \"html\")\n" +
                        "        );\n" +
                        "    }\n" +
                        "}\n", Language.java)
        );
    }
}


































































































































































