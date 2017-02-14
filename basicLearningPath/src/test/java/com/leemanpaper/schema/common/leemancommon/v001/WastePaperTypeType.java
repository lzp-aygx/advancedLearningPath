
package com.leemanpaper.schema.common.leemancommon.v001;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>WastePaperTypeType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="WastePaperTypeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="F"/&gt;
 *     &lt;enumeration value="L"/&gt;
 *     &lt;enumeration value="I"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "WastePaperTypeType")
@XmlEnum
public enum WastePaperTypeType {

    F,
    L,
    I;

    public String value() {
        return name();
    }

    public static WastePaperTypeType fromValue(String v) {
        return valueOf(v);
    }

}
