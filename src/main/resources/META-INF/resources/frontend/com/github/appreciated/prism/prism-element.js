import {html, PolymerElement} from '@polymer/polymer';
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
        let element = this;
        super.connectedCallback();
        console.log(this.code);
        let ev = new CustomEvent('syntax-highlight', {
            detail: {
                code: this.code
            }
        });
        this.$.parent.dispatchEvent(ev);
        this.$.output.innerHTML = ev.detail.code;
    }
}

customElements.define('prism-highlighter-wrapper', SampleElement);
