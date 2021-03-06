//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.07.27 at 04:06:37 PM EDT 
//


package us.gov.ic.cvenum.ism.exemptfrom;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CVEnumISMExemptFromValues.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CVEnumISMExemptFromValues"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="IC_710_MANDATORY_FDR"/&gt;
 *     &lt;enumeration value="DOD_DISTRO_STATEMENT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CVEnumISMExemptFromValues", namespace = "urn:us:gov:ic:cvenum:ism:exemptfrom")
@XmlEnum
public enum CVEnumISMExemptFromValues {


    /**
     * (U) Document claims exemption from ICD-710 rules mandating the
     * 				use of Foreign Disclosure and Release markings that have been encoded in ISM.
     * 				Currently, the requirement for FDR is only mandatory for Disseminated Analytic
     * 				Product however, it is strongly encouraged otherwise.
     * 
     */
    IC_710_MANDATORY_FDR,

    /**
     * (U) Document claims exemption from the rules in DoD5230.24
     * 				requiring DoD Distribution Statements that have been encoded into
     * 				ISM.
     * 
     */
    DOD_DISTRO_STATEMENT;

    public String value() {
        return name();
    }

    public static CVEnumISMExemptFromValues fromValue(String v) {
        return valueOf(v);
    }

}
