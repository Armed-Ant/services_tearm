package com.example.AdcService.WebService;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "Shipment")
public class ShipmentInterfaceService {

    @GetMapping(value = "ShipmentInterfaceCorrectService",produces = MediaType.APPLICATION_XML_VALUE)
    public String returnCorrectResponseXML(){
        return "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?><ns2:Response xmlns:ns2=\"http://www.cn.dhl.com\" xmlns:ns4=\"Booking.SOAP.BookingCreate_v2\" xmlns:ns3=\"http://www.dhl.com/Express/CM/CM_BkgMsg/v3\" xmlns:ns9=\"http://www.dhl.com/Express/CM/CM_BOStatusRsp/v3\" xmlns:ns12=\"http://www.dhl.com/Express/CM/CM_GenericRequest/v3\" xmlns:ns5=\"Booking.SOAP.BookingUpdate\" xmlns:ns13=\"http://www.cn.dhl.com/WsService_datatypes\" xmlns:ns6=\"Booking.SOAP.BookingCancel\" xmlns:ns10=\"Booking.SOAP.BookingEventQuery\" xmlns:ns7=\"http://www.dhl.com/Express/CM/CM_BOStatusRqst/v3\" xmlns:ns11=\"http://www.dhl.com/Express/CM/CM_GenRqstMsg/v3\" xmlns:ns8=\"Booking.SOAP.BookingStatusGet\"><ResponseHeader><SendTime>2018-11-06 05:29:06</SendTime><SerialNo>181106173625</SerialNo><ChannelName>adc</ChannelName><Message>成功查询信息</Message><MessageCode>Success</MessageCode></ResponseHeader><ShipmentCustomersInvceGroup><InvoiceNumber>Unknown</InvoiceNumber><TotalAmount>0</TotalAmount><Paid>0</Paid><PrePaid>0</PrePaid><ShipmentExtraCharge/><Email></Email><TelNum></TelNum><ContactName></ContactName></ShipmentCustomersInvceGroup></ns2:Response>";

    }
    @GetMapping(value = "ShipmentInterfaceErrorService",produces = MediaType.APPLICATION_XML_VALUE)
    public String returnErrorResponseXML(){
        return "<?xml version=\"1.0\" encoding=\"utf-8\"?><ns2:Response xmlns:ns2=\"http://www.cn.dhl.com\" xmlns:ns4=\"http://www.dhl.com/Express/CM/CM_BkgMsg/v3\" xmlns:ns3=\"http://www.dhl.com/Express/CM/CM_GenRqstMsg/v3\" xmlns:ns9=\"Booking.SOAP.BookingStatusGet\" xmlns:ns12=\"http://www.cn.dhl.com/WsService_datatypes\" xmlns:ns5=\"Booking.SOAP.BookingCreate_v2\" xmlns:ns13=\"http://www.dhl.com/Express/CM/CM_GenericRequest/v3\" xmlns:ns6=\"Booking.SOAP.BookingUpdate\" xmlns:ns10=\"http://www.dhl.com/Express/CM/CM_BOStatusRsp/v3\" xmlns:ns7=\"Booking.SOAP.BookingCancel\" xmlns:ns11=\"Booking.SOAP.BookingEventQuery\" xmlns:ns8=\"http://www.dhl.com/Express/CM/CM_BOStatusRqst/v3\"><ResponseHeader><SendTime>2018-11-06 01:20:06</SendTime><SerialNo>181106134816</SerialNo><ChannelName>adc</ChannelName><Status>Failed</Status><Message>请输入ShipId！</Message><MessageCode>-99</MessageCode></ResponseHeader></ns2:Response>";

    }


}
