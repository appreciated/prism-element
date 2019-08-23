import {html, PolymerElement} from '@polymer/polymer';
import '@polymer/prism-element/prism-element.js';
import '@polymer/prism-element/prism-highlighter.js';
import '@polymer/prism-element/prism-theme-default.js';

class SampleElement extends PolymerElement {
    static get template() {
        return html`
<style include="prism-theme-default"></style>
<div id="parent">
    <prism-highlighter></prism-highlighter>
    <div id="output"></div>
</div>
`;
    }

    connectedCallback() {
        super.connectedCallback();
        const ev = new CustomEvent('syntax-highlight');

        // enter code and language here
        ev.detail = {
            code: 'p { background-color: blue }',
            lang: 'css',
        };
        this.$.parent.dispatchEvent(ev);

        // detail is modified by prism-highlighter
        this.$.output.innerHTML = ev.detail.code;
    }
}

customElements.define('prism-highlighter-wrapper', SampleElement);
