//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.07.27 at 04:06:37 PM EDT 
//


package net.opengis.gml._3_3.ce;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.v_3_2_1.AbstractSurfaceType;
import net.opengis.gml.v_3_2_1.DirectPositionListType;
import net.opengis.gml.v_3_2_1.DirectPositionType;
import net.opengis.gml.v_3_2_1.PointPropertyType;
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
 * <p>Java class for SimpleTriangleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SimpleTriangleType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractSurfaceType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;choice maxOccurs="3" minOccurs="3"&gt;
 *             &lt;element ref="{http://www.opengis.net/gml/3.2}pos"/&gt;
 *             &lt;element ref="{http://www.opengis.net/gml/3.2}pointProperty"/&gt;
 *           &lt;/choice&gt;
 *           &lt;element ref="{http://www.opengis.net/gml/3.2}posList"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SimpleTriangleType", propOrder = {
    "posOrPointProperty",
    "posList"
})
public class SimpleTriangleType
    extends AbstractSurfaceType
    implements Serializable, Cloneable, CopyTo2, Equals2, HashCode2, MergeFrom2, ToString2
{

    private final static long serialVersionUID = 1L;
    @XmlElements({
        @XmlElement(name = "pos", namespace = "http://www.opengis.net/gml/3.2", type = DirectPositionType.class),
        @XmlElement(name = "pointProperty", namespace = "http://www.opengis.net/gml/3.2", type = PointPropertyType.class)
    })
    @Size(min = 3, max = 3)
    protected List<Object> posOrPointProperty;
    @XmlElement(namespace = "http://www.opengis.net/gml/3.2")
    @Valid
    protected DirectPositionListType posList;

    /**
     * Gets the value of the posOrPointProperty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the posOrPointProperty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPosOrPointProperty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DirectPositionType }
     * {@link PointPropertyType }
     * 
     * 
     */
    public List<Object> getPosOrPointProperty() {
        if (posOrPointProperty == null) {
            posOrPointProperty = new ArrayList<Object>();
        }
        return this.posOrPointProperty;
    }

    public boolean isSetPosOrPointProperty() {
        return ((this.posOrPointProperty!= null)&&(!this.posOrPointProperty.isEmpty()));
    }

    public void unsetPosOrPointProperty() {
        this.posOrPointProperty = null;
    }

    /**
     * Gets the value of the posList property.
     * 
     * @return
     *     possible object is
     *     {@link DirectPositionListType }
     *     
     */
    public DirectPositionListType getPosList() {
        return posList;
    }

    /**
     * Sets the value of the posList property.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectPositionListType }
     *     
     */
    public void setPosList(DirectPositionListType value) {
        this.posList = value;
    }

    public boolean isSetPosList() {
        return (this.posList!= null);
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
            List<Object> thePosOrPointProperty;
            thePosOrPointProperty = (this.isSetPosOrPointProperty()?this.getPosOrPointProperty():null);
            strategy.appendField(locator, this, "posOrPointProperty", buffer, thePosOrPointProperty, this.isSetPosOrPointProperty());
        }
        {
            DirectPositionListType thePosList;
            thePosList = this.getPosList();
            strategy.appendField(locator, this, "posList", buffer, thePosList, this.isSetPosList());
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
        final SimpleTriangleType that = ((SimpleTriangleType) object);
        {
            List<Object> lhsPosOrPointProperty;
            lhsPosOrPointProperty = (this.isSetPosOrPointProperty()?this.getPosOrPointProperty():null);
            List<Object> rhsPosOrPointProperty;
            rhsPosOrPointProperty = (that.isSetPosOrPointProperty()?that.getPosOrPointProperty():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "posOrPointProperty", lhsPosOrPointProperty), LocatorUtils.property(thatLocator, "posOrPointProperty", rhsPosOrPointProperty), lhsPosOrPointProperty, rhsPosOrPointProperty, this.isSetPosOrPointProperty(), that.isSetPosOrPointProperty())) {
                return false;
            }
        }
        {
            DirectPositionListType lhsPosList;
            lhsPosList = this.getPosList();
            DirectPositionListType rhsPosList;
            rhsPosList = that.getPosList();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "posList", lhsPosList), LocatorUtils.property(thatLocator, "posList", rhsPosList), lhsPosList, rhsPosList, this.isSetPosList(), that.isSetPosList())) {
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
            List<Object> thePosOrPointProperty;
            thePosOrPointProperty = (this.isSetPosOrPointProperty()?this.getPosOrPointProperty():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "posOrPointProperty", thePosOrPointProperty), currentHashCode, thePosOrPointProperty, this.isSetPosOrPointProperty());
        }
        {
            DirectPositionListType thePosList;
            thePosList = this.getPosList();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "posList", thePosList), currentHashCode, thePosList, this.isSetPosList());
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
        if (draftCopy instanceof SimpleTriangleType) {
            final SimpleTriangleType copy = ((SimpleTriangleType) draftCopy);
            {
                Boolean posOrPointPropertyShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetPosOrPointProperty());
                if (posOrPointPropertyShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<Object> sourcePosOrPointProperty;
                    sourcePosOrPointProperty = (this.isSetPosOrPointProperty()?this.getPosOrPointProperty():null);
                    @SuppressWarnings("unchecked")
                    List<Object> copyPosOrPointProperty = ((List<Object> ) strategy.copy(LocatorUtils.property(locator, "posOrPointProperty", sourcePosOrPointProperty), sourcePosOrPointProperty, this.isSetPosOrPointProperty()));
                    copy.unsetPosOrPointProperty();
                    if (copyPosOrPointProperty!= null) {
                        List<Object> uniquePosOrPointPropertyl = copy.getPosOrPointProperty();
                        uniquePosOrPointPropertyl.addAll(copyPosOrPointProperty);
                    }
                } else {
                    if (posOrPointPropertyShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.unsetPosOrPointProperty();
                    }
                }
            }
            {
                Boolean posListShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetPosList());
                if (posListShouldBeCopiedAndSet == Boolean.TRUE) {
                    DirectPositionListType sourcePosList;
                    sourcePosList = this.getPosList();
                    DirectPositionListType copyPosList = ((DirectPositionListType) strategy.copy(LocatorUtils.property(locator, "posList", sourcePosList), sourcePosList, this.isSetPosList()));
                    copy.setPosList(copyPosList);
                } else {
                    if (posListShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.posList = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new SimpleTriangleType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy2 strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy2 strategy) {
        super.mergeFrom(leftLocator, rightLocator, left, right, strategy);
        if (right instanceof SimpleTriangleType) {
            final SimpleTriangleType target = this;
            final SimpleTriangleType leftObject = ((SimpleTriangleType) left);
            final SimpleTriangleType rightObject = ((SimpleTriangleType) right);
            {
                Boolean posOrPointPropertyShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, leftObject.isSetPosOrPointProperty(), rightObject.isSetPosOrPointProperty());
                if (posOrPointPropertyShouldBeMergedAndSet == Boolean.TRUE) {
                    List<Object> lhsPosOrPointProperty;
                    lhsPosOrPointProperty = (leftObject.isSetPosOrPointProperty()?leftObject.getPosOrPointProperty():null);
                    List<Object> rhsPosOrPointProperty;
                    rhsPosOrPointProperty = (rightObject.isSetPosOrPointProperty()?rightObject.getPosOrPointProperty():null);
                    List<Object> mergedPosOrPointProperty = ((List<Object> ) strategy.merge(LocatorUtils.property(leftLocator, "posOrPointProperty", lhsPosOrPointProperty), LocatorUtils.property(rightLocator, "posOrPointProperty", rhsPosOrPointProperty), lhsPosOrPointProperty, rhsPosOrPointProperty, leftObject.isSetPosOrPointProperty(), rightObject.isSetPosOrPointProperty()));
                    target.unsetPosOrPointProperty();
                    if (mergedPosOrPointProperty!= null) {
                        List<Object> uniquePosOrPointPropertyl = target.getPosOrPointProperty();
                        uniquePosOrPointPropertyl.addAll(mergedPosOrPointProperty);
                    }
                } else {
                    if (posOrPointPropertyShouldBeMergedAndSet == Boolean.FALSE) {
                        target.unsetPosOrPointProperty();
                    }
                }
            }
            {
                Boolean posListShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, leftObject.isSetPosList(), rightObject.isSetPosList());
                if (posListShouldBeMergedAndSet == Boolean.TRUE) {
                    DirectPositionListType lhsPosList;
                    lhsPosList = leftObject.getPosList();
                    DirectPositionListType rhsPosList;
                    rhsPosList = rightObject.getPosList();
                    DirectPositionListType mergedPosList = ((DirectPositionListType) strategy.merge(LocatorUtils.property(leftLocator, "posList", lhsPosList), LocatorUtils.property(rightLocator, "posList", rhsPosList), lhsPosList, rhsPosList, leftObject.isSetPosList(), rightObject.isSetPosList()));
                    target.setPosList(mergedPosList);
                } else {
                    if (posListShouldBeMergedAndSet == Boolean.FALSE) {
                        target.posList = null;
                    }
                }
            }
        }
    }

    public void setPosOrPointProperty(List<Object> value) {
        this.posOrPointProperty = null;
        if (value!= null) {
            List<Object> draftl = this.getPosOrPointProperty();
            draftl.addAll(value);
        }
    }

}
