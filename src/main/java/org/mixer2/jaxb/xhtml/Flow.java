
package org.mixer2.jaxb.xhtml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlMixed;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.CopyStrategy;
import org.jvnet.jaxb2_commons.lang.CopyTo;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.HashCode;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBCopyStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;
import org.mixer2.xhtml.AbstractJaxb;


/**
 * 
 *       "Flow" mixes block and inline and is used for list items etc.
 *       
 * 
 * <p>Java class for Flow complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Flow"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *         &lt;group ref="{http://www.w3.org/1999/xhtml}block"/&gt;
 *         &lt;element ref="{http://www.w3.org/1999/xhtml}form"/&gt;
 *         &lt;group ref="{http://www.w3.org/1999/xhtml}inline"/&gt;
 *         &lt;group ref="{http://www.w3.org/1999/xhtml}misc"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Flow", propOrder = {
    "content"
})
@XmlSeeAlso({
    Body.class,
    Div.class,
    Del.class,
    Ins.class,
    Noscript.class,
    Ruby.class,
    Iframe.class,
    Footer.class,
    Header.class,
    Figcaption.class,
    Figure.class,
    Nav.class,
    Canvas.class,
    Aside.class,
    Article.class,
    Section.class,
    Main.class,
    Td.class,
    Th.class,
    Noframes.class,
    Center.class,
    Blockquote.class,
    Video.class,
    Audio.class,
    Time.class,
    Meter.class,
    Mark.class,
    Progress.class,
    Dd.class,
    Li.class
})
public class Flow
    extends AbstractJaxb
    implements Cloneable, CopyTo, Equals, HashCode
{

    @XmlElementRefs({
        @XmlElementRef(name = "object", namespace = "http://www.w3.org/1999/xhtml", type = org.mixer2.jaxb.xhtml.Object.class),
        @XmlElementRef(name = "bdi", namespace = "http://www.w3.org/1999/xhtml", type = Bdi.class),
        @XmlElementRef(name = "p", namespace = "http://www.w3.org/1999/xhtml", type = P.class),
        @XmlElementRef(name = "ins", namespace = "http://www.w3.org/1999/xhtml", type = Ins.class),
        @XmlElementRef(name = "textarea", namespace = "http://www.w3.org/1999/xhtml", type = Textarea.class),
        @XmlElementRef(name = "em", namespace = "http://www.w3.org/1999/xhtml", type = Em.class),
        @XmlElementRef(name = "aside", namespace = "http://www.w3.org/1999/xhtml", type = Aside.class),
        @XmlElementRef(name = "iframe", namespace = "http://www.w3.org/1999/xhtml", type = Iframe.class),
        @XmlElementRef(name = "fieldset", namespace = "http://www.w3.org/1999/xhtml", type = Fieldset.class),
        @XmlElementRef(name = "var", namespace = "http://www.w3.org/1999/xhtml", type = Var.class),
        @XmlElementRef(name = "big", namespace = "http://www.w3.org/1999/xhtml", type = Big.class),
        @XmlElementRef(name = "figcaption", namespace = "http://www.w3.org/1999/xhtml", type = Figcaption.class),
        @XmlElementRef(name = "map", namespace = "http://www.w3.org/1999/xhtml", type = Map.class),
        @XmlElementRef(name = "h4", namespace = "http://www.w3.org/1999/xhtml", type = H4 .class),
        @XmlElementRef(name = "div", namespace = "http://www.w3.org/1999/xhtml", type = Div.class),
        @XmlElementRef(name = "rp", namespace = "http://www.w3.org/1999/xhtml", type = Rp.class),
        @XmlElementRef(name = "b", namespace = "http://www.w3.org/1999/xhtml", type = B.class),
        @XmlElementRef(name = "header", namespace = "http://www.w3.org/1999/xhtml", type = Header.class),
        @XmlElementRef(name = "a", namespace = "http://www.w3.org/1999/xhtml", type = A.class),
        @XmlElementRef(name = "time", namespace = "http://www.w3.org/1999/xhtml", type = Time.class),
        @XmlElementRef(name = "button", namespace = "http://www.w3.org/1999/xhtml", type = Button.class),
        @XmlElementRef(name = "dfn", namespace = "http://www.w3.org/1999/xhtml", type = Dfn.class),
        @XmlElementRef(name = "span", namespace = "http://www.w3.org/1999/xhtml", type = Span.class),
        @XmlElementRef(name = "script", namespace = "http://www.w3.org/1999/xhtml", type = Script.class),
        @XmlElementRef(name = "s", namespace = "http://www.w3.org/1999/xhtml", type = S.class),
        @XmlElementRef(name = "bdo", namespace = "http://www.w3.org/1999/xhtml", type = Bdo.class),
        @XmlElementRef(name = "section", namespace = "http://www.w3.org/1999/xhtml", type = Section.class),
        @XmlElementRef(name = "output", namespace = "http://www.w3.org/1999/xhtml", type = Output.class),
        @XmlElementRef(name = "acronym", namespace = "http://www.w3.org/1999/xhtml", type = Acronym.class),
        @XmlElementRef(name = "hr", namespace = "http://www.w3.org/1999/xhtml", type = Hr.class),
        @XmlElementRef(name = "menu", namespace = "http://www.w3.org/1999/xhtml", type = Menu.class),
        @XmlElementRef(name = "progress", namespace = "http://www.w3.org/1999/xhtml", type = Progress.class),
        @XmlElementRef(name = "pre", namespace = "http://www.w3.org/1999/xhtml", type = Pre.class),
        @XmlElementRef(name = "figure", namespace = "http://www.w3.org/1999/xhtml", type = Figure.class),
        @XmlElementRef(name = "sub", namespace = "http://www.w3.org/1999/xhtml", type = Sub.class),
        @XmlElementRef(name = "strike", namespace = "http://www.w3.org/1999/xhtml", type = Strike.class),
        @XmlElementRef(name = "label", namespace = "http://www.w3.org/1999/xhtml", type = Label.class),
        @XmlElementRef(name = "tt", namespace = "http://www.w3.org/1999/xhtml", type = Tt.class),
        @XmlElementRef(name = "table", namespace = "http://www.w3.org/1999/xhtml", type = Table.class),
        @XmlElementRef(name = "form", namespace = "http://www.w3.org/1999/xhtml", type = Form.class),
        @XmlElementRef(name = "video", namespace = "http://www.w3.org/1999/xhtml", type = Video.class),
        @XmlElementRef(name = "samp", namespace = "http://www.w3.org/1999/xhtml", type = Samp.class),
        @XmlElementRef(name = "embed", namespace = "http://www.w3.org/1999/xhtml", type = Embed.class),
        @XmlElementRef(name = "u", namespace = "http://www.w3.org/1999/xhtml", type = U.class),
        @XmlElementRef(name = "br", namespace = "http://www.w3.org/1999/xhtml", type = Br.class),
        @XmlElementRef(name = "mark", namespace = "http://www.w3.org/1999/xhtml", type = Mark.class),
        @XmlElementRef(name = "details", namespace = "http://www.w3.org/1999/xhtml", type = Details.class),
        @XmlElementRef(name = "kbd", namespace = "http://www.w3.org/1999/xhtml", type = Kbd.class),
        @XmlElementRef(name = "dl", namespace = "http://www.w3.org/1999/xhtml", type = Dl.class),
        @XmlElementRef(name = "cite", namespace = "http://www.w3.org/1999/xhtml", type = Cite.class),
        @XmlElementRef(name = "center", namespace = "http://www.w3.org/1999/xhtml", type = Center.class),
        @XmlElementRef(name = "abbr", namespace = "http://www.w3.org/1999/xhtml", type = Abbr.class),
        @XmlElementRef(name = "code", namespace = "http://www.w3.org/1999/xhtml", type = Code.class),
        @XmlElementRef(name = "isindex", namespace = "http://www.w3.org/1999/xhtml", type = Isindex.class),
        @XmlElementRef(name = "select", namespace = "http://www.w3.org/1999/xhtml", type = Select.class),
        @XmlElementRef(name = "ul", namespace = "http://www.w3.org/1999/xhtml", type = Ul.class),
        @XmlElementRef(name = "dir", namespace = "http://www.w3.org/1999/xhtml", type = Dir.class),
        @XmlElementRef(name = "audio", namespace = "http://www.w3.org/1999/xhtml", type = Audio.class),
        @XmlElementRef(name = "noscript", namespace = "http://www.w3.org/1999/xhtml", type = Noscript.class),
        @XmlElementRef(name = "address", namespace = "http://www.w3.org/1999/xhtml", type = Address.class),
        @XmlElementRef(name = "source", namespace = "http://www.w3.org/1999/xhtml", type = Source.class),
        @XmlElementRef(name = "blockquote", namespace = "http://www.w3.org/1999/xhtml", type = Blockquote.class),
        @XmlElementRef(name = "q", namespace = "http://www.w3.org/1999/xhtml", type = Q.class),
        @XmlElementRef(name = "command", namespace = "http://www.w3.org/1999/xhtml", type = Command.class),
        @XmlElementRef(name = "noframes", namespace = "http://www.w3.org/1999/xhtml", type = Noframes.class),
        @XmlElementRef(name = "datalist", namespace = "http://www.w3.org/1999/xhtml", type = Datalist.class),
        @XmlElementRef(name = "small", namespace = "http://www.w3.org/1999/xhtml", type = Small.class),
        @XmlElementRef(name = "keygen", namespace = "http://www.w3.org/1999/xhtml", type = Keygen.class),
        @XmlElementRef(name = "h2", namespace = "http://www.w3.org/1999/xhtml", type = H2 .class),
        @XmlElementRef(name = "h5", namespace = "http://www.w3.org/1999/xhtml", type = H5 .class),
        @XmlElementRef(name = "applet", namespace = "http://www.w3.org/1999/xhtml", type = Applet.class),
        @XmlElementRef(name = "input", namespace = "http://www.w3.org/1999/xhtml", type = Input.class),
        @XmlElementRef(name = "sup", namespace = "http://www.w3.org/1999/xhtml", type = Sup.class),
        @XmlElementRef(name = "strong", namespace = "http://www.w3.org/1999/xhtml", type = Strong.class),
        @XmlElementRef(name = "i", namespace = "http://www.w3.org/1999/xhtml", type = I.class),
        @XmlElementRef(name = "main", namespace = "http://www.w3.org/1999/xhtml", type = Main.class),
        @XmlElementRef(name = "meter", namespace = "http://www.w3.org/1999/xhtml", type = Meter.class),
        @XmlElementRef(name = "wbr", namespace = "http://www.w3.org/1999/xhtml", type = Wbr.class),
        @XmlElementRef(name = "basefont", namespace = "http://www.w3.org/1999/xhtml", type = Basefont.class),
        @XmlElementRef(name = "font", namespace = "http://www.w3.org/1999/xhtml", type = Font.class),
        @XmlElementRef(name = "canvas", namespace = "http://www.w3.org/1999/xhtml", type = Canvas.class),
        @XmlElementRef(name = "footer", namespace = "http://www.w3.org/1999/xhtml", type = Footer.class),
        @XmlElementRef(name = "h6", namespace = "http://www.w3.org/1999/xhtml", type = H6 .class),
        @XmlElementRef(name = "h3", namespace = "http://www.w3.org/1999/xhtml", type = H3 .class),
        @XmlElementRef(name = "rt", namespace = "http://www.w3.org/1999/xhtml", type = Rt.class),
        @XmlElementRef(name = "h1", namespace = "http://www.w3.org/1999/xhtml", type = H1 .class),
        @XmlElementRef(name = "ol", namespace = "http://www.w3.org/1999/xhtml", type = Ol.class),
        @XmlElementRef(name = "nav", namespace = "http://www.w3.org/1999/xhtml", type = Nav.class),
        @XmlElementRef(name = "track", namespace = "http://www.w3.org/1999/xhtml", type = Track.class),
        @XmlElementRef(name = "article", namespace = "http://www.w3.org/1999/xhtml", type = Article.class),
        @XmlElementRef(name = "hgroup", namespace = "http://www.w3.org/1999/xhtml", type = Hgroup.class),
        @XmlElementRef(name = "ruby", namespace = "http://www.w3.org/1999/xhtml", type = Ruby.class),
        @XmlElementRef(name = "img", namespace = "http://www.w3.org/1999/xhtml", type = Img.class),
        @XmlElementRef(name = "del", namespace = "http://www.w3.org/1999/xhtml", type = Del.class)
    })
    @XmlMixed
    protected List<java.lang.Object> content;

    /**
     * 
     *       "Flow" mixes block and inline and is used for list items etc.
     *       Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link org.mixer2.jaxb.xhtml.Object }
     * {@link P }
     * {@link Bdi }
     * {@link Textarea }
     * {@link Ins }
     * {@link Iframe }
     * {@link Aside }
     * {@link Em }
     * {@link Fieldset }
     * {@link Var }
     * {@link Map }
     * {@link Figcaption }
     * {@link Big }
     * {@link H4 }
     * {@link Div }
     * {@link Rp }
     * {@link Header }
     * {@link B }
     * {@link A }
     * {@link Time }
     * {@link Span }
     * {@link Dfn }
     * {@link Button }
     * {@link S }
     * {@link Script }
     * {@link Bdo }
     * {@link Section }
     * {@link Hr }
     * {@link Acronym }
     * {@link Output }
     * {@link Menu }
     * {@link Progress }
     * {@link Pre }
     * {@link Figure }
     * {@link Strike }
     * {@link Sub }
     * {@link Label }
     * {@link Tt }
     * {@link Table }
     * {@link Form }
     * {@link Embed }
     * {@link Samp }
     * {@link Video }
     * {@link U }
     * {@link Br }
     * {@link Mark }
     * {@link Details }
     * {@link Dl }
     * {@link Kbd }
     * {@link Center }
     * {@link Cite }
     * {@link Code }
     * {@link Abbr }
     * {@link Isindex }
     * {@link Dir }
     * {@link Ul }
     * {@link Select }
     * {@link Audio }
     * {@link Noscript }
     * {@link Source }
     * {@link Address }
     * {@link String }
     * {@link Blockquote }
     * {@link Q }
     * {@link Noframes }
     * {@link Command }
     * {@link Datalist }
     * {@link Small }
     * {@link Keygen }
     * {@link H2 }
     * {@link Applet }
     * {@link H5 }
     * {@link Sup }
     * {@link Input }
     * {@link Strong }
     * {@link I }
     * {@link Main }
     * {@link Meter }
     * {@link Wbr }
     * {@link Basefont }
     * {@link Footer }
     * {@link Canvas }
     * {@link Font }
     * {@link H6 }
     * {@link H3 }
     * {@link Rt }
     * {@link Ol }
     * {@link H1 }
     * {@link Nav }
     * {@link Track }
     * {@link Article }
     * {@link Hgroup }
     * {@link Ruby }
     * {@link Img }
     * {@link Del }
     * 
     * 
     */
    public List<java.lang.Object> getContent() {
        if (content == null) {
            content = new ArrayList<java.lang.Object>();
        }
        return this.content;
    }

    public boolean isSetContent() {
        return ((this.content!= null)&&(!this.content.isEmpty()));
    }

    public void unsetContent() {
        this.content = null;
    }

    public java.lang.Object clone() {
        return copyTo(createNewInstance());
    }

    public java.lang.Object copyTo(java.lang.Object target) {
        final CopyStrategy strategy = JAXBCopyStrategy.INSTANCE;
        return copyTo(null, target, strategy);
    }

    public java.lang.Object copyTo(ObjectLocator locator, java.lang.Object target, CopyStrategy strategy) {
        final java.lang.Object draftCopy = ((target == null)?createNewInstance():target);
        if (draftCopy instanceof Flow) {
            final Flow copy = ((Flow) draftCopy);
            if (this.isSetContent()) {
                List<java.lang.Object> sourceContent;
                sourceContent = (this.isSetContent()?this.getContent():null);
                @SuppressWarnings("unchecked")
                List<java.lang.Object> copyContent = ((List<java.lang.Object> ) strategy.copy(LocatorUtils.property(locator, "content", sourceContent), sourceContent));
                copy.unsetContent();
                if (copyContent!= null) {
                    List<java.lang.Object> uniqueContentl = copy.getContent();
                    uniqueContentl.addAll(copyContent);
                }
            } else {
                copy.unsetContent();
            }
        }
        return draftCopy;
    }

    public java.lang.Object createNewInstance() {
        return new Flow();
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, java.lang.Object object, EqualsStrategy strategy) {
        if (!(object instanceof Flow)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Flow that = ((Flow) object);
        {
            List<java.lang.Object> lhsContent;
            lhsContent = (this.isSetContent()?this.getContent():null);
            List<java.lang.Object> rhsContent;
            rhsContent = (that.isSetContent()?that.getContent():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "content", lhsContent), LocatorUtils.property(thatLocator, "content", rhsContent), lhsContent, rhsContent)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(java.lang.Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = 1;
        {
            List<java.lang.Object> theContent;
            theContent = (this.isSetContent()?this.getContent():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "content", theContent), currentHashCode, theContent);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
