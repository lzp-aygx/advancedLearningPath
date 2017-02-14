
package com.leemanpaper.wsdl.logistics.transport.vehiclegatecontrol.v001;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.leemanpaper.schema.common.leemancommon.v001.PurposesType;


/**
 * <p>anonymous complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡorganizationID���Ե�ֵ��
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
     * ����organizationID���Ե�ֵ��
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
     * ��ȡvehicleLicensePlate���Ե�ֵ��
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
     * ����vehicleLicensePlate���Ե�ֵ��
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
     * ��ȡpurposes���Ե�ֵ��
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
     * ����purposes���Ե�ֵ��
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
