
package com.leemanpaper.schema.technology.framework.common.v001;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.leemanpaper.schema.technology.framework.common.v001 package. 
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

    private final static QName _Error_QNAME = new QName("http://www.leemanpaper.com/schema/technology/framework/Common/v001", "Error");
    private final static QName _ReplyMessage_QNAME = new QName("http://www.leemanpaper.com/schema/technology/framework/Common/v001", "ReplyMessage");
    private final static QName _RequestHeader_QNAME = new QName("http://www.leemanpaper.com/schema/technology/framework/Common/v001", "RequestHeader");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.leemanpaper.schema.technology.framework.common.v001
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ErrorType }
     * 
     */
    public ErrorType createErrorType() {
        return new ErrorType();
    }

    /**
     * Create an instance of {@link ReplyMessageType }
     * 
     */
    public ReplyMessageType createReplyMessageType() {
        return new ReplyMessageType();
    }

    /**
     * Create an instance of {@link RequestHeaderType }
     * 
     */
    public RequestHeaderType createRequestHeaderType() {
        return new RequestHeaderType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ErrorType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.leemanpaper.com/schema/technology/framework/Common/v001", name = "Error")
    public JAXBElement<ErrorType> createError(ErrorType value) {
        return new JAXBElement<ErrorType>(_Error_QNAME, ErrorType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReplyMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.leemanpaper.com/schema/technology/framework/Common/v001", name = "ReplyMessage")
    public JAXBElement<ReplyMessageType> createReplyMessage(ReplyMessageType value) {
        return new JAXBElement<ReplyMessageType>(_ReplyMessage_QNAME, ReplyMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestHeaderType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.leemanpaper.com/schema/technology/framework/Common/v001", name = "RequestHeader")
    public JAXBElement<RequestHeaderType> createRequestHeader(RequestHeaderType value) {
        return new JAXBElement<RequestHeaderType>(_RequestHeader_QNAME, RequestHeaderType.class, null, value);
    }

}
