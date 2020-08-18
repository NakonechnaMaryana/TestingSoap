
package libraryservice;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BookType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BookType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bookId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="bookName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="bookLanguage" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="bookDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="additional">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="pageCount" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                   &lt;element name="size">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="height" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *                             &lt;element name="width" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *                             &lt;element name="length" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="publicationYear" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BookType", propOrder = {
    "bookId",
    "bookName",
    "bookLanguage",
    "bookDescription",
    "additional",
    "publicationYear"
})
public class BookType {

    protected long bookId;
    @XmlElement(required = true)
    protected String bookName;
    @XmlElement(required = true)
    protected String bookLanguage;
    @XmlElement(required = true)
    protected String bookDescription;
    @XmlElement(required = true)
    protected BookType.Additional additional;
    @XmlElement(required = true)
    protected BigInteger publicationYear;

    /**
     * Gets the value of the bookId property.
     * 
     */
    public long getBookId() {
        return bookId;
    }

    /**
     * Sets the value of the bookId property.
     * 
     */
    public void setBookId(long value) {
        this.bookId = value;
    }

    /**
     * Gets the value of the bookName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookName() {
        return bookName;
    }

    /**
     * Sets the value of the bookName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookName(String value) {
        this.bookName = value;
    }

    /**
     * Gets the value of the bookLanguage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookLanguage() {
        return bookLanguage;
    }

    /**
     * Sets the value of the bookLanguage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookLanguage(String value) {
        this.bookLanguage = value;
    }

    /**
     * Gets the value of the bookDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookDescription() {
        return bookDescription;
    }

    /**
     * Sets the value of the bookDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookDescription(String value) {
        this.bookDescription = value;
    }

    /**
     * Gets the value of the additional property.
     * 
     * @return
     *     possible object is
     *     {@link BookType.Additional }
     *     
     */
    public BookType.Additional getAdditional() {
        return additional;
    }

    /**
     * Sets the value of the additional property.
     * 
     * @param value
     *     allowed object is
     *     {@link BookType.Additional }
     *     
     */
    public void setAdditional(BookType.Additional value) {
        this.additional = value;
    }

    /**
     * Gets the value of the publicationYear property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPublicationYear() {
        return publicationYear;
    }

    /**
     * Sets the value of the publicationYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPublicationYear(BigInteger value) {
        this.publicationYear = value;
    }


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
     *         &lt;element name="pageCount" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *         &lt;element name="size">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="height" type="{http://www.w3.org/2001/XMLSchema}float"/>
     *                   &lt;element name="width" type="{http://www.w3.org/2001/XMLSchema}float"/>
     *                   &lt;element name="length" type="{http://www.w3.org/2001/XMLSchema}float"/>
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
        "pageCount",
        "size"
    })
    public static class Additional {

        @XmlElement(required = true)
        protected BigInteger pageCount;
        @XmlElement(required = true)
        protected BookType.Additional.Size size;

        /**
         * Gets the value of the pageCount property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getPageCount() {
            return pageCount;
        }

        /**
         * Sets the value of the pageCount property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setPageCount(BigInteger value) {
            this.pageCount = value;
        }

        /**
         * Gets the value of the size property.
         * 
         * @return
         *     possible object is
         *     {@link BookType.Additional.Size }
         *     
         */
        public BookType.Additional.Size getSize() {
            return size;
        }

        /**
         * Sets the value of the size property.
         * 
         * @param value
         *     allowed object is
         *     {@link BookType.Additional.Size }
         *     
         */
        public void setSize(BookType.Additional.Size value) {
            this.size = value;
        }


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
         *         &lt;element name="height" type="{http://www.w3.org/2001/XMLSchema}float"/>
         *         &lt;element name="width" type="{http://www.w3.org/2001/XMLSchema}float"/>
         *         &lt;element name="length" type="{http://www.w3.org/2001/XMLSchema}float"/>
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
            "height",
            "width",
            "length"
        })
        public static class Size {

            protected float height;
            protected float width;
            protected float length;

            /**
             * Gets the value of the height property.
             * 
             */
            public float getHeight() {
                return height;
            }

            /**
             * Sets the value of the height property.
             * 
             */
            public void setHeight(float value) {
                this.height = value;
            }

            /**
             * Gets the value of the width property.
             * 
             */
            public float getWidth() {
                return width;
            }

            /**
             * Sets the value of the width property.
             * 
             */
            public void setWidth(float value) {
                this.width = value;
            }

            /**
             * Gets the value of the length property.
             * 
             */
            public float getLength() {
                return length;
            }

            /**
             * Sets the value of the length property.
             * 
             */
            public void setLength(float value) {
                this.length = value;
            }

        }

    }

}
