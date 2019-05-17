
package wsdl.stubs;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the wsdl.stubs package. 
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

    private final static QName _UnsignedLong_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedLong");
    private final static QName _UnsignedByte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedByte");
    private final static QName _UnsignedInt_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedInt");
    private final static QName _Char_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "char");
    private final static QName _Short_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "short");
    private final static QName _Guid_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "guid");
    private final static QName _Arquivo_QNAME = new QName("http://schemas.datacontract.org/2004/07/Engine_WebService_Externo", "Arquivo");
    private final static QName _UnsignedShort_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedShort");
    private final static QName _Decimal_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "decimal");
    private final static QName _InformacaoAutenticacao_QNAME = new QName("http://schemas.datacontract.org/2004/07/Engine_WebService_Externo", "InformacaoAutenticacao");
    private final static QName _Boolean_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "boolean");
    private final static QName _Duration_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "duration");
    private final static QName _Base64Binary_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "base64Binary");
    private final static QName _Int_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "int");
    private final static QName _Long_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "long");
    private final static QName _AnyURI_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyURI");
    private final static QName _Float_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "float");
    private final static QName _DateTime_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "dateTime");
    private final static QName _Byte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "byte");
    private final static QName _Double_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "double");
    private final static QName _QName_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "QName");
    private final static QName _AnyType_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyType");
    private final static QName _String_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "string");
    private final static QName _RetornarProtolocoArquivoNomeArquivo_QNAME = new QName("http://tempuri.org/", "nomeArquivo");
    private final static QName _RetornarProtolocoArquivoInformacaoAutenticacao_QNAME = new QName("http://tempuri.org/", "informacaoAutenticacao");
    private final static QName _RetornarSituacaoArquivoProtocolo_QNAME = new QName("http://tempuri.org/", "protocolo");
    private final static QName _RetornarSituacaoArquivoResponseRetornarSituacaoArquivoResult_QNAME = new QName("http://tempuri.org/", "RetornarSituacaoArquivoResult");
    private final static QName _InformacaoAutenticacaoCNPJ_QNAME = new QName("http://schemas.datacontract.org/2004/07/Engine_WebService_Externo", "CNPJ");
    private final static QName _RetornarLogProcessamentoResponseRetornarLogProcessamentoResult_QNAME = new QName("http://tempuri.org/", "RetornarLogProcessamentoResult");
    private final static QName _EnviarArquivoResponseEnviarArquivoResult_QNAME = new QName("http://tempuri.org/", "EnviarArquivoResult");
    private final static QName _RetornarProtolocoArquivoResponseRetornarProtolocoArquivoResult_QNAME = new QName("http://tempuri.org/", "RetornarProtolocoArquivoResult");
    private final static QName _EnviarArquivoArquivo_QNAME = new QName("http://tempuri.org/", "arquivo");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: wsdl.stubs
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RetornarSituacaoArquivoResponse }
     * 
     */
    public RetornarSituacaoArquivoResponse createRetornarSituacaoArquivoResponse() {
        return new RetornarSituacaoArquivoResponse();
    }

    /**
     * Create an instance of {@link RetornarProtolocoArquivoResponse }
     * 
     */
    public RetornarProtolocoArquivoResponse createRetornarProtolocoArquivoResponse() {
        return new RetornarProtolocoArquivoResponse();
    }

    /**
     * Create an instance of {@link RetornarLogProcessamentoResponse }
     * 
     */
    public RetornarLogProcessamentoResponse createRetornarLogProcessamentoResponse() {
        return new RetornarLogProcessamentoResponse();
    }

    /**
     * Create an instance of {@link EnviarArquivoResponse }
     * 
     */
    public EnviarArquivoResponse createEnviarArquivoResponse() {
        return new EnviarArquivoResponse();
    }

    /**
     * Create an instance of {@link EnviarArquivo }
     * 
     */
    public EnviarArquivo createEnviarArquivo() {
        return new EnviarArquivo();
    }

    /**
     * Create an instance of {@link Arquivo }
     * 
     */
    public Arquivo createArquivo() {
        return new Arquivo();
    }

    /**
     * Create an instance of {@link InformacaoAutenticacao }
     * 
     */
    public InformacaoAutenticacao createInformacaoAutenticacao() {
        return new InformacaoAutenticacao();
    }

    /**
     * Create an instance of {@link RetornarProtolocoArquivo }
     * 
     */
    public RetornarProtolocoArquivo createRetornarProtolocoArquivo() {
        return new RetornarProtolocoArquivo();
    }

    /**
     * Create an instance of {@link RetornarSituacaoArquivoResponse.RetornarSituacaoArquivoResult }
     * 
     */
    public RetornarSituacaoArquivoResponse.RetornarSituacaoArquivoResult createRetornarSituacaoArquivoResponseRetornarSituacaoArquivoResult() {
        return new RetornarSituacaoArquivoResponse.RetornarSituacaoArquivoResult();
    }

    /**
     * Create an instance of {@link RetornarLogProcessamento }
     * 
     */
    public RetornarLogProcessamento createRetornarLogProcessamento() {
        return new RetornarLogProcessamento();
    }

    /**
     * Create an instance of {@link RetornarProtolocoArquivoResponse.RetornarProtolocoArquivoResult }
     * 
     */
    public RetornarProtolocoArquivoResponse.RetornarProtolocoArquivoResult createRetornarProtolocoArquivoResponseRetornarProtolocoArquivoResult() {
        return new RetornarProtolocoArquivoResponse.RetornarProtolocoArquivoResult();
    }

    /**
     * Create an instance of {@link RetornarLogProcessamentoResponse.RetornarLogProcessamentoResult }
     * 
     */
    public RetornarLogProcessamentoResponse.RetornarLogProcessamentoResult createRetornarLogProcessamentoResponseRetornarLogProcessamentoResult() {
        return new RetornarLogProcessamentoResponse.RetornarLogProcessamentoResult();
    }

    /**
     * Create an instance of {@link EnviarArquivoResponse.EnviarArquivoResult }
     * 
     */
    public EnviarArquivoResponse.EnviarArquivoResult createEnviarArquivoResponseEnviarArquivoResult() {
        return new EnviarArquivoResponse.EnviarArquivoResult();
    }

    /**
     * Create an instance of {@link RetornarSituacaoArquivo }
     * 
     */
    public RetornarSituacaoArquivo createRetornarSituacaoArquivo() {
        return new RetornarSituacaoArquivo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedLong")
    public JAXBElement<BigInteger> createUnsignedLong(BigInteger value) {
        return new JAXBElement<BigInteger>(_UnsignedLong_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedByte")
    public JAXBElement<Short> createUnsignedByte(Short value) {
        return new JAXBElement<Short>(_UnsignedByte_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedInt")
    public JAXBElement<Long> createUnsignedInt(Long value) {
        return new JAXBElement<Long>(_UnsignedInt_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "char")
    public JAXBElement<Integer> createChar(Integer value) {
        return new JAXBElement<Integer>(_Char_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "short")
    public JAXBElement<Short> createShort(Short value) {
        return new JAXBElement<Short>(_Short_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "guid")
    public JAXBElement<String> createGuid(String value) {
        return new JAXBElement<String>(_Guid_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Arquivo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Engine_WebService_Externo", name = "Arquivo")
    public JAXBElement<Arquivo> createArquivo(Arquivo value) {
        return new JAXBElement<Arquivo>(_Arquivo_QNAME, Arquivo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedShort")
    public JAXBElement<Integer> createUnsignedShort(Integer value) {
        return new JAXBElement<Integer>(_UnsignedShort_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "decimal")
    public JAXBElement<BigDecimal> createDecimal(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Decimal_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InformacaoAutenticacao }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Engine_WebService_Externo", name = "InformacaoAutenticacao")
    public JAXBElement<InformacaoAutenticacao> createInformacaoAutenticacao(InformacaoAutenticacao value) {
        return new JAXBElement<InformacaoAutenticacao>(_InformacaoAutenticacao_QNAME, InformacaoAutenticacao.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "boolean")
    public JAXBElement<Boolean> createBoolean(Boolean value) {
        return new JAXBElement<Boolean>(_Boolean_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "duration")
    public JAXBElement<Duration> createDuration(Duration value) {
        return new JAXBElement<Duration>(_Duration_QNAME, Duration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "base64Binary")
    public JAXBElement<byte[]> createBase64Binary(byte[] value) {
        return new JAXBElement<byte[]>(_Base64Binary_QNAME, byte[].class, null, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "int")
    public JAXBElement<Integer> createInt(Integer value) {
        return new JAXBElement<Integer>(_Int_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "long")
    public JAXBElement<Long> createLong(Long value) {
        return new JAXBElement<Long>(_Long_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "anyURI")
    public JAXBElement<String> createAnyURI(String value) {
        return new JAXBElement<String>(_AnyURI_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "float")
    public JAXBElement<Float> createFloat(Float value) {
        return new JAXBElement<Float>(_Float_QNAME, Float.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "dateTime")
    public JAXBElement<XMLGregorianCalendar> createDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DateTime_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Byte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "byte")
    public JAXBElement<Byte> createByte(Byte value) {
        return new JAXBElement<Byte>(_Byte_QNAME, Byte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "double")
    public JAXBElement<Double> createDouble(Double value) {
        return new JAXBElement<Double>(_Double_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "QName")
    public JAXBElement<QName> createQName(QName value) {
        return new JAXBElement<QName>(_QName_QNAME, QName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "anyType")
    public JAXBElement<Object> createAnyType(Object value) {
        return new JAXBElement<Object>(_AnyType_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "string")
    public JAXBElement<String> createString(String value) {
        return new JAXBElement<String>(_String_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "nomeArquivo", scope = RetornarProtolocoArquivo.class)
    public JAXBElement<String> createRetornarProtolocoArquivoNomeArquivo(String value) {
        return new JAXBElement<String>(_RetornarProtolocoArquivoNomeArquivo_QNAME, String.class, RetornarProtolocoArquivo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InformacaoAutenticacao }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "informacaoAutenticacao", scope = RetornarProtolocoArquivo.class)
    public JAXBElement<InformacaoAutenticacao> createRetornarProtolocoArquivoInformacaoAutenticacao(InformacaoAutenticacao value) {
        return new JAXBElement<InformacaoAutenticacao>(_RetornarProtolocoArquivoInformacaoAutenticacao_QNAME, InformacaoAutenticacao.class, RetornarProtolocoArquivo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "protocolo", scope = RetornarSituacaoArquivo.class)
    public JAXBElement<String> createRetornarSituacaoArquivoProtocolo(String value) {
        return new JAXBElement<String>(_RetornarSituacaoArquivoProtocolo_QNAME, String.class, RetornarSituacaoArquivo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InformacaoAutenticacao }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "informacaoAutenticacao", scope = RetornarSituacaoArquivo.class)
    public JAXBElement<InformacaoAutenticacao> createRetornarSituacaoArquivoInformacaoAutenticacao(InformacaoAutenticacao value) {
        return new JAXBElement<InformacaoAutenticacao>(_RetornarProtolocoArquivoInformacaoAutenticacao_QNAME, InformacaoAutenticacao.class, RetornarSituacaoArquivo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetornarSituacaoArquivoResponse.RetornarSituacaoArquivoResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "RetornarSituacaoArquivoResult", scope = RetornarSituacaoArquivoResponse.class)
    public JAXBElement<RetornarSituacaoArquivoResponse.RetornarSituacaoArquivoResult> createRetornarSituacaoArquivoResponseRetornarSituacaoArquivoResult(RetornarSituacaoArquivoResponse.RetornarSituacaoArquivoResult value) {
        return new JAXBElement<RetornarSituacaoArquivoResponse.RetornarSituacaoArquivoResult>(_RetornarSituacaoArquivoResponseRetornarSituacaoArquivoResult_QNAME, RetornarSituacaoArquivoResponse.RetornarSituacaoArquivoResult.class, RetornarSituacaoArquivoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Engine_WebService_Externo", name = "CNPJ", scope = InformacaoAutenticacao.class)
    public JAXBElement<String> createInformacaoAutenticacaoCNPJ(String value) {
        return new JAXBElement<String>(_InformacaoAutenticacaoCNPJ_QNAME, String.class, InformacaoAutenticacao.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "protocolo", scope = RetornarLogProcessamento.class)
    public JAXBElement<String> createRetornarLogProcessamentoProtocolo(String value) {
        return new JAXBElement<String>(_RetornarSituacaoArquivoProtocolo_QNAME, String.class, RetornarLogProcessamento.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InformacaoAutenticacao }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "informacaoAutenticacao", scope = RetornarLogProcessamento.class)
    public JAXBElement<InformacaoAutenticacao> createRetornarLogProcessamentoInformacaoAutenticacao(InformacaoAutenticacao value) {
        return new JAXBElement<InformacaoAutenticacao>(_RetornarProtolocoArquivoInformacaoAutenticacao_QNAME, InformacaoAutenticacao.class, RetornarLogProcessamento.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetornarLogProcessamentoResponse.RetornarLogProcessamentoResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "RetornarLogProcessamentoResult", scope = RetornarLogProcessamentoResponse.class)
    public JAXBElement<RetornarLogProcessamentoResponse.RetornarLogProcessamentoResult> createRetornarLogProcessamentoResponseRetornarLogProcessamentoResult(RetornarLogProcessamentoResponse.RetornarLogProcessamentoResult value) {
        return new JAXBElement<RetornarLogProcessamentoResponse.RetornarLogProcessamentoResult>(_RetornarLogProcessamentoResponseRetornarLogProcessamentoResult_QNAME, RetornarLogProcessamentoResponse.RetornarLogProcessamentoResult.class, RetornarLogProcessamentoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnviarArquivoResponse.EnviarArquivoResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "EnviarArquivoResult", scope = EnviarArquivoResponse.class)
    public JAXBElement<EnviarArquivoResponse.EnviarArquivoResult> createEnviarArquivoResponseEnviarArquivoResult(EnviarArquivoResponse.EnviarArquivoResult value) {
        return new JAXBElement<EnviarArquivoResponse.EnviarArquivoResult>(_EnviarArquivoResponseEnviarArquivoResult_QNAME, EnviarArquivoResponse.EnviarArquivoResult.class, EnviarArquivoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetornarProtolocoArquivoResponse.RetornarProtolocoArquivoResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "RetornarProtolocoArquivoResult", scope = RetornarProtolocoArquivoResponse.class)
    public JAXBElement<RetornarProtolocoArquivoResponse.RetornarProtolocoArquivoResult> createRetornarProtolocoArquivoResponseRetornarProtolocoArquivoResult(RetornarProtolocoArquivoResponse.RetornarProtolocoArquivoResult value) {
        return new JAXBElement<RetornarProtolocoArquivoResponse.RetornarProtolocoArquivoResult>(_RetornarProtolocoArquivoResponseRetornarProtolocoArquivoResult_QNAME, RetornarProtolocoArquivoResponse.RetornarProtolocoArquivoResult.class, RetornarProtolocoArquivoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InformacaoAutenticacao }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "informacaoAutenticacao", scope = EnviarArquivo.class)
    public JAXBElement<InformacaoAutenticacao> createEnviarArquivoInformacaoAutenticacao(InformacaoAutenticacao value) {
        return new JAXBElement<InformacaoAutenticacao>(_RetornarProtolocoArquivoInformacaoAutenticacao_QNAME, InformacaoAutenticacao.class, EnviarArquivo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Arquivo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "arquivo", scope = EnviarArquivo.class)
    public JAXBElement<Arquivo> createEnviarArquivoArquivo(Arquivo value) {
        return new JAXBElement<Arquivo>(_EnviarArquivoArquivo_QNAME, Arquivo.class, EnviarArquivo.class, value);
    }

}
