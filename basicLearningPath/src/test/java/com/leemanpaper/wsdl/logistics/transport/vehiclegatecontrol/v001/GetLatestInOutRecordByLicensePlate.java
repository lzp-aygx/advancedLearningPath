
package com.leemanpaper.wsdl.logistics.transport.vehiclegatecontrol.v001;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.leemanpaper.schema.common.leemancommon.v001.PurposesType;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OrganizationID" type="{http://www.leemanpaper.com/schema/common/LeeManCommon/v001}OrganizationIDType"/&gt;
 *         &lt;element name="VehicleLicensePlate" type="{http://www.leemanpaper.com/schema/common/LeeManCommon/v001}VehicleLicensePlateType"/&gt;
 *         &lt;element name="Purposes" type="{http://www.leemanpaper.com/schema/common/LeeManCommon/v001}PurposesType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "organizationID",
    "vehicleLicensePlate",
    "purposes"
})
@XmlRootElement(name = "GetLatestInOutRecordByLicensePlate")
public class GetLatestInOutRecordByLicensePlate {

    @XmlElement(name = "OrganizationID", required = true)
    protected String organizationID;
    @XmlElement(name = "VehicleLicensePlate", required = true)
    protected String vehicleLicensePlate;
    @XmlElement(name = "Purposes", required = true)
    protected PurposesType purposes;

    /**
     * 获取organizationID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganizationID() {
        return organizationID;
    }

    /**
     * 设置organizationID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganizationID(String value) {
        this.organizationID = value;
    }

    /**
     * 获取vehicleLicensePlate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehicleLicensePlate() {
        return vehicleLicensePlate;
    }

    /**
     * 设置vehicleLicensePlate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehicleLicensePlate(String value) {
        this.vehicleLicensePlate = value;
    }

    /**
     * 获取purposes属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PurposesType }
     *     
     */
    public PurposesType getPurposes() {
        return purposes;
    }

    /**
     * 设置purposes属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PurposesType }
     *     
     */
    public void setPurposes(PurposesType value) {
        this.purposes = value;
    }

}
