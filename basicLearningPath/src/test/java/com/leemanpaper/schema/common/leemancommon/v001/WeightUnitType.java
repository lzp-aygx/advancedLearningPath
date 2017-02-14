
package com.leemanpaper.schema.common.leemancommon.v001;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>WeightUnitType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="WeightUnitType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="kg"/&gt;
 *     &lt;enumeration value="g"/&gt;
 *     &lt;enumeration value="mg"/&gt;
 *     &lt;enumeration value="lb"/&gt;
 *     &lt;enumeration value="mt"/&gt;
 *     &lt;enumeration value="t"/&gt;
 *     &lt;enumeration value="oz"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "WeightUnitType")
@XmlEnum
public enum WeightUnitType {

    @XmlEnumValue("kg")
    KG("kg"),
    @XmlEnumValue("g")
    G("g"),
    @XmlEnumValue("mg")
    MG("mg"),
    @XmlEnumValue("lb")
    LB("lb"),
    @XmlEnumValue("mt")
    MT("mt"),
    @XmlEnumValue("t")
    T("t"),
    @XmlEnumValue("oz")
    OZ("oz");
    private final String value;

    WeightUnitType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static WeightUnitType fromValue(String v) {
        for (WeightUnitType c: WeightUnitType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
