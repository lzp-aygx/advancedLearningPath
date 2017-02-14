
package com.leemanpaper.schema.common.leemancommon.v001;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.leemanpaper.schema.common.leemancommon.v001 package. 
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

    private final static QName _BinID_QNAME = new QName("http://www.leemanpaper.com/schema/common/LeeManCommon/v001", "BinID");
    private final static QName _ContainerID_QNAME = new QName("http://www.leemanpaper.com/schema/common/LeeManCommon/v001", "ContainerID");
    private final static QName _ContainerQty_QNAME = new QName("http://www.leemanpaper.com/schema/common/LeeManCommon/v001", "ContainerQty");
    private final static QName _ContainerQuantities_QNAME = new QName("http://www.leemanpaper.com/schema/common/LeeManCommon/v001", "ContainerQuantities");
    private final static QName _Currency_QNAME = new QName("http://www.leemanpaper.com/schema/common/LeeManCommon/v001", "Currency");
    private final static QName _EmailAddress_QNAME = new QName("http://www.leemanpaper.com/schema/common/LeeManCommon/v001", "EmailAddress");
    private final static QName _EventAction_QNAME = new QName("http://www.leemanpaper.com/schema/common/LeeManCommon/v001", "EventAction");
    private final static QName _FactoryLocation_QNAME = new QName("http://www.leemanpaper.com/schema/common/LeeManCommon/v001", "FactoryLocation");
    private final static QName _GoodsDeliveryMode_QNAME = new QName("http://www.leemanpaper.com/schema/common/LeeManCommon/v001", "GoodsDeliveryMode");
    private final static QName _LanguageCode_QNAME = new QName("http://www.leemanpaper.com/schema/common/LeeManCommon/v001", "LanguageCode");
    private final static QName _MonetaryValue_QNAME = new QName("http://www.leemanpaper.com/schema/common/LeeManCommon/v001", "MonetaryValue");
    private final static QName _OrganizationID_QNAME = new QName("http://www.leemanpaper.com/schema/common/LeeManCommon/v001", "OrganizationID");
    private final static QName _ShipmentNumber_QNAME = new QName("http://www.leemanpaper.com/schema/common/LeeManCommon/v001", "ShipmentNumber");
    private final static QName _SystemOrgCode_QNAME = new QName("http://www.leemanpaper.com/schema/common/LeeManCommon/v001", "SystemOrgCode");
    private final static QName _TransportationMode_QNAME = new QName("http://www.leemanpaper.com/schema/common/LeeManCommon/v001", "TransportationMode");
    private final static QName _TypeOfTrade_QNAME = new QName("http://www.leemanpaper.com/schema/common/LeeManCommon/v001", "TypeOfTrade");
    private final static QName _UserActionTimeStamp_QNAME = new QName("http://www.leemanpaper.com/schema/common/LeeManCommon/v001", "UserActionTimeStamp");
    private final static QName _UserID_QNAME = new QName("http://www.leemanpaper.com/schema/common/LeeManCommon/v001", "UserID");
    private final static QName _VehicleLicensePlate_QNAME = new QName("http://www.leemanpaper.com/schema/common/LeeManCommon/v001", "VehicleLicensePlate");
    private final static QName _WarehouseCheckInRecordID_QNAME = new QName("http://www.leemanpaper.com/schema/common/LeeManCommon/v001", "WarehouseCheckInRecordID");
    private final static QName _WarehouseCheckOutRecordID_QNAME = new QName("http://www.leemanpaper.com/schema/common/LeeManCommon/v001", "WarehouseCheckOutRecordID");
    private final static QName _WarehouseID_QNAME = new QName("http://www.leemanpaper.com/schema/common/LeeManCommon/v001", "WarehouseID");
    private final static QName _WarehouseTransferRecordID_QNAME = new QName("http://www.leemanpaper.com/schema/common/LeeManCommon/v001", "WarehouseTransferRecordID");
    private final static QName _WastePaperSource_QNAME = new QName("http://www.leemanpaper.com/schema/common/LeeManCommon/v001", "WastePaperSource");
    private final static QName _WastePaperType_QNAME = new QName("http://www.leemanpaper.com/schema/common/LeeManCommon/v001", "WastePaperType");
    private final static QName _WastePaperYardLocation_QNAME = new QName("http://www.leemanpaper.com/schema/common/LeeManCommon/v001", "WastePaperYardLocation");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.leemanpaper.schema.common.leemancommon.v001
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PurposesType }
     * 
     */
    public PurposesType createPurposesType() {
        return new PurposesType();
    }

    /**
     * Create an instance of {@link ContainerQtyType }
     * 
     */
    public ContainerQtyType createContainerQtyType() {
        return new ContainerQtyType();
    }

    /**
     * Create an instance of {@link ContainerQuantitiesType }
     * 
     */
    public ContainerQuantitiesType createContainerQuantitiesType() {
        return new ContainerQuantitiesType();
    }

    /**
     * Create an instance of {@link MonetaryValueType }
     * 
     */
    public MonetaryValueType createMonetaryValueType() {
        return new MonetaryValueType();
    }

    /**
     * Create an instance of {@link UserActionTimeStampType }
     * 
     */
    public UserActionTimeStampType createUserActionTimeStampType() {
        return new UserActionTimeStampType();
    }

    /**
     * Create an instance of {@link WastePaperYardLocationType }
     * 
     */
    public WastePaperYardLocationType createWastePaperYardLocationType() {
        return new WastePaperYardLocationType();
    }

    /**
     * Create an instance of {@link WeightType }
     * 
     */
    public WeightType createWeightType() {
        return new WeightType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.leemanpaper.com/schema/common/LeeManCommon/v001", name = "BinID")
    public JAXBElement<String> createBinID(String value) {
        return new JAXBElement<String>(_BinID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.leemanpaper.com/schema/common/LeeManCommon/v001", name = "ContainerID")
    public JAXBElement<String> createContainerID(String value) {
        return new JAXBElement<String>(_ContainerID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContainerQtyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.leemanpaper.com/schema/common/LeeManCommon/v001", name = "ContainerQty")
    public JAXBElement<ContainerQtyType> createContainerQty(ContainerQtyType value) {
        return new JAXBElement<ContainerQtyType>(_ContainerQty_QNAME, ContainerQtyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContainerQuantitiesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.leemanpaper.com/schema/common/LeeManCommon/v001", name = "ContainerQuantities")
    public JAXBElement<ContainerQuantitiesType> createContainerQuantities(ContainerQuantitiesType value) {
        return new JAXBElement<ContainerQuantitiesType>(_ContainerQuantities_QNAME, ContainerQuantitiesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CurrencyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.leemanpaper.com/schema/common/LeeManCommon/v001", name = "Currency")
    public JAXBElement<CurrencyType> createCurrency(CurrencyType value) {
        return new JAXBElement<CurrencyType>(_Currency_QNAME, CurrencyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.leemanpaper.com/schema/common/LeeManCommon/v001", name = "EmailAddress")
    public JAXBElement<String> createEmailAddress(String value) {
        return new JAXBElement<String>(_EmailAddress_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EventActionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.leemanpaper.com/schema/common/LeeManCommon/v001", name = "EventAction")
    public JAXBElement<EventActionType> createEventAction(EventActionType value) {
        return new JAXBElement<EventActionType>(_EventAction_QNAME, EventActionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FactoryLocationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.leemanpaper.com/schema/common/LeeManCommon/v001", name = "FactoryLocation")
    public JAXBElement<FactoryLocationType> createFactoryLocation(FactoryLocationType value) {
        return new JAXBElement<FactoryLocationType>(_FactoryLocation_QNAME, FactoryLocationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GoodsDeliveryModeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.leemanpaper.com/schema/common/LeeManCommon/v001", name = "GoodsDeliveryMode")
    public JAXBElement<GoodsDeliveryModeType> createGoodsDeliveryMode(GoodsDeliveryModeType value) {
        return new JAXBElement<GoodsDeliveryModeType>(_GoodsDeliveryMode_QNAME, GoodsDeliveryModeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.leemanpaper.com/schema/common/LeeManCommon/v001", name = "LanguageCode")
    public JAXBElement<String> createLanguageCode(String value) {
        return new JAXBElement<String>(_LanguageCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MonetaryValueType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.leemanpaper.com/schema/common/LeeManCommon/v001", name = "MonetaryValue")
    public JAXBElement<MonetaryValueType> createMonetaryValue(MonetaryValueType value) {
        return new JAXBElement<MonetaryValueType>(_MonetaryValue_QNAME, MonetaryValueType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.leemanpaper.com/schema/common/LeeManCommon/v001", name = "OrganizationID")
    public JAXBElement<String> createOrganizationID(String value) {
        return new JAXBElement<String>(_OrganizationID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.leemanpaper.com/schema/common/LeeManCommon/v001", name = "ShipmentNumber")
    public JAXBElement<String> createShipmentNumber(String value) {
        return new JAXBElement<String>(_ShipmentNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.leemanpaper.com/schema/common/LeeManCommon/v001", name = "SystemOrgCode")
    public JAXBElement<String> createSystemOrgCode(String value) {
        return new JAXBElement<String>(_SystemOrgCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransportationModeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.leemanpaper.com/schema/common/LeeManCommon/v001", name = "TransportationMode")
    public JAXBElement<TransportationModeType> createTransportationMode(TransportationModeType value) {
        return new JAXBElement<TransportationModeType>(_TransportationMode_QNAME, TransportationModeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TypeOfTradeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.leemanpaper.com/schema/common/LeeManCommon/v001", name = "TypeOfTrade")
    public JAXBElement<TypeOfTradeType> createTypeOfTrade(TypeOfTradeType value) {
        return new JAXBElement<TypeOfTradeType>(_TypeOfTrade_QNAME, TypeOfTradeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserActionTimeStampType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.leemanpaper.com/schema/common/LeeManCommon/v001", name = "UserActionTimeStamp")
    public JAXBElement<UserActionTimeStampType> createUserActionTimeStamp(UserActionTimeStampType value) {
        return new JAXBElement<UserActionTimeStampType>(_UserActionTimeStamp_QNAME, UserActionTimeStampType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.leemanpaper.com/schema/common/LeeManCommon/v001", name = "UserID")
    public JAXBElement<String> createUserID(String value) {
        return new JAXBElement<String>(_UserID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.leemanpaper.com/schema/common/LeeManCommon/v001", name = "VehicleLicensePlate")
    public JAXBElement<String> createVehicleLicensePlate(String value) {
        return new JAXBElement<String>(_VehicleLicensePlate_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.leemanpaper.com/schema/common/LeeManCommon/v001", name = "WarehouseCheckInRecordID")
    public JAXBElement<String> createWarehouseCheckInRecordID(String value) {
        return new JAXBElement<String>(_WarehouseCheckInRecordID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.leemanpaper.com/schema/common/LeeManCommon/v001", name = "WarehouseCheckOutRecordID")
    public JAXBElement<String> createWarehouseCheckOutRecordID(String value) {
        return new JAXBElement<String>(_WarehouseCheckOutRecordID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.leemanpaper.com/schema/common/LeeManCommon/v001", name = "WarehouseID")
    public JAXBElement<String> createWarehouseID(String value) {
        return new JAXBElement<String>(_WarehouseID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.leemanpaper.com/schema/common/LeeManCommon/v001", name = "WarehouseTransferRecordID")
    public JAXBElement<String> createWarehouseTransferRecordID(String value) {
        return new JAXBElement<String>(_WarehouseTransferRecordID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WastePaperSourceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.leemanpaper.com/schema/common/LeeManCommon/v001", name = "WastePaperSource")
    public JAXBElement<WastePaperSourceType> createWastePaperSource(WastePaperSourceType value) {
        return new JAXBElement<WastePaperSourceType>(_WastePaperSource_QNAME, WastePaperSourceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WastePaperTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.leemanpaper.com/schema/common/LeeManCommon/v001", name = "WastePaperType")
    public JAXBElement<WastePaperTypeType> createWastePaperType(WastePaperTypeType value) {
        return new JAXBElement<WastePaperTypeType>(_WastePaperType_QNAME, WastePaperTypeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WastePaperYardLocationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.leemanpaper.com/schema/common/LeeManCommon/v001", name = "WastePaperYardLocation")
    public JAXBElement<WastePaperYardLocationType> createWastePaperYardLocation(WastePaperYardLocationType value) {
        return new JAXBElement<WastePaperYardLocationType>(_WastePaperYardLocation_QNAME, WastePaperYardLocationType.class, null, value);
    }

}
