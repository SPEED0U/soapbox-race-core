
package com.soapboxrace.jaxb.http;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de PersonaCCar complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="PersonaCCar">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CCID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Durability" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Heat" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="IsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="PersonaId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonaCCar", propOrder = {
    "ccid",
    "durability",
    "heat",
    "isDefault",
    "personaId"
})
public class PersonaCCar {

    @XmlElement(name = "CCID")
    protected int ccid;
    @XmlElement(name = "Durability")
    protected int durability;
    @XmlElement(name = "Heat")
    protected float heat;
    @XmlElement(name = "IsDefault")
    protected boolean isDefault;
    @XmlElement(name = "PersonaId")
    protected long personaId;

    /**
     * Obtém o valor da propriedade ccid.
     * 
     */
    public int getCCID() {
        return ccid;
    }

    /**
     * Define o valor da propriedade ccid.
     * 
     */
    public void setCCID(int value) {
        this.ccid = value;
    }

    /**
     * Obtém o valor da propriedade durability.
     * 
     */
    public int getDurability() {
        return durability;
    }

    /**
     * Define o valor da propriedade durability.
     * 
     */
    public void setDurability(int value) {
        this.durability = value;
    }

    /**
     * Obtém o valor da propriedade heat.
     * 
     */
    public float getHeat() {
        return heat;
    }

    /**
     * Define o valor da propriedade heat.
     * 
     */
    public void setHeat(float value) {
        this.heat = value;
    }

    /**
     * Obtém o valor da propriedade isDefault.
     * 
     */
    public boolean isIsDefault() {
        return isDefault;
    }

    /**
     * Define o valor da propriedade isDefault.
     * 
     */
    public void setIsDefault(boolean value) {
        this.isDefault = value;
    }

    /**
     * Obtém o valor da propriedade personaId.
     * 
     */
    public long getPersonaId() {
        return personaId;
    }

    /**
     * Define o valor da propriedade personaId.
     * 
     */
    public void setPersonaId(long value) {
        this.personaId = value;
    }

}