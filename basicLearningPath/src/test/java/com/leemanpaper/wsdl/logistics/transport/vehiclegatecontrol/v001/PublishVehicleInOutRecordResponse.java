
package com.leemanpaper.wsdl.logistics.transport.vehiclegatecontrol.v001;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.leemanpaper.schema.technology.framework.common.v001.ReplyMessageType;


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
 *         &lt;element ref="{http://www.leemanpaper.com/schema/technology/framework/Common/v001}ReplyMessage"/&gt;
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
    "replyMessage"
})
@XmlRootElement(name = "PublishVehicleInOutRecordResponse")
public class PublishVehicleInOutRecordResponse {

    @XmlElement(name = "ReplyMessage", namespace = "http://www.leemanpaper.com/schema/technology/framework/Common/v001", required = true)
    protected ReplyMessageType replyMessage;

    /**
     * ��ȡreplyMessage���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ReplyMessageType }
     *     
     */
    public ReplyMessageType getReplyMessage() {
        return replyMessage;
    }

    /**
     * ����replyMessage���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ReplyMessageType }
     *     
     */
    public void setReplyMessage(ReplyMessageType value) {
        this.replyMessage = value;
    }

}
