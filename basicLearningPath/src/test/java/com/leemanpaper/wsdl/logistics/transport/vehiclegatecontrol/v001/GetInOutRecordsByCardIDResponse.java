
package com.leemanpaper.wsdl.logistics.transport.vehiclegatecontrol.v001;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.leemanpaper.schema.logistics.transport.vehiclegatecontrol.v001.VehicleInOutRecordType;


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
 *         &lt;element ref="{http://www.leemanpaper.com/schema/logistics/transport/VehicleGateControl/v001}VehicleInOutRecord" maxOccurs="10" minOccurs="0"/&gt;
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
@XmlRootElement(name = "GetInOutRecordsByCardIDResponse")
public class GetInOutRecordsByCardIDResponse {

    @XmlElement(name = "VehicleInOutRecord", namespace = "http://www.leemanpaper.com/schema/logistics/transport/VehicleGateControl/v001")
    protected List<VehicleInOutRecordType> vehicleInOutRecord;

    /**
     * Gets the value of the vehicleInOutRecord property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vehicleInOutRecord property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVehicleInOutRecord().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VehicleInOutRecordType }
     * 
     * 
     */
    public List<VehicleInOutRecordType> getVehicleInOutRecord() {
        if (vehicleInOutRecord == null) {
            vehicleInOutRecord = new ArrayList<VehicleInOutRecordType>();
        }
        return this.vehicleInOutRecord;
    }

}
