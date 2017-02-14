
package com.leemanpaper.schema.common.leemancommon.v001;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>EventActionType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="EventActionType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Create"/&gt;
 *     &lt;enumeration value="Update"/&gt;
 *     &lt;enumeration value="Delete"/&gt;
 *     &lt;enumeration value="Invalidate"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EventActionType")
@XmlEnum
public enum EventActionType {

    @XmlEnumValue("Create")
    CREATE("Create"),
    @XmlEnumValue("Update")
    UPDATE("Update"),
    @XmlEnumValue("Delete")
    DELETE("Delete"),
    @XmlEnumValue("Invalidate")
    INVALIDATE("Invalidate");
    private final String value;

    EventActionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EventActionType fromValue(String v) {
        for (EventActionType c: EventActionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
