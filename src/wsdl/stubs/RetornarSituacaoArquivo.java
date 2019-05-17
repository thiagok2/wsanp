
package wsdl.stubs;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de anonymous complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="protocolo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="informacaoAutenticacao" type="{http://schemas.datacontract.org/2004/07/Engine_WebService_Externo}InformacaoAutenticacao" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "protocolo",
    "informacaoAutenticacao"
})
@XmlRootElement(name = "RetornarSituacaoArquivo")
public class RetornarSituacaoArquivo {

    @XmlElementRef(name = "protocolo", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> protocolo;
    @XmlElementRef(name = "informacaoAutenticacao", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<InformacaoAutenticacao> informacaoAutenticacao;

    /**
     * Obtém o valor da propriedade protocolo.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProtocolo() {
        return protocolo;
    }

    /**
     * Define o valor da propriedade protocolo.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProtocolo(JAXBElement<String> value) {
        this.protocolo = value;
    }

    /**
     * Obtém o valor da propriedade informacaoAutenticacao.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link InformacaoAutenticacao }{@code >}
     *     
     */
    public JAXBElement<InformacaoAutenticacao> getInformacaoAutenticacao() {
        return informacaoAutenticacao;
    }

    /**
     * Define o valor da propriedade informacaoAutenticacao.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link InformacaoAutenticacao }{@code >}
     *     
     */
    public void setInformacaoAutenticacao(JAXBElement<InformacaoAutenticacao> value) {
        this.informacaoAutenticacao = value;
    }

}
