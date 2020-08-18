
package libraryservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="authorId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="options" type="{libraryService}DeleteParams"/>
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
    "authorId",
    "options"
})
@XmlRootElement(name = "deleteAuthorRequest")
public class DeleteAuthorRequest {

    protected long authorId;
    @XmlElement(required = true)
    protected DeleteParams options;

    /**
     * Gets the value of the authorId property.
     * 
     */
    public long getAuthorId() {
        return authorId;
    }

    /**
     * Sets the value of the authorId property.
     * 
     */
    public void setAuthorId(long value) {
        this.authorId = value;
    }

    /**
     * Gets the value of the options property.
     * 
     * @return
     *     possible object is
     *     {@link DeleteParams }
     *     
     */
    public DeleteParams getOptions() {
        return options;
    }

    /**
     * Sets the value of the options property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeleteParams }
     *     
     */
    public void setOptions(DeleteParams value) {
        this.options = value;
    }

}
