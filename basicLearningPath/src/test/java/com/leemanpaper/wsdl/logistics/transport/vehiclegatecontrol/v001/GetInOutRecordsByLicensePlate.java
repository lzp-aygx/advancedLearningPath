
package com.leemanpaper.wsdl.logistics.transport.vehiclegatecontrol.v001;

import java.util.HashMap;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
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
 *         &lt;element name="DateTimeRange" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Start" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *                   &lt;element name="End" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ResultPageNumber"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
 *               &lt;minInclusive value="0"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ResultPageSize"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
 *               &lt;minInclusive value="1"/&gt;
 *               &lt;maxInclusive value="10"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Purposes" type="{http://www.leemanpaper.com/schema/common/LeeManCommon/v001}PurposesType"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;anyAttribute processContents='skip'/&gt;
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
    "dateTimeRange",
    "resultPageNumber",
    "resultPageSize",
    "purposes"
})
@XmlRootElement(name = "GetInOutRecordsByLicensePlate")
public class GetInOutRecordsByLicensePlate {

    @XmlElement(name = "OrganizationID", required = true)
    protected String organizationID;
    @XmlElement(name = "VehicleLicensePlate", required = true)
    protected String vehicleLicensePlate;
    @XmlElement(name = "DateTimeRange")
    protected GetInOutRecordsByLicensePlate.DateTimeRange dateTimeRange;
    @XmlElement(name = "ResultPageNumber")
    protected int resultPageNumber;
    @XmlElement(name = "ResultPageSize")
    protected int resultPageSize;
    @XmlElement(name = "Purposes", required = true)
    protected PurposesType purposes;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

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
     * 获取dateTimeRange属性的值。
     * 
     * @return
     *     possible object is
     *     {@link GetInOutRecordsByLicensePlate.DateTimeRange }
     *     
     */
    public GetInOutRecordsByLicensePlate.DateTimeRange getDateTimeRange() {
        return dateTimeRange;
    }

    /**
     * 设置dateTimeRange属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link GetInOutRecordsByLicensePlate.DateTimeRange }
     *     
     */
    public void setDateTimeRange(GetInOutRecordsByLicensePlate.DateTimeRange value) {
        this.dateTimeRange = value;
    }

    /**
     * 获取resultPageNumber属性的值。
     * 
     */
    public int getResultPageNumber() {
        return resultPageNumber;
    }

    /**
     * 设置resultPageNumber属性的值。
     * 
     */
    public void setResultPageNumber(int value) {
        this.resultPageNumber = value;
    }

    /**
     * 获取resultPageSize属性的值。
     * 
     */
    public int getResultPageSize() {
        return resultPageSize;
    }

    /**
     * 设置resultPageSize属性的值。
     * 
     */
    public void setResultPageSize(int value) {
        this.resultPageSize = value;
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

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     * 
     * <p>
     * the map is keyed by the name of the attribute and 
     * the value is the string value of the attribute.
     * 
     * the map returned by this method is live, and you can add new attribute
     * by updating the map directly. Because of this design, there's no setter.
     * 
     * 
     * @return
     *     always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }


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
     *         &lt;element name="Start" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
     *         &lt;element name="End" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
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
        "start",
        "end"
    })
    public static class DateTimeRange {

        @XmlElement(name = "Start", required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar start;
        @XmlElement(name = "End", required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar end;

        /**
         * 获取start属性的值。
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getStart() {
            return start;
        }

        /**
         * 设置start属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setStart(XMLGregorianCalendar value) {
            this.start = value;
        }

        /**
         * 获取end属性的值。
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getEnd() {
            return end;
        }

        /**
         * 设置end属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setEnd(XMLGregorianCalendar value) {
            this.end = value;
        }

    }

}
