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
import us.gov.dod.standard.ssrf._3_1.receiver.Deployment;

/**
 * Enumerated values for fields using the ListCIN type.
 * <p>
 * Used in {@link Deployment}
 * <p>
 * @author Key Bridge Global LLC <developer@keybridgeglobal.com>
 * @version 3.1.0, 10/01/2014
 */
@XmlType(name = "ListCIN")
@XmlEnum
public enum ListCIN {

  @XmlEnumValue("Air")
  AIR("Air"),
  @XmlEnumValue("Amphibious")
  AMPHIBIOUS("Amphibious"),
  @XmlEnumValue("Deep Space")
  DEEP_SPACE("Deep Space"),
  @XmlEnumValue("Handheld")
  HANDHELD("Handheld"),
  @XmlEnumValue("Land")
  LAND("Land"),
  @XmlEnumValue("Land Fixed")
  LAND_FIXED("Land Fixed"),
  @XmlEnumValue("Land Mobile")
  LAND_MOBILE("Land Mobile"),
  @XmlEnumValue("Manpack")
  MANPACK("Manpack"),
  @XmlEnumValue("Missile")
  MISSILE("Missile"),
  @XmlEnumValue("Non Synchronous Orbit")
  NON_SYNCHRONOUS_ORBIT("Non Synchronous Orbit"),
  @XmlEnumValue("Unmanned Aerial Vehicle (UAV)")
  UNMANNED_AERIAL_VEHICLE__UAV__("Unmanned Aerial Vehicle (UAV)"),
  @XmlEnumValue("Unmanned Aircraft System (UAS)")
  UNMANNED_AIRCRAFT_SYSTEM__UAS__("Unmanned Aircraft System (UAS)"),
  @XmlEnumValue("Unmanned Ground Vehicle (UGV)")
  UNMANNED_GROUND_VEHICLE__UGV__("Unmanned Ground Vehicle (UGV)"),
  @XmlEnumValue("Unmanned Surface Vehicle (USV)")
  UNMANNED_SURFACE_VEHICLE__USV__("Unmanned Surface Vehicle (USV)"),
  @XmlEnumValue("Unmanned Underwater Vehicle (UUV)")
  UNMANNED_UNDERWATER_VEHICLE__UUV__("Unmanned Underwater Vehicle (UUV)"),
  @XmlEnumValue("Satellite")
  SATELLITE("Satellite"),
  @XmlEnumValue("Shipboard")
  SHIPBOARD("Shipboard"),
  @XmlEnumValue("Space")
  SPACE("Space"),
  @XmlEnumValue("Submarine")
  SUBMARINE("Submarine"),
  @XmlEnumValue("Synchronous Orbit")
  SYNCHRONOUS_ORBIT("Synchronous Orbit"),
  @XmlEnumValue("Transport")
  TRANSPORT("Transport"),
  @XmlEnumValue("Water")
  WATER("Water"),
  @XmlEnumValue("Other")
  OTHER("Other");
  private final String value;

  ListCIN(String v) {
    value = v;
  }

  public String value() {
    return value;
  }

  public static ListCIN fromValue(String v) {
    for (ListCIN c : ListCIN.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }

}