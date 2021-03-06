//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.07.27 at 04:06:37 PM EDT 
//


package org.isotc211._2005.gco;

import java.io.Serializable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.CopyStrategy2;
import org.jvnet.jaxb2_commons.lang.CopyTo2;
import org.jvnet.jaxb2_commons.lang.Equals2;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy2;
import org.jvnet.jaxb2_commons.lang.HashCode2;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy2;
import org.jvnet.jaxb2_commons.lang.JAXBCopyStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBMergeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.MergeFrom2;
import org.jvnet.jaxb2_commons.lang.MergeStrategy2;
import org.jvnet.jaxb2_commons.lang.ToString2;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy2;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * A TypeName is a LocalName that references either a recordType or object type in some form of schema. The stored value "aName" is the returned value for the "aName()" operation. This is the types name.  - For parsing from types (or objects) the parsible name normally uses a "." navigation separator, so that it is of the form  [class].[member].[memberOfMember]. ...)
 * 
 * <p>Java class for TypeName_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TypeName_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.isotc211.org/2005/gco}AbstractObject_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="aName" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TypeName_Type", propOrder = {
    "aName"
})
public class TypeNameType
    extends AbstractObjectType
    implements Serializable, Cloneable, CopyTo2, Equals2, HashCode2, MergeFrom2, ToString2
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    @NotNull(message = "TypeNameType.aName {javax.validation.constraints.NotNull.message}")
    @Valid
    protected CharacterStringPropertyType aName;

    /**
     * Gets the value of the aName property.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getAName() {
        return aName;
    }

    /**
     * Sets the value of the aName property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setAName(CharacterStringPropertyType value) {
        this.aName = value;
    }

    public boolean isSetAName() {
        return (this.aName!= null);
    }

    public String toString() {
        final ToStringStrategy2 strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            CharacterStringPropertyType theAName;
            theAName = this.getAName();
            strategy.appendField(locator, this, "aName", buffer, theAName, this.isSetAName());
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final TypeNameType that = ((TypeNameType) object);
        {
            CharacterStringPropertyType lhsAName;
            lhsAName = this.getAName();
            CharacterStringPropertyType rhsAName;
            rhsAName = that.getAName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "aName", lhsAName), LocatorUtils.property(thatLocator, "aName", rhsAName), lhsAName, rhsAName, this.isSetAName(), that.isSetAName())) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy2 strategy) {
        int currentHashCode = super.hashCode(locator, strategy);
        {
            CharacterStringPropertyType theAName;
            theAName = this.getAName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "aName", theAName), currentHashCode, theAName, this.isSetAName());
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

    public Object clone() {
        return copyTo(createNewInstance());
    }

    public Object copyTo(Object target) {
        final CopyStrategy2 strategy = JAXBCopyStrategy.INSTANCE;
        return copyTo(null, target, strategy);
    }

    public Object copyTo(ObjectLocator locator, Object target, CopyStrategy2 strategy) {
        final Object draftCopy = ((target == null)?createNewInstance():target);
        super.copyTo(locator, draftCopy, strategy);
        if (draftCopy instanceof TypeNameType) {
            final TypeNameType copy = ((TypeNameType) draftCopy);
            {
                Boolean aNameShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetAName());
                if (aNameShouldBeCopiedAndSet == Boolean.TRUE) {
                    CharacterStringPropertyType sourceAName;
                    sourceAName = this.getAName();
                    CharacterStringPropertyType copyAName = ((CharacterStringPropertyType) strategy.copy(LocatorUtils.property(locator, "aName", sourceAName), sourceAName, this.isSetAName()));
                    copy.setAName(copyAName);
                } else {
                    if (aNameShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.aName = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new TypeNameType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy2 strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy2 strategy) {
        super.mergeFrom(leftLocator, rightLocator, left, right, strategy);
        if (right instanceof TypeNameType) {
            final TypeNameType target = this;
            final TypeNameType leftObject = ((TypeNameType) left);
            final TypeNameType rightObject = ((TypeNameType) right);
            {
                Boolean aNameShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, leftObject.isSetAName(), rightObject.isSetAName());
                if (aNameShouldBeMergedAndSet == Boolean.TRUE) {
                    CharacterStringPropertyType lhsAName;
                    lhsAName = leftObject.getAName();
                    CharacterStringPropertyType rhsAName;
                    rhsAName = rightObject.getAName();
                    CharacterStringPropertyType mergedAName = ((CharacterStringPropertyType) strategy.merge(LocatorUtils.property(leftLocator, "aName", lhsAName), LocatorUtils.property(rightLocator, "aName", rhsAName), lhsAName, rhsAName, leftObject.isSetAName(), rightObject.isSetAName()));
                    target.setAName(mergedAName);
                } else {
                    if (aNameShouldBeMergedAndSet == Boolean.FALSE) {
                        target.aName = null;
                    }
                }
            }
        }
    }

}
