
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
 *       pre uses "Inline" excluding img, object, applet, big, small,
 *       font, or basefont
 *       
 * 
 * <p>pre.content complex typeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * 
 * <pre>
 * &lt;complexType name="pre.content">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element ref="{http://www.w3.org/1999/xhtml}a"/>
 *         &lt;group ref="{http://www.w3.org/1999/xhtml}special.basic"/>
 *         &lt;group ref="{http://www.w3.org/1999/xhtml}fontstyle.basic"/>
 *         &lt;group ref="{http://www.w3.org/1999/xhtml}phrase.basic"/>
 *         &lt;group ref="{http://www.w3.org/1999/xhtml}inline.forms"/>
 *         &lt;group ref="{http://www.w3.org/1999/xhtml}misc.inline"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pre.content", propOrder = {
    "content"
})
@XmlSeeAlso({
    Pre.class
})
public class PreContent
    extends AbstractJaxb
    implements Cloneable, CopyTo, Equals, HashCode
{

    @XmlElementRefs({
        @XmlElementRef(name = "button", namespace = "http://www.w3.org/1999/xhtml", type = Button.class),
        @XmlElementRef(name = "select", namespace = "http://www.w3.org/1999/xhtml", type = Select.class),
        @XmlElementRef(name = "i", namespace = "http://www.w3.org/1999/xhtml", type = I.class),
        @XmlElementRef(name = "video", namespace = "http://www.w3.org/1999/xhtml", type = Video.class),
        @XmlElementRef(name = "time", namespace = "http://www.w3.org/1999/xhtml", type = Time.class),
        @XmlElementRef(name = "samp", namespace = "http://www.w3.org/1999/xhtml", type = Samp.class),
        @XmlElementRef(name = "label", namespace = "http://www.w3.org/1999/xhtml", type = Label.class),
        @XmlElementRef(name = "strike", namespace = "http://www.w3.org/1999/xhtml", type = Strike.class),
        @XmlElementRef(name = "acronym", namespace = "http://www.w3.org/1999/xhtml", type = Acronym.class),
        @XmlElementRef(name = "b", namespace = "http://www.w3.org/1999/xhtml", type = B.class),
        @XmlElementRef(name = "dfn", namespace = "http://www.w3.org/1999/xhtml", type = Dfn.class),
        @XmlElementRef(name = "s", namespace = "http://www.w3.org/1999/xhtml", type = S.class),
        @XmlElementRef(name = "bdo", namespace = "http://www.w3.org/1999/xhtml", type = Bdo.class),
        @XmlElementRef(name = "command", namespace = "http://www.w3.org/1999/xhtml", type = Command.class),
        @XmlElementRef(name = "keygen", namespace = "http://www.w3.org/1999/xhtml", type = Keygen.class),
        @XmlElementRef(name = "br", namespace = "http://www.w3.org/1999/xhtml", type = Br.class),
        @XmlElementRef(name = "strong", namespace = "http://www.w3.org/1999/xhtml", type = Strong.class),
        @XmlElementRef(name = "del", namespace = "http://www.w3.org/1999/xhtml", type = Del.class),
        @XmlElementRef(name = "audio", namespace = "http://www.w3.org/1999/xhtml", type = Audio.class),
        @XmlElementRef(name = "output", namespace = "http://www.w3.org/1999/xhtml", type = Output.class),
        @XmlElementRef(name = "script", namespace = "http://www.w3.org/1999/xhtml", type = Script.class),
        @XmlElementRef(name = "textarea", namespace = "http://www.w3.org/1999/xhtml", type = Textarea.class),
        @XmlElementRef(name = "kbd", namespace = "http://www.w3.org/1999/xhtml", type = Kbd.class),
        @XmlElementRef(name = "span", namespace = "http://www.w3.org/1999/xhtml", type = Span.class),
        @XmlElementRef(name = "ins", namespace = "http://www.w3.org/1999/xhtml", type = Ins.class),
        @XmlElementRef(name = "var", namespace = "http://www.w3.org/1999/xhtml", type = Var.class),
        @XmlElementRef(name = "em", namespace = "http://www.w3.org/1999/xhtml", type = Em.class),
        @XmlElementRef(name = "input", namespace = "http://www.w3.org/1999/xhtml", type = Input.class),
        @XmlElementRef(name = "tt", namespace = "http://www.w3.org/1999/xhtml", type = Tt.class),
        @XmlElementRef(name = "q", namespace = "http://www.w3.org/1999/xhtml", type = Q.class),
        @XmlElementRef(name = "u", namespace = "http://www.w3.org/1999/xhtml", type = U.class),
        @XmlElementRef(name = "progress", namespace = "http://www.w3.org/1999/xhtml", type = Progress.class),
        @XmlElementRef(name = "mark", namespace = "http://www.w3.org/1999/xhtml", type = Mark.class),
        @XmlElementRef(name = "a", namespace = "http://www.w3.org/1999/xhtml", type = A.class),
        @XmlElementRef(name = "cite", namespace = "http://www.w3.org/1999/xhtml", type = Cite.class),
        @XmlElementRef(name = "abbr", namespace = "http://www.w3.org/1999/xhtml", type = Abbr.class),
        @XmlElementRef(name = "code", namespace = "http://www.w3.org/1999/xhtml", type = Code.class),
        @XmlElementRef(name = "meter", namespace = "http://www.w3.org/1999/xhtml", type = Meter.class)
    })
    @XmlMixed
    protected List<java.lang.Object> content;

    /**
     * 
     *       pre uses "Inline" excluding img, object, applet, big, small,
     *       font, or basefont
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
     * {@link I }
     * {@link Select }
     * {@link Button }
     * {@link Time }
     * {@link Video }
     * {@link Samp }
     * {@link Label }
     * {@link Strike }
     * {@link Acronym }
     * {@link B }
     * {@link Dfn }
     * {@link String }
     * {@link S }
     * {@link Bdo }
     * {@link Command }
     * {@link Keygen }
     * {@link Br }
     * {@link Strong }
     * {@link Output }
     * {@link Audio }
     * {@link Del }
     * {@link Textarea }
     * {@link Script }
     * {@link Kbd }
     * {@link Span }
     * {@link Ins }
     * {@link Var }
     * {@link Em }
     * {@link Input }
     * {@link Tt }
     * {@link Q }
     * {@link Mark }
     * {@link Progress }
     * {@link U }
     * {@link Abbr }
     * {@link Cite }
     * {@link A }
     * {@link Code }
     * {@link Meter }
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

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, java.lang.Object object, EqualsStrategy strategy) {
        if (!(object instanceof PreContent)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final PreContent that = ((PreContent) object);
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

    public java.lang.Object clone() {
        return copyTo(createNewInstance());
    }

    public java.lang.Object copyTo(java.lang.Object target) {
        final CopyStrategy strategy = JAXBCopyStrategy.INSTANCE;
        return copyTo(null, target, strategy);
    }

    public java.lang.Object copyTo(ObjectLocator locator, java.lang.Object target, CopyStrategy strategy) {
        final java.lang.Object draftCopy = ((target == null)?createNewInstance():target);
        if (draftCopy instanceof PreContent) {
            final PreContent copy = ((PreContent) draftCopy);
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
        return new PreContent();
    }

}
