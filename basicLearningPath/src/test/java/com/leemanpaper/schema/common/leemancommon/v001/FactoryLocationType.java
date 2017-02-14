
package com.leemanpaper.schema.common.leemancommon.v001;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>FactoryLocationType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="FactoryLocationType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="GuangDong"/&gt;
 *     &lt;enumeration value="DongGuan"/&gt;
 *     &lt;enumeration value="ChongQing"/&gt;
 *     &lt;enumeration value="JiangSu"/&gt;
 *     &lt;enumeration value="JiangXi"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FactoryLocationType")
@XmlEnum
public enum FactoryLocationType {

    @XmlEnumValue("GuangDong")
    GUANG_DONG("GuangDong"),
    @XmlEnumValue("DongGuan")
    DONG_GUAN("DongGuan"),
    @XmlEnumValue("ChongQing")
    CHONG_QING("ChongQing"),
    @XmlEnumValue("JiangSu")
    JIANG_SU("JiangSu"),
    @XmlEnumValue("JiangXi")
    JIANG_XI("JiangXi");
    private final String value;

    FactoryLocationType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FactoryLocationType fromValue(String v) {
        for (FactoryLocationType c: FactoryLocationType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
