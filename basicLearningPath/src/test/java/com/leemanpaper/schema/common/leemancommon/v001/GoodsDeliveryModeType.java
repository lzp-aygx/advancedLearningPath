
package com.leemanpaper.schema.common.leemancommon.v001;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>GoodsDeliveryModeType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="GoodsDeliveryModeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="SelfPickUp"/&gt;
 *     &lt;enumeration value="Delivered"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "GoodsDeliveryModeType")
@XmlEnum
public enum GoodsDeliveryModeType {

    @XmlEnumValue("SelfPickUp")
    SELF_PICK_UP("SelfPickUp"),
    @XmlEnumValue("Delivered")
    DELIVERED("Delivered");
    private final String value;

    GoodsDeliveryModeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GoodsDeliveryModeType fromValue(String v) {
        for (GoodsDeliveryModeType c: GoodsDeliveryModeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
