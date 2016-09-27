//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.07.27 at 04:06:37 PM EDT 
//


package org.isotc211._2005.gmd;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.isotc211._2005.gco.AbstractObjectType;
import org.isotc211._2005.gco.CharacterStringPropertyType;
import org.isotc211._2005.gco.RealPropertyType;
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
 * Technical means and media by which a dataset is obtained from the distributor
 * 
 * <p>Java class for MD_DigitalTransferOptions_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MD_DigitalTransferOptions_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.isotc211.org/2005/gco}AbstractObject_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="unitsOfDistribution" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" minOccurs="0"/&gt;
 *         &lt;element name="transferSize" type="{http://www.isotc211.org/2005/gco}Real_PropertyType" minOccurs="0"/&gt;
 *         &lt;element name="onLine" type="{http://www.isotc211.org/2005/gmd}CI_OnlineResource_PropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="offLine" type="{http://www.isotc211.org/2005/gmd}MD_Medium_PropertyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MD_DigitalTransferOptions_Type", propOrder = {
    "unitsOfDistribution",
    "transferSize",
    "onLine",
    "offLine"
})
public class MDDigitalTransferOptionsType
    extends AbstractObjectType
    implements Serializable, Cloneable, CopyTo2, Equals2, HashCode2, MergeFrom2, ToString2
{

    private final static long serialVersionUID = 1L;
    @Valid
    protected CharacterStringPropertyType unitsOfDistribution;
    @Valid
    protected RealPropertyType transferSize;
    @Valid
    protected List<CIOnlineResourcePropertyType> onLine;
    @Valid
    protected MDMediumPropertyType offLine;

    /**
     * Gets the value of the unitsOfDistribution property.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getUnitsOfDistribution() {
        return unitsOfDistribution;
    }

    /**
     * Sets the value of the unitsOfDistribution property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setUnitsOfDistribution(CharacterStringPropertyType value) {
        this.unitsOfDistribution = value;
    }

    public boolean isSetUnitsOfDistribution() {
        return (this.unitsOfDistribution!= null);
    }

    /**
     * Gets the value of the transferSize property.
     * 
     * @return
     *     possible object is
     *     {@link RealPropertyType }
     *     
     */
    public RealPropertyType getTransferSize() {
        return transferSize;
    }

    /**
     * Sets the value of the transferSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link RealPropertyType }
     *     
     */
    public void setTransferSize(RealPropertyType value) {
        this.transferSize = value;
    }

    public boolean isSetTransferSize() {
        return (this.transferSize!= null);
    }

    /**
     * Gets the value of the onLine property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the onLine property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOnLine().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CIOnlineResourcePropertyType }
     * 
     * 
     */
    public List<CIOnlineResourcePropertyType> getOnLine() {
        if (onLine == null) {
            onLine = new ArrayList<CIOnlineResourcePropertyType>();
        }
        return this.onLine;
    }

    public boolean isSetOnLine() {
        return ((this.onLine!= null)&&(!this.onLine.isEmpty()));
    }

    public void unsetOnLine() {
        this.onLine = null;
    }

    /**
     * Gets the value of the offLine property.
     * 
     * @return
     *     possible object is
     *     {@link MDMediumPropertyType }
     *     
     */
    public MDMediumPropertyType getOffLine() {
        return offLine;
    }

    /**
     * Sets the value of the offLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link MDMediumPropertyType }
     *     
     */
    public void setOffLine(MDMediumPropertyType value) {
        this.offLine = value;
    }

    public boolean isSetOffLine() {
        return (this.offLine!= null);
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
            CharacterStringPropertyType theUnitsOfDistribution;
            theUnitsOfDistribution = this.getUnitsOfDistribution();
            strategy.appendField(locator, this, "unitsOfDistribution", buffer, theUnitsOfDistribution, this.isSetUnitsOfDistribution());
        }
        {
            RealPropertyType theTransferSize;
            theTransferSize = this.getTransferSize();
            strategy.appendField(locator, this, "transferSize", buffer, theTransferSize, this.isSetTransferSize());
        }
        {
            List<CIOnlineResourcePropertyType> theOnLine;
            theOnLine = (this.isSetOnLine()?this.getOnLine():null);
            strategy.appendField(locator, this, "onLine", buffer, theOnLine, this.isSetOnLine());
        }
        {
            MDMediumPropertyType theOffLine;
            theOffLine = this.getOffLine();
            strategy.appendField(locator, this, "offLine", buffer, theOffLine, this.isSetOffLine());
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
        final MDDigitalTransferOptionsType that = ((MDDigitalTransferOptionsType) object);
        {
            CharacterStringPropertyType lhsUnitsOfDistribution;
            lhsUnitsOfDistribution = this.getUnitsOfDistribution();
            CharacterStringPropertyType rhsUnitsOfDistribution;
            rhsUnitsOfDistribution = that.getUnitsOfDistribution();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "unitsOfDistribution", lhsUnitsOfDistribution), LocatorUtils.property(thatLocator, "unitsOfDistribution", rhsUnitsOfDistribution), lhsUnitsOfDistribution, rhsUnitsOfDistribution, this.isSetUnitsOfDistribution(), that.isSetUnitsOfDistribution())) {
                return false;
            }
        }
        {
            RealPropertyType lhsTransferSize;
            lhsTransferSize = this.getTransferSize();
            RealPropertyType rhsTransferSize;
            rhsTransferSize = that.getTransferSize();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "transferSize", lhsTransferSize), LocatorUtils.property(thatLocator, "transferSize", rhsTransferSize), lhsTransferSize, rhsTransferSize, this.isSetTransferSize(), that.isSetTransferSize())) {
                return false;
            }
        }
        {
            List<CIOnlineResourcePropertyType> lhsOnLine;
            lhsOnLine = (this.isSetOnLine()?this.getOnLine():null);
            List<CIOnlineResourcePropertyType> rhsOnLine;
            rhsOnLine = (that.isSetOnLine()?that.getOnLine():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "onLine", lhsOnLine), LocatorUtils.property(thatLocator, "onLine", rhsOnLine), lhsOnLine, rhsOnLine, this.isSetOnLine(), that.isSetOnLine())) {
                return false;
            }
        }
        {
            MDMediumPropertyType lhsOffLine;
            lhsOffLine = this.getOffLine();
            MDMediumPropertyType rhsOffLine;
            rhsOffLine = that.getOffLine();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "offLine", lhsOffLine), LocatorUtils.property(thatLocator, "offLine", rhsOffLine), lhsOffLine, rhsOffLine, this.isSetOffLine(), that.isSetOffLine())) {
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
            CharacterStringPropertyType theUnitsOfDistribution;
            theUnitsOfDistribution = this.getUnitsOfDistribution();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "unitsOfDistribution", theUnitsOfDistribution), currentHashCode, theUnitsOfDistribution, this.isSetUnitsOfDistribution());
        }
        {
            RealPropertyType theTransferSize;
            theTransferSize = this.getTransferSize();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "transferSize", theTransferSize), currentHashCode, theTransferSize, this.isSetTransferSize());
        }
        {
            List<CIOnlineResourcePropertyType> theOnLine;
            theOnLine = (this.isSetOnLine()?this.getOnLine():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "onLine", theOnLine), currentHashCode, theOnLine, this.isSetOnLine());
        }
        {
            MDMediumPropertyType theOffLine;
            theOffLine = this.getOffLine();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "offLine", theOffLine), currentHashCode, theOffLine, this.isSetOffLine());
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
        if (draftCopy instanceof MDDigitalTransferOptionsType) {
            final MDDigitalTransferOptionsType copy = ((MDDigitalTransferOptionsType) draftCopy);
            {
                Boolean unitsOfDistributionShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetUnitsOfDistribution());
                if (unitsOfDistributionShouldBeCopiedAndSet == Boolean.TRUE) {
                    CharacterStringPropertyType sourceUnitsOfDistribution;
                    sourceUnitsOfDistribution = this.getUnitsOfDistribution();
                    CharacterStringPropertyType copyUnitsOfDistribution = ((CharacterStringPropertyType) strategy.copy(LocatorUtils.property(locator, "unitsOfDistribution", sourceUnitsOfDistribution), sourceUnitsOfDistribution, this.isSetUnitsOfDistribution()));
                    copy.setUnitsOfDistribution(copyUnitsOfDistribution);
                } else {
                    if (unitsOfDistributionShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.unitsOfDistribution = null;
                    }
                }
            }
            {
                Boolean transferSizeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetTransferSize());
                if (transferSizeShouldBeCopiedAndSet == Boolean.TRUE) {
                    RealPropertyType sourceTransferSize;
                    sourceTransferSize = this.getTransferSize();
                    RealPropertyType copyTransferSize = ((RealPropertyType) strategy.copy(LocatorUtils.property(locator, "transferSize", sourceTransferSize), sourceTransferSize, this.isSetTransferSize()));
                    copy.setTransferSize(copyTransferSize);
                } else {
                    if (transferSizeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.transferSize = null;
                    }
                }
            }
            {
                Boolean onLineShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetOnLine());
                if (onLineShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<CIOnlineResourcePropertyType> sourceOnLine;
                    sourceOnLine = (this.isSetOnLine()?this.getOnLine():null);
                    @SuppressWarnings("unchecked")
                    List<CIOnlineResourcePropertyType> copyOnLine = ((List<CIOnlineResourcePropertyType> ) strategy.copy(LocatorUtils.property(locator, "onLine", sourceOnLine), sourceOnLine, this.isSetOnLine()));
                    copy.unsetOnLine();
                    if (copyOnLine!= null) {
                        List<CIOnlineResourcePropertyType> uniqueOnLinel = copy.getOnLine();
                        uniqueOnLinel.addAll(copyOnLine);
                    }
                } else {
                    if (onLineShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.unsetOnLine();
                    }
                }
            }
            {
                Boolean offLineShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetOffLine());
                if (offLineShouldBeCopiedAndSet == Boolean.TRUE) {
                    MDMediumPropertyType sourceOffLine;
                    sourceOffLine = this.getOffLine();
                    MDMediumPropertyType copyOffLine = ((MDMediumPropertyType) strategy.copy(LocatorUtils.property(locator, "offLine", sourceOffLine), sourceOffLine, this.isSetOffLine()));
                    copy.setOffLine(copyOffLine);
                } else {
                    if (offLineShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.offLine = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new MDDigitalTransferOptionsType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy2 strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy2 strategy) {
        super.mergeFrom(leftLocator, rightLocator, left, right, strategy);
        if (right instanceof MDDigitalTransferOptionsType) {
            final MDDigitalTransferOptionsType target = this;
            final MDDigitalTransferOptionsType leftObject = ((MDDigitalTransferOptionsType) left);
            final MDDigitalTransferOptionsType rightObject = ((MDDigitalTransferOptionsType) right);
            {
                Boolean unitsOfDistributionShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, leftObject.isSetUnitsOfDistribution(), rightObject.isSetUnitsOfDistribution());
                if (unitsOfDistributionShouldBeMergedAndSet == Boolean.TRUE) {
                    CharacterStringPropertyType lhsUnitsOfDistribution;
                    lhsUnitsOfDistribution = leftObject.getUnitsOfDistribution();
                    CharacterStringPropertyType rhsUnitsOfDistribution;
                    rhsUnitsOfDistribution = rightObject.getUnitsOfDistribution();
                    CharacterStringPropertyType mergedUnitsOfDistribution = ((CharacterStringPropertyType) strategy.merge(LocatorUtils.property(leftLocator, "unitsOfDistribution", lhsUnitsOfDistribution), LocatorUtils.property(rightLocator, "unitsOfDistribution", rhsUnitsOfDistribution), lhsUnitsOfDistribution, rhsUnitsOfDistribution, leftObject.isSetUnitsOfDistribution(), rightObject.isSetUnitsOfDistribution()));
                    target.setUnitsOfDistribution(mergedUnitsOfDistribution);
                } else {
                    if (unitsOfDistributionShouldBeMergedAndSet == Boolean.FALSE) {
                        target.unitsOfDistribution = null;
                    }
                }
            }
            {
                Boolean transferSizeShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, leftObject.isSetTransferSize(), rightObject.isSetTransferSize());
                if (transferSizeShouldBeMergedAndSet == Boolean.TRUE) {
                    RealPropertyType lhsTransferSize;
                    lhsTransferSize = leftObject.getTransferSize();
                    RealPropertyType rhsTransferSize;
                    rhsTransferSize = rightObject.getTransferSize();
                    RealPropertyType mergedTransferSize = ((RealPropertyType) strategy.merge(LocatorUtils.property(leftLocator, "transferSize", lhsTransferSize), LocatorUtils.property(rightLocator, "transferSize", rhsTransferSize), lhsTransferSize, rhsTransferSize, leftObject.isSetTransferSize(), rightObject.isSetTransferSize()));
                    target.setTransferSize(mergedTransferSize);
                } else {
                    if (transferSizeShouldBeMergedAndSet == Boolean.FALSE) {
                        target.transferSize = null;
                    }
                }
            }
            {
                Boolean onLineShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, leftObject.isSetOnLine(), rightObject.isSetOnLine());
                if (onLineShouldBeMergedAndSet == Boolean.TRUE) {
                    List<CIOnlineResourcePropertyType> lhsOnLine;
                    lhsOnLine = (leftObject.isSetOnLine()?leftObject.getOnLine():null);
                    List<CIOnlineResourcePropertyType> rhsOnLine;
                    rhsOnLine = (rightObject.isSetOnLine()?rightObject.getOnLine():null);
                    List<CIOnlineResourcePropertyType> mergedOnLine = ((List<CIOnlineResourcePropertyType> ) strategy.merge(LocatorUtils.property(leftLocator, "onLine", lhsOnLine), LocatorUtils.property(rightLocator, "onLine", rhsOnLine), lhsOnLine, rhsOnLine, leftObject.isSetOnLine(), rightObject.isSetOnLine()));
                    target.unsetOnLine();
                    if (mergedOnLine!= null) {
                        List<CIOnlineResourcePropertyType> uniqueOnLinel = target.getOnLine();
                        uniqueOnLinel.addAll(mergedOnLine);
                    }
                } else {
                    if (onLineShouldBeMergedAndSet == Boolean.FALSE) {
                        target.unsetOnLine();
                    }
                }
            }
            {
                Boolean offLineShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, leftObject.isSetOffLine(), rightObject.isSetOffLine());
                if (offLineShouldBeMergedAndSet == Boolean.TRUE) {
                    MDMediumPropertyType lhsOffLine;
                    lhsOffLine = leftObject.getOffLine();
                    MDMediumPropertyType rhsOffLine;
                    rhsOffLine = rightObject.getOffLine();
                    MDMediumPropertyType mergedOffLine = ((MDMediumPropertyType) strategy.merge(LocatorUtils.property(leftLocator, "offLine", lhsOffLine), LocatorUtils.property(rightLocator, "offLine", rhsOffLine), lhsOffLine, rhsOffLine, leftObject.isSetOffLine(), rightObject.isSetOffLine()));
                    target.setOffLine(mergedOffLine);
                } else {
                    if (offLineShouldBeMergedAndSet == Boolean.FALSE) {
                        target.offLine = null;
                    }
                }
            }
        }
    }

    public void setOnLine(List<CIOnlineResourcePropertyType> value) {
        this.onLine = null;
        if (value!= null) {
            List<CIOnlineResourcePropertyType> draftl = this.getOnLine();
            draftl.addAll(value);
        }
    }

}