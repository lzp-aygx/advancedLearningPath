
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
 *         &lt;element name="CardID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "cardID",
    "dateTimeRange",
    "resultPageNumber",
    "resultPageSize"
})
@XmlRootElement(name = "GetInOutRecordsByCardID")
public class GetInOutRecordsByCardID {

    @XmlElement(name = "OrganizationID", required = true)
    protected String organizationID;
    @XmlElement(name = "CardID", required = true)
    protected String cardID;
    @XmlElement(name = "DateTimeRange")
    protected GetInOutRecordsByCardID.DateTimeRange dateTimeRange;
    @XmlElement(name = "ResultPageNumber")
    protected int resultPageNumber;
    @XmlElement(name = "ResultPageSize")
    protected int resultPageSize;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

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
     * ��ȡdateTimeRange���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link GetInOutRecordsByCardID.DateTimeRange }
     *     
     */
    public GetInOutRecordsByCardID.DateTimeRange getDateTimeRange() {
        return dateTimeRange;
    }

    /**
     * ����dateTimeRange���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link GetInOutRecordsByCardID.DateTimeRange }
     *     
     */
    public void setDateTimeRange(GetInOutRecordsByCardID.DateTimeRange value) {
        this.dateTimeRange = value;
    }

    /**
     * ��ȡresultPageNumber���Ե�ֵ��
     * 
     */
    public int getResultPageNumber() {
        return resultPageNumber;
    }

    /**
     * ����resultPageNumber���Ե�ֵ��
     * 
     */
    public void setResultPageNumber(int value) {
        this.resultPageNumber = value;
    }

    /**
     * ��ȡresultPageSize���Ե�ֵ��
     * 
     */
    public int getResultPageSize() {
        return resultPageSize;
    }

    /**
     * ����resultPageSize���Ե�ֵ��
     * 
     */
    public void setResultPageSize(int value) {
        this.resultPageSize = value;
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
     * <p>anonymous complex type�� Java �ࡣ
     * 
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
         * ��ȡstart���Ե�ֵ��
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
         * ����start���Ե�ֵ��
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
         * ��ȡend���Ե�ֵ��
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
         * ����end���Ե�ֵ��
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
