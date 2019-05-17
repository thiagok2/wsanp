
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
 *         &lt;element name="arquivo" type="{http://schemas.datacontract.org/2004/07/Engine_WebService_Externo}Arquivo" minOccurs="0"/>
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
    "arquivo",
    "informacaoAutenticacao"
})
@XmlRootElement(name = "EnviarArquivo")
public class EnviarArquivo {

    @XmlElementRef(name = "arquivo", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<Arquivo> arquivo;
    @XmlElementRef(name = "informacaoAutenticacao", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<InformacaoAutenticacao> informacaoAutenticacao;

    /**
     * Obtém o valor da propriedade arquivo.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Arquivo }{@code >}
     *     
     */
    public JAXBElement<Arquivo> getArquivo() {
        return arquivo;
    }

    /**
     * Define o valor da propriedade arquivo.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Arquivo }{@code >}
     *     
     */
    public void setArquivo(JAXBElement<Arquivo> value) {
        this.arquivo = value;
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
