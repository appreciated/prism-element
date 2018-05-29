package com.github.appreciated;

import com.github.appreciated.prism.element.PrismHighlighter;
import com.github.appreciated.prism.element.PrismHighlighter;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route("")
public class DemoView extends VerticalLayout {

    public DemoView() {
        add(
                new PrismHighlighter("<style>p { color: blue; }</style>"),
                new PrismHighlighter("<style>p { color: blue; }</style>","html"),
                new PrismHighlighter("p { color: blue; }"),
                new PrismHighlighter("p { color: blue; }","css"),
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
                        "}\n"),
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
                        "}\n","java")
        );
    }
}
