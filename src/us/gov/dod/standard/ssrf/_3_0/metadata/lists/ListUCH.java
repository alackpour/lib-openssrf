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
package us.gov.dod.standard.ssrf._3_0.metadata.lists;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

/**
 * Java class for ListUCH.
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * <pre>
 * &lt;simpleType name="ListUCH"> &lt;restriction
 * base="{urn:us:gov:dod:standard:ssrf:3.0.0}S50"> &lt;enumeration
 * value="NOISE"/> &lt;enumeration value="PULSED"/> &lt;enumeration value="VOICE
 * ENGLISH"/> &lt;enumeration value="VOICE FOREIGN"/> &lt;enumeration
 * value="OTHERS NEARBY AFFECTED"/> &lt;enumeration value="OTHERS FAR AWAY
 * AFFECTED"/> &lt;enumeration value="INTERFERENCE FOLLOWS WHEN I CHANGE"/>
 * &lt;enumeration value="GARBLED"/> &lt;enumeration value="FRAME LOSS"/>
 * &lt;enumeration value="STEADY RECEIVE INDICATION (SRI)"/> &lt;enumeration
 * value="REDUCED RANGE"/> &lt;enumeration value="FALSE TARGETS"/>
 * &lt;enumeration value="REDUCED INTELLIGIBILITY (VOICE)"/> &lt;enumeration
 * value="DATA ERRORS"/> &lt;/restriction> &lt;/simpleType>
 * </pre>
 * <p>
 */
@XmlType(name = "ListUCH")
@XmlEnum
public enum ListUCH {

  NOISE("NOISE"),
  PULSED("PULSED"),
  @XmlEnumValue("VOICE ENGLISH")
  VOICE_ENGLISH("VOICE ENGLISH"),
  @XmlEnumValue("VOICE FOREIGN")
  VOICE_FOREIGN("VOICE FOREIGN"),
  @XmlEnumValue("OTHERS NEARBY AFFECTED")
  OTHERS_NEARBY_AFFECTED("OTHERS NEARBY AFFECTED"),
  @XmlEnumValue("OTHERS FAR AWAY AFFECTED")
  OTHERS_FAR_AWAY_AFFECTED("OTHERS FAR AWAY AFFECTED"),
  @XmlEnumValue("INTERFERENCE FOLLOWS WHEN I CHANGE")
  INTERFERENCE_FOLLOWS_WHEN_I_CHANGE("INTERFERENCE FOLLOWS WHEN I CHANGE"),
  GARBLED("GARBLED"),
  @XmlEnumValue("FRAME LOSS")
  FRAME_LOSS("FRAME LOSS"),
  @XmlEnumValue("STEADY RECEIVE INDICATION (SRI)")
  STEADY_RECEIVE_INDICATION_SRI("STEADY RECEIVE INDICATION (SRI)"),
  @XmlEnumValue("REDUCED RANGE")
  REDUCED_RANGE("REDUCED RANGE"),
  @XmlEnumValue("FALSE TARGETS")
  FALSE_TARGETS("FALSE TARGETS"),
  @XmlEnumValue("REDUCED INTELLIGIBILITY (VOICE)")
  REDUCED_INTELLIGIBILITY_VOICE("REDUCED INTELLIGIBILITY (VOICE)"),
  @XmlEnumValue("DATA ERRORS")
  DATA_ERRORS("DATA ERRORS");
  private final String value;

  ListUCH(String v) {
    value = v;
  }

  public String value() {
    return value;
  }

  public static ListUCH fromValue(String v) {
    for (ListUCH c : ListUCH.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }

}