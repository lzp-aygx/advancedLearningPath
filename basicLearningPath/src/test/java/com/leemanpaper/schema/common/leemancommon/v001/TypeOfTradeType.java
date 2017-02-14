
package com.leemanpaper.schema.common.leemancommon.v001;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>TypeOfTradeType�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * һ���Q��
     * 
     */
    @XmlEnumValue("OrdinaryTrade")
    ORDINARY_TRADE("OrdinaryTrade"),

    /**
     * �ӹ��Q��
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
