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
import org.isotc211._2005.gco.DecimalPropertyType;
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
 * Geographic area of the entire dataset referenced to WGS 84
 * 
 * <p>Java class for EX_GeographicBoundingBox_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EX_GeographicBoundingBox_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.isotc211.org/2005/gmd}AbstractEX_GeographicExtent_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="westBoundLongitude" type="{http://www.isotc211.org/2005/gco}Decimal_PropertyType"/&gt;
 *         &lt;element name="eastBoundLongitude" type="{http://www.isotc211.org/2005/gco}Decimal_PropertyType"/&gt;
 *         &lt;element name="southBoundLatitude" type="{http://www.isotc211.org/2005/gco}Decimal_PropertyType"/&gt;
 *         &lt;element name="northBoundLatitude" type="{http://www.isotc211.org/2005/gco}Decimal_PropertyType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EX_GeographicBoundingBox_Type", propOrder = {
    "westBoundLongitude",
    "eastBoundLongitude",
    "southBoundLatitude",
    "northBoundLatitude"
})
public class EXGeographicBoundingBoxType
    extends AbstractEXGeographicExtentType
    implements Serializable, Cloneable, CopyTo2, Equals2, HashCode2, MergeFrom2, ToString2
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    @NotNull(message = "EXGeographicBoundingBoxType.westBoundLongitude {javax.validation.constraints.NotNull.message}")
    @Valid
    protected DecimalPropertyType westBoundLongitude;
    @XmlElement(required = true)
    @NotNull(message = "EXGeographicBoundingBoxType.eastBoundLongitude {javax.validation.constraints.NotNull.message}")
    @Valid
    protected DecimalPropertyType eastBoundLongitude;
    @XmlElement(required = true)
    @NotNull(message = "EXGeographicBoundingBoxType.southBoundLatitude {javax.validation.constraints.NotNull.message}")
    @Valid
    protected DecimalPropertyType southBoundLatitude;
    @XmlElement(required = true)
    @NotNull(message = "EXGeographicBoundingBoxType.northBoundLatitude {javax.validation.constraints.NotNull.message}")
    @Valid
    protected DecimalPropertyType northBoundLatitude;

    /**
     * Gets the value of the westBoundLongitude property.
     * 
     * @return
     *     possible object is
     *     {@link DecimalPropertyType }
     *     
     */
    public DecimalPropertyType getWestBoundLongitude() {
        return westBoundLongitude;
    }

    /**
     * Sets the value of the westBoundLongitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link DecimalPropertyType }
     *     
     */
    public void setWestBoundLongitude(DecimalPropertyType value) {
        this.westBoundLongitude = value;
    }

    public boolean isSetWestBoundLongitude() {
        return (this.westBoundLongitude!= null);
    }

    /**
     * Gets the value of the eastBoundLongitude property.
     * 
     * @return
     *     possible object is
     *     {@link DecimalPropertyType }
     *     
     */
    public DecimalPropertyType getEastBoundLongitude() {
        return eastBoundLongitude;
    }

    /**
     * Sets the value of the eastBoundLongitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link DecimalPropertyType }
     *     
     */
    public void setEastBoundLongitude(DecimalPropertyType value) {
        this.eastBoundLongitude = value;
    }

    public boolean isSetEastBoundLongitude() {
        return (this.eastBoundLongitude!= null);
    }

    /**
     * Gets the value of the southBoundLatitude property.
     * 
     * @return
     *     possible object is
     *     {@link DecimalPropertyType }
     *     
     */
    public DecimalPropertyType getSouthBoundLatitude() {
        return southBoundLatitude;
    }

    /**
     * Sets the value of the southBoundLatitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link DecimalPropertyType }
     *     
     */
    public void setSouthBoundLatitude(DecimalPropertyType value) {
        this.southBoundLatitude = value;
    }

    public boolean isSetSouthBoundLatitude() {
        return (this.southBoundLatitude!= null);
    }

    /**
     * Gets the value of the northBoundLatitude property.
     * 
     * @return
     *     possible object is
     *     {@link DecimalPropertyType }
     *     
     */
    public DecimalPropertyType getNorthBoundLatitude() {
        return northBoundLatitude;
    }

    /**
     * Sets the value of the northBoundLatitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link DecimalPropertyType }
     *     
     */
    public void setNorthBoundLatitude(DecimalPropertyType value) {
        this.northBoundLatitude = value;
    }

    public boolean isSetNorthBoundLatitude() {
        return (this.northBoundLatitude!= null);
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
            DecimalPropertyType theWestBoundLongitude;
            theWestBoundLongitude = this.getWestBoundLongitude();
            strategy.appendField(locator, this, "westBoundLongitude", buffer, theWestBoundLongitude, this.isSetWestBoundLongitude());
        }
        {
            DecimalPropertyType theEastBoundLongitude;
            theEastBoundLongitude = this.getEastBoundLongitude();
            strategy.appendField(locator, this, "eastBoundLongitude", buffer, theEastBoundLongitude, this.isSetEastBoundLongitude());
        }
        {
            DecimalPropertyType theSouthBoundLatitude;
            theSouthBoundLatitude = this.getSouthBoundLatitude();
            strategy.appendField(locator, this, "southBoundLatitude", buffer, theSouthBoundLatitude, this.isSetSouthBoundLatitude());
        }
        {
            DecimalPropertyType theNorthBoundLatitude;
            theNorthBoundLatitude = this.getNorthBoundLatitude();
            strategy.appendField(locator, this, "northBoundLatitude", buffer, theNorthBoundLatitude, this.isSetNorthBoundLatitude());
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
        final EXGeographicBoundingBoxType that = ((EXGeographicBoundingBoxType) object);
        {
            DecimalPropertyType lhsWestBoundLongitude;
            lhsWestBoundLongitude = this.getWestBoundLongitude();
            DecimalPropertyType rhsWestBoundLongitude;
            rhsWestBoundLongitude = that.getWestBoundLongitude();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "westBoundLongitude", lhsWestBoundLongitude), LocatorUtils.property(thatLocator, "westBoundLongitude", rhsWestBoundLongitude), lhsWestBoundLongitude, rhsWestBoundLongitude, this.isSetWestBoundLongitude(), that.isSetWestBoundLongitude())) {
                return false;
            }
        }
        {
            DecimalPropertyType lhsEastBoundLongitude;
            lhsEastBoundLongitude = this.getEastBoundLongitude();
            DecimalPropertyType rhsEastBoundLongitude;
            rhsEastBoundLongitude = that.getEastBoundLongitude();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "eastBoundLongitude", lhsEastBoundLongitude), LocatorUtils.property(thatLocator, "eastBoundLongitude", rhsEastBoundLongitude), lhsEastBoundLongitude, rhsEastBoundLongitude, this.isSetEastBoundLongitude(), that.isSetEastBoundLongitude())) {
                return false;
            }
        }
        {
            DecimalPropertyType lhsSouthBoundLatitude;
            lhsSouthBoundLatitude = this.getSouthBoundLatitude();
            DecimalPropertyType rhsSouthBoundLatitude;
            rhsSouthBoundLatitude = that.getSouthBoundLatitude();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "southBoundLatitude", lhsSouthBoundLatitude), LocatorUtils.property(thatLocator, "southBoundLatitude", rhsSouthBoundLatitude), lhsSouthBoundLatitude, rhsSouthBoundLatitude, this.isSetSouthBoundLatitude(), that.isSetSouthBoundLatitude())) {
                return false;
            }
        }
        {
            DecimalPropertyType lhsNorthBoundLatitude;
            lhsNorthBoundLatitude = this.getNorthBoundLatitude();
            DecimalPropertyType rhsNorthBoundLatitude;
            rhsNorthBoundLatitude = that.getNorthBoundLatitude();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "northBoundLatitude", lhsNorthBoundLatitude), LocatorUtils.property(thatLocator, "northBoundLatitude", rhsNorthBoundLatitude), lhsNorthBoundLatitude, rhsNorthBoundLatitude, this.isSetNorthBoundLatitude(), that.isSetNorthBoundLatitude())) {
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
            DecimalPropertyType theWestBoundLongitude;
            theWestBoundLongitude = this.getWestBoundLongitude();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "westBoundLongitude", theWestBoundLongitude), currentHashCode, theWestBoundLongitude, this.isSetWestBoundLongitude());
        }
        {
            DecimalPropertyType theEastBoundLongitude;
            theEastBoundLongitude = this.getEastBoundLongitude();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "eastBoundLongitude", theEastBoundLongitude), currentHashCode, theEastBoundLongitude, this.isSetEastBoundLongitude());
        }
        {
            DecimalPropertyType theSouthBoundLatitude;
            theSouthBoundLatitude = this.getSouthBoundLatitude();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "southBoundLatitude", theSouthBoundLatitude), currentHashCode, theSouthBoundLatitude, this.isSetSouthBoundLatitude());
        }
        {
            DecimalPropertyType theNorthBoundLatitude;
            theNorthBoundLatitude = this.getNorthBoundLatitude();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "northBoundLatitude", theNorthBoundLatitude), currentHashCode, theNorthBoundLatitude, this.isSetNorthBoundLatitude());
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
        if (draftCopy instanceof EXGeographicBoundingBoxType) {
            final EXGeographicBoundingBoxType copy = ((EXGeographicBoundingBoxType) draftCopy);
            {
                Boolean westBoundLongitudeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetWestBoundLongitude());
                if (westBoundLongitudeShouldBeCopiedAndSet == Boolean.TRUE) {
                    DecimalPropertyType sourceWestBoundLongitude;
                    sourceWestBoundLongitude = this.getWestBoundLongitude();
                    DecimalPropertyType copyWestBoundLongitude = ((DecimalPropertyType) strategy.copy(LocatorUtils.property(locator, "westBoundLongitude", sourceWestBoundLongitude), sourceWestBoundLongitude, this.isSetWestBoundLongitude()));
                    copy.setWestBoundLongitude(copyWestBoundLongitude);
                } else {
                    if (westBoundLongitudeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.westBoundLongitude = null;
                    }
                }
            }
            {
                Boolean eastBoundLongitudeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetEastBoundLongitude());
                if (eastBoundLongitudeShouldBeCopiedAndSet == Boolean.TRUE) {
                    DecimalPropertyType sourceEastBoundLongitude;
                    sourceEastBoundLongitude = this.getEastBoundLongitude();
                    DecimalPropertyType copyEastBoundLongitude = ((DecimalPropertyType) strategy.copy(LocatorUtils.property(locator, "eastBoundLongitude", sourceEastBoundLongitude), sourceEastBoundLongitude, this.isSetEastBoundLongitude()));
                    copy.setEastBoundLongitude(copyEastBoundLongitude);
                } else {
                    if (eastBoundLongitudeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.eastBoundLongitude = null;
                    }
                }
            }
            {
                Boolean southBoundLatitudeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetSouthBoundLatitude());
                if (southBoundLatitudeShouldBeCopiedAndSet == Boolean.TRUE) {
                    DecimalPropertyType sourceSouthBoundLatitude;
                    sourceSouthBoundLatitude = this.getSouthBoundLatitude();
                    DecimalPropertyType copySouthBoundLatitude = ((DecimalPropertyType) strategy.copy(LocatorUtils.property(locator, "southBoundLatitude", sourceSouthBoundLatitude), sourceSouthBoundLatitude, this.isSetSouthBoundLatitude()));
                    copy.setSouthBoundLatitude(copySouthBoundLatitude);
                } else {
                    if (southBoundLatitudeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.southBoundLatitude = null;
                    }
                }
            }
            {
                Boolean northBoundLatitudeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetNorthBoundLatitude());
                if (northBoundLatitudeShouldBeCopiedAndSet == Boolean.TRUE) {
                    DecimalPropertyType sourceNorthBoundLatitude;
                    sourceNorthBoundLatitude = this.getNorthBoundLatitude();
                    DecimalPropertyType copyNorthBoundLatitude = ((DecimalPropertyType) strategy.copy(LocatorUtils.property(locator, "northBoundLatitude", sourceNorthBoundLatitude), sourceNorthBoundLatitude, this.isSetNorthBoundLatitude()));
                    copy.setNorthBoundLatitude(copyNorthBoundLatitude);
                } else {
                    if (northBoundLatitudeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.northBoundLatitude = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new EXGeographicBoundingBoxType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy2 strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy2 strategy) {
        super.mergeFrom(leftLocator, rightLocator, left, right, strategy);
        if (right instanceof EXGeographicBoundingBoxType) {
            final EXGeographicBoundingBoxType target = this;
            final EXGeographicBoundingBoxType leftObject = ((EXGeographicBoundingBoxType) left);
            final EXGeographicBoundingBoxType rightObject = ((EXGeographicBoundingBoxType) right);
            {
                Boolean westBoundLongitudeShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, leftObject.isSetWestBoundLongitude(), rightObject.isSetWestBoundLongitude());
                if (westBoundLongitudeShouldBeMergedAndSet == Boolean.TRUE) {
                    DecimalPropertyType lhsWestBoundLongitude;
                    lhsWestBoundLongitude = leftObject.getWestBoundLongitude();
                    DecimalPropertyType rhsWestBoundLongitude;
                    rhsWestBoundLongitude = rightObject.getWestBoundLongitude();
                    DecimalPropertyType mergedWestBoundLongitude = ((DecimalPropertyType) strategy.merge(LocatorUtils.property(leftLocator, "westBoundLongitude", lhsWestBoundLongitude), LocatorUtils.property(rightLocator, "westBoundLongitude", rhsWestBoundLongitude), lhsWestBoundLongitude, rhsWestBoundLongitude, leftObject.isSetWestBoundLongitude(), rightObject.isSetWestBoundLongitude()));
                    target.setWestBoundLongitude(mergedWestBoundLongitude);
                } else {
                    if (westBoundLongitudeShouldBeMergedAndSet == Boolean.FALSE) {
                        target.westBoundLongitude = null;
                    }
                }
            }
            {
                Boolean eastBoundLongitudeShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, leftObject.isSetEastBoundLongitude(), rightObject.isSetEastBoundLongitude());
                if (eastBoundLongitudeShouldBeMergedAndSet == Boolean.TRUE) {
                    DecimalPropertyType lhsEastBoundLongitude;
                    lhsEastBoundLongitude = leftObject.getEastBoundLongitude();
                    DecimalPropertyType rhsEastBoundLongitude;
                    rhsEastBoundLongitude = rightObject.getEastBoundLongitude();
                    DecimalPropertyType mergedEastBoundLongitude = ((DecimalPropertyType) strategy.merge(LocatorUtils.property(leftLocator, "eastBoundLongitude", lhsEastBoundLongitude), LocatorUtils.property(rightLocator, "eastBoundLongitude", rhsEastBoundLongitude), lhsEastBoundLongitude, rhsEastBoundLongitude, leftObject.isSetEastBoundLongitude(), rightObject.isSetEastBoundLongitude()));
                    target.setEastBoundLongitude(mergedEastBoundLongitude);
                } else {
                    if (eastBoundLongitudeShouldBeMergedAndSet == Boolean.FALSE) {
                        target.eastBoundLongitude = null;
                    }
                }
            }
            {
                Boolean southBoundLatitudeShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, leftObject.isSetSouthBoundLatitude(), rightObject.isSetSouthBoundLatitude());
                if (southBoundLatitudeShouldBeMergedAndSet == Boolean.TRUE) {
                    DecimalPropertyType lhsSouthBoundLatitude;
                    lhsSouthBoundLatitude = leftObject.getSouthBoundLatitude();
                    DecimalPropertyType rhsSouthBoundLatitude;
                    rhsSouthBoundLatitude = rightObject.getSouthBoundLatitude();
                    DecimalPropertyType mergedSouthBoundLatitude = ((DecimalPropertyType) strategy.merge(LocatorUtils.property(leftLocator, "southBoundLatitude", lhsSouthBoundLatitude), LocatorUtils.property(rightLocator, "southBoundLatitude", rhsSouthBoundLatitude), lhsSouthBoundLatitude, rhsSouthBoundLatitude, leftObject.isSetSouthBoundLatitude(), rightObject.isSetSouthBoundLatitude()));
                    target.setSouthBoundLatitude(mergedSouthBoundLatitude);
                } else {
                    if (southBoundLatitudeShouldBeMergedAndSet == Boolean.FALSE) {
                        target.southBoundLatitude = null;
                    }
                }
            }
            {
                Boolean northBoundLatitudeShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, leftObject.isSetNorthBoundLatitude(), rightObject.isSetNorthBoundLatitude());
                if (northBoundLatitudeShouldBeMergedAndSet == Boolean.TRUE) {
                    DecimalPropertyType lhsNorthBoundLatitude;
                    lhsNorthBoundLatitude = leftObject.getNorthBoundLatitude();
                    DecimalPropertyType rhsNorthBoundLatitude;
                    rhsNorthBoundLatitude = rightObject.getNorthBoundLatitude();
                    DecimalPropertyType mergedNorthBoundLatitude = ((DecimalPropertyType) strategy.merge(LocatorUtils.property(leftLocator, "northBoundLatitude", lhsNorthBoundLatitude), LocatorUtils.property(rightLocator, "northBoundLatitude", rhsNorthBoundLatitude), lhsNorthBoundLatitude, rhsNorthBoundLatitude, leftObject.isSetNorthBoundLatitude(), rightObject.isSetNorthBoundLatitude()));
                    target.setNorthBoundLatitude(mergedNorthBoundLatitude);
                } else {
                    if (northBoundLatitudeShouldBeMergedAndSet == Boolean.FALSE) {
                        target.northBoundLatitude = null;
                    }
                }
            }
        }
    }

}
