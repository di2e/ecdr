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
 * Information about the vector spatial objects in the dataset
 * 
 * <p>Java class for MD_VectorSpatialRepresentation_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MD_VectorSpatialRepresentation_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.isotc211.org/2005/gmd}AbstractMD_SpatialRepresentation_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="topologyLevel" type="{http://www.isotc211.org/2005/gmd}MD_TopologyLevelCode_PropertyType" minOccurs="0"/&gt;
 *         &lt;element name="geometricObjects" type="{http://www.isotc211.org/2005/gmd}MD_GeometricObjects_PropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MD_VectorSpatialRepresentation_Type", propOrder = {
    "topologyLevel",
    "geometricObjects"
})
public class MDVectorSpatialRepresentationType
    extends AbstractMDSpatialRepresentationType
    implements Serializable, Cloneable, CopyTo2, Equals2, HashCode2, MergeFrom2, ToString2
{

    private final static long serialVersionUID = 1L;
    @Valid
    protected MDTopologyLevelCodePropertyType topologyLevel;
    @Valid
    protected List<MDGeometricObjectsPropertyType> geometricObjects;

    /**
     * Gets the value of the topologyLevel property.
     * 
     * @return
     *     possible object is
     *     {@link MDTopologyLevelCodePropertyType }
     *     
     */
    public MDTopologyLevelCodePropertyType getTopologyLevel() {
        return topologyLevel;
    }

    /**
     * Sets the value of the topologyLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link MDTopologyLevelCodePropertyType }
     *     
     */
    public void setTopologyLevel(MDTopologyLevelCodePropertyType value) {
        this.topologyLevel = value;
    }

    public boolean isSetTopologyLevel() {
        return (this.topologyLevel!= null);
    }

    /**
     * Gets the value of the geometricObjects property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the geometricObjects property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGeometricObjects().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MDGeometricObjectsPropertyType }
     * 
     * 
     */
    public List<MDGeometricObjectsPropertyType> getGeometricObjects() {
        if (geometricObjects == null) {
            geometricObjects = new ArrayList<MDGeometricObjectsPropertyType>();
        }
        return this.geometricObjects;
    }

    public boolean isSetGeometricObjects() {
        return ((this.geometricObjects!= null)&&(!this.geometricObjects.isEmpty()));
    }

    public void unsetGeometricObjects() {
        this.geometricObjects = null;
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
            MDTopologyLevelCodePropertyType theTopologyLevel;
            theTopologyLevel = this.getTopologyLevel();
            strategy.appendField(locator, this, "topologyLevel", buffer, theTopologyLevel, this.isSetTopologyLevel());
        }
        {
            List<MDGeometricObjectsPropertyType> theGeometricObjects;
            theGeometricObjects = (this.isSetGeometricObjects()?this.getGeometricObjects():null);
            strategy.appendField(locator, this, "geometricObjects", buffer, theGeometricObjects, this.isSetGeometricObjects());
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
        final MDVectorSpatialRepresentationType that = ((MDVectorSpatialRepresentationType) object);
        {
            MDTopologyLevelCodePropertyType lhsTopologyLevel;
            lhsTopologyLevel = this.getTopologyLevel();
            MDTopologyLevelCodePropertyType rhsTopologyLevel;
            rhsTopologyLevel = that.getTopologyLevel();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "topologyLevel", lhsTopologyLevel), LocatorUtils.property(thatLocator, "topologyLevel", rhsTopologyLevel), lhsTopologyLevel, rhsTopologyLevel, this.isSetTopologyLevel(), that.isSetTopologyLevel())) {
                return false;
            }
        }
        {
            List<MDGeometricObjectsPropertyType> lhsGeometricObjects;
            lhsGeometricObjects = (this.isSetGeometricObjects()?this.getGeometricObjects():null);
            List<MDGeometricObjectsPropertyType> rhsGeometricObjects;
            rhsGeometricObjects = (that.isSetGeometricObjects()?that.getGeometricObjects():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "geometricObjects", lhsGeometricObjects), LocatorUtils.property(thatLocator, "geometricObjects", rhsGeometricObjects), lhsGeometricObjects, rhsGeometricObjects, this.isSetGeometricObjects(), that.isSetGeometricObjects())) {
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
            MDTopologyLevelCodePropertyType theTopologyLevel;
            theTopologyLevel = this.getTopologyLevel();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "topologyLevel", theTopologyLevel), currentHashCode, theTopologyLevel, this.isSetTopologyLevel());
        }
        {
            List<MDGeometricObjectsPropertyType> theGeometricObjects;
            theGeometricObjects = (this.isSetGeometricObjects()?this.getGeometricObjects():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "geometricObjects", theGeometricObjects), currentHashCode, theGeometricObjects, this.isSetGeometricObjects());
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
        if (draftCopy instanceof MDVectorSpatialRepresentationType) {
            final MDVectorSpatialRepresentationType copy = ((MDVectorSpatialRepresentationType) draftCopy);
            {
                Boolean topologyLevelShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetTopologyLevel());
                if (topologyLevelShouldBeCopiedAndSet == Boolean.TRUE) {
                    MDTopologyLevelCodePropertyType sourceTopologyLevel;
                    sourceTopologyLevel = this.getTopologyLevel();
                    MDTopologyLevelCodePropertyType copyTopologyLevel = ((MDTopologyLevelCodePropertyType) strategy.copy(LocatorUtils.property(locator, "topologyLevel", sourceTopologyLevel), sourceTopologyLevel, this.isSetTopologyLevel()));
                    copy.setTopologyLevel(copyTopologyLevel);
                } else {
                    if (topologyLevelShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.topologyLevel = null;
                    }
                }
            }
            {
                Boolean geometricObjectsShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetGeometricObjects());
                if (geometricObjectsShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<MDGeometricObjectsPropertyType> sourceGeometricObjects;
                    sourceGeometricObjects = (this.isSetGeometricObjects()?this.getGeometricObjects():null);
                    @SuppressWarnings("unchecked")
                    List<MDGeometricObjectsPropertyType> copyGeometricObjects = ((List<MDGeometricObjectsPropertyType> ) strategy.copy(LocatorUtils.property(locator, "geometricObjects", sourceGeometricObjects), sourceGeometricObjects, this.isSetGeometricObjects()));
                    copy.unsetGeometricObjects();
                    if (copyGeometricObjects!= null) {
                        List<MDGeometricObjectsPropertyType> uniqueGeometricObjectsl = copy.getGeometricObjects();
                        uniqueGeometricObjectsl.addAll(copyGeometricObjects);
                    }
                } else {
                    if (geometricObjectsShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.unsetGeometricObjects();
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new MDVectorSpatialRepresentationType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy2 strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy2 strategy) {
        super.mergeFrom(leftLocator, rightLocator, left, right, strategy);
        if (right instanceof MDVectorSpatialRepresentationType) {
            final MDVectorSpatialRepresentationType target = this;
            final MDVectorSpatialRepresentationType leftObject = ((MDVectorSpatialRepresentationType) left);
            final MDVectorSpatialRepresentationType rightObject = ((MDVectorSpatialRepresentationType) right);
            {
                Boolean topologyLevelShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, leftObject.isSetTopologyLevel(), rightObject.isSetTopologyLevel());
                if (topologyLevelShouldBeMergedAndSet == Boolean.TRUE) {
                    MDTopologyLevelCodePropertyType lhsTopologyLevel;
                    lhsTopologyLevel = leftObject.getTopologyLevel();
                    MDTopologyLevelCodePropertyType rhsTopologyLevel;
                    rhsTopologyLevel = rightObject.getTopologyLevel();
                    MDTopologyLevelCodePropertyType mergedTopologyLevel = ((MDTopologyLevelCodePropertyType) strategy.merge(LocatorUtils.property(leftLocator, "topologyLevel", lhsTopologyLevel), LocatorUtils.property(rightLocator, "topologyLevel", rhsTopologyLevel), lhsTopologyLevel, rhsTopologyLevel, leftObject.isSetTopologyLevel(), rightObject.isSetTopologyLevel()));
                    target.setTopologyLevel(mergedTopologyLevel);
                } else {
                    if (topologyLevelShouldBeMergedAndSet == Boolean.FALSE) {
                        target.topologyLevel = null;
                    }
                }
            }
            {
                Boolean geometricObjectsShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, leftObject.isSetGeometricObjects(), rightObject.isSetGeometricObjects());
                if (geometricObjectsShouldBeMergedAndSet == Boolean.TRUE) {
                    List<MDGeometricObjectsPropertyType> lhsGeometricObjects;
                    lhsGeometricObjects = (leftObject.isSetGeometricObjects()?leftObject.getGeometricObjects():null);
                    List<MDGeometricObjectsPropertyType> rhsGeometricObjects;
                    rhsGeometricObjects = (rightObject.isSetGeometricObjects()?rightObject.getGeometricObjects():null);
                    List<MDGeometricObjectsPropertyType> mergedGeometricObjects = ((List<MDGeometricObjectsPropertyType> ) strategy.merge(LocatorUtils.property(leftLocator, "geometricObjects", lhsGeometricObjects), LocatorUtils.property(rightLocator, "geometricObjects", rhsGeometricObjects), lhsGeometricObjects, rhsGeometricObjects, leftObject.isSetGeometricObjects(), rightObject.isSetGeometricObjects()));
                    target.unsetGeometricObjects();
                    if (mergedGeometricObjects!= null) {
                        List<MDGeometricObjectsPropertyType> uniqueGeometricObjectsl = target.getGeometricObjects();
                        uniqueGeometricObjectsl.addAll(mergedGeometricObjects);
                    }
                } else {
                    if (geometricObjectsShouldBeMergedAndSet == Boolean.FALSE) {
                        target.unsetGeometricObjects();
                    }
                }
            }
        }
    }

    public void setGeometricObjects(List<MDGeometricObjectsPropertyType> value) {
        this.geometricObjects = null;
        if (value!= null) {
            List<MDGeometricObjectsPropertyType> draftl = this.getGeometricObjects();
            draftl.addAll(value);
        }
    }

}