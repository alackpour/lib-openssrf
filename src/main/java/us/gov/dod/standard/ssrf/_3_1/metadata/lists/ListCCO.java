/* 
 * Copyright 2015 Key Bridge LLC.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package us.gov.dod.standard.ssrf._3_1.metadata.lists;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;
import us.gov.dod.standard.ssrf._3_1.IntfReport;
import us.gov.dod.standard.ssrf._3_1.assignment.StationConfig;

/**
 * Enumerated values for fields using the ListCCO type.
 * <p>
 * Used in {@link IntfReport}, {@link StationConfig}
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 3.1.0, 10/01/2014
 */
@XmlType(name = "ListCCO")
@XmlEnum
public enum ListCCO {

  @XmlEnumValue("Global ")
  GLOBAL("Global "),
  @XmlEnumValue("Eastern Hemisphere ")
  EASTERN_HEMISPHERE("Eastern Hemisphere "),
  @XmlEnumValue("Western Hemisphere ")
  WESTERN_HEMISPHERE("Western Hemisphere "),
  @XmlEnumValue("Northern Hemisphere ")
  NORTHERN_HEMISPHERE("Northern Hemisphere "),
  @XmlEnumValue("Southern Hemisphere ")
  SOUTHERN_HEMISPHERE("Southern Hemisphere "),
  @XmlEnumValue("North-eastern Earth Quarter ")
  NORTH_EASTERN_EARTH_QUARTER("North-eastern Earth Quarter "),
  @XmlEnumValue("North-western Earth Quarter ")
  NORTH_WESTERN_EARTH_QUARTER("North-western Earth Quarter "),
  @XmlEnumValue("South-eastern Earth Quarter")
  SOUTH_EASTERN_EARTH_QUARTER("South-eastern Earth Quarter"),
  @XmlEnumValue("South-western Earth Quarter ")
  SOUTH_WESTERN_EARTH_QUARTER("South-western Earth Quarter "),
  @XmlEnumValue("Narrow Beam")
  NARROW_BEAM("Narrow Beam"),
  @XmlEnumValue("Other")
  OTHER("Other");
  private final String value;

  ListCCO(String v) {
    value = v;
  }

  public String value() {
    return value;
  }

  public static ListCCO fromValue(String v) {
    for (ListCCO c : ListCCO.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }

}
