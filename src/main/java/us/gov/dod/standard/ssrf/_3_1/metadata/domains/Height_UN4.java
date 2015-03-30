package us.gov.dod.standard.ssrf._3_1.metadata.domains;

import java.math.BigInteger;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import us.gov.dod.standard.ssrf._3_1.adapter.types.XmlAdapterHEIGHT_UN4;
import us.gov.dod.standard.ssrf._3_1.metadata.AMetadata;

/**
 * The SSRF Height_UN4 data type.
 * <p>
 * @author Key Bridge LLC <developer@keybridge.ch>
 * @version 3.1.0, 03/30/2015
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Height_UN4", propOrder = {"value"})
public class Height_UN4 extends AMetadata<Height_UN4> implements Comparable<Height_UN4> {

  /**
   * The value property.
   */
  @XmlValue
  @XmlJavaTypeAdapter(XmlAdapterHEIGHT_UN4.class)
  protected BigInteger value;

  /**
   * Construct a new, empty Height_UN4 instance.
   */
  public Height_UN4() {
  }

  /**
   * Construct a new Height_UN4 instance with the given initial value.
   * <p>
   * @param value The initial value.
   */
  public Height_UN4(BigInteger value) {
    this.value = value;
  }

  /**
   * Construct a new Height_UN4 instance with the given initial value.
   * <p>
   * @param value The initial value.
   */
  public Height_UN4(Integer value) {
    this.value = BigInteger.valueOf(value);
  }

  /**
   * Get the value of the value property.
   * <p>
   * @return the value of the value property
   */
  public BigInteger getValue() {
    return value;
  }

  /**
   * Set the value of the value property.
   * <p>
   * @param the value
   */
  public void setValue(BigInteger value) {
    this.value = value;
  }

  /**
   * Determine if the value property is configured.
   * <p>
   * @return TRUE if the value is set, FALSE if the value is null
   */
  public boolean isSetValue() {
    return this.value != null;
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  @Override
  public boolean isSet() {
    return super.isSet() && isSetValue();
  }

  /**
   * Get a string representation of this data wrapper value.
   * <p>
   * @return The current data value.
   */
  @Override
  public String toString() {
    return this.value != null ? this.value.toString() : null;
  }

  //<editor-fold defaultstate="collapsed" desc="Hashcode Equals and Comparable">
  /**
   * Hash code is based upon the value.
   * <p>
   * @return a unique hash code from the value.
   */
  @Override
  public int hashCode() {
    int hash = 7;
    hash = 97 * hash + Objects.hashCode(this.value);
    return hash;
  }

  /**
   * Equality is based upon the value.
   * <p>
   * @param obj the other object to compare.
   * @return TRUE if the values match exactly.
   */
  @Override
  public boolean equals(Object obj) {
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    return Objects.equals(this.value, ((Height_UN4) obj).getValue());
  }

  /**
   * Comparison and sorting.
   * <p>
   * @param obj the other object to compare
   * @return the sorting order.
   */
  @Override
  public int compareTo(Height_UN4 obj) {
    if (obj == null) {
      return -1;
    }
    if (this.value == null) {
      return 1;
    }
    return this.value.compareTo(obj.getValue());
  }//</editor-fold>
}
