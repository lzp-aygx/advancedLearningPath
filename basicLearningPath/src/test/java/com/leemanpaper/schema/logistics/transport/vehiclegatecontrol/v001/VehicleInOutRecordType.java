
package com.leemanpaper.schema.logistics.transport.vehiclegatecontrol.v001;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>VehicleInOutRecordType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="VehicleInOutRecordType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OrganizationID" type="{http://www.leemanpaper.com/schema/common/LeeManCommon/v001}OrganizationIDType"/&gt;
 *         &lt;element name="CardID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ControlGateRecordID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DetainedCardType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GuestCardNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="InSecurityGuard" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="ExceptionAuthorization" type="{http://www.leemanpaper.com/schema/logistics/transport/VehicleGateControl/v001}ExceptionAuthorizationType" minOccurs="0"/&gt;
 *         &lt;element name="OutSecurityGuard" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OutDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="IsOutOfPremises" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ParkingLot" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VehicleLicensePlate" type="{http://www.leemanpaper.com/schema/common/LeeManCommon/v001}VehicleLicensePlateType"/&gt;
 *         &lt;element name="VehicleType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="NeedWeighing" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="entryChannelId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="entryChannelName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="exitChannelId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="exitChannelName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleInOutRecordType", propOrder = {
    "organizationID",
    "cardID",
    "controlGateRecordID",
    "detainedCardType",
    "guestCardNumber",
    "inSecurityGuard",
    "inDateTime",
    "exceptionAuthorization",
    "outSecurityGuard",
    "outDateTime",
    "isOutOfPremises",
    "parkingLot",
    "vehicleLicensePlate",
    "vehicleType",
    "needWeighing",
    "entryChannelId",
    "entryChannelName",
    "exitChannelId",
    "exitChannelName"
})
public class VehicleInOutRecordType {
    @Override
    public String toString() {
        return "VehicleInOutRecordType{" +
                "organizationID='" + organizationID + '\'' +
                ", cardID='" + cardID + '\'' +
                ", controlGateRecordID='" + controlGateRecordID + '\'' +
                ", detainedCardType='" + detainedCardType + '\'' +
                ", guestCardNumber=" + guestCardNumber +
                ", inSecurityGuard='" + inSecurityGuard + '\'' +
                ", inDateTime=" + inDateTime +
                ", exceptionAuthorization=" + exceptionAuthorization +
                ", outSecurityGuard='" + outSecurityGuard + '\'' +
                ", outDateTime=" + outDateTime +
                ", isOutOfPremises=" + isOutOfPremises +
                ", parkingLot='" + parkingLot + '\'' +
                ", vehicleLicensePlate='" + vehicleLicensePlate + '\'' +
                ", vehicleType='" + vehicleType + '\'' +
                ", needWeighing=" + needWeighing +
                ", entryChannelId='" + entryChannelId + '\'' +
                ", entryChannelName='" + entryChannelName + '\'' +
                ", exitChannelId='" + exitChannelId + '\'' +
                ", exitChannelName='" + exitChannelName + '\'' +
                '}';
    }

    @XmlElement(name = "OrganizationID", required = true)
    protected String organizationID;
    @XmlElement(name = "CardID", required = true)
    protected String cardID;
    @XmlElement(name = "ControlGateRecordID", required = true)
    protected String controlGateRecordID;
    @XmlElement(name = "DetainedCardType")
    protected String detainedCardType;
    @XmlElement(name = "GuestCardNumber")
    protected Integer guestCardNumber;
    @XmlElement(name = "InSecurityGuard")
    protected String inSecurityGuard;
    @XmlElement(name = "InDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inDateTime;
    @XmlElement(name = "ExceptionAuthorization")
    protected ExceptionAuthorizationType exceptionAuthorization;
    @XmlElement(name = "OutSecurityGuard")
    protected String outSecurityGuard;
    @XmlElement(name = "OutDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outDateTime;
    @XmlElement(name = "IsOutOfPremises")
    protected Boolean isOutOfPremises;
    @XmlElement(name = "ParkingLot")
    protected String parkingLot;
    @XmlElement(name = "VehicleLicensePlate", required = true)
    protected String vehicleLicensePlate;
    @XmlElement(name = "VehicleType", required = true)
    protected String vehicleType;
    @XmlElement(name = "NeedWeighing")
    protected boolean needWeighing;
    protected String entryChannelId;
    protected String entryChannelName;
    protected String exitChannelId;
    protected String exitChannelName;

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
     * ��ȡcardID���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardID() {
        return cardID;
    }

    /**
     * ����cardID���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardID(String value) {
        this.cardID = value;
    }

    /**
     * ��ȡcontrolGateRecordID���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getControlGateRecordID() {
        return controlGateRecordID;
    }

    /**
     * ����controlGateRecordID���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setControlGateRecordID(String value) {
        this.controlGateRecordID = value;
    }

    /**
     * ��ȡdetainedCardType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDetainedCardType() {
        return detainedCardType;
    }

    /**
     * ����detainedCardType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDetainedCardType(String value) {
        this.detainedCardType = value;
    }

    /**
     * ��ȡguestCardNumber���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGuestCardNumber() {
        return guestCardNumber;
    }

    /**
     * ����guestCardNumber���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGuestCardNumber(Integer value) {
        this.guestCardNumber = value;
    }

    /**
     * ��ȡinSecurityGuard���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSecurityGuard() {
        return inSecurityGuard;
    }

    /**
     * ����inSecurityGuard���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSecurityGuard(String value) {
        this.inSecurityGuard = value;
    }

    /**
     * ��ȡinDateTime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInDateTime() {
        return inDateTime;
    }

    /**
     * ����inDateTime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInDateTime(XMLGregorianCalendar value) {
        this.inDateTime = value;
    }

    /**
     * ��ȡexceptionAuthorization���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ExceptionAuthorizationType }
     *     
     */
    public ExceptionAuthorizationType getExceptionAuthorization() {
        return exceptionAuthorization;
    }

    /**
     * ����exceptionAuthorization���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ExceptionAuthorizationType }
     *     
     */
    public void setExceptionAuthorization(ExceptionAuthorizationType value) {
        this.exceptionAuthorization = value;
    }

    /**
     * ��ȡoutSecurityGuard���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSecurityGuard() {
        return outSecurityGuard;
    }

    /**
     * ����outSecurityGuard���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSecurityGuard(String value) {
        this.outSecurityGuard = value;
    }

    /**
     * ��ȡoutDateTime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutDateTime() {
        return outDateTime;
    }

    /**
     * ����outDateTime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutDateTime(XMLGregorianCalendar value) {
        this.outDateTime = value;
    }

    /**
     * ��ȡisOutOfPremises���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsOutOfPremises() {
        return isOutOfPremises;
    }

    /**
     * ����isOutOfPremises���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsOutOfPremises(Boolean value) {
        this.isOutOfPremises = value;
    }

    /**
     * ��ȡparkingLot���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParkingLot() {
        return parkingLot;
    }

    /**
     * ����parkingLot���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParkingLot(String value) {
        this.parkingLot = value;
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
     * ��ȡvehicleType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehicleType() {
        return vehicleType;
    }

    /**
     * ����vehicleType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehicleType(String value) {
        this.vehicleType = value;
    }

    /**
     * ��ȡneedWeighing���Ե�ֵ��
     * 
     */
    public boolean isNeedWeighing() {
        return needWeighing;
    }

    /**
     * ����needWeighing���Ե�ֵ��
     * 
     */
    public void setNeedWeighing(boolean value) {
        this.needWeighing = value;
    }

    /**
     * ��ȡentryChannelId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntryChannelId() {
        return entryChannelId;
    }

    /**
     * ����entryChannelId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntryChannelId(String value) {
        this.entryChannelId = value;
    }

    /**
     * ��ȡentryChannelName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntryChannelName() {
        return entryChannelName;
    }

    /**
     * ����entryChannelName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntryChannelName(String value) {
        this.entryChannelName = value;
    }

    /**
     * ��ȡexitChannelId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExitChannelId() {
        return exitChannelId;
    }

    /**
     * ����exitChannelId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExitChannelId(String value) {
        this.exitChannelId = value;
    }

    /**
     * ��ȡexitChannelName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExitChannelName() {
        return exitChannelName;
    }

    /**
     * ����exitChannelName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExitChannelName(String value) {
        this.exitChannelName = value;
    }

}
