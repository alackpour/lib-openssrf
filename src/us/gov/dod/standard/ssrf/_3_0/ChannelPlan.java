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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf._3_0.adapter.*;
import us.gov.dod.standard.ssrf._3_0.common.Channel;
import us.gov.dod.standard.ssrf._3_0.metadata.domains.TString;

/**
 * <p>
 * Java class for ChannelPlan complex type.
 * <p>
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <p>
 * <
 * pre>
 * &lt;complexType name="ChannelPlan"> &lt;complexContent> &lt;extension
 * base="{urn:us:gov:dod:standard:ssrf:3.0.0}Common"> &lt;sequence> &lt;element
 * name="Name" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS100"/> &lt;element
 * name="Channel" type="{urn:us:gov:dod:standard:ssrf:3.0.0}Channel"
 * maxOccurs="unbounded"/> &lt;/sequence> &lt;/extension> &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * <p>
 * <p>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChannelPlan", propOrder = {
  "name",
  "channel"
})
public class ChannelPlan extends Common<ChannelPlan> {

  @XmlElement(name = "Name", required = true)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS100.class)
  private TString name;
  @XmlElement(name = "Channel", required = true)
  private List<Channel> channel;

  /**
   * Gets the value of the name property.
   * <p>
   * @return
   */
  public TString getName() {
    return name;
  }

  /**
   * Sets the value of the name property.
   * <p>
   * @param value
   */
  public void setName(TString value) {
    this.name = value;
  }

  public boolean isSetName() {
    return (this.name != null);
  }

  /**
   * Gets the value of the channel property.
   * <p>
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the channel property.
   * <p>
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getChannel().add(newItem);
   * </pre>
   * <p>
   * <p>
   * <p>
   * Objects of the following type(s) are allowed in the list
   * <p>
   * <p>
   * @return
   */
  public List<Channel> getChannel() {
    if (channel == null) {
      channel = new ArrayList<>();
    }
    return this.channel;
  }

  public boolean isSetChannel() {
    return ((this.channel != null) && (!this.channel.isEmpty()));
  }

  public void unsetChannel() {
    this.channel = null;
  }

  public ChannelPlan withName(String value) {
    setName(new TString(value));
    return this;
  }

  public ChannelPlan withChannel(Channel... values) {
    if (values != null) {
      getChannel().addAll(Arrays.asList(values));
    }
    return this;
  }

  public ChannelPlan withChannel(Collection<Channel> values) {
    if (values != null) {
      getChannel().addAll(values);
    }
    return this;
  }

}
