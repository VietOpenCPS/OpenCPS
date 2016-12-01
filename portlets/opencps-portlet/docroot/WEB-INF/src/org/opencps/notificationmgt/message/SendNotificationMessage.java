//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.11.30 at 06:00:34 PM ICT 
//


package org.opencps.notificationmgt.message;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="NotificationEventName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ProcessOrderId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="DossierId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="PaymentFileId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="InfoList" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="UserId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *                   &lt;element name="UserMail" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="FullName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="UserPhone" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Group" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="GroupId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *                   &lt;element name="Plid" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="NotificationContent" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "notificationEventName",
    "type",
    "processOrderId",
    "dossierId",
    "paymentFileId",
    "infoList",
    "notificationContent"
})
@XmlRootElement(name = "SendNotificationMessage")
public class SendNotificationMessage {

    @XmlElement(name = "NotificationEventName", required = true)
    protected String notificationEventName;
    @XmlElement(name = "Type", required = true)
    protected String type;
    @XmlElement(name = "ProcessOrderId")
    protected long processOrderId;
    @XmlElement(name = "DossierId")
    protected long dossierId;
    @XmlElement(name = "PaymentFileId")
    protected long paymentFileId;
    @XmlElement(name = "InfoList", required = true)
    protected List<SendNotificationMessage.InfoList> infoList;
    
	public void setInfoList(List<SendNotificationMessage.InfoList> infoList) {
	
		this.infoList = infoList;
	}


	@XmlElement(name = "NotificationContent", required = true)
    protected String notificationContent;

    /**
     * Gets the value of the notificationEventName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotificationEventName() {
        return notificationEventName;
    }

    /**
     * Sets the value of the notificationEventName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotificationEventName(String value) {
        this.notificationEventName = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the processOrderId property.
     * 
     */
    public long getProcessOrderId() {
        return processOrderId;
    }

    /**
     * Sets the value of the processOrderId property.
     * 
     */
    public void setProcessOrderId(long value) {
        this.processOrderId = value;
    }

    /**
     * Gets the value of the dossierId property.
     * 
     */
    public long getDossierId() {
        return dossierId;
    }

    /**
     * Sets the value of the dossierId property.
     * 
     */
    public void setDossierId(long value) {
        this.dossierId = value;
    }

    /**
     * Gets the value of the paymentFileId property.
     * 
     */
    public long getPaymentFileId() {
        return paymentFileId;
    }

    /**
     * Sets the value of the paymentFileId property.
     * 
     */
    public void setPaymentFileId(long value) {
        this.paymentFileId = value;
    }

    /**
     * Gets the value of the infoList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the infoList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInfoList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SendNotificationMessage.InfoList }
     * 
     * 
     */
    public List<SendNotificationMessage.InfoList> getInfoList() {
        if (infoList == null) {
            infoList = new ArrayList<SendNotificationMessage.InfoList>();
        }
        return this.infoList;
    }

    /**
     * Gets the value of the notificationContent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotificationContent() {
        return notificationContent;
    }

    /**
     * Sets the value of the notificationContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotificationContent(String value) {
        this.notificationContent = value;
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
     *         &lt;element name="UserId" type="{http://www.w3.org/2001/XMLSchema}long"/>
     *         &lt;element name="UserMail" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="FullName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="UserPhone" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Group" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="GroupId" type="{http://www.w3.org/2001/XMLSchema}long"/>
     *         &lt;element name="Plid" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "userId",
        "userMail",
        "fullName",
        "userPhone",
        "group",
        "groupId",
        "plid"
    })
    public static class InfoList {

        @XmlElement(name = "UserId")
        protected long userId;
        @XmlElement(name = "UserMail", required = true)
        protected String userMail;
        @XmlElement(name = "FullName", required = true)
        protected String fullName;
        @XmlElement(name = "UserPhone", required = true)
        protected String userPhone;
        @XmlElement(name = "Group", required = true)
        protected String group;
        @XmlElement(name = "GroupId")
        protected long groupId;
        @XmlElement(name = "Plid", required = true)
        protected String plid;

        /**
         * Gets the value of the userId property.
         * 
         */
        public long getUserId() {
            return userId;
        }

        /**
         * Sets the value of the userId property.
         * 
         */
        public void setUserId(long value) {
            this.userId = value;
        }

        /**
         * Gets the value of the userMail property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUserMail() {
            return userMail;
        }

        /**
         * Sets the value of the userMail property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUserMail(String value) {
            this.userMail = value;
        }

        /**
         * Gets the value of the fullName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFullName() {
            return fullName;
        }

        /**
         * Sets the value of the fullName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFullName(String value) {
            this.fullName = value;
        }

        /**
         * Gets the value of the userPhone property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUserPhone() {
            return userPhone;
        }

        /**
         * Sets the value of the userPhone property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUserPhone(String value) {
            this.userPhone = value;
        }

        /**
         * Gets the value of the group property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGroup() {
            return group;
        }

        /**
         * Sets the value of the group property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGroup(String value) {
            this.group = value;
        }

        /**
         * Gets the value of the groupId property.
         * 
         */
        public long getGroupId() {
            return groupId;
        }

        /**
         * Sets the value of the groupId property.
         * 
         */
        public void setGroupId(long value) {
            this.groupId = value;
        }

        /**
         * Gets the value of the plid property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPlid() {
            return plid;
        }

        /**
         * Sets the value of the plid property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPlid(String value) {
            this.plid = value;
        }

    }

}
