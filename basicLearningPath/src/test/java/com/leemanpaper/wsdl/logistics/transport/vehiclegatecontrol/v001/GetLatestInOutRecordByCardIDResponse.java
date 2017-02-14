
package com.leemanpaper.wsdl.logistics.transport.vehiclegatecontrol.v001;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.leemanpaper.schema.logistics.transport.vehiclegatecontrol.v001.VehicleInOutRecordType;


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
 *         &lt;element ref="{http://www.leemanpaper.com/schema/logistics/transport/VehicleGateControl/v001}VehicleInOutRecord" minOccurs="0"/&gt;
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
    "vehicleInOutRecord"
})
@XmlRootElement(name = "GetLatestInOutRecordByCardIDResponse")
public class GetLatestInOutRecordByCardIDResponse {

    @XmlElement(name = "VehicleInOutRecord", namespace = "http://www.leemanpaper.com/schema/logistics/transport/VehicleGateControl/v001")
    protected VehicleInOutRecordType vehicleInOutRecord;

    /**
     * ��ȡvehicleInOutRecord���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link VehicleInOutRecordType }
     *     
     */
    public VehicleInOutRecordType getVehicleInOutRecord() {
        return vehicleInOutRecord;
    }

    /**
     * ����vehicleInOutRecord���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleInOutRecordType }
     *     
     */
    public void setVehicleInOutRecord(VehicleInOutRecordType value) {
        this.vehicleInOutRecord = value;
    }

}
