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
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.isotc211._2005.gco.AbstractObjectType;
import org.isotc211._2005.gco.CharacterStringPropertyType;
import org.isotc211._2005.gco.DateTimePropertyType;
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
 * <p>Java class for LI_ProcessStep_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LI_ProcessStep_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.isotc211.org/2005/gco}AbstractObject_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="description" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType"/&gt;
 *         &lt;element name="rationale" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" minOccurs="0"/&gt;
 *         &lt;element name="dateTime" type="{http://www.isotc211.org/2005/gco}DateTime_PropertyType" minOccurs="0"/&gt;
 *         &lt;element name="processor" type="{http://www.isotc211.org/2005/gmd}CI_ResponsibleParty_PropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="source" type="{http://www.isotc211.org/2005/gmd}LI_Source_PropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LI_ProcessStep_Type", propOrder = {
    "description",
    "rationale",
    "dateTime",
    "processor",
    "source"
})
public class LIProcessStepType
    extends AbstractObjectType
    implements Serializable, Cloneable, CopyTo2, Equals2, HashCode2, MergeFrom2, ToString2
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    @NotNull(message = "LIProcessStepType.description {javax.validation.constraints.NotNull.message}")
    @Valid
    protected CharacterStringPropertyType description;
    @Valid
    protected CharacterStringPropertyType rationale;
    @Valid
    protected DateTimePropertyType dateTime;
    @Valid
    protected List<CIResponsiblePartyPropertyType> processor;
    @Valid
    protected List<LISourcePropertyType> source;

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setDescription(CharacterStringPropertyType value) {
        this.description = value;
    }

    public boolean isSetDescription() {
        return (this.description!= null);
    }

    /**
     * Gets the value of the rationale property.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getRationale() {
        return rationale;
    }

    /**
     * Sets the value of the rationale property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setRationale(CharacterStringPropertyType value) {
        this.rationale = value;
    }

    public boolean isSetRationale() {
        return (this.rationale!= null);
    }

    /**
     * Gets the value of the dateTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimePropertyType }
     *     
     */
    public DateTimePropertyType getDateTime() {
        return dateTime;
    }

    /**
     * Sets the value of the dateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimePropertyType }
     *     
     */
    public void setDateTime(DateTimePropertyType value) {
        this.dateTime = value;
    }

    public boolean isSetDateTime() {
        return (this.dateTime!= null);
    }

    /**
     * Gets the value of the processor property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the processor property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProcessor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CIResponsiblePartyPropertyType }
     * 
     * 
     */
    public List<CIResponsiblePartyPropertyType> getProcessor() {
        if (processor == null) {
            processor = new ArrayList<CIResponsiblePartyPropertyType>();
        }
        return this.processor;
    }

    public boolean isSetProcessor() {
        return ((this.processor!= null)&&(!this.processor.isEmpty()));
    }

    public void unsetProcessor() {
        this.processor = null;
    }

    /**
     * Gets the value of the source property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the source property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSource().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LISourcePropertyType }
     * 
     * 
     */
    public List<LISourcePropertyType> getSource() {
        if (source == null) {
            source = new ArrayList<LISourcePropertyType>();
        }
        return this.source;
    }

    public boolean isSetSource() {
        return ((this.source!= null)&&(!this.source.isEmpty()));
    }

    public void unsetSource() {
        this.source = null;
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
            CharacterStringPropertyType theDescription;
            theDescription = this.getDescription();
            strategy.appendField(locator, this, "description", buffer, theDescription, this.isSetDescription());
        }
        {
            CharacterStringPropertyType theRationale;
            theRationale = this.getRationale();
            strategy.appendField(locator, this, "rationale", buffer, theRationale, this.isSetRationale());
        }
        {
            DateTimePropertyType theDateTime;
            theDateTime = this.getDateTime();
            strategy.appendField(locator, this, "dateTime", buffer, theDateTime, this.isSetDateTime());
        }
        {
            List<CIResponsiblePartyPropertyType> theProcessor;
            theProcessor = (this.isSetProcessor()?this.getProcessor():null);
            strategy.appendField(locator, this, "processor", buffer, theProcessor, this.isSetProcessor());
        }
        {
            List<LISourcePropertyType> theSource;
            theSource = (this.isSetSource()?this.getSource():null);
            strategy.appendField(locator, this, "source", buffer, theSource, this.isSetSource());
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
        final LIProcessStepType that = ((LIProcessStepType) object);
        {
            CharacterStringPropertyType lhsDescription;
            lhsDescription = this.getDescription();
            CharacterStringPropertyType rhsDescription;
            rhsDescription = that.getDescription();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "description", lhsDescription), LocatorUtils.property(thatLocator, "description", rhsDescription), lhsDescription, rhsDescription, this.isSetDescription(), that.isSetDescription())) {
                return false;
            }
        }
        {
            CharacterStringPropertyType lhsRationale;
            lhsRationale = this.getRationale();
            CharacterStringPropertyType rhsRationale;
            rhsRationale = that.getRationale();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "rationale", lhsRationale), LocatorUtils.property(thatLocator, "rationale", rhsRationale), lhsRationale, rhsRationale, this.isSetRationale(), that.isSetRationale())) {
                return false;
            }
        }
        {
            DateTimePropertyType lhsDateTime;
            lhsDateTime = this.getDateTime();
            DateTimePropertyType rhsDateTime;
            rhsDateTime = that.getDateTime();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dateTime", lhsDateTime), LocatorUtils.property(thatLocator, "dateTime", rhsDateTime), lhsDateTime, rhsDateTime, this.isSetDateTime(), that.isSetDateTime())) {
                return false;
            }
        }
        {
            List<CIResponsiblePartyPropertyType> lhsProcessor;
            lhsProcessor = (this.isSetProcessor()?this.getProcessor():null);
            List<CIResponsiblePartyPropertyType> rhsProcessor;
            rhsProcessor = (that.isSetProcessor()?that.getProcessor():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "processor", lhsProcessor), LocatorUtils.property(thatLocator, "processor", rhsProcessor), lhsProcessor, rhsProcessor, this.isSetProcessor(), that.isSetProcessor())) {
                return false;
            }
        }
        {
            List<LISourcePropertyType> lhsSource;
            lhsSource = (this.isSetSource()?this.getSource():null);
            List<LISourcePropertyType> rhsSource;
            rhsSource = (that.isSetSource()?that.getSource():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "source", lhsSource), LocatorUtils.property(thatLocator, "source", rhsSource), lhsSource, rhsSource, this.isSetSource(), that.isSetSource())) {
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
            CharacterStringPropertyType theDescription;
            theDescription = this.getDescription();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "description", theDescription), currentHashCode, theDescription, this.isSetDescription());
        }
        {
            CharacterStringPropertyType theRationale;
            theRationale = this.getRationale();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "rationale", theRationale), currentHashCode, theRationale, this.isSetRationale());
        }
        {
            DateTimePropertyType theDateTime;
            theDateTime = this.getDateTime();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dateTime", theDateTime), currentHashCode, theDateTime, this.isSetDateTime());
        }
        {
            List<CIResponsiblePartyPropertyType> theProcessor;
            theProcessor = (this.isSetProcessor()?this.getProcessor():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "processor", theProcessor), currentHashCode, theProcessor, this.isSetProcessor());
        }
        {
            List<LISourcePropertyType> theSource;
            theSource = (this.isSetSource()?this.getSource():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "source", theSource), currentHashCode, theSource, this.isSetSource());
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
        if (draftCopy instanceof LIProcessStepType) {
            final LIProcessStepType copy = ((LIProcessStepType) draftCopy);
            {
                Boolean descriptionShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetDescription());
                if (descriptionShouldBeCopiedAndSet == Boolean.TRUE) {
                    CharacterStringPropertyType sourceDescription;
                    sourceDescription = this.getDescription();
                    CharacterStringPropertyType copyDescription = ((CharacterStringPropertyType) strategy.copy(LocatorUtils.property(locator, "description", sourceDescription), sourceDescription, this.isSetDescription()));
                    copy.setDescription(copyDescription);
                } else {
                    if (descriptionShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.description = null;
                    }
                }
            }
            {
                Boolean rationaleShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetRationale());
                if (rationaleShouldBeCopiedAndSet == Boolean.TRUE) {
                    CharacterStringPropertyType sourceRationale;
                    sourceRationale = this.getRationale();
                    CharacterStringPropertyType copyRationale = ((CharacterStringPropertyType) strategy.copy(LocatorUtils.property(locator, "rationale", sourceRationale), sourceRationale, this.isSetRationale()));
                    copy.setRationale(copyRationale);
                } else {
                    if (rationaleShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.rationale = null;
                    }
                }
            }
            {
                Boolean dateTimeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetDateTime());
                if (dateTimeShouldBeCopiedAndSet == Boolean.TRUE) {
                    DateTimePropertyType sourceDateTime;
                    sourceDateTime = this.getDateTime();
                    DateTimePropertyType copyDateTime = ((DateTimePropertyType) strategy.copy(LocatorUtils.property(locator, "dateTime", sourceDateTime), sourceDateTime, this.isSetDateTime()));
                    copy.setDateTime(copyDateTime);
                } else {
                    if (dateTimeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.dateTime = null;
                    }
                }
            }
            {
                Boolean processorShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetProcessor());
                if (processorShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<CIResponsiblePartyPropertyType> sourceProcessor;
                    sourceProcessor = (this.isSetProcessor()?this.getProcessor():null);
                    @SuppressWarnings("unchecked")
                    List<CIResponsiblePartyPropertyType> copyProcessor = ((List<CIResponsiblePartyPropertyType> ) strategy.copy(LocatorUtils.property(locator, "processor", sourceProcessor), sourceProcessor, this.isSetProcessor()));
                    copy.unsetProcessor();
                    if (copyProcessor!= null) {
                        List<CIResponsiblePartyPropertyType> uniqueProcessorl = copy.getProcessor();
                        uniqueProcessorl.addAll(copyProcessor);
                    }
                } else {
                    if (processorShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.unsetProcessor();
                    }
                }
            }
            {
                Boolean sourceShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetSource());
                if (sourceShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<LISourcePropertyType> sourceSource;
                    sourceSource = (this.isSetSource()?this.getSource():null);
                    @SuppressWarnings("unchecked")
                    List<LISourcePropertyType> copySource = ((List<LISourcePropertyType> ) strategy.copy(LocatorUtils.property(locator, "source", sourceSource), sourceSource, this.isSetSource()));
                    copy.unsetSource();
                    if (copySource!= null) {
                        List<LISourcePropertyType> uniqueSourcel = copy.getSource();
                        uniqueSourcel.addAll(copySource);
                    }
                } else {
                    if (sourceShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.unsetSource();
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new LIProcessStepType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy2 strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy2 strategy) {
        super.mergeFrom(leftLocator, rightLocator, left, right, strategy);
        if (right instanceof LIProcessStepType) {
            final LIProcessStepType target = this;
            final LIProcessStepType leftObject = ((LIProcessStepType) left);
            final LIProcessStepType rightObject = ((LIProcessStepType) right);
            {
                Boolean descriptionShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, leftObject.isSetDescription(), rightObject.isSetDescription());
                if (descriptionShouldBeMergedAndSet == Boolean.TRUE) {
                    CharacterStringPropertyType lhsDescription;
                    lhsDescription = leftObject.getDescription();
                    CharacterStringPropertyType rhsDescription;
                    rhsDescription = rightObject.getDescription();
                    CharacterStringPropertyType mergedDescription = ((CharacterStringPropertyType) strategy.merge(LocatorUtils.property(leftLocator, "description", lhsDescription), LocatorUtils.property(rightLocator, "description", rhsDescription), lhsDescription, rhsDescription, leftObject.isSetDescription(), rightObject.isSetDescription()));
                    target.setDescription(mergedDescription);
                } else {
                    if (descriptionShouldBeMergedAndSet == Boolean.FALSE) {
                        target.description = null;
                    }
                }
            }
            {
                Boolean rationaleShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, leftObject.isSetRationale(), rightObject.isSetRationale());
                if (rationaleShouldBeMergedAndSet == Boolean.TRUE) {
                    CharacterStringPropertyType lhsRationale;
                    lhsRationale = leftObject.getRationale();
                    CharacterStringPropertyType rhsRationale;
                    rhsRationale = rightObject.getRationale();
                    CharacterStringPropertyType mergedRationale = ((CharacterStringPropertyType) strategy.merge(LocatorUtils.property(leftLocator, "rationale", lhsRationale), LocatorUtils.property(rightLocator, "rationale", rhsRationale), lhsRationale, rhsRationale, leftObject.isSetRationale(), rightObject.isSetRationale()));
                    target.setRationale(mergedRationale);
                } else {
                    if (rationaleShouldBeMergedAndSet == Boolean.FALSE) {
                        target.rationale = null;
                    }
                }
            }
            {
                Boolean dateTimeShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, leftObject.isSetDateTime(), rightObject.isSetDateTime());
                if (dateTimeShouldBeMergedAndSet == Boolean.TRUE) {
                    DateTimePropertyType lhsDateTime;
                    lhsDateTime = leftObject.getDateTime();
                    DateTimePropertyType rhsDateTime;
                    rhsDateTime = rightObject.getDateTime();
                    DateTimePropertyType mergedDateTime = ((DateTimePropertyType) strategy.merge(LocatorUtils.property(leftLocator, "dateTime", lhsDateTime), LocatorUtils.property(rightLocator, "dateTime", rhsDateTime), lhsDateTime, rhsDateTime, leftObject.isSetDateTime(), rightObject.isSetDateTime()));
                    target.setDateTime(mergedDateTime);
                } else {
                    if (dateTimeShouldBeMergedAndSet == Boolean.FALSE) {
                        target.dateTime = null;
                    }
                }
            }
            {
                Boolean processorShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, leftObject.isSetProcessor(), rightObject.isSetProcessor());
                if (processorShouldBeMergedAndSet == Boolean.TRUE) {
                    List<CIResponsiblePartyPropertyType> lhsProcessor;
                    lhsProcessor = (leftObject.isSetProcessor()?leftObject.getProcessor():null);
                    List<CIResponsiblePartyPropertyType> rhsProcessor;
                    rhsProcessor = (rightObject.isSetProcessor()?rightObject.getProcessor():null);
                    List<CIResponsiblePartyPropertyType> mergedProcessor = ((List<CIResponsiblePartyPropertyType> ) strategy.merge(LocatorUtils.property(leftLocator, "processor", lhsProcessor), LocatorUtils.property(rightLocator, "processor", rhsProcessor), lhsProcessor, rhsProcessor, leftObject.isSetProcessor(), rightObject.isSetProcessor()));
                    target.unsetProcessor();
                    if (mergedProcessor!= null) {
                        List<CIResponsiblePartyPropertyType> uniqueProcessorl = target.getProcessor();
                        uniqueProcessorl.addAll(mergedProcessor);
                    }
                } else {
                    if (processorShouldBeMergedAndSet == Boolean.FALSE) {
                        target.unsetProcessor();
                    }
                }
            }
            {
                Boolean sourceShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, leftObject.isSetSource(), rightObject.isSetSource());
                if (sourceShouldBeMergedAndSet == Boolean.TRUE) {
                    List<LISourcePropertyType> lhsSource;
                    lhsSource = (leftObject.isSetSource()?leftObject.getSource():null);
                    List<LISourcePropertyType> rhsSource;
                    rhsSource = (rightObject.isSetSource()?rightObject.getSource():null);
                    List<LISourcePropertyType> mergedSource = ((List<LISourcePropertyType> ) strategy.merge(LocatorUtils.property(leftLocator, "source", lhsSource), LocatorUtils.property(rightLocator, "source", rhsSource), lhsSource, rhsSource, leftObject.isSetSource(), rightObject.isSetSource()));
                    target.unsetSource();
                    if (mergedSource!= null) {
                        List<LISourcePropertyType> uniqueSourcel = target.getSource();
                        uniqueSourcel.addAll(mergedSource);
                    }
                } else {
                    if (sourceShouldBeMergedAndSet == Boolean.FALSE) {
                        target.unsetSource();
                    }
                }
            }
        }
    }

    public void setProcessor(List<CIResponsiblePartyPropertyType> value) {
        this.processor = null;
        if (value!= null) {
            List<CIResponsiblePartyPropertyType> draftl = this.getProcessor();
            draftl.addAll(value);
        }
    }

    public void setSource(List<LISourcePropertyType> value) {
        this.source = null;
        if (value!= null) {
            List<LISourcePropertyType> draftl = this.getSource();
            draftl.addAll(value);
        }
    }

}
