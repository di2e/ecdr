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
import org.isotc211._2005.gco.BinaryPropertyType;
import org.isotc211._2005.gco.CharacterStringPropertyType;
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
 * Information about the application schema used to build the dataset
 * 
 * <p>Java class for MD_ApplicationSchemaInformation_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MD_ApplicationSchemaInformation_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.isotc211.org/2005/gco}AbstractObject_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="name" type="{http://www.isotc211.org/2005/gmd}CI_Citation_PropertyType"/&gt;
 *         &lt;element name="schemaLanguage" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType"/&gt;
 *         &lt;element name="constraintLanguage" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType"/&gt;
 *         &lt;element name="schemaAscii" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" minOccurs="0"/&gt;
 *         &lt;element name="graphicsFile" type="{http://www.isotc211.org/2005/gco}Binary_PropertyType" minOccurs="0"/&gt;
 *         &lt;element name="softwareDevelopmentFile" type="{http://www.isotc211.org/2005/gco}Binary_PropertyType" minOccurs="0"/&gt;
 *         &lt;element name="softwareDevelopmentFileFormat" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MD_ApplicationSchemaInformation_Type", propOrder = {
    "name",
    "schemaLanguage",
    "constraintLanguage",
    "schemaAscii",
    "graphicsFile",
    "softwareDevelopmentFile",
    "softwareDevelopmentFileFormat"
})
public class MDApplicationSchemaInformationType
    extends AbstractObjectType
    implements Serializable, Cloneable, CopyTo2, Equals2, HashCode2, MergeFrom2, ToString2
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    @NotNull(message = "MDApplicationSchemaInformationType.name {javax.validation.constraints.NotNull.message}")
    @Valid
    protected CICitationPropertyType name;
    @XmlElement(required = true)
    @NotNull(message = "MDApplicationSchemaInformationType.schemaLanguage {javax.validation.constraints.NotNull.message}")
    @Valid
    protected CharacterStringPropertyType schemaLanguage;
    @XmlElement(required = true)
    @NotNull(message = "MDApplicationSchemaInformationType.constraintLanguage {javax.validation.constraints.NotNull.message}")
    @Valid
    protected CharacterStringPropertyType constraintLanguage;
    @Valid
    protected CharacterStringPropertyType schemaAscii;
    @Valid
    protected BinaryPropertyType graphicsFile;
    @Valid
    protected BinaryPropertyType softwareDevelopmentFile;
    @Valid
    protected CharacterStringPropertyType softwareDevelopmentFileFormat;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link CICitationPropertyType }
     *     
     */
    public CICitationPropertyType getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link CICitationPropertyType }
     *     
     */
    public void setName(CICitationPropertyType value) {
        this.name = value;
    }

    public boolean isSetName() {
        return (this.name!= null);
    }

    /**
     * Gets the value of the schemaLanguage property.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getSchemaLanguage() {
        return schemaLanguage;
    }

    /**
     * Sets the value of the schemaLanguage property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setSchemaLanguage(CharacterStringPropertyType value) {
        this.schemaLanguage = value;
    }

    public boolean isSetSchemaLanguage() {
        return (this.schemaLanguage!= null);
    }

    /**
     * Gets the value of the constraintLanguage property.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getConstraintLanguage() {
        return constraintLanguage;
    }

    /**
     * Sets the value of the constraintLanguage property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setConstraintLanguage(CharacterStringPropertyType value) {
        this.constraintLanguage = value;
    }

    public boolean isSetConstraintLanguage() {
        return (this.constraintLanguage!= null);
    }

    /**
     * Gets the value of the schemaAscii property.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getSchemaAscii() {
        return schemaAscii;
    }

    /**
     * Sets the value of the schemaAscii property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setSchemaAscii(CharacterStringPropertyType value) {
        this.schemaAscii = value;
    }

    public boolean isSetSchemaAscii() {
        return (this.schemaAscii!= null);
    }

    /**
     * Gets the value of the graphicsFile property.
     * 
     * @return
     *     possible object is
     *     {@link BinaryPropertyType }
     *     
     */
    public BinaryPropertyType getGraphicsFile() {
        return graphicsFile;
    }

    /**
     * Sets the value of the graphicsFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link BinaryPropertyType }
     *     
     */
    public void setGraphicsFile(BinaryPropertyType value) {
        this.graphicsFile = value;
    }

    public boolean isSetGraphicsFile() {
        return (this.graphicsFile!= null);
    }

    /**
     * Gets the value of the softwareDevelopmentFile property.
     * 
     * @return
     *     possible object is
     *     {@link BinaryPropertyType }
     *     
     */
    public BinaryPropertyType getSoftwareDevelopmentFile() {
        return softwareDevelopmentFile;
    }

    /**
     * Sets the value of the softwareDevelopmentFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link BinaryPropertyType }
     *     
     */
    public void setSoftwareDevelopmentFile(BinaryPropertyType value) {
        this.softwareDevelopmentFile = value;
    }

    public boolean isSetSoftwareDevelopmentFile() {
        return (this.softwareDevelopmentFile!= null);
    }

    /**
     * Gets the value of the softwareDevelopmentFileFormat property.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getSoftwareDevelopmentFileFormat() {
        return softwareDevelopmentFileFormat;
    }

    /**
     * Sets the value of the softwareDevelopmentFileFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setSoftwareDevelopmentFileFormat(CharacterStringPropertyType value) {
        this.softwareDevelopmentFileFormat = value;
    }

    public boolean isSetSoftwareDevelopmentFileFormat() {
        return (this.softwareDevelopmentFileFormat!= null);
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
            CICitationPropertyType theName;
            theName = this.getName();
            strategy.appendField(locator, this, "name", buffer, theName, this.isSetName());
        }
        {
            CharacterStringPropertyType theSchemaLanguage;
            theSchemaLanguage = this.getSchemaLanguage();
            strategy.appendField(locator, this, "schemaLanguage", buffer, theSchemaLanguage, this.isSetSchemaLanguage());
        }
        {
            CharacterStringPropertyType theConstraintLanguage;
            theConstraintLanguage = this.getConstraintLanguage();
            strategy.appendField(locator, this, "constraintLanguage", buffer, theConstraintLanguage, this.isSetConstraintLanguage());
        }
        {
            CharacterStringPropertyType theSchemaAscii;
            theSchemaAscii = this.getSchemaAscii();
            strategy.appendField(locator, this, "schemaAscii", buffer, theSchemaAscii, this.isSetSchemaAscii());
        }
        {
            BinaryPropertyType theGraphicsFile;
            theGraphicsFile = this.getGraphicsFile();
            strategy.appendField(locator, this, "graphicsFile", buffer, theGraphicsFile, this.isSetGraphicsFile());
        }
        {
            BinaryPropertyType theSoftwareDevelopmentFile;
            theSoftwareDevelopmentFile = this.getSoftwareDevelopmentFile();
            strategy.appendField(locator, this, "softwareDevelopmentFile", buffer, theSoftwareDevelopmentFile, this.isSetSoftwareDevelopmentFile());
        }
        {
            CharacterStringPropertyType theSoftwareDevelopmentFileFormat;
            theSoftwareDevelopmentFileFormat = this.getSoftwareDevelopmentFileFormat();
            strategy.appendField(locator, this, "softwareDevelopmentFileFormat", buffer, theSoftwareDevelopmentFileFormat, this.isSetSoftwareDevelopmentFileFormat());
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
        final MDApplicationSchemaInformationType that = ((MDApplicationSchemaInformationType) object);
        {
            CICitationPropertyType lhsName;
            lhsName = this.getName();
            CICitationPropertyType rhsName;
            rhsName = that.getName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "name", lhsName), LocatorUtils.property(thatLocator, "name", rhsName), lhsName, rhsName, this.isSetName(), that.isSetName())) {
                return false;
            }
        }
        {
            CharacterStringPropertyType lhsSchemaLanguage;
            lhsSchemaLanguage = this.getSchemaLanguage();
            CharacterStringPropertyType rhsSchemaLanguage;
            rhsSchemaLanguage = that.getSchemaLanguage();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "schemaLanguage", lhsSchemaLanguage), LocatorUtils.property(thatLocator, "schemaLanguage", rhsSchemaLanguage), lhsSchemaLanguage, rhsSchemaLanguage, this.isSetSchemaLanguage(), that.isSetSchemaLanguage())) {
                return false;
            }
        }
        {
            CharacterStringPropertyType lhsConstraintLanguage;
            lhsConstraintLanguage = this.getConstraintLanguage();
            CharacterStringPropertyType rhsConstraintLanguage;
            rhsConstraintLanguage = that.getConstraintLanguage();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "constraintLanguage", lhsConstraintLanguage), LocatorUtils.property(thatLocator, "constraintLanguage", rhsConstraintLanguage), lhsConstraintLanguage, rhsConstraintLanguage, this.isSetConstraintLanguage(), that.isSetConstraintLanguage())) {
                return false;
            }
        }
        {
            CharacterStringPropertyType lhsSchemaAscii;
            lhsSchemaAscii = this.getSchemaAscii();
            CharacterStringPropertyType rhsSchemaAscii;
            rhsSchemaAscii = that.getSchemaAscii();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "schemaAscii", lhsSchemaAscii), LocatorUtils.property(thatLocator, "schemaAscii", rhsSchemaAscii), lhsSchemaAscii, rhsSchemaAscii, this.isSetSchemaAscii(), that.isSetSchemaAscii())) {
                return false;
            }
        }
        {
            BinaryPropertyType lhsGraphicsFile;
            lhsGraphicsFile = this.getGraphicsFile();
            BinaryPropertyType rhsGraphicsFile;
            rhsGraphicsFile = that.getGraphicsFile();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "graphicsFile", lhsGraphicsFile), LocatorUtils.property(thatLocator, "graphicsFile", rhsGraphicsFile), lhsGraphicsFile, rhsGraphicsFile, this.isSetGraphicsFile(), that.isSetGraphicsFile())) {
                return false;
            }
        }
        {
            BinaryPropertyType lhsSoftwareDevelopmentFile;
            lhsSoftwareDevelopmentFile = this.getSoftwareDevelopmentFile();
            BinaryPropertyType rhsSoftwareDevelopmentFile;
            rhsSoftwareDevelopmentFile = that.getSoftwareDevelopmentFile();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "softwareDevelopmentFile", lhsSoftwareDevelopmentFile), LocatorUtils.property(thatLocator, "softwareDevelopmentFile", rhsSoftwareDevelopmentFile), lhsSoftwareDevelopmentFile, rhsSoftwareDevelopmentFile, this.isSetSoftwareDevelopmentFile(), that.isSetSoftwareDevelopmentFile())) {
                return false;
            }
        }
        {
            CharacterStringPropertyType lhsSoftwareDevelopmentFileFormat;
            lhsSoftwareDevelopmentFileFormat = this.getSoftwareDevelopmentFileFormat();
            CharacterStringPropertyType rhsSoftwareDevelopmentFileFormat;
            rhsSoftwareDevelopmentFileFormat = that.getSoftwareDevelopmentFileFormat();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "softwareDevelopmentFileFormat", lhsSoftwareDevelopmentFileFormat), LocatorUtils.property(thatLocator, "softwareDevelopmentFileFormat", rhsSoftwareDevelopmentFileFormat), lhsSoftwareDevelopmentFileFormat, rhsSoftwareDevelopmentFileFormat, this.isSetSoftwareDevelopmentFileFormat(), that.isSetSoftwareDevelopmentFileFormat())) {
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
            CICitationPropertyType theName;
            theName = this.getName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "name", theName), currentHashCode, theName, this.isSetName());
        }
        {
            CharacterStringPropertyType theSchemaLanguage;
            theSchemaLanguage = this.getSchemaLanguage();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "schemaLanguage", theSchemaLanguage), currentHashCode, theSchemaLanguage, this.isSetSchemaLanguage());
        }
        {
            CharacterStringPropertyType theConstraintLanguage;
            theConstraintLanguage = this.getConstraintLanguage();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "constraintLanguage", theConstraintLanguage), currentHashCode, theConstraintLanguage, this.isSetConstraintLanguage());
        }
        {
            CharacterStringPropertyType theSchemaAscii;
            theSchemaAscii = this.getSchemaAscii();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "schemaAscii", theSchemaAscii), currentHashCode, theSchemaAscii, this.isSetSchemaAscii());
        }
        {
            BinaryPropertyType theGraphicsFile;
            theGraphicsFile = this.getGraphicsFile();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "graphicsFile", theGraphicsFile), currentHashCode, theGraphicsFile, this.isSetGraphicsFile());
        }
        {
            BinaryPropertyType theSoftwareDevelopmentFile;
            theSoftwareDevelopmentFile = this.getSoftwareDevelopmentFile();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "softwareDevelopmentFile", theSoftwareDevelopmentFile), currentHashCode, theSoftwareDevelopmentFile, this.isSetSoftwareDevelopmentFile());
        }
        {
            CharacterStringPropertyType theSoftwareDevelopmentFileFormat;
            theSoftwareDevelopmentFileFormat = this.getSoftwareDevelopmentFileFormat();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "softwareDevelopmentFileFormat", theSoftwareDevelopmentFileFormat), currentHashCode, theSoftwareDevelopmentFileFormat, this.isSetSoftwareDevelopmentFileFormat());
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
        if (draftCopy instanceof MDApplicationSchemaInformationType) {
            final MDApplicationSchemaInformationType copy = ((MDApplicationSchemaInformationType) draftCopy);
            {
                Boolean nameShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetName());
                if (nameShouldBeCopiedAndSet == Boolean.TRUE) {
                    CICitationPropertyType sourceName;
                    sourceName = this.getName();
                    CICitationPropertyType copyName = ((CICitationPropertyType) strategy.copy(LocatorUtils.property(locator, "name", sourceName), sourceName, this.isSetName()));
                    copy.setName(copyName);
                } else {
                    if (nameShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.name = null;
                    }
                }
            }
            {
                Boolean schemaLanguageShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetSchemaLanguage());
                if (schemaLanguageShouldBeCopiedAndSet == Boolean.TRUE) {
                    CharacterStringPropertyType sourceSchemaLanguage;
                    sourceSchemaLanguage = this.getSchemaLanguage();
                    CharacterStringPropertyType copySchemaLanguage = ((CharacterStringPropertyType) strategy.copy(LocatorUtils.property(locator, "schemaLanguage", sourceSchemaLanguage), sourceSchemaLanguage, this.isSetSchemaLanguage()));
                    copy.setSchemaLanguage(copySchemaLanguage);
                } else {
                    if (schemaLanguageShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.schemaLanguage = null;
                    }
                }
            }
            {
                Boolean constraintLanguageShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetConstraintLanguage());
                if (constraintLanguageShouldBeCopiedAndSet == Boolean.TRUE) {
                    CharacterStringPropertyType sourceConstraintLanguage;
                    sourceConstraintLanguage = this.getConstraintLanguage();
                    CharacterStringPropertyType copyConstraintLanguage = ((CharacterStringPropertyType) strategy.copy(LocatorUtils.property(locator, "constraintLanguage", sourceConstraintLanguage), sourceConstraintLanguage, this.isSetConstraintLanguage()));
                    copy.setConstraintLanguage(copyConstraintLanguage);
                } else {
                    if (constraintLanguageShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.constraintLanguage = null;
                    }
                }
            }
            {
                Boolean schemaAsciiShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetSchemaAscii());
                if (schemaAsciiShouldBeCopiedAndSet == Boolean.TRUE) {
                    CharacterStringPropertyType sourceSchemaAscii;
                    sourceSchemaAscii = this.getSchemaAscii();
                    CharacterStringPropertyType copySchemaAscii = ((CharacterStringPropertyType) strategy.copy(LocatorUtils.property(locator, "schemaAscii", sourceSchemaAscii), sourceSchemaAscii, this.isSetSchemaAscii()));
                    copy.setSchemaAscii(copySchemaAscii);
                } else {
                    if (schemaAsciiShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.schemaAscii = null;
                    }
                }
            }
            {
                Boolean graphicsFileShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetGraphicsFile());
                if (graphicsFileShouldBeCopiedAndSet == Boolean.TRUE) {
                    BinaryPropertyType sourceGraphicsFile;
                    sourceGraphicsFile = this.getGraphicsFile();
                    BinaryPropertyType copyGraphicsFile = ((BinaryPropertyType) strategy.copy(LocatorUtils.property(locator, "graphicsFile", sourceGraphicsFile), sourceGraphicsFile, this.isSetGraphicsFile()));
                    copy.setGraphicsFile(copyGraphicsFile);
                } else {
                    if (graphicsFileShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.graphicsFile = null;
                    }
                }
            }
            {
                Boolean softwareDevelopmentFileShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetSoftwareDevelopmentFile());
                if (softwareDevelopmentFileShouldBeCopiedAndSet == Boolean.TRUE) {
                    BinaryPropertyType sourceSoftwareDevelopmentFile;
                    sourceSoftwareDevelopmentFile = this.getSoftwareDevelopmentFile();
                    BinaryPropertyType copySoftwareDevelopmentFile = ((BinaryPropertyType) strategy.copy(LocatorUtils.property(locator, "softwareDevelopmentFile", sourceSoftwareDevelopmentFile), sourceSoftwareDevelopmentFile, this.isSetSoftwareDevelopmentFile()));
                    copy.setSoftwareDevelopmentFile(copySoftwareDevelopmentFile);
                } else {
                    if (softwareDevelopmentFileShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.softwareDevelopmentFile = null;
                    }
                }
            }
            {
                Boolean softwareDevelopmentFileFormatShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetSoftwareDevelopmentFileFormat());
                if (softwareDevelopmentFileFormatShouldBeCopiedAndSet == Boolean.TRUE) {
                    CharacterStringPropertyType sourceSoftwareDevelopmentFileFormat;
                    sourceSoftwareDevelopmentFileFormat = this.getSoftwareDevelopmentFileFormat();
                    CharacterStringPropertyType copySoftwareDevelopmentFileFormat = ((CharacterStringPropertyType) strategy.copy(LocatorUtils.property(locator, "softwareDevelopmentFileFormat", sourceSoftwareDevelopmentFileFormat), sourceSoftwareDevelopmentFileFormat, this.isSetSoftwareDevelopmentFileFormat()));
                    copy.setSoftwareDevelopmentFileFormat(copySoftwareDevelopmentFileFormat);
                } else {
                    if (softwareDevelopmentFileFormatShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.softwareDevelopmentFileFormat = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new MDApplicationSchemaInformationType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy2 strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy2 strategy) {
        super.mergeFrom(leftLocator, rightLocator, left, right, strategy);
        if (right instanceof MDApplicationSchemaInformationType) {
            final MDApplicationSchemaInformationType target = this;
            final MDApplicationSchemaInformationType leftObject = ((MDApplicationSchemaInformationType) left);
            final MDApplicationSchemaInformationType rightObject = ((MDApplicationSchemaInformationType) right);
            {
                Boolean nameShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, leftObject.isSetName(), rightObject.isSetName());
                if (nameShouldBeMergedAndSet == Boolean.TRUE) {
                    CICitationPropertyType lhsName;
                    lhsName = leftObject.getName();
                    CICitationPropertyType rhsName;
                    rhsName = rightObject.getName();
                    CICitationPropertyType mergedName = ((CICitationPropertyType) strategy.merge(LocatorUtils.property(leftLocator, "name", lhsName), LocatorUtils.property(rightLocator, "name", rhsName), lhsName, rhsName, leftObject.isSetName(), rightObject.isSetName()));
                    target.setName(mergedName);
                } else {
                    if (nameShouldBeMergedAndSet == Boolean.FALSE) {
                        target.name = null;
                    }
                }
            }
            {
                Boolean schemaLanguageShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, leftObject.isSetSchemaLanguage(), rightObject.isSetSchemaLanguage());
                if (schemaLanguageShouldBeMergedAndSet == Boolean.TRUE) {
                    CharacterStringPropertyType lhsSchemaLanguage;
                    lhsSchemaLanguage = leftObject.getSchemaLanguage();
                    CharacterStringPropertyType rhsSchemaLanguage;
                    rhsSchemaLanguage = rightObject.getSchemaLanguage();
                    CharacterStringPropertyType mergedSchemaLanguage = ((CharacterStringPropertyType) strategy.merge(LocatorUtils.property(leftLocator, "schemaLanguage", lhsSchemaLanguage), LocatorUtils.property(rightLocator, "schemaLanguage", rhsSchemaLanguage), lhsSchemaLanguage, rhsSchemaLanguage, leftObject.isSetSchemaLanguage(), rightObject.isSetSchemaLanguage()));
                    target.setSchemaLanguage(mergedSchemaLanguage);
                } else {
                    if (schemaLanguageShouldBeMergedAndSet == Boolean.FALSE) {
                        target.schemaLanguage = null;
                    }
                }
            }
            {
                Boolean constraintLanguageShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, leftObject.isSetConstraintLanguage(), rightObject.isSetConstraintLanguage());
                if (constraintLanguageShouldBeMergedAndSet == Boolean.TRUE) {
                    CharacterStringPropertyType lhsConstraintLanguage;
                    lhsConstraintLanguage = leftObject.getConstraintLanguage();
                    CharacterStringPropertyType rhsConstraintLanguage;
                    rhsConstraintLanguage = rightObject.getConstraintLanguage();
                    CharacterStringPropertyType mergedConstraintLanguage = ((CharacterStringPropertyType) strategy.merge(LocatorUtils.property(leftLocator, "constraintLanguage", lhsConstraintLanguage), LocatorUtils.property(rightLocator, "constraintLanguage", rhsConstraintLanguage), lhsConstraintLanguage, rhsConstraintLanguage, leftObject.isSetConstraintLanguage(), rightObject.isSetConstraintLanguage()));
                    target.setConstraintLanguage(mergedConstraintLanguage);
                } else {
                    if (constraintLanguageShouldBeMergedAndSet == Boolean.FALSE) {
                        target.constraintLanguage = null;
                    }
                }
            }
            {
                Boolean schemaAsciiShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, leftObject.isSetSchemaAscii(), rightObject.isSetSchemaAscii());
                if (schemaAsciiShouldBeMergedAndSet == Boolean.TRUE) {
                    CharacterStringPropertyType lhsSchemaAscii;
                    lhsSchemaAscii = leftObject.getSchemaAscii();
                    CharacterStringPropertyType rhsSchemaAscii;
                    rhsSchemaAscii = rightObject.getSchemaAscii();
                    CharacterStringPropertyType mergedSchemaAscii = ((CharacterStringPropertyType) strategy.merge(LocatorUtils.property(leftLocator, "schemaAscii", lhsSchemaAscii), LocatorUtils.property(rightLocator, "schemaAscii", rhsSchemaAscii), lhsSchemaAscii, rhsSchemaAscii, leftObject.isSetSchemaAscii(), rightObject.isSetSchemaAscii()));
                    target.setSchemaAscii(mergedSchemaAscii);
                } else {
                    if (schemaAsciiShouldBeMergedAndSet == Boolean.FALSE) {
                        target.schemaAscii = null;
                    }
                }
            }
            {
                Boolean graphicsFileShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, leftObject.isSetGraphicsFile(), rightObject.isSetGraphicsFile());
                if (graphicsFileShouldBeMergedAndSet == Boolean.TRUE) {
                    BinaryPropertyType lhsGraphicsFile;
                    lhsGraphicsFile = leftObject.getGraphicsFile();
                    BinaryPropertyType rhsGraphicsFile;
                    rhsGraphicsFile = rightObject.getGraphicsFile();
                    BinaryPropertyType mergedGraphicsFile = ((BinaryPropertyType) strategy.merge(LocatorUtils.property(leftLocator, "graphicsFile", lhsGraphicsFile), LocatorUtils.property(rightLocator, "graphicsFile", rhsGraphicsFile), lhsGraphicsFile, rhsGraphicsFile, leftObject.isSetGraphicsFile(), rightObject.isSetGraphicsFile()));
                    target.setGraphicsFile(mergedGraphicsFile);
                } else {
                    if (graphicsFileShouldBeMergedAndSet == Boolean.FALSE) {
                        target.graphicsFile = null;
                    }
                }
            }
            {
                Boolean softwareDevelopmentFileShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, leftObject.isSetSoftwareDevelopmentFile(), rightObject.isSetSoftwareDevelopmentFile());
                if (softwareDevelopmentFileShouldBeMergedAndSet == Boolean.TRUE) {
                    BinaryPropertyType lhsSoftwareDevelopmentFile;
                    lhsSoftwareDevelopmentFile = leftObject.getSoftwareDevelopmentFile();
                    BinaryPropertyType rhsSoftwareDevelopmentFile;
                    rhsSoftwareDevelopmentFile = rightObject.getSoftwareDevelopmentFile();
                    BinaryPropertyType mergedSoftwareDevelopmentFile = ((BinaryPropertyType) strategy.merge(LocatorUtils.property(leftLocator, "softwareDevelopmentFile", lhsSoftwareDevelopmentFile), LocatorUtils.property(rightLocator, "softwareDevelopmentFile", rhsSoftwareDevelopmentFile), lhsSoftwareDevelopmentFile, rhsSoftwareDevelopmentFile, leftObject.isSetSoftwareDevelopmentFile(), rightObject.isSetSoftwareDevelopmentFile()));
                    target.setSoftwareDevelopmentFile(mergedSoftwareDevelopmentFile);
                } else {
                    if (softwareDevelopmentFileShouldBeMergedAndSet == Boolean.FALSE) {
                        target.softwareDevelopmentFile = null;
                    }
                }
            }
            {
                Boolean softwareDevelopmentFileFormatShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, leftObject.isSetSoftwareDevelopmentFileFormat(), rightObject.isSetSoftwareDevelopmentFileFormat());
                if (softwareDevelopmentFileFormatShouldBeMergedAndSet == Boolean.TRUE) {
                    CharacterStringPropertyType lhsSoftwareDevelopmentFileFormat;
                    lhsSoftwareDevelopmentFileFormat = leftObject.getSoftwareDevelopmentFileFormat();
                    CharacterStringPropertyType rhsSoftwareDevelopmentFileFormat;
                    rhsSoftwareDevelopmentFileFormat = rightObject.getSoftwareDevelopmentFileFormat();
                    CharacterStringPropertyType mergedSoftwareDevelopmentFileFormat = ((CharacterStringPropertyType) strategy.merge(LocatorUtils.property(leftLocator, "softwareDevelopmentFileFormat", lhsSoftwareDevelopmentFileFormat), LocatorUtils.property(rightLocator, "softwareDevelopmentFileFormat", rhsSoftwareDevelopmentFileFormat), lhsSoftwareDevelopmentFileFormat, rhsSoftwareDevelopmentFileFormat, leftObject.isSetSoftwareDevelopmentFileFormat(), rightObject.isSetSoftwareDevelopmentFileFormat()));
                    target.setSoftwareDevelopmentFileFormat(mergedSoftwareDevelopmentFileFormat);
                } else {
                    if (softwareDevelopmentFileFormatShouldBeMergedAndSet == Boolean.FALSE) {
                        target.softwareDevelopmentFileFormat = null;
                    }
                }
            }
        }
    }

}