
package com.leemanpaper.schema.logistics.transport.vehiclegatecontrol.v001;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.leemanpaper.schema.logistics.transport.vehiclegatecontrol.v001 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ExceptionAuthorization_QNAME = new QName("http://www.leemanpaper.com/schema/logistics/transport/VehicleGateControl/v001", "ExceptionAuthorization");
    private final static QName _VehicleInOutRecord_QNAME = new QName("http://www.leemanpaper.com/schema/logistics/transport/VehicleGateControl/v001", "VehicleInOutRecord");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.leemanpaper.schema.logistics.transport.vehiclegatecontrol.v001
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ExceptionAuthorizationType }
     * 
     */
    public ExceptionAuthorizationType createExceptionAuthorizationType() {
        return new ExceptionAuthorizationType();
    }

    /**
     * Create an instance of {@link VehicleInOutRecordType }
     * 
     */
    public VehicleInOutRecordType createVehicleInOutRecordType() {
        return new VehicleInOutRecordType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExceptionAuthorizationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.leemanpaper.com/schema/logistics/transport/VehicleGateControl/v001", name = "ExceptionAuthorization")
    public JAXBElement<ExceptionAuthorizationType> createExceptionAuthorization(ExceptionAuthorizationType value) {
        return new JAXBElement<ExceptionAuthorizationType>(_ExceptionAuthorization_QNAME, ExceptionAuthorizationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VehicleInOutRecordType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.leemanpaper.com/schema/logistics/transport/VehicleGateControl/v001", name = "VehicleInOutRecord")
    public JAXBElement<VehicleInOutRecordType> createVehicleInOutRecord(VehicleInOutRecordType value) {
        return new JAXBElement<VehicleInOutRecordType>(_VehicleInOutRecord_QNAME, VehicleInOutRecordType.class, null, value);
    }

}
