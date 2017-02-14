
package com.leemanpaper.schema.common.leemancommon.v001;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>TypeOfTradeType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="TypeOfTradeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="OrdinaryTrade"/&gt;
 *     &lt;enumeration value="ProcessingTrade"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TypeOfTradeType")
@XmlEnum
public enum TypeOfTradeType {


    /**
     * 一般貿易
     * 
     */
    @XmlEnumValue("OrdinaryTrade")
    ORDINARY_TRADE("OrdinaryTrade"),

    /**
     * 加工貿易
     * 
     */
    @XmlEnumValue("ProcessingTrade")
    PROCESSING_TRADE("ProcessingTrade");
    private final String value;

    TypeOfTradeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeOfTradeType fromValue(String v) {
        for (TypeOfTradeType c: TypeOfTradeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
