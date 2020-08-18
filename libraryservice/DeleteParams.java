
package libraryservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeleteParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeleteParams">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="forcibly" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeleteParams", propOrder = {
    "forcibly"
})
public class DeleteParams {

    @XmlElement(defaultValue = "false")
    protected boolean forcibly;

    /**
     * Gets the value of the forcibly property.
     * 
     */
    public boolean isForcibly() {
        return forcibly;
    }

    /**
     * Sets the value of the forcibly property.
     * 
     */
    public void setForcibly(boolean value) {
        this.forcibly = value;
    }

}
