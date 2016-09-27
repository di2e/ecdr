//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.07.27 at 04:06:37 PM EDT 
//


package mil.ces.metadata.mdr.ns.gsip.tspi._2_0.core;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LongitudeHemisphereType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LongitudeHemisphereType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="east"/&gt;
 *     &lt;enumeration value="west"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LongitudeHemisphereType")
@XmlEnum
public enum LongitudeHemisphereType {


    /**
     * Eastern Hemisphere: The half of the surface of the Earth lying to the side of the 0 arc degree meridian in which direction the Earth rotates and ending at the 180 arc degree meridian. [desc] It generally contains the Eurasian, African and Australian landmasses.
     * 
     */
    @XmlEnumValue("east")
    EAST("east"),

    /**
     * Western Hemisphere: The half of the surface of the Earth lying to the side of the 0 arc degree meridian opposite to the direction in which the Earth rotates and ending at the 180 arc degree meridian. [desc] It generally contains the North American and South American landmasses.
     * 
     */
    @XmlEnumValue("west")
    WEST("west");
    private final String value;

    LongitudeHemisphereType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LongitudeHemisphereType fromValue(String v) {
        for (LongitudeHemisphereType c: LongitudeHemisphereType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}