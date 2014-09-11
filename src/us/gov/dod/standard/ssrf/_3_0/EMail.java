/* 
 * The MIT License
 *
 * Copyright 2014 Jesse Caulfield <jesse@caulfield.org>.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package us.gov.dod.standard.ssrf._3_0;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf._3_0.adapter.*;
import us.gov.dod.standard.ssrf._3_0.domains.TString;
import us.gov.dod.standard.ssrf._3_0.lists.ListCBO;
import us.gov.dod.standard.ssrf._3_0.lists.ListCCL;

/**
 * <p>
 * Java class for EMail complex type.
 * <p>
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * <
 * pre>
 * &lt;complexType name="EMail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Preferred" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TListCBO" minOccurs="0"/>
 *         &lt;element name="Type" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS20" minOccurs="0"/>
 *         &lt;element name="MaxCls" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TListCCL" minOccurs="0"/>
 *         &lt;element name="Address" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS255"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p>
 * <p>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EMail", propOrder = {
  "preferred",
  "type",
  "maxCls",
  "address"
})
public class EMail {

  @XmlElement(name = "Preferred", required = false)
  private TString preferred;
  @XmlElement(name = "Type", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS20.class)
  private TString type;
  @XmlElement(name = "MaxCls", required = false)
  private TString maxCls;
  @XmlElement(name = "Address", required = true)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS255.class)
  private TString address;

  /**
   * Gets the value of the preferred property.
   * <p>
   * @return possible object is
   *         
   * <p>
   */
  public TString getPreferred() {
    return preferred;
  }

  /**
   * Sets the value of the preferred property.
   * <p>
   * @param value allowed object is
   *              
   * <p>
   */
  public void setPreferred(TString value) {
    this.preferred = value;
  }

  public boolean isSetPreferred() {
    return (this.preferred != null);
  }

  /**
   * Gets the value of the type property.
   * <p>
   * @return possible object is
   *         
   * <p>
   */
  public TString getType() {
    return type;
  }

  /**
   * Sets the value of the type property.
   * <p>
   * @param value allowed object is
   *              
   * <p>
   */
  public void setType(TString value) {
    this.type = value;
  }

  public boolean isSetType() {
    return (this.type != null);
  }

  /**
   * Gets the value of the maxCls property.
   * <p>
   * @return possible object is
   *         
   * <p>
   */
  public TString getMaxCls() {
    return maxCls;
  }

  /**
   * Sets the value of the maxCls property.
   * <p>
   * @param value allowed object is
   *              
   * <p>
   */
  public void setMaxCls(TString value) {
    this.maxCls = value;
  }

  public boolean isSetMaxCls() {
    return (this.maxCls != null);
  }

  /**
   * Gets the value of the address property.
   * <p>
   * @return 
   */
  public TString getAddress() {
    return address;
  }

  /**
   * Sets the value of the address property.
   * <p>
   * @param value 
   */
  public void setAddress(TString value) {
    this.address = value;
  }

  public boolean isSetAddress() {
    return (this.address != null);
  }

  public EMail withPreferred(ListCBO value) {
    setPreferred(new TString(value.value()));
    return this;
  }

  public EMail withType(String value) {
    setType(new TString(value));
    return this;
  }

  public EMail withMaxCls(ListCCL value) {
    setMaxCls(new TString(value.value()));
    return this;
  }

  public EMail withAddress(String value) {
    setAddress(new TString(value));
    return this;
  }

}
