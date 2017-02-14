Job-1492480 Error in [Services/WoodPulpManagement/WoodPulpWarehousing/v001/AsyncPublishWeighingEvent/Dynamic/CoreProcess.process/Generate Error] <?xml version="1.0" encoding="UTF-8"?>
<ServiceException xmlns="http://schemas.datacontract.org/2004/07/UFSoft.UBF.Service"
                  xmlns:s="http://schemas.xmlsoap.org/soap/envelope/" xmlns:x="http://www.w3.org/2001/XMLSchema"
                  xmlns:i="http://www.w3.org/2001/XMLSchema-instance">
    <ClassName xmlns="" i:type="x:string">UFSoft.UBF.Service.ServiceException</ClassName>
    <Message xmlns="" i:type="x:string">System.Data.SqlClient.SqlException:A severe error occurred on the current
        command. The results, if any, should be discarded. at UFSoft.UBF.Service.ServerDynamicProxy.Invoke(IMessage
        myIMessage)&#xD; at System.Runtime.Remoting.Proxies.RealProxy.PrivateInvoke(MessageData&amp; msgData, Int32
        type)&#xD; at UFIDA.U9.ISV.MiscRcvISV.Proxy.ICommonCreateMiscRcv.Do(IContext context, IList`1&amp; outMessages,
        List`1 miscRcvDTOList)&#xD; at UFIDA.U9.ISV.MiscRcvISV.Proxy.CommonCreateMiscRcvProxy.InvokeImplement[T](T
        oChannel)&#xD; at UFSoft.UBF.Service.Base.ProxyBase.InvokeAgent[T]()&#xD; at
        UFSoft.UBF.Service.Base.ServiceProxyBase.InvokeByOrg[T](Int64 targetOrgId)&#xD; at
        UFIDA.U9.ISV.MiscRcvISV.Proxy.CommonCreateMiscRcvProxy.Do(Int64 targetOrgId)&#xD; at
        UFIDA.U9.Cust.LM.ESB.Lit.WBPSSV.CreateMiscRcvImpementStrategy.CreateAndApprovedMiscRcv(CreateMiscRcv bpObj) in
        D:\UFIDA\Unconfiged\Code\LitSV\BpImplement\WBPSSV\CreateMiscRcvExtend.cs:line 212&#xD; at
        UFIDA.U9.Cust.LM.ESB.Lit.WBPSSV.CreateMiscRcvImpementStrategy.Do(Object obj) in
        D:\UFIDA\Unconfiged\Code\LitSV\BpImplement\WBPSSV\CreateMiscRcvExtend.cs:line 47&#xD; at
        UFSoft.UBF.AopFrame.BaseStrategy.Execute(Object obj)&#xD; at UFIDA.U9.Cust.LM.ESB.Lit.WBPSSV.CreateMiscRcv.Do()
        in D:\UFIDA\Unconfiged\Code\LitSV\BpImplement\WBPSSV\CreateMiscRcv.cs:line 246&#xD; at
        UFIDA.U9.Cust.LM.ESB.Lit.WBPSSV.CreateMiscRcvStub.DoEx(ICommonDataContract commonData, String itemCode, Decimal
        storeQty, String lotCode, String wHCode, String binCode, String wHManCode, Int32 callType, Decimal grossWeight,
        DateTime businessDate, Decimal moisture, String reserved1, String reserved2) in
        D:\UFIDA\Unconfiged\Code\LitSV\BpImplement\WBPSSV\CreateMiscRcvStub.cs:line 79
    </Message>
    <Data xmlns="" i:nil="true"/>
    <InnerException xmlns="" i:nil="true"/>
    <HelpURL xmlns="" i:nil="true"/>
    <StackTraceString xmlns="" i:nil="true"/>
    <RemoteStackTraceString xmlns="" i:nil="true"/>
    <RemoteStackIndex xmlns="" i:type="x:int">0</RemoteStackIndex>
    <ExceptionMethod xmlns="" i:nil="true"/>
    <HResult xmlns="" i:type="x:int">-2146233088</HResult>
    <Source xmlns="" i:nil="true"/>
    <WatsonBuckets xmlns="" i:nil="true"/>
    <localMessage xmlns="" i:type="x:string">System.Data.SqlClient.SqlException:A severe error occurred on the current
        command. The results, if any, should be discarded. at UFSoft.UBF.Service.ServerDynamicProxy.Invoke(IMessage
        myIMessage)&#xD; at System.Runtime.Remoting.Proxies.RealProxy.PrivateInvoke(MessageData&amp; msgData, Int32
        type)&#xD; at UFIDA.U9.ISV.MiscRcvISV.Proxy.ICommonCreateMiscRcv.Do(IContext context, IList`1&amp; outMessages,
        List`1 miscRcvDTOList)&#xD; at UFIDA.U9.ISV.MiscRcvISV.Proxy.CommonCreateMiscRcvProxy.InvokeImplement[T](T
        oChannel)&#xD; at UFSoft.UBF.Service.Base.ProxyBase.InvokeAgent[T]()&#xD; at
        UFSoft.UBF.Service.Base.ServiceProxyBase.InvokeByOrg[T](Int64 targetOrgId)&#xD; at
        UFIDA.U9.ISV.MiscRcvISV.Proxy.CommonCreateMiscRcvProxy.Do(Int64 targetOrgId)&#xD; at
        UFIDA.U9.Cust.LM.ESB.Lit.WBPSSV.CreateMiscRcvImpementStrategy.CreateAndApprovedMiscRcv(CreateMiscRcv bpObj) in
        D:\UFIDA\Unconfiged\Code\LitSV\BpImplement\WBPSSV\CreateMiscRcvExtend.cs:line 212&#xD; at
        UFIDA.U9.Cust.LM.ESB.Lit.WBPSSV.CreateMiscRcvImpementStrategy.Do(Object obj) in
        D:\UFIDA\Unconfiged\Code\LitSV\BpImplement\WBPSSV\CreateMiscRcvExtend.cs:line 47&#xD; at
        UFSoft.UBF.AopFrame.BaseStrategy.Execute(Object obj)&#xD; at UFIDA.U9.Cust.LM.ESB.Lit.WBPSSV.CreateMiscRcv.Do()
        in D:\UFIDA\Unconfiged\Code\LitSV\BpImplement\WBPSSV\CreateMiscRcv.cs:line 246&#xD; at
        UFIDA.U9.Cust.LM.ESB.Lit.WBPSSV.CreateMiscRcvStub.DoEx(ICommonDataContract commonData, String itemCode, Decimal
        storeQty, String lotCode, String wHCode, String binCode, String wHManCode, Int32 callType, Decimal grossWeight,
        DateTime businessDate, Decimal moisture, String reserved1, String reserved2) in
        D:\UFIDA\Unconfiged\Code\LitSV\BpImplement\WBPSSV\CreateMiscRcvStub.cs:line 79
    </localMessage>
    <formated xmlns="" xmlns:a="http://schemas.datacontract.org/2004/07/UFSoft.UBF"
              i:type="a:ExceptionBase.FormatState">Formatted
    </formated>
    <SerializeWithBaseType xmlns="" i:type="x:boolean">false</SerializeWithBaseType>
    <TypeName xmlns="" i:nil="true"/>
    <InnerExceptions xmlns="" xmlns:a="http://schemas.datacontract.org/2004/07/System" i:type="a:ArrayOfException">
        <a:Exception xmlns:b="http://schemas.datacontract.org/2004/07/UFSoft.UBF" i:type="b:UnknownException">
            <ClassName i:type="x:string">UFSoft.UBF.UnknownException</ClassName>
            <Message i:type="x:string">A severe error occurred on the current command. The results, if any, should be
                discarded.
            </Message>
            <Data i:nil="true"/>
            <InnerException i:nil="true"/>
            <HelpURL i:nil="true"/>
            <StackTraceString i:nil="true"/>
            <RemoteStackTraceString i:nil="true"/>
            <RemoteStackIndex i:type="x:int">0</RemoteStackIndex>
            <ExceptionMethod i:nil="true"/>
            <HResult i:type="x:int">-2146233088</HResult>
            <Source i:type="x:string">.Net SqlClient Data Provider</Source>
            <WatsonBuckets i:nil="true"/>
            <localMessage i:type="x:string">A severe error occurred on the current command. The results, if any, should
                be discarded.
            </localMessage>
            <formated i:type="b:ExceptionBase.FormatState">Formatted</formated>
            <SerializeWithBaseType i:type="x:boolean">true</SerializeWithBaseType>
            <TypeName i:type="x:string">System.Data.SqlClient.SqlException</TypeName>
            <InnerExceptions i:type="a:ArrayOfException"/>
            <UBFData xmlns:c="http://schemas.microsoft.com/2003/10/Serialization/Arrays"
                     i:type="c:ArrayOfKeyValueOfanyTypeanyType">
                <c:KeyValueOfanyTypeanyType>
                    <c:Key i:type="x:string">_Source</c:Key>
                    <c:Value i:type="x:string">.Net SqlClient Data Provider</c:Value>
                </c:KeyValueOfanyTypeanyType>
                <c:KeyValueOfanyTypeanyType>
                    <c:Key i:type="x:string">_StackTree</c:Key>
                    <c:Value i:type="x:string">at UFSoft.UBF.Service.ServerDynamicProxy.Invoke(IMessage myIMessage)&#xD;
                        at System.Runtime.Remoting.Proxies.RealProxy.PrivateInvoke(MessageData&amp; msgData, Int32 type)&#xD;
                        at UFIDA.U9.ISV.MiscRcvISV.Proxy.ICommonCreateMiscRcv.Do(IContext context, IList`1&amp;
                        outMessages, List`1 miscRcvDTOList)&#xD; at
                        UFIDA.U9.ISV.MiscRcvISV.Proxy.CommonCreateMiscRcvProxy.InvokeImplement[T](T oChannel)&#xD; at
                        UFSoft.UBF.Service.Base.ProxyBase.InvokeAgent[T]()&#xD; at
                        UFSoft.UBF.Service.Base.ServiceProxyBase.InvokeByOrg[T](Int64 targetOrgId)&#xD; at
                        UFIDA.U9.ISV.MiscRcvISV.Proxy.CommonCreateMiscRcvProxy.Do(Int64 targetOrgId)&#xD; at
                        UFIDA.U9.Cust.LM.ESB.Lit.WBPSSV.CreateMiscRcvImpementStrategy.CreateAndApprovedMiscRcv(CreateMiscRcv
                        bpObj) in D:\UFIDA\Unconfiged\Code\LitSV\BpImplement\WBPSSV\CreateMiscRcvExtend.cs:line 212&#xD;
                        at UFIDA.U9.Cust.LM.ESB.Lit.WBPSSV.CreateMiscRcvImpementStrategy.Do(Object obj) in
                        D:\UFIDA\Unconfiged\Code\LitSV\BpImplement\WBPSSV\CreateMiscRcvExtend.cs:line 47&#xD; at
                        UFSoft.UBF.AopFrame.BaseStrategy.Execute(Object obj)&#xD; at
                        UFIDA.U9.Cust.LM.ESB.Lit.WBPSSV.CreateMiscRcv.Do() in
                        D:\UFIDA\Unconfiged\Code\LitSV\BpImplement\WBPSSV\CreateMiscRcv.cs:line 246&#xD; at
                        UFIDA.U9.Cust.LM.ESB.Lit.WBPSSV.CreateMiscRcvStub.DoEx(ICommonDataContract commonData, String
                        itemCode, Decimal storeQty, String lotCode, String wHCode, String binCode, String wHManCode,
                        Int32 callType, Decimal grossWeight, DateTime businessDate, Decimal moisture, String reserved1,
                        String reserved2) in D:\UFIDA\Unconfiged\Code\LitSV\BpImplement\WBPSSV\CreateMiscRcvStub.cs:line
                        79
                    </c:Value>
                </c:KeyValueOfanyTypeanyType>
            </UBFData>
        </a:Exception>
    </InnerExceptions>
    <UBFData xmlns="" i:nil="true"/>
</ServiceException>   at com.tibco.pe.core.GenerateErrorActivity.eval(Unknown Source)   at com.tibco.pe.plugin.Activity.eval(Unknown Source)   at com.tibco.pe.core.TaskImpl.eval(Unknown Source)   at com.tibco.pe.core.Job.a(Unknown Source)   at com.tibco.pe.core.Job.k(Unknown Source)   at com.tibco.pe.core.JobDispatcher$JobCourier.a(Unknown Source)   at com.tibco.pe.core.JobDispatcher$JobCourier.run(Unknown Source)