//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.07.27 at 04:06:37 PM EDT 
//


package org.isotc211._2005.gmd;

import java.io.Serializable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.isotc211._2005.gco.AbstractObjectType;
import org.isotc211._2005.gco.IntegerPropertyType;
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
 * <p>Java class for MD_GeometricObjects_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MD_GeometricObjects_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.isotc211.org/2005/gco}AbstractObject_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="geometricObjectType" type="{http://www.isotc211.org/2005/gmd}MD_GeometricObjectTypeCode_PropertyType"/&gt;
 *         &lt;element name="geometricObjectCount" type="{http://www.isotc211.org/2005/gco}Integer_PropertyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MD_GeometricObjects_Type", propOrder = {
    "geometricObjectType",
    "geometricObjectCount"
})
public class MDGeometricObjectsType
    extends AbstractObjectType
    implements Serializable, Cloneable, CopyTo2, Equals2, HashCode2, MergeFrom2, ToString2
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    @NotNull(message = "MDGeometricObjectsType.geometricObjectType {javax.validation.constraints.NotNull.message}")
    @Valid
    protected MDGeometricObjectTypeCodePropertyType geometricObjectType;
    @Valid
    protected IntegerPropertyType geometricObjectCount;

    /**
     * Gets the value of the geometricObjectType property.
     * 
     * @return
     *     possible object is
     *     {@link MDGeometricObjectTypeCodePropertyType }
     *     
     */
    public MDGeometricObjectTypeCodePropertyType getGeometricObjectType() {
        return geometricObjectType;
    }

    /**
     * Sets the value of the geometricObjectType property.
     * 
     * @param value
     *     allowed object is
     *     {@link MDGeometricObjectTypeCodePropertyType }
     *     
     */
    public void setGeometricObjectType(MDGeometricObjectTypeCodePropertyType value) {
        this.geometricObjectType = value;
    }

    public boolean isSetGeometricObjectType() {
        return (this.geometricObjectType!= null);
    }

    /**
     * Gets the value of the geometricObjectCount property.
     * 
     * @return
     *     possible object is
     *     {@link IntegerPropertyType }
     *     
     */
    public IntegerPropertyType getGeometricObjectCount() {
        return geometricObjectCount;
    }

    /**
     * Sets the value of the geometricObjectCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntegerPropertyType }
     *     
     */
    public void setGeometricObjectCount(IntegerPropertyType value) {
        this.geometricObjectCount = value;
    }

    public boolean isSetGeometricObjectCount() {
        return (this.geometricObjectCount!= null);
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
            MDGeometricObjectTypeCodePropertyType theGeometricObjectType;
            theGeometricObjectType = this.getGeometricObjectType();
            strategy.appendField(locator, this, "geometricObjectType", buffer, theGeometricObjectType, this.isSetGeometricObjectType());
        }
        {
            IntegerPropertyType theGeometricObjectCount;
            theGeometricObjectCount = this.getGeometricObjectCount();
            strategy.appendField(locator, this, "geometricObjectCount", buffer, theGeometricObjectCount, this.isSetGeometricObjectCount());
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
        final MDGeometricObjectsType that = ((MDGeometricObjectsType) object);
        {
            MDGeometricObjectTypeCodePropertyType lhsGeometricObjectType;
            lhsGeometricObjectType = this.getGeometricObjectType();
            MDGeometricObjectTypeCodePropertyType rhsGeometricObjectType;
            rhsGeometricObjectType = that.getGeometricObjectType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "geometricObjectType", lhsGeometricObjectType), LocatorUtils.property(thatLocator, "geometricObjectType", rhsGeometricObjectType), lhsGeometricObjectType, rhsGeometricObjectType, this.isSetGeometricObjectType(), that.isSetGeometricObjectType())) {
                return false;
            }
        }
        {
            IntegerPropertyType lhsGeometricObjectCount;
            lhsGeometricObjectCount = this.getGeometricObjectCount();
            IntegerPropertyType rhsGeometricObjectCount;
            rhsGeometricObjectCount = that.getGeometricObjectCount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "geometricObjectCount", lhsGeometricObjectCount), LocatorUtils.property(thatLocator, "geometricObjectCount", rhsGeometricObjectCount), lhsGeometricObjectCount, rhsGeometricObjectCount, this.isSetGeometricObjectCount(), that.isSetGeometricObjectCount())) {
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
            MDGeometricObjectTypeCodePropertyType theGeometricObjectType;
            theGeometricObjectType = this.getGeometricObjectType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "geometricObjectType", theGeometricObjectType), currentHashCode, theGeometricObjectType, this.isSetGeometricObjectType());
        }
        {
            IntegerPropertyType theGeometricObjectCount;
            theGeometricObjectCount = this.getGeometricObjectCount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "geometricObjectCount", theGeometricObjectCount), currentHashCode, theGeometricObjectCount, this.isSetGeometricObjectCount());
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
        if (draftCopy instanceof MDGeometricObjectsType) {
            final MDGeometricObjectsType copy = ((MDGeometricObjectsType) draftCopy);
            {
                Boolean geometricObjectTypeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetGeometricObjectType());
                if (geometricObjectTypeShouldBeCopiedAndSet == Boolean.TRUE) {
                    MDGeometricObjectTypeCodePropertyType sourceGeometricObjectType;
                    sourceGeometricObjectType = this.getGeometricObjectType();
                    MDGeometricObjectTypeCodePropertyType copyGeometricObjectType = ((MDGeometricObjectTypeCodePropertyType) strategy.copy(LocatorUtils.property(locator, "geometricObjectType", sourceGeometricObjectType), sourceGeometricObjectType, this.isSetGeometricObjectType()));
                    copy.setGeometricObjectType(copyGeometricObjectType);
                } else {
                    if (geometricObjectTypeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.geometricObjectType = null;
                    }
                }
            }
            {
                Boolean geometricObjectCountShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetGeometricObjectCount());
                if (geometricObjectCountShouldBeCopiedAndSet == Boolean.TRUE) {
                    IntegerPropertyType sourceGeometricObjectCount;
                    sourceGeometricObjectCount = this.getGeometricObjectCount();
                    IntegerPropertyType copyGeometricObjectCount = ((IntegerPropertyType) strategy.copy(LocatorUtils.property(locator, "geometricObjectCount", sourceGeometricObjectCount), sourceGeometricObjectCount, this.isSetGeometricObjectCount()));
                    copy.setGeometricObjectCount(copyGeometricObjectCount);
                } else {
                    if (geometricObjectCountShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.geometricObjectCount = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new MDGeometricObjectsType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy2 strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy2 strategy) {
        super.mergeFrom(leftLocator, rightLocator, left, right, strategy);
        if (right instanceof MDGeometricObjectsType) {
            final MDGeometricObjectsType target = this;
            final MDGeometricObjectsType leftObject = ((MDGeometricObjectsType) left);
            final MDGeometricObjectsType rightObject = ((MDGeometricObjectsType) right);
            {
                Boolean geometricObjectTypeShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, leftObject.isSetGeometricObjectType(), rightObject.isSetGeometricObjectType());
                if (geometricObjectTypeShouldBeMergedAndSet == Boolean.TRUE) {
                    MDGeometricObjectTypeCodePropertyType lhsGeometricObjectType;
                    lhsGeometricObjectType = leftObject.getGeometricObjectType();
                    MDGeometricObjectTypeCodePropertyType rhsGeometricObjectType;
                    rhsGeometricObjectType = rightObject.getGeometricObjectType();
                    MDGeometricObjectTypeCodePropertyType mergedGeometricObjectType = ((MDGeometricObjectTypeCodePropertyType) strategy.merge(LocatorUtils.property(leftLocator, "geometricObjectType", lhsGeometricObjectType), LocatorUtils.property(rightLocator, "geometricObjectType", rhsGeometricObjectType), lhsGeometricObjectType, rhsGeometricObjectType, leftObject.isSetGeometricObjectType(), rightObject.isSetGeometricObjectType()));
                    target.setGeometricObjectType(mergedGeometricObjectType);
                } else {
                    if (geometricObjectTypeShouldBeMergedAndSet == Boolean.FALSE) {
                        target.geometricObjectType = null;
                    }
                }
            }
            {
                Boolean geometricObjectCountShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, leftObject.isSetGeometricObjectCount(), rightObject.isSetGeometricObjectCount());
                if (geometricObjectCountShouldBeMergedAndSet == Boolean.TRUE) {
                    IntegerPropertyType lhsGeometricObjectCount;
                    lhsGeometricObjectCount = leftObject.getGeometricObjectCount();
                    IntegerPropertyType rhsGeometricObjectCount;
                    rhsGeometricObjectCount = rightObject.getGeometricObjectCount();
                    IntegerPropertyType mergedGeometricObjectCount = ((IntegerPropertyType) strategy.merge(LocatorUtils.property(leftLocator, "geometricObjectCount", lhsGeometricObjectCount), LocatorUtils.property(rightLocator, "geometricObjectCount", rhsGeometricObjectCount), lhsGeometricObjectCount, rhsGeometricObjectCount, leftObject.isSetGeometricObjectCount(), rightObject.isSetGeometricObjectCount()));
                    target.setGeometricObjectCount(mergedGeometricObjectCount);
                } else {
                    if (geometricObjectCountShouldBeMergedAndSet == Boolean.FALSE) {
                        target.geometricObjectCount = null;
                    }
                }
            }
        }
    }

}
