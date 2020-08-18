
package DataImport;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GenreType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GenreType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="genreId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="genreName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="genreDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GenreType", propOrder = {
    "genreId",
    "genreName",
    "genreDescription"
})
public class GenreType {

    protected long genreId;
    @XmlElement(required = true)
    protected String genreName;
    @XmlElement(required = true)
    protected String genreDescription;

    /**
     * Gets the value of the genreId property.
     * 
     */
    public long getGenreId() {
        return genreId;
    }

    /**
     * Sets the value of the genreId property.
     * 
     */
    public void setGenreId(long value) {
        this.genreId = value;
    }

    /**
     * Gets the value of the genreName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGenreName() {
        return genreName;
    }

    /**
     * Sets the value of the genreName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGenreName(String value) {
        this.genreName = value;
    }

    /**
     * Gets the value of the genreDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGenreDescription() {
        return genreDescription;
    }

    /**
     * Sets the value of the genreDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGenreDescription(String value) {
        this.genreDescription = value;
    }

}
