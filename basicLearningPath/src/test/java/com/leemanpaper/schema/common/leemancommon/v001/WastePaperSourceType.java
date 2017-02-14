
package com.leemanpaper.schema.common.leemancommon.v001;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>WastePaperSourceType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="WastePaperSourceType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Foreign"/&gt;
 *     &lt;enumeration value="Local"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "WastePaperSourceType")
@XmlEnum
public enum WastePaperSourceType {

    @XmlEnumValue("Foreign")
    FOREIGN("Foreign"),
    @XmlEnumValue("Local")
    LOCAL("Local");
    private final String value;

    WastePaperSourceType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static WastePaperSourceType fromValue(String v) {
        for (WastePaperSourceType c: WastePaperSourceType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
