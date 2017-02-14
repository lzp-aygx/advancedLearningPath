
package com.leemanpaper.schema.common.leemancommon.v001;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>ContainerQtyType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ContainerQtyType"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;int"&gt;
 *       &lt;attribute name="Size" use="required" type="{http://www.leemanpaper.com/schema/common/LeeManCommon/v001}ContainerSizeType" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContainerQtyType", propOrder = {
    "value"
})
public class ContainerQtyType {

    @XmlValue
    protected int value;
    @XmlAttribute(name = "Size", required = true)
    protected String size;

    /**
     * 获取value属性的值。
     * 
     */
    public int getValue() {
        return value;
    }

    /**
     * 设置value属性的值。
     * 
     */
    public void setValue(int value) {
        this.value = value;
    }

    /**
     * 获取size属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSize() {
        return size;
    }

    /**
     * 设置size属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSize(String value) {
        this.size = value;
    }

}
