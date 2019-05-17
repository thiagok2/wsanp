
package wsdl.stubs;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


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
 *         &lt;element name="RetornarProtolocoArquivoResult" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;any processContents='lax' minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
    "retornarProtolocoArquivoResult"
})
@XmlRootElement(name = "RetornarProtolocoArquivoResponse")
public class RetornarProtolocoArquivoResponse {

    @XmlElementRef(name = "RetornarProtolocoArquivoResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<RetornarProtolocoArquivoResponse.RetornarProtolocoArquivoResult> retornarProtolocoArquivoResult;

    /**
     * Obtém o valor da propriedade retornarProtolocoArquivoResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RetornarProtolocoArquivoResponse.RetornarProtolocoArquivoResult }{@code >}
     *     
     */
    public JAXBElement<RetornarProtolocoArquivoResponse.RetornarProtolocoArquivoResult> getRetornarProtolocoArquivoResult() {
        return retornarProtolocoArquivoResult;
    }

    /**
     * Define o valor da propriedade retornarProtolocoArquivoResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RetornarProtolocoArquivoResponse.RetornarProtolocoArquivoResult }{@code >}
     *     
     */
    public void setRetornarProtolocoArquivoResult(JAXBElement<RetornarProtolocoArquivoResponse.RetornarProtolocoArquivoResult> value) {
        this.retornarProtolocoArquivoResult = value;
    }


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
     *         &lt;any processContents='lax' minOccurs="0"/>
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
        "any"
    })
    public static class RetornarProtolocoArquivoResult {

        @XmlAnyElement(lax = true)
        protected Object any;

        /**
         * Obtém o valor da propriedade any.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     {@link Element }
         *     
         */
        public Object getAny() {
            return any;
        }

        /**
         * Define o valor da propriedade any.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     {@link Element }
         *     
         */
        public void setAny(Object value) {
            this.any = value;
        }

    }

}
