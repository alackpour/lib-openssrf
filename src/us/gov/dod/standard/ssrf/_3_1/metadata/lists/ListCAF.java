/* 
 * The MIT License
 *
 * Copyright 2014 Key Bridge Global LLC.
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
package us.gov.dod.standard.ssrf._3_1.metadata.lists;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;
import us.gov.dod.standard.ssrf._3_1.antenna.AntHardware;

/**
 * Enumerated values for fields using the ListCAF type.
 * <p>
 * Used in {@link AntHardware}
 * <p>
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version 3.1.0, 10/01/2014
 */
@XmlType(name = "ListCAF")
@XmlEnum
public enum ListCAF {

  @XmlEnumValue("Balun")
  BALUN("Balun"),
  @XmlEnumValue("Cassegrain")
  CASSEGRAIN("Cassegrain"),
  @XmlEnumValue("Eight Feed Horn Cluster")
  EIGHT_FEED_HORN_CLUSTER("Eight Feed Horn Cluster"),
  @XmlEnumValue("Feed Horn Cluster")
  FEED_HORN_CLUSTER("Feed Horn Cluster"),
  @XmlEnumValue("Four Horn Cluster")
  FOUR_HORN_CLUSTER("Four Horn Cluster"),
  @XmlEnumValue("Conical")
  CONICAL("Conical"),
  @XmlEnumValue("Cutler")
  CUTLER("Cutler"),
  @XmlEnumValue("Dipole")
  DIPOLE("Dipole"),
  @XmlEnumValue("Dipole Array")
  DIPOLE_ARRAY("Dipole Array"),
  @XmlEnumValue("Rotating Dipole")
  ROTATING_DIPOLE("Rotating Dipole"),
  @XmlEnumValue("Faired Set Horns")
  FAIRED_SET_HORNS("Faired Set Horns"),
  @XmlEnumValue("Float Strip Type Power Divider")
  FLOAT_STRIP_TYPE_POWER_DIVIDER("Float Strip Type Power Divider"),
  @XmlEnumValue("Half Wave Radiator")
  HALF_WAVE_RADIATOR("Half Wave Radiator"),
  @XmlEnumValue("Horn")
  HORN("Horn"),
  @XmlEnumValue("Horn-Rotating Spinner")
  HORN_ROTATING_SPINNER("Horn-Rotating Spinner"),
  @XmlEnumValue("Lens")
  LENS("Lens"),
  @XmlEnumValue("Lewis Scanner")
  LEWIS_SCANNER("Lewis Scanner"),
  @XmlEnumValue("Multiple Array Of Folded Dipoles")
  MULTIPLE_ARRAY_OF_FOLDED_DIPOLES("Multiple Array Of Folded Dipoles"),
  @XmlEnumValue("Multiple Feed Horn Array")
  MULTIPLE_FEED_HORN_ARRAY("Multiple Feed Horn Array"),
  @XmlEnumValue("Pill Box")
  PILL_BOX("Pill Box"),
  @XmlEnumValue("Probe")
  PROBE("Probe"),
  @XmlEnumValue("Rod")
  ROD("Rod"),
  @XmlEnumValue("Slot")
  SLOT("Slot"),
  @XmlEnumValue("Slotted Linear Array")
  SLOTTED_LINEAR_ARRAY("Slotted Linear Array"),
  @XmlEnumValue("Waveguide")
  WAVEGUIDE("Waveguide"),
  @XmlEnumValue("Yagi Element")
  YAGI_ELEMENT("Yagi Element"),
  @XmlEnumValue("Other")
  OTHER("Other");
  private final String value;

  ListCAF(String v) {
    value = v;
  }

  public String value() {
    return value;
  }

  public static ListCAF fromValue(String v) {
    for (ListCAF c : ListCAF.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }

}