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
package us.gov.dod.standard.ssrf._3_0.spectrumsupportability;

import java.util.*;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf._3_0.adapter.*;
import us.gov.dod.standard.ssrf._3_0.metadata.Comment;
import us.gov.dod.standard.ssrf._3_0.metadata.domains.TCalendar;
import us.gov.dod.standard.ssrf._3_0.metadata.domains.TString;

/**
 * Java class for CommentSource complex type.
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <pre>
 * &lt;complexType name="CommentSource"> &lt;complexContent> &lt;restriction
 * base="{http://www.w3.org/2001/XMLSchema}anyType"> &lt;sequence> &lt;element
 * name="Source" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS100"
 * minOccurs="0"/> &lt;element name="Author"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS100" minOccurs="0"/> &lt;element
 * name="JobTitle" type="{urn:us:gov:dod:standard:ssrf:3.0.0}TS100"
 * minOccurs="0"/> &lt;element name="Date"
 * type="{urn:us:gov:dod:standard:ssrf:3.0.0}TD" minOccurs="0"/> &lt;element
 * name="Comment" type="{urn:us:gov:dod:standard:ssrf:3.0.0}Comment"
 * maxOccurs="unbounded" minOccurs="0"/> &lt;/sequence> &lt;/restriction>
 * &lt;/complexContent> &lt;/complexType>
 * </pre>
 * <p>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommentSource", propOrder = {
  "source",
  "author",
  "jobTitle",
  "date",
  "comment"
})
public class CommentSource {

  @XmlElement(name = "Source", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS100.class)
  private TString source;
  @XmlElement(name = "Author", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS100.class)
  private TString author;
  @XmlElement(name = "JobTitle", required = false)
  @XmlJavaTypeAdapter(type = TString.class, value = XmlAdapterS100.class)
  private TString jobTitle;
  @XmlElement(name = "Date", required = false)
  @XmlJavaTypeAdapter(type = TCalendar.class, value = XmlAdapterDATE.class)
  private TCalendar date;
  @XmlElement(name = "Comment", nillable = true)
  private List<Comment> comment;

  /**
   * Gets the value of the source property.
   * <p>
   * @return 
   */
  public TString getSource() {
    return source;
  }

  /**
   * Sets the value of the source property.
   * <p>
   * @param value 
   */
  public void setSource(TString value) {
    this.source = value;
  }

  public boolean isSetSource() {
    return (this.source != null);
  }

  /**
   * Gets the value of the author property.
   * <p>
   * @return 
   */
  public TString getAuthor() {
    return author;
  }

  /**
   * Sets the value of the author property.
   * <p>
   * @param value 
   */
  public void setAuthor(TString value) {
    this.author = value;
  }

  public boolean isSetAuthor() {
    return (this.author != null);
  }

  /**
   * Gets the value of the jobTitle property.
   * <p>
   * @return 
   */
  public TString getJobTitle() {
    return jobTitle;
  }

  /**
   * Sets the value of the jobTitle property.
   * <p>
   * @param value 
   */
  public void setJobTitle(TString value) {
    this.jobTitle = value;
  }

  public boolean isSetJobTitle() {
    return (this.jobTitle != null);
  }

  /**
   * Gets the value of the date property.
   * <p>
   * @return 
   */
  public TCalendar getDate() {
    return date;
  }

  /**
   * Sets the value of the date property.
   * <p>
   * @param value 
   */
  public void setDate(TCalendar value) {
    this.date = value;
  }

  public boolean isSetDate() {
    return (this.date != null);
  }

  /**
   * Gets the value of the comment property.
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the comment property.
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getComment().add(newItem);
   * </pre>
   * <p>
   * Objects of the following type(s) are allowed in the list
   * <p>
   * @return
   */
  public List<Comment> getComment() {
    if (comment == null) {
      comment = new ArrayList<>();
    }
    return this.comment;
  }

  public boolean isSetComment() {
    return ((this.comment != null) && (!this.comment.isEmpty()));
  }

  public void unsetComment() {
    this.comment = null;
  }

  public CommentSource withSource(String value) {
    setSource(new TString(value));
    return this;
  }

  public CommentSource withAuthor(String value) {
    setAuthor(new TString(value));
    return this;
  }

  public CommentSource withJobTitle(String value) {
    setJobTitle(new TString(value));
    return this;
  }

  public CommentSource withDate(Calendar value) {
    setDate(new TCalendar(value));
    return this;
  }

  public CommentSource withComment(Comment... values) {
    if (values != null) {
      getComment().addAll(Arrays.asList(values));
    }
    return this;
  }

  public CommentSource withComment(Collection<Comment> values) {
    if (values != null) {
      getComment().addAll(values);
    }
    return this;
  }

}