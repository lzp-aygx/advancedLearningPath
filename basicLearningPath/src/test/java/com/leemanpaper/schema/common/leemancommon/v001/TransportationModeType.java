
package com.leemanpaper.schema.common.leemancommon.v001;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>TransportationModeType�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p>
 * <pre>
 * &lt;simpleType name="TransportationModeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Sea"/&gt;
 *     &lt;enumeration value="Land"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TransportationModeType")
@XmlEnum
public enum TransportationModeType {

    @XmlEnumValue("Sea")
    SEA("Sea"),
    @XmlEnumValue("Land")
    LAND("Land");
    private final String value;

    TransportationModeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TransportationModeType fromValue(String v) {
        for (TransportationModeType c: TransportationModeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
