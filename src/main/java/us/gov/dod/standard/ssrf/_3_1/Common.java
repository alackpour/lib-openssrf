/*
 * Copyright 2014 Key Bridge Global LLC.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package us.gov.dod.standard.ssrf._3_1;

import java.math.BigInteger;
import java.util.*;
import javax.xml.bind.annotation.*;
import us.gov.dod.standard.ssrf.SSRF;
import us.gov.dod.standard.ssrf._3_1.adapter.*;
import us.gov.dod.standard.ssrf._3_1.adapter.types.*;
import us.gov.dod.standard.ssrf._3_1.common.CaseNum;
import us.gov.dod.standard.ssrf._3_1.common.ExtReferenceRef;
import us.gov.dod.standard.ssrf._3_1.common.Remarks;
import us.gov.dod.standard.ssrf._3_1.common.SecurityClass;
import us.gov.dod.standard.ssrf._3_1.metadata.domains.*;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCBO;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCCL;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCCY;
import us.gov.dod.standard.ssrf._3_1.metadata.lists.ListCSU;

/**
 * Common is the parent complex element for all Datasets.
 * <p>
 * Sub-Elements are
 * {@link CaseNum}, {@link ExtReferenceRef}, {@link Remarks}, {@link SecurityClass}
 * <p>
 * @author Jesse Caulfield
 * @version SSRF 3.1.0, 09/30/2014
 * @param <T> The inheriting class type
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Common", propOrder = {
  "lastObservedBy",
  "observedFirstDateTime",
  "observedLastDateTime",
  "approvedBy",
  "approvedDateTime",
  "redacted",
  "serial",
  "entryDateTime",
  "entryBy",
  "owner",
  "lastChangeDateTime",
  "lastChangeBy",
  "lastReviewDate",
  "lastReviewBy",
  "modAllowedBy",
  "state",
  "description",
  "securityClass",
  "caseNum",
  "extReferenceRef",
  "remarks"
})
@XmlSeeAlso({
  Administrative.class,
  Allotment.class,
  Antenna.class,
  Assignment.class,
  ChannelPlan.class,
  Contact.class,
  ExternalReference.class,
  FEDeployment.class,
  ForceElement.class,
  IntfReport.class,
  JRFL.class,
  Loadset.class,
  Location.class,
  Message.class,
  Note.class,
  Organisation.class,
  RadiationPlan.class,
  Receiver.class,
  RFSystem.class,
  Role.class,
  Satellite.class,
  SSReply.class,
  SSRequest.class,
  TOA.class,
  Transmitter.class
})
@SuppressWarnings("unchecked")
public abstract class Common<T> implements Comparable<T> {

  /**
   * cls - Classification (Required)
   * <p>
   * The classification of the current data item. This attribute is REQUIRED on
   * each data item, even if the classification is "U".
   * <p>
   * Format is L:CCL
   */
  @XmlAttribute(name = "cls", required = true)
  private ListCCL cls;
  /**
   * Serial - Serial (Required)
   * <p>
   * A unique Dataset identifier.
   * <p>
   * Serial is composed of four parts separated by colons (":"). The maximum
   * total length is 29 characters (5+1+4+1+2+1+15).
   * <ul>
   * <li>Part 1 is the Country and is always REQUIRED. It contains one to five
   * alphabetic uppercase characters representing either the ITU country code or
   * the NATO Command code identifying the originator or organisation
   * responsible for maintaining the dataset, as listed in Code List CCY. </li>
   * <li>Part 2 is the orgCode and is OPTIONAL. It may contain one to four
   * alphanumeric characters (no spaces nor special characters) representing a
   * code for an Organisation within the country or command. It will normally
   * indicate the organisation responsible for maintaining the dataset. Domain
   * naming is left at the discretion of each country, but should be managed by
   * a central authority in the country to allow deconfliction and uniqueness.
   * It should enable the location in the data repository where this dataset
   * information is stored. </li>
   * <li>Part 3 is the Dataset Type and MUST contain a two-character code from
   * the table in the Introduction section identifying the type of dataset (LO
   * for a Location, etc). </li>
   * <li>Part 4 is a Serial Identifier and is always REQUIRED. It contains one
   * to fifteen alphanumeric characters (including spaces and special
   * characters), whose meaning is left at the discretion of each domain
   * manager.</li>
   * </ul>
   * <p>
   * Format is pattern (S29)
   * <p>
   * Attribute group Initial (Required)
   */
  @XmlElement(name = "Serial", required = true)
  @XmlTypeValidator(type = TSerial.class, value = XmlAdapterSERIAL.class)
  private TSerial serial;
  /**
   * EntryDateTime - Entry Date/Time (Required)
   * <p>
   * The date and UTC Time the dataset was initially entered into the data
   * repository (e.g., FRRS for USA, SMIR for NATO).
   * <p>
   * Format is DateTime
   * <p>
   * Attribute group Initial (Required)
   */
  @XmlElement(name = "EntryDateTime", required = true)
  private TDateTime entryDateTime;

  //<editor-fold defaultstate="collapsed" desc="Class Fields (Optional)">
  /**
   * US:LastObservedBy - Last Observed By (Optional)
   * <p>
   * The identifier of the person or entity who last observed this Dataset.
   * <p>
   * Format is S50
   */
  @XmlElement(name = "LastObservedBy", required = false)
  @XmlTypeValidator(type = TString.class, value = XmlAdapterS50.class)
  private TString lastObservedBy;
  /**
   * US:ObservedFirstDateTime - Initial Signal Detected Timestamp (Optional)
   * <p>
   * The date and time, based on Greenwich Mean Time (GMT), the subject signal
   * was first collected.
   * <p>
   * Format is DateTime
   */
  @XmlElement(name = "ObservedFirstDateTime", required = false)
  private TDateTime observedFirstDateTime;
  /**
   * US:ObservedLastDateTime - Last Signal Detected Timestamp (Optional)
   * <p>
   * The date and time, based on Greenwich Mean Time (GMT), the subject signal
   * was last collected.
   * <p>
   * Format is DateTime
   */
  @XmlElement(name = "ObservedLastDateTime", required = false)
  private TDateTime observedLastDateTime;
  /**
   * US:ApprovedBy - Last Approval Person (Optional)
   * <p>
   * The identifier of the designated expert who last approved or accepted the
   * dataset.
   * <p>
   * Format is S50
   */
  @XmlElement(name = "ApprovedBy", required = false)
  @XmlTypeValidator(type = TString.class, value = XmlAdapterS50.class)
  private TString approvedBy;
  /**
   * US:ApprovedDateTime - Last Approval Timestamp (Optional)
   * <p>
   * The last date and time, based on Greenwich Mean Time (GMT), that the
   * dataset was approved or accepted by a designated expert.
   * <p>
   * Format is DateTime
   */
  @XmlElement(name = "ApprovedDateTime", required = false)
  private TDateTime approvedDateTime;
  /**
   * Redacted (US), indicate if any original, or authoritative, data was
   * omitted. Supports datasets which have some data withheld by the submitting
   * agency.
   */
  @XmlElement(name = "Redacted", required = false)
  private TString redacted;

  /**
   * EntryBy - Creator Role (Optional)
   * <p>
   * The serial of the Role which is creating the current dataset.
   * <p>
   * Format is pattern (S29)
   * <p>
   * Attribute group Initial (Required)
   */
  @XmlElement(name = "EntryBy", required = false)
  @XmlTypeValidator(type = TSerial.class, value = XmlAdapterSERIAL.class)
  private TSerial entryBy;
  /**
   * Owner - Role which Owns the Dataset (Optional)
   * <p>
   * The serial of the Role which is responsible for the accuracy of the data
   * content.
   * <p>
   * Format is pattern (S29)
   * <p>
   * Attribute group Initial (Required)
   */
  @XmlElement(name = "Owner", required = false)
  @XmlTypeValidator(type = TSerial.class, value = XmlAdapterSERIAL.class)
  private TSerial owner;
  /**
   * LastChangeDateTime - Latest Modification Date/Time (Optional)
   * <p>
   * The date and UTC Time the dataset was last modified.
   * <p>
   * Format is DateTime
   * <p>
   * Attribute group LastChange (Optional)
   */
  @XmlElement(name = "LastChangeDateTime", required = false)
  private TDateTime lastChangeDateTime;
  /**
   * LastChangeBy - Last Modifier Role (Optional)
   * <p>
   * The serial of the Role which last modified the current dataset.
   * <p>
   * Format is pattern (S29)
   * <p>
   * Attribute group LastChange (Optional)
   */
  @XmlElement(name = "LastChangeBy", required = false)
  @XmlTypeValidator(type = TSerial.class, value = XmlAdapterSERIAL.class)
  private TSerial lastChangeBy;
  /**
   * LastReviewDate - Last Review Date (Optional)
   * <p>
   * The last date that the dataset was reviewed.
   * <p>
   * Format is Date
   * <p>
   * Attribute group LastReview (Optional)
   */
  @XmlElement(name = "LastReviewDate", required = false)
  private TDate lastReviewDate;
  /**
   * LastReviewBy - Last Review Person RoleRef (Optional)
   * <p>
   * The Role reference serial of the person who last reviewed the dataset.
   * <p>
   * Format is pattern (S29)
   * <p>
   * Attribute group LastReview (Optional)
   */
  @XmlElement(name = "LastReviewBy", required = false)
  @XmlTypeValidator(type = TSerial.class, value = XmlAdapterSERIAL.class)
  private TSerial lastReviewBy;
  /**
   * ModAllowedBy - Role Allowed to Modify (Optional)
   * <p>
   * The serial of the Role which is authorized to modify the current dataset.
   * <p>
   * Format is pattern (S29)
   * <p>
   * Divergence from SMADEF: Automated changes using ModAllowedBy are not
   * permitted for use by USA systems.
   */
  @XmlElement(name = "ModAllowedBy", required = false)
  @XmlTypeValidator(type = TSerial.class, value = XmlAdapterSERIAL.class)
  private TSerial modAllowedBy;
  /**
   * State - Dataset Status (Optional)
   * <p>
   * The state of the dataset.
   * <p>
   * Format is L:CSU
   */
  @XmlElement(name = "State", required = false)
  private TString state;
  /**
   * Description - General Dataset Description (Optional)
   * <p>
   * A general description of the Dataset that is inheriting Common.
   * <p>
   * Format is S500
   */
  @XmlElement(name = "Description", required = false)
  @XmlTypeValidator(type = TString.class, value = XmlAdapterS500.class)
  private TString description;
  /**
   * US:SecurityClass (Optional)
   * <p>
   * SecurityClass (US) contains the security classification from one or more
   * data information sources.
   */
  @XmlElement(name = "SecurityClass")
  private SecurityClass securityClass;
  /**
   * CaseNum (Optional)
   * <p>
   * CaseNum provides the capability to store multiple identifiers for a
   * Dataset.
   */
  @XmlElement(name = "CaseNum")
  private Set<CaseNum> caseNum;
  /**
   * ExtReferenceRef (Optional)
   * <p>
   * ExtReferenceRef refers to an external reference defined in a dataset
   * ExternalReference.
   */
  @XmlElement(name = "ExtReferenceRef", nillable = true)
  private Set<ExtReferenceRef> extReferenceRef;
  /**
   * remarks - Remarks (Optional)
   * <p>
   * Remarks is a free text field that provides a place to add additional MEMO
   * information. In certain situations, technical data must be included in free
   * text in order to clearly explain a technical or operational consideration;
   * in these instances, the data must also be entered in the data element(s)
   * specifically established for it.
   */
  @XmlElement(name = "Remarks", nillable = true)
  private Set<Remarks> remarks;

  /**
   * releasability - Releasability Markings (Optional)
   * <p>
   * A list of country codes for which the current data item is releasable. For
   * NATO, if this element is omitted, there is no releasability restriction for
   * the data item. For the US, if this data item AND attribute US:legacy
   * Releasability are both blank, there is no releasability restriction for the
   * data item.
   * <p>
   * Format is List of L:CCY
   */
  @XmlList
  @XmlAttribute(name = "releasability")
  private Set<ListCCY> releasability;
  /**
   * remarks - Index reference to Data Item Remarks (Optional)
   * <p>
   * A list of Common/Remarks idx values applicable to the current data item.
   * <p>
   * Format is List of UN6
   */
  @XmlList
  @XmlAttribute(name = "remarks")
  @XmlTypeValidator(type = BigInteger.class, value = XmlAdapterNumberUN6.class)
  private Set<BigInteger> remarkRef;
  /**
   * extReferences - Links to External References (Optional)
   * <p>
   * A list of Common/ExtReferenceRef idx values applicable to the current data
   * item.
   * <p>
   * Format is List of UN6
   */
  @XmlList
  @XmlAttribute(name = "extReferences")
  @XmlTypeValidator(type = BigInteger.class, value = XmlAdapterNumberUN6.class)
  private Set<BigInteger> extReferences;
  /**
   * US:legacyReleasability - Legacy Releasability (Optional)
   * <p>
   * One or more special handling instructions in sentence format, not code
   * format. For example, "Approved for public release; distribution is
   * unlimited". Multiple special handling instructions are separated by "|”
   * (i.e., ASCII character #124).
   * <p>
   * Format is Memo
   */
  @XmlAttribute(name = "legacyReleasability")
  @XmlTypeValidator(type = String.class, value = XmlAdapterStringMEMO.class)
  private String legacyReleasability;
  /**
   * US:quality - Data Quality (Optional)
   * <p>
   * One or more data quality indicator(s), separated by "|” (i.e., ASCII
   * character #124), for the contents of the associated Data Item For example,
   * "Outlier" | "Non-CodeList".
   * <p>
   * Format is S255
   */
  @XmlAttribute(name = "quality")
  @XmlTypeValidator(type = String.class, value = XmlAdapterStringS255.class)
  private String quality;
  /**
   * US:recommendedValue - Recommended Value (Optional)
   * <p>
   * A value that is most probably correct.
   * <p>
   * Format is Memo
   */
  @XmlAttribute(name = "recommendedValue")
  @XmlTypeValidator(type = String.class, value = XmlAdapterStringMEMO.class)
  private String recommendedValue;
  /**
   * idref - Data Item ID (Optional)
   * <p>
   * A unique identifier for each Data Item in the Dataset. Within each Dataset,
   * the idref value must be unique for every occurrence. If a received Dataset
   * uses idrefs and it is expected that the Dataset will be exchanged, the
   * idrefs should be considered required. If the receiving system is the
   * permanent end of the line for the Dataset, the idrefs may be considered
   * optional.
   * <p>
   * Format is S10
   */
  @XmlAttribute(name = "idref")
  @XmlTypeValidator(type = String.class, value = XmlAdapterStringS10.class)
  private String idref;//</editor-fold>

  /**
   * Abstract constructor for the Common class type.
   * <p>
   * This constructor sets the minimum mandatory fields {@link #serial} with a
   * programmatically generated {@link TSerial} instance and
   * {@link #entryDateTime} with the current DATETIME.
   */
  @SuppressWarnings("unchecked")
  public Common() {
    this.serial = TSerial.getInstance((Class<? extends Common<?>>) this.getClass());
    this.entryDateTime = new TDateTime(Calendar.getInstance());
  }

  //<editor-fold defaultstate="collapsed" desc="Getters and Setters">
  /**
   * Get the identifier of the person or entity who last observed this Dataset.
   * <p>
   * @return the LastObservedBy value in a {@link TString} data type
   */
  public TString getLastObservedBy() {
    return lastObservedBy;
  }

  /**
   * Set the identifier of the person or entity who last observed this Dataset.
   * <p>
   * @param value the LastObservedBy value in a {@link TString} data type
   */
  public void setLastObservedBy(TString value) {
    this.lastObservedBy = value;
  }

  /**
   * Determine if the LastObservedBy is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetLastObservedBy() {
    return (this.lastObservedBy != null ? this.lastObservedBy.isSetValue() : false);
  }

  /**
   * Get the date and time, based on Greenwich Mean Time (GMT), the subject
   * signal was first collected.
   * <p>
   * @return the ObservedFirstDateTime value in a {@link TDateTime} data type
   */
  public TDateTime getObservedFirstDateTime() {
    return observedFirstDateTime;
  }

  /**
   * Set the date and time, based on Greenwich Mean Time (GMT), the subject
   * signal was first collected.
   * <p>
   * @param value the ObservedFirstDateTime value in a {@link TDateTime} data
   *              type
   */
  public void setObservedFirstDateTime(TDateTime value) {
    this.observedFirstDateTime = value;
  }

  /**
   * Determine if the ObservedFirstDateTime is configured.
   * <p>
   * If configured this method also inspects the {@link TDateTime} wrapped
   * value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetObservedFirstDateTime() {
    return (this.observedFirstDateTime != null ? this.observedFirstDateTime.isSetValue() : false);
  }

  /**
   * Get the date and time, based on Greenwich Mean Time (GMT), the subject
   * signal was last collected.
   * <p>
   * @return the ObservedLastDateTime value in a {@link TDateTime} data type
   */
  public TDateTime getObservedLastDateTime() {
    return observedLastDateTime;
  }

  /**
   * Set the date and time, based on Greenwich Mean Time (GMT), the subject
   * signal was last collected.
   * <p>
   * @param value the ObservedLastDateTime value in a {@link TDateTime} data
   *              type
   */
  public void setObservedLastDateTime(TDateTime value) {
    this.observedLastDateTime = value;
  }

  /**
   * Determine if the ObservedLastDateTime is configured.
   * <p>
   * If configured this method also inspects the {@link TDateTime} wrapped
   * value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetObservedLastDateTime() {
    return (this.observedLastDateTime != null ? this.observedLastDateTime.isSetValue() : false);
  }

  /**
   * Get the identifier of the designated expert who last approved or accepted
   * the dataset.
   * <p>
   * @return the ApprovedBy value in a {@link TString} data type
   */
  public TString getApprovedBy() {
    return approvedBy;
  }

  /**
   * Set the identifier of the designated expert who last approved or accepted
   * the dataset.
   * <p>
   * @param value the ApprovedBy value in a {@link TString} data type
   */
  public void setApprovedBy(TString value) {
    this.approvedBy = value;
  }

  /**
   * Determine if the ApprovedBy is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetApprovedBy() {
    return (this.approvedBy != null ? this.approvedBy.isSetValue() : false);
  }

  /**
   * Get the last date and time, based on Greenwich Mean Time (GMT), that the
   * dataset was approved or accepted by a designated expert.
   * <p>
   * @return the ApprovedDateTime value in a {@link TDateTime} data type
   */
  public TDateTime getApprovedDateTime() {
    return approvedDateTime;
  }

  /**
   * Set the last date and time, based on Greenwich Mean Time (GMT), that the
   * dataset was approved or accepted by a designated expert.
   * <p>
   * @param value the ApprovedDateTime value in a {@link TDateTime} data type
   */
  public void setApprovedDateTime(TDateTime value) {
    this.approvedDateTime = value;
  }

  /**
   * Determine if the ApprovedDateTime is configured.
   * <p>
   * If configured this method also inspects the {@link TDateTime} wrapped
   * value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetApprovedDateTime() {
    return (this.approvedDateTime != null ? this.approvedDateTime.isSetValue() : false);
  }

  /**
   * Get Redacted (US), indicate if any original, or authoritative, data was
   * omitted. Supports datasets which have some data withheld by the submitting
   * agency.
   * <p>
   * @return the Redacted value in a {@link TString} data type
   */
  public TString getRedacted() {
    return redacted;
  }

  /**
   * Set Redacted (US), indicate if any original, or authoritative, data was
   * omitted. Supports datasets which have some data withheld by the submitting
   * agency.
   * <p>
   * @param value the Redacted value in a {@link TString} data type
   */
  public void setRedacted(TString value) {
    this.redacted = value;
  }

  /**
   * Determine if the Redacted is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetRedacted() {
    return (this.redacted != null ? this.redacted.isSetValue() : false);
  }

  /**
   * Get a unique Dataset identifier.
   * <p>
   * @return the Serial value in a {@link TSerial} data type
   */
  public TSerial getSerial() {
    return serial;
  }

  /**
   * Set a unique Dataset identifier.
   * <p>
   * @param value the Serial value in a {@link TSerial} data type
   */
  public void setSerial(TSerial value) {
    this.serial = value;
  }

  /**
   * Determine if the Serial is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetSerial() {
    return (this.serial != null ? this.serial.isSetValue() : false);
  }

  /**
   * Get the date and UTC Time the dataset was initially entered into the data
   * repository (e.g., FRRS for USA, SMIR for NATO).
   * <p>
   * @return the EntryDateTime value in a {@link TDateTime} data type
   */
  public TDateTime getEntryDateTime() {
    return entryDateTime;
  }

  /**
   * Set the date and UTC Time the dataset was initially entered into the data
   * repository (e.g., FRRS for USA, SMIR for NATO).
   * <p>
   * @param value the EntryDateTime value in a {@link TDateTime} data type
   */
  public void setEntryDateTime(TDateTime value) {
    this.entryDateTime = value;
  }

  /**
   * Determine if the EntryDateTime is configured.
   * <p>
   * If configured this method also inspects the {@link TDateTime} wrapped
   * value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetEntryDateTime() {
    return (this.entryDateTime != null ? this.entryDateTime.isSetValue() : false);
  }

  /**
   * Get the serial of the Role which is creating the current dataset.
   * <p>
   * @return the EntryBy value in a {@link TString} data type
   * @deprecated SSRF references are managed automatically. Use
   * {@link #getEntryByRole()} instead.
   */
  @Deprecated
  public TSerial getEntryBy() {
    return entryBy;
  }

  /**
   * Set the serial of the Role which is creating the current dataset.
   * <p>
   * @param value the EntryBy value in a {@link TString} data type
   * @deprecated SSRF references are managed automatically. Use
   * {@link #setEntryByRole(Role)} instead.
   */
  @Deprecated
  public void setEntryBy(TSerial value) {
    this.entryBy = value;
  }

  /**
   * Determine if the EntryBy is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetEntryBy() {
    return (this.entryBy != null ? this.entryBy.isSetValue() : false);
  }

  /**
   * Get the serial of the Role which is responsible for the accuracy of the
   * data content.
   * <p>
   * @return the Owner value in a {@link TString} data type
   * @deprecated SSRF references are managed automatically. Use
   * {@link #getOwnerRole()} instead.
   */
  @Deprecated
  public TSerial getOwner() {
    return owner;
  }

  /**
   * Set the serial of the Role which is responsible for the accuracy of the
   * data content.
   * <p>
   * @param value the Owner value in a {@link TString} data type
   * @deprecated SSRF references are managed automatically. Use
   * {@link #setOwnerRole(Role)} instead.
   */
  @Deprecated
  public void setOwner(TSerial value) {
    this.owner = value;
  }

  /**
   * Determine if the Owner is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetOwner() {
    return (this.owner != null ? this.owner.isSetValue() : false);
  }

  /**
   * Get the date and UTC Time the dataset was last modified.
   * <p>
   * @return the LastChangeDateTime value in a {@link TDateTime} data type
   */
  public TDateTime getLastChangeDateTime() {
    return lastChangeDateTime;
  }

  /**
   * Set the date and UTC Time the dataset was last modified.
   * <p>
   * @param value the LastChangeDateTime value in a {@link TDateTime} data type
   */
  public void setLastChangeDateTime(TDateTime value) {
    this.lastChangeDateTime = value;
  }

  /**
   * Determine if the LastChangeDateTime is configured.
   * <p>
   * If configured this method also inspects the {@link TDateTime} wrapped
   * value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetLastChangeDateTime() {
    return (this.lastChangeDateTime != null ? this.lastChangeDateTime.isSetValue() : false);
  }

  /**
   * Get the serial of the Role which last modified the current dataset.
   * <p>
   * @return the LastChangeBy value in a {@link TString} data type
   * @deprecated SSRF references are managed automatically. Use
   * {@link #getLastChangeByRole()} instead.
   */
  @Deprecated
  public TSerial getLastChangeBy() {
    return lastChangeBy;
  }

  /**
   * Set the serial of the Role which last modified the current dataset.
   * <p>
   * @param value the LastChangeBy value in a {@link TString} data type
   * @deprecated SSRF references are managed automatically. Use
   * {@link #setLastChangeByRole(Role)} instead.
   */
  @Deprecated
  public void setLastChangeBy(TSerial value) {
    this.lastChangeBy = value;
  }

  /**
   * Determine if the LastChangeBy is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetLastChangeBy() {
    return (this.lastChangeBy != null ? this.lastChangeBy.isSetValue() : false);
  }

  /**
   * Get the last date that the dataset was reviewed.
   * <p>
   * @return the LastReviewDate value in a {@link TDateTime} data type
   */
  public TDate getLastReviewDate() {
    return lastReviewDate;
  }

  /**
   * Set the last date that the dataset was reviewed.
   * <p>
   * @param value the LastReviewDate value in a {@link TDateTime} data type
   */
  public void setLastReviewDate(TDate value) {
    this.lastReviewDate = value;
  }

  /**
   * Determine if the LastReviewDate is configured.
   * <p>
   * If configured this method also inspects the {@link TDateTime} wrapped
   * value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetLastReviewDate() {
    return (this.lastReviewDate != null ? this.lastReviewDate.isSetValue() : false);
  }

  /**
   * Get the Role reference serial of the person who last reviewed the dataset.
   * <p>
   * @return the LastReviewBy value in a {@link TString} data type
   * @deprecated SSRF references are managed automatically. Use
   * {@link #getLastReviewByRole()} instead.
   */
  @Deprecated
  public TSerial getLastReviewBy() {
    return lastReviewBy;
  }

  /**
   * Set the Role reference serial of the person who last reviewed the dataset.
   * <p>
   * @param value the LastReviewBy value in a {@link TString} data type
   * @deprecated SSRF references are managed automatically. Use
   * {@link #setLastReviewByRole(Role)} instead.
   */
  @Deprecated
  public void setLastReviewBy(TSerial value) {
    this.lastReviewBy = value;
  }

  /**
   * Determine if the LastReviewBy is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetLastReviewBy() {
    return (this.lastReviewBy != null ? this.lastReviewBy.isSetValue() : false);
  }

  /**
   * Get the serial of the Role which is authorized to modify the current
   * dataset.
   * <p>
   * @return the ModAllowedBy value in a {@link TString} data type
   * @deprecated SSRF references are managed automatically. Use
   * {@link #getModAllowedByRole()} instead.
   */
  @Deprecated
  public TSerial getModAllowedBy() {
    return modAllowedBy;
  }

  /**
   * Set the serial of the Role which is authorized to modify the current
   * dataset.
   * <p>
   * @param value the ModAllowedBy value in a {@link TString} data type
   * @deprecated SSRF references are managed automatically. Use
   * {@link #setModAllowedByRole(Role)} instead.
   */
  @Deprecated
  public void setModAllowedBy(TSerial value) {
    this.modAllowedBy = value;
  }

  /**
   * Determine if the ModAllowedBy is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetModAllowedBy() {
    return (this.modAllowedBy != null ? this.modAllowedBy.isSetValue() : false);
  }

  /**
   * Get the state of the dataset.
   * <p>
   * @return the State value in a {@link TString} data type
   */
  public TString getState() {
    return state;
  }

  /**
   * Set the state of the dataset.
   * <p>
   * @param value the State value in a {@link TString} data type
   */
  public void setState(TString value) {
    this.state = value;
  }

  /**
   * Determine if the State is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetState() {
    return (this.state != null ? this.state.isSetValue() : false);
  }

  /**
   * Get a general description of the Dataset that is inheriting Common.
   * <p>
   * @return the Description value in a {@link TString} data type
   */
  public TString getDescription() {
    return description;
  }

  /**
   * Set a general description of the Dataset that is inheriting Common.
   * <p>
   * @param value the Description value in a {@link TString} data type
   */
  public void setDescription(TString value) {
    this.description = value;
  }

  /**
   * Determine if the Description is configured.
   * <p>
   * If configured this method also inspects the {@link TString} wrapped value.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetDescription() {
    return (this.description != null ? this.description.isSetValue() : false);
  }

  /**
   * Get the US:SecurityClass
   * <p>
   * Complex element SecurityClass (US) contains the security classification
   * from one or more data information sources.
   * <p>
   * @return a {@link SecurityClass} instance
   */
  public SecurityClass getSecurityClass() {
    return securityClass;
  }

  /**
   * Set the US:SecurityClass
   * <p>
   * Complex element SecurityClass (US) contains the security classification
   * from one or more data information sources.
   * <p>
   * @param value a {@link SecurityClass} instance
   */
  public void setSecurityClass(SecurityClass value) {
    this.securityClass = value;
  }

  /**
   * Determine if the SecurityClass is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetSecurityClass() {
    return (this.securityClass != null);
  }

  /**
   * Get the CaseNum
   * <p>
   * Complex element CaseNum provides the capability to store multiple
   * identifiers for a Dataset.
   * <p>
   * @return a non-null but possibly empty list of {@link CaseNum} instances
   */
  public Set<CaseNum> getCaseNum() {
    if (caseNum == null) {
      caseNum = new HashSet<>();
    }
    return this.caseNum;
  }

  /**
   * Determine if the CaseNum is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetCaseNum() {
    return ((this.caseNum != null) && (!this.caseNum.isEmpty()));
  }

  /**
   * Clear the CaseNum field. This sets the field to null.
   */
  public void unsetCaseNum() {
    this.caseNum = null;
  }

  /**
   * Get the ExtReferenceRef
   * <p>
   * Complex element ExtReferenceRef refers to an external reference defined in
   * a dataset ExternalReference.
   * <p>
   * @return a non-null but possibly empty list of {@link ExtReferenceRef}
   *         instances
   */
  public Set<ExtReferenceRef> getExtReferenceRef() {
    if (extReferenceRef == null) {
      extReferenceRef = new HashSet<>();
    }
    return this.extReferenceRef;
  }

  /**
   * Determine if the ExtReferenceRef is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetExtReferenceRef() {
    return ((this.extReferenceRef != null) && (!this.extReferenceRef.isEmpty()));
  }

  /**
   * Clear the ExtReferenceRef field. This sets the field to null.
   */
  public void unsetExtReferenceRef() {
    this.extReferenceRef = null;
  }

  /**
   * Get a list of Remark memo entries applicable to the current data item.
   * <p>
   * @return a non-null but possibly empty list of {@link Remarks} instances
   */
  public Set<Remarks> getRemarks() {
    if (remarks == null) {
      remarks = new HashSet<>();
    }
    return this.remarks;
  }

  /**
   * Determine if the Remarks is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetRemarks() {
    return ((this.remarks != null) && (!this.remarks.isEmpty()));
  }

  /**
   * Clear the Remarks field. This sets the field to null.
   */
  public void unsetRemarks() {
    this.remarks = null;
  }

  /**
   * Get the classification of the current data item. This attribute is REQUIRED
   * on each data item, even if the classification is "U".
   * <p>
   * @return a {@link ListCCL} instance
   */
  public ListCCL getCls() {
    return cls;
  }

  /**
   * Set the classification of the current data item. This attribute is REQUIRED
   * on each data item, even if the classification is "U".
   * <p>
   * @param value a {@link ListCCL} instance
   */
  public void setCls(ListCCL value) {
    this.cls = value;
  }

  /**
   * Determine if the Cls is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetCls() {
    return (this.cls != null);
  }

  /**
   * Get a list of country codes for which the current data item is releasable.
   * For NATO, if this element is omitted, there is no releasability restriction
   * for the data item. For the US, if this data item AND attribute US:legacy
   * Releasability are both blank, there is no releasability restriction for the
   * data item.
   * <p>
   * @return a non-null but possibly empty list of {@link ListCCY} instances
   */
  public Set<ListCCY> getReleasability() {
    if (releasability == null) {
      releasability = new HashSet<>();
    }
    return this.releasability;
  }

  /**
   * Determine if the Releasability is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetReleasability() {
    return ((this.releasability != null) && (!this.releasability.isEmpty()));
  }

  /**
   * Clear the Releasability field. This sets the field to null.
   */
  public void unsetReleasability() {
    this.releasability = null;
  }

  /**
   * Get a list of Common/Remarks idx values applicable to the current data
   * item.
   * <p>
   * @return a non-null but possibly empty list of {@link BigInteger} instances
   */
  public Set<BigInteger> getRemarkRef() {
    if (remarkRef == null) {
      remarkRef = new HashSet<>();
    }
    return this.remarkRef;
  }

  /**
   * Determine if the RemarkRef is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetRemarkRef() {
    return ((this.remarkRef != null) && (!this.remarkRef.isEmpty()));
  }

  /**
   * Clear the RemarkRef field. This sets the field to null.
   */
  public void unsetRemarkRef() {
    this.remarkRef = null;
  }

  /**
   * Get a list of Common/ExtReferenceRef idx values applicable to the current
   * data item.
   * <p>
   * @return a non-null but possibly empty list of {@link BigInteger} instances
   */
  public Set<BigInteger> getExtReferences() {
    if (extReferences == null) {
      extReferences = new HashSet<>();
    }
    return this.extReferences;
  }

  /**
   * Determine if the ExtReferences is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetExtReferences() {
    return ((this.extReferences != null) && (!this.extReferences.isEmpty()));
  }

  /**
   * Clear the ExtReferences field. This sets the field to null.
   */
  public void unsetExtReferences() {
    this.extReferences = null;
  }

  /**
   * Get one or more special handling instructions in sentence format, not code
   * format. For example, "Approved for public release; distribution is
   * unlimited". Multiple special handling instructions are separated by "|”
   * (i.e., ASCII character #124).
   * <p>
   * @return a {@link String} instance
   */
  public String getLegacyReleasability() {
    return legacyReleasability;
  }

  /**
   * Set one or more special handling instructions in sentence format, not code
   * format. For example, "Approved for public release; distribution is
   * unlimited". Multiple special handling instructions are separated by "|”
   * (i.e., ASCII character #124).
   * <p>
   * @param value a {@link String} instance
   */
  public void setLegacyReleasability(String value) {
    this.legacyReleasability = value;
  }

  /**
   * Determine if the LegacyReleasability is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetLegacyReleasability() {
    return (this.legacyReleasability != null);
  }

  /**
   * Get one or more data quality indicator(s), separated by "|” (i.e., ASCII
   * character #124), for the contents of the associated Data Item For example,
   * "Outlier" | "Non-CodeList".
   * <p>
   * @return a {@link String} instance
   */
  public String getQuality() {
    return quality;
  }

  /**
   * Set one or more data quality indicator(s), separated by "|” (i.e., ASCII
   * character #124), for the contents of the associated Data Item For example,
   * "Outlier" | "Non-CodeList".
   * <p>
   * @param value a {@link String} instance
   */
  public void setQuality(String value) {
    this.quality = value;
  }

  /**
   * Determine if the Quality is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetQuality() {
    return (this.quality != null);
  }

  /**
   * Get a value that is most probably correct.
   * <p>
   * @return a {@link String} instance
   */
  public String getRecommendedValue() {
    return recommendedValue;
  }

  /**
   * Set a value that is most probably correct.
   * <p>
   * @param value a {@link String} instance
   */
  public void setRecommendedValue(String value) {
    this.recommendedValue = value;
  }

  /**
   * Determine if the RecommendedValue is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetRecommendedValue() {
    return (this.recommendedValue != null);
  }

  /**
   * Get a unique identifier for each Data Item in the Dataset. Within each
   * Dataset, the idref value must be unique for every occurrence. If a received
   * Dataset uses idrefs and it is expected that the Dataset will be exchanged,
   * the idrefs should be considered required. If the receiving system is the
   * permanent end of the line for the Dataset, the idrefs may be considered
   * optional.
   * <p>
   * @return a {@link String} instance
   */
  public String getIdref() {
    return idref;
  }

  /**
   * Set a unique identifier for each Data Item in the Dataset. Within each
   * Dataset, the idref value must be unique for every occurrence. If a received
   * Dataset uses idrefs and it is expected that the Dataset will be exchanged,
   * the idrefs should be considered required. If the receiving system is the
   * permanent end of the line for the Dataset, the idrefs may be considered
   * optional.
   * <p>
   * @param value a {@link String} instance
   */
  public void setIdref(String value) {
    this.idref = value;
  }

  /**
   * Determine if the Idref is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetIdref() {
    return (this.idref != null);
  }//</editor-fold>

  //<editor-fold defaultstate="collapsed" desc="With Setters">
  /**
   * Set the identifier of the person or entity who last observed this Dataset.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Common object instance
   */
  public T withLastObservedBy(String value) {
    setLastObservedBy(new TString(value));
    return (T) this;
  }

  /**
   * Set the date and time, based on Greenwich Mean Time (GMT), the subject
   * signal was first collected.
   * <p>
   * @param value An instances of type {@link Calendar}
   * @return The current Common object instance
   */
  public T withObservedFirstDateTime(Calendar value) {
    setObservedFirstDateTime(new TDateTime(value));
    return (T) this;
  }

  /**
   * Set the date and time, based on Greenwich Mean Time (GMT), the subject
   * signal was first collected.
   * <p>
   * @param value An instances of type {@link Date}
   * @return The current Common object instance
   */
  public T withObservedFirstDateTime(Date value) {
    setObservedFirstDateTime(new TDateTime(value));
    return (T) this;
  }

  /**
   * Set the date and time, based on Greenwich Mean Time (GMT), the subject
   * signal was last collected.
   * <p>
   * @param value An instances of type {@link Calendar}
   * @return The current Common object instance
   */
  public T withObservedLastDateTime(Calendar value) {
    setObservedLastDateTime(new TDateTime(value));
    return (T) this;
  }

  /**
   * Set the date and time, based on Greenwich Mean Time (GMT), the subject
   * signal was last collected.
   * <p>
   * @param value An instances of type {@link Date}
   * @return The current Common object instance
   */
  public T withObservedLastDateTime(Date value) {
    setObservedLastDateTime(new TDateTime(value));
    return (T) this;
  }

  /**
   * Set the identifier of the designated expert who last approved or accepted
   * the dataset.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Common object instance
   */
  public T withApprovedBy(String value) {
    setApprovedBy(new TString(value));
    return (T) this;
  }

  /**
   * Set the last date and time, based on Greenwich Mean Time (GMT), that the
   * dataset was approved or accepted by a designated expert.
   * <p>
   * @param value An instances of type {@link Calendar}
   * @return The current Common object instance
   */
  public T withApprovedDateTime(Calendar value) {
    setApprovedDateTime(new TDateTime(value));
    return (T) this;
  }

  /**
   * Set the last date and time, based on Greenwich Mean Time (GMT), that the
   * dataset was approved or accepted by a designated expert.
   * <p>
   * @param value An instances of type {@link Date}
   * @return The current Common object instance
   */
  public T withApprovedDateTime(Date value) {
    setApprovedDateTime(new TDateTime(value));
    return (T) this;
  }

  /**
   * Set Redacted (US), indicate if any original, or authoritative, data was
   * omitted. Supports datasets which have some data withheld by the submitting
   * agency.
   * <p>
   * @param value An instances of type {@link ListCBO}
   * @return The current Common object instance
   */
  public T withRedacted(ListCBO value) {
    setRedacted(new TString(value.value()));
    return (T) this;
  }

  /**
   * Set a unique Dataset identifier.
   * <p>
   * @param value An instances of type {@link TSerial}
   * @return The current Common object instance
   */
  public T withSerial(TSerial value) {
    setSerial(value);
    return (T) this;
  }

  /**
   * Set the date and UTC Time the dataset was initially entered into the data
   * repository (e.g., FRRS for USA, SMIR for NATO).
   * <p>
   * @param value An instances of type {@link Calendar}
   * @return The current Common object instance
   */
  public T withEntryDateTime(Calendar value) {
    setEntryDateTime(new TDateTime(value));
    return (T) this;
  }

  /**
   * Set the date and UTC Time the dataset was initially entered into the data
   * repository (e.g., FRRS for USA, SMIR for NATO).
   * <p>
   * @param value An instances of type {@link Date}
   * @return The current Common object instance
   */
  public T withEntryDateTime(Date value) {
    setEntryDateTime(new TDateTime(value));
    return (T) this;
  }

  /**
   * Set the serial of the Role which is creating the current dataset.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Common object instance
   * @deprecated SSRF references are managed automatically. Use
   * {@link #withEntryByRole(Role)} instead.
   */
  @Deprecated
  public T withEntryBy(TSerial value) {
    setEntryBy(value);
    return (T) this;
  }

  /**
   * Set the serial of the Role which is responsible for the accuracy of the
   * data content.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Common object instance
   * @deprecated SSRF references are managed automatically. Use
   * {@link #withOwnerRole(Role)} instead.
   */
  @Deprecated
  public T withOwner(TSerial value) {
    setOwner(value);
    return (T) this;
  }

  /**
   * Set the date and UTC Time the dataset was last modified.
   * <p>
   * @param value An instances of type {@link Calendar}
   * @return The current Common object instance
   */
  public T withLastChangeDateTime(Calendar value) {
    setLastChangeDateTime(new TDateTime(value));
    return (T) this;
  }

  /**
   * Set the date and UTC Time the dataset was last modified.
   * <p>
   * @param value An instances of type {@link Date}
   * @return The current Common object instance
   */
  public T withLastChangeDateTime(Date value) {
    setLastChangeDateTime(new TDateTime(value));
    return (T) this;
  }

  /**
   * Set the serial of the Role which last modified the current dataset.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Common object instance
   * @deprecated SSRF references are managed automatically. Use
   * {@link #withLastChangeByRole(Role)} instead.
   */
  @Deprecated
  public T withLastChangeBy(TSerial value) {
    setLastChangeBy(value);
    return (T) this;
  }

  /**
   * Set the last date that the dataset was reviewed.
   * <p>
   * @param value An instances of type {@link Calendar}
   * @return The current Common object instance
   */
  public T withLastReviewDate(Calendar value) {
    setLastReviewDate(new TDate(value));
    return (T) this;
  }

  /**
   * Set the last date that the dataset was reviewed.
   * <p>
   * @param value An instances of type {@link Date}
   * @return The current Common object instance
   */
  public T withLastReviewDate(Date value) {
    setLastReviewDate(new TDate(value));
    return (T) this;
  }

  /**
   * Set the Role reference serial of the person who last reviewed the dataset.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Common object instance
   * @deprecated SSRF references are managed automatically. Use
   * {@link #withLastReviewByRole(Role)} instead.
   */
  @Deprecated
  public T withLastReviewBy(TSerial value) {
    setLastReviewBy(value);
    return (T) this;
  }

  /**
   * Set the serial of the Role which is authorized to modify the current
   * dataset.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Common object instance
   * @deprecated SSRF references are managed automatically. Use
   * {@link #withModAllowedByRole(Role)} instead.
   */
  @Deprecated
  public T withModAllowedBy(TSerial value) {
    setModAllowedBy(value);
    return (T) this;
  }

  /**
   * Set the state of the dataset.
   * <p>
   * @param value An instances of type {@link ListCSU}
   * @return The current Common object instance
   */
  public T withState(ListCSU value) {
    setState(new TString(value.value()));
    return (T) this;
  }

  /**
   * Set a general description of the Dataset that is inheriting Common.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Common object instance
   */
  public T withDescription(String value) {
    setDescription(new TString(value));
    return (T) this;
  }

  /**
   * Set the US:SecurityClass
   * <p>
   * Complex element SecurityClass (US) contains the security classification
   * from one or more data information sources.
   * <p>
   * @param value An instances of type {@link SecurityClass}
   * @return The current Common object instance
   */
  public T withSecurityClass(SecurityClass value) {
    setSecurityClass(value);
    return (T) this;
  }

  /**
   * Set the CaseNum
   * <p>
   * Complex element CaseNum provides the capability to store multiple
   * identifiers for a Dataset.
   * <p>
   * @param values One or more instances of type {@link CaseNum}
   * @return The current Common object instance
   */
  public T withCaseNum(CaseNum... values) {
    if (values != null) {
      getCaseNum().addAll(new HashSet<>(Arrays.asList(values)));
    }
    return (T) this;
  }

  /**
   * Set the CaseNum
   * <p>
   * Complex element CaseNum provides the capability to store multiple
   * identifiers for a Dataset.
   * <p>
   * @param values A collection of {@link CaseNum} instances
   * @return The current Common object instance
   */
  public T withCaseNum(Set<CaseNum> values) {
    if (values != null) {
      getCaseNum().addAll(values);
    }
    return (T) this;
  }

  /**
   * Set the ExtReferenceRef
   * <p>
   * Complex element ExtReferenceRef refers to an external reference defined in
   * a dataset ExternalReference.
   * <p>
   * @param values One or more instances of type {@link ExtReferenceRef}
   * @return The current Common object instance
   */
  public T withExtReferenceRef(ExtReferenceRef... values) {
    if (values != null) {
      getExtReferenceRef().addAll(new HashSet<>(Arrays.asList(values)));
    }
    return (T) this;
  }

  /**
   * Set the ExtReferenceRef
   * <p>
   * Complex element ExtReferenceRef refers to an external reference defined in
   * a dataset ExternalReference.
   * <p>
   * @param values A collection of {@link ExtReferenceRef} instances
   * @return The current Common object instance
   */
  public T withExtReferenceRef(Set<ExtReferenceRef> values) {
    if (values != null) {
      getExtReferenceRef().addAll(values);
    }
    return (T) this;
  }

  /**
   * Set a list of Common/Remarks idx values applicable to the current data
   * item.
   * <p>
   * @param values One or more instances of type {@link Remarks}
   * @return The current Common object instance
   */
  public T withRemarks(Remarks... values) {
    if (values != null) {
      getRemarks().addAll(new HashSet<>(Arrays.asList(values)));
    }
    return (T) this;
  }

  /**
   * Set a list of Common/Remarks idx values applicable to the current data
   * item.
   * <p>
   * @param values A collection of {@link Remarks} instances
   * @return The current Common object instance
   */
  public T withRemarks(Set<Remarks> values) {
    if (values != null) {
      getRemarks().addAll(values);
    }
    return (T) this;
  }

  /**
   * Set the classification of the current data item. This attribute is REQUIRED
   * on each data item, even if the classification is "U".
   * <p>
   * @param value An instances of type {@link ListCCL}
   * @return The current Common object instance
   */
  public T withCls(ListCCL value) {
    setCls(value);
    return (T) this;
  }

  /**
   * Set a list of country codes for which the current data item is releasable.
   * For NATO, if this element is omitted, there is no releasability restriction
   * for the data item. For the US, if this data item AND attribute US:legacy
   * Releasability are both blank, there is no releasability restriction for the
   * data item.
   * <p>
   * @param values One or more instances of type {@link ListCCY}
   * @return The current Common object instance
   */
  public T withReleasability(ListCCY... values) {
    if (values != null) {
      getReleasability().addAll(new HashSet<>(Arrays.asList(values)));
    }
    return (T) this;
  }

  /**
   * Set a list of country codes for which the current data item is releasable.
   * For NATO, if this element is omitted, there is no releasability restriction
   * for the data item. For the US, if this data item AND attribute US:legacy
   * Releasability are both blank, there is no releasability restriction for the
   * data item.
   * <p>
   * @param values A collection of {@link ListCCY} instances
   * @return The current Common object instance
   */
  public T withReleasability(Set<ListCCY> values) {
    if (values != null) {
      getReleasability().addAll(values);
    }
    return (T) this;
  }

  /**
   * Set
   * <p>
   * @param values One or more instances of type {@link BigInteger}
   * @return The current Common object instance
   */
  public T withRemarkRef(BigInteger... values) {
    if (values != null) {
      getRemarkRef().addAll(new HashSet<>(Arrays.asList(values)));
    }
    return (T) this;
  }

  /**
   * Set
   * <p>
   * @param values A collection of {@link BigInteger} instances
   * @return The current Common object instance
   */
  public T withRemarkRef(Set<BigInteger> values) {
    if (values != null) {
      getRemarkRef().addAll(values);
    }
    return (T) this;
  }

  /**
   * Set a list of Common/ExtReferenceRef idx values applicable to the current
   * data item.
   * <p>
   * @param values One or more instances of type {@link BigInteger}
   * @return The current Common object instance
   */
  public T withExtReferences(BigInteger... values) {
    if (values != null) {
      getExtReferences().addAll(new HashSet<>(Arrays.asList(values)));
    }
    return (T) this;
  }

  /**
   * Set a list of Common/ExtReferenceRef idx values applicable to the current
   * data item.
   * <p>
   * @param values A collection of {@link BigInteger} instances
   * @return The current Common object instance
   */
  public T withExtReferences(Set<BigInteger> values) {
    if (values != null) {
      getExtReferences().addAll(values);
    }
    return (T) this;
  }

  /**
   * Set one or more special handling instructions in sentence format, not code
   * format. For example, "Approved for public release; distribution is
   * unlimited". Multiple special handling instructions are separated by "|”
   * (i.e., ASCII character #124).
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Common object instance
   */
  public T withLegacyReleasability(String value) {
    setLegacyReleasability(value);
    return (T) this;
  }

  /**
   * Set one or more data quality indicator(s), separated by "|” (i.e., ASCII
   * character #124), for the contents of the associated Data Item For example,
   * "Outlier" | "Non-CodeList".
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Common object instance
   */
  public T withQuality(String value) {
    setQuality(value);
    return (T) this;
  }

  /**
   * Set a value that is most probably correct.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Common object instance
   */
  public T withRecommendedValue(String value) {
    setRecommendedValue(value);
    return (T) this;
  }

  /**
   * Set a unique identifier for each Data Item in the Dataset. Within each
   * Dataset, the idref value must be unique for every occurrence. If a received
   * Dataset uses idrefs and it is expected that the Dataset will be exchanged,
   * the idrefs should be considered required. If the receiving system is the
   * permanent end of the line for the Dataset, the idrefs may be considered
   * optional.
   * <p>
   * @param value An instances of type {@link String}
   * @return The current Common object instance
   */
  public T withIdref(String value) {
    setIdref(value);
    return (T) this;
  }//</editor-fold>

  /**
   * Get a string representation of this Common instance configuration.
   * <p>
   * @return The current object instance configuration as a non-null String
   */
  @Override
  public String toString() {
    return "Common {"
           // Required
           + (cls != null ? "cls [" + cls + "]" : "")
           + (serial != null ? "\n      serial [" + serial + "]" : "")
           + (entryDateTime != null ? "\n      entryDateTime [" + entryDateTime + "]" : "")
           // Optional
           + (approvedBy != null ? "\n      approvedBy [" + approvedBy + "]" : "")
           + (approvedDateTime != null ? "\n      approvedDateTime [" + approvedDateTime + "]" : "")
           + (caseNum != null ? "\n      caseNum [" + caseNum + "]" : "")
           + (description != null ? "\n      description [" + description + "]" : "")
           + (entryBy != null ? "\n      entryBy [" + entryBy + "]" : "")
           + (extReferenceRef != null ? "\n      extReferenceRef [" + extReferenceRef + "]" : "")
           + (extReferences != null ? "\n      extReferences [" + extReferences + "]" : "")
           + (idref != null ? "\n      idref [" + idref + "]" : "")
           + (lastChangeBy != null ? "\n      lastChangeBy [" + lastChangeBy + "]" : "")
           + (lastChangeDateTime != null ? "\n      lastChangeDateTime [" + lastChangeDateTime + "]" : "")
           + (lastObservedBy != null ? "\n      lastObservedBy [" + lastObservedBy + "]" : "")
           + (lastReviewBy != null ? "\n      lastReviewBy [" + lastReviewBy + "]" : "")
           + (lastReviewDate != null ? "\n      lastReviewDate [" + lastReviewDate + "]" : "")
           + (legacyReleasability != null ? "\n      legacyReleasability [" + legacyReleasability + "]" : "")
           + (modAllowedBy != null ? "\n      modAllowedBy [" + modAllowedBy + "]" : "")
           + (observedFirstDateTime != null ? "\n      observedFirstDateTime [" + observedFirstDateTime + "]" : "")
           + (observedLastDateTime != null ? "\n      observedLastDateTime [" + observedLastDateTime + "]" : "")
           + (owner != null ? "\n      owner [" + owner + "]" : "")
           + (quality != null ? "\n      quality [" + quality + "]" : "")
           + (recommendedValue != null ? "\n      recommendedValue [" + recommendedValue + "]" : "")
           + (redacted != null ? "\n      redacted [" + redacted + "]" : "")
           + (releasability != null ? "\n      releasability [" + releasability + "]" : "")
           + (remarkRef != null ? "\n      remarkRef [" + remarkRef + "]" : "")
           + (remarks != null ? "\n      remarks [" + remarks + "]" : "")
           + (securityClass != null ? "\n      securityClass [" + securityClass + "]" : "")
           + (state != null ? "\n      state [" + state + "]" : "")
           + "}";
  }

  /**
   * Determine if the required fields in this SSRF data type instance are set.
   * <p>
   * {@link Common} requires
   * {@link TDateTime EntryDateTime}, {@link TString Serial}, {@link ListCCL cls}.
   * <p>
   * Note that this method only checks for the presence of required information;
   * this method does not validate the information format.
   * <p>
   * @return TRUE if required fields are set, otherwise FALSE
   */
  public boolean isSet() {
    return isSetEntryDateTime() && isSetSerial() && isSetCls();
  }

  //<editor-fold defaultstate="collapsed" desc="SSRF Referenced Object Instances">
  /**
   * EntryBy - Creator Role (Optional)
   * <p>
   * The serial of the Role which is creating the current dataset.
   * <p>
   * Format is pattern (S29)
   * <p>
   * Attribute group Initial (Required)
   * <p>
   * @since 3.1.0
   */
  @XmlTransient
  private Role entryByRole;
  /**
   * Owner - Role which Owns the Dataset (Optional)
   * <p>
   * The serial of the Role which is responsible for the accuracy of the data
   * content.
   * <p>
   * Format is pattern (S29)
   * <p>
   * Attribute group Initial (Required)
   * <p>
   * @since 3.1.0
   */
  @XmlTransient
  private Role ownerRole;
  /**
   * LastChangeBy - Last Modifier Role (Optional)
   * <p>
   * The serial of the Role which last modified the current dataset.
   * <p>
   * Format is pattern (S29)
   * <p>
   * Attribute group LastChange (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlTransient
  private Role lastChangeByRole;
  /**
   * LastReviewBy - Last Review Person RoleRef (Optional)
   * <p>
   * The Role reference serial of the person who last reviewed the dataset.
   * <p>
   * Format is pattern (S29)
   * <p>
   * Attribute group LastReview (Optional)
   * <p>
   * @since 3.1.0
   */
  @XmlTransient
  private Role lastReviewByRole;

  /**
   * ModAllowedBy - Role Allowed to Modify (Optional)
   * <p>
   * The serial of the Role which is authorized to modify the current dataset.
   * <p>
   * Format is pattern (S29)
   * <p>
   * Divergence from SMADEF: Automated changes using ModAllowedBy are not
   * permitted for use by USA systems.
   * <p>
   * @since 3.1.0
   */
  @XmlTransient
  private Role modAllowedByRole;

  /**
   * Get the serial of the Role which is creating the current dataset.
   * <p>
   * @return a {@link Role} instance
   * @since 3.1.0
   */
  public Role getEntryByRole() {
    return entryByRole;
  }

  /**
   * Determine if the entryByRole field is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetEntryByRole() {
    return this.entryByRole != null;
  }

  /**
   * Set the serial of the Role which is creating the current dataset.
   * <p>
   * @param value An instances of type {@link Role}
   * @return The current Common object instance
   * @since 3.1.0
   */
  public T withEntryByRole(Role value) {
    this.entryByRole = value;
    return (T) this;
  }

  /**
   * Get the serial of the Role which is responsible for the accuracy of the
   * data content.
   * <p>
   * @return a {@link Role} instance
   * @since 3.1.0
   */
  public Role getOwnerRole() {
    return ownerRole;
  }

  /**
   * Determine if the ownerRole field is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetOwnerRole() {
    return this.ownerRole != null;
  }

  /**
   * Set the serial of the Role which is responsible for the accuracy of the
   * data content.
   * <p>
   * @param value An instances of type {@link Role}
   * @return The current Common object instance
   * @since 3.1.0
   */
  public T withOwnerRole(Role value) {
    this.ownerRole = value;
    return (T) this;
  }

  /**
   * Get the serial of the Role which last modified the current dataset.
   * <p>
   * @return a {@link Role} instance
   * @since 3.1.0
   */
  public Role getLastChangeByRole() {
    return lastChangeByRole;
  }

  /**
   * Determine if the lastChangeByRole field is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetLastChangeByRole() {
    return this.lastChangeByRole != null;
  }

  /**
   * Set the serial of the Role which last modified the current dataset.
   * <p>
   * @param value An instances of type {@link Role}
   * @return The current Common object instance
   * @since 3.1.0
   */
  public T withLastChangeByRole(Role value) {
    this.lastChangeByRole = value;
    return (T) this;
  }

  /**
   * Get the Role reference serial of the person who last reviewed the dataset.
   * <p>
   * @return a {@link Role} instance
   * @since 3.1.0
   */
  public Role getLastReviewByRole() {
    return lastReviewByRole;
  }

  /**
   * Determine if the lastReviewByRole field is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetLastReviewByRole() {
    return this.lastReviewByRole != null;
  }

  /**
   * Set the Role reference serial of the person who last reviewed the dataset.
   * <p>
   * @param value An instances of type {@link Role}
   * @return The current Common object instance
   * @since 3.1.0
   */
  public T withLastReviewByRole(Role value) {
    this.lastReviewByRole = value;
    return (T) this;
  }

  /**
   * Get the serial of the Role which is authorized to modify the current
   * dataset.
   * <p>
   * @return a {@link Role} instance
   * @since 3.1.0
   */
  public Role getModAllowedByRole() {
    return modAllowedByRole;
  }

  /**
   * Determine if the modAllowedByRole field is configured.
   * <p>
   * @return TRUE if the field is set, FALSE if the field is null
   */
  public boolean isSetModAllowedByRole() {
    return this.modAllowedByRole != null;
  }

  /**
   * Set the serial of the Role which is authorized to modify the current
   * dataset.
   * <p>
   * @param value An instances of type {@link Role}
   * @return The current Common object instance
   * @since 3.1.0
   */
  public T withModAllowedByRole(Role value) {
    this.modAllowedByRole = value;
    return (T) this;
  }

  /**
   * Update the SSRF data type references in this Common record.
   * <p>
   * This method builds Common exported fields with values from their respective
   * transient object instance fields.:<br/> {@link #entryBy} from
   * {@link #entryByRole} <br/> {@link #owner} from {@link #ownerRole} <br/>
   * {@link #lastChangeBy} from {@link #lastChangeByRole} <br/>
   * {@link #lastReviewBy} from {@link #lastReviewByRole} <br/>
   * {@link #modAllowedBy} from {@link #modAllowedByRole}
   * <p>
   * This method should typically be called after the Common is configured and
   * (optionally) before exporting an SSRF message.
   */
  public void prepare() {
    this.entryBy = entryByRole != null ? entryByRole.getSerial() : null;
    this.owner = ownerRole != null ? ownerRole.getSerial() : null;
    this.lastChangeBy = lastChangeByRole != null ? lastChangeByRole.getSerial() : null;
    this.lastReviewBy = lastReviewByRole != null ? lastReviewByRole.getSerial() : null;
    this.modAllowedBy = modAllowedByRole != null ? modAllowedByRole.getSerial() : null;
  }

  /**
   * Update the SSRF data type references in this Common record after loading
   * from XML.
   * <p>
   * This method builds the transient {@link #entryByRole} with values from the
   * imported {@link #entryBy} field. This method should typically be called
   * after the Common is imported from XML.
   * <p>
   * @param root the SSRF root instance
   * @since 3.1.0
   */
  public void postLoad(SSRF root) {
    if (entryBy != null && entryBy.isSetValue()) {
      for (Role instance : root.getRole()) {
        if (entryBy.equals(instance.getSerial())) {
          entryByRole = instance;
          return;
        }
      }
    }
    if (owner != null && owner.isSetValue()) {
      for (Role instance : root.getRole()) {
        if (owner.equals(instance.getSerial())) {
          ownerRole = instance;
          return;
        }
      }
    }
    if (lastChangeBy != null && lastChangeBy.isSetValue()) {
      for (Role instance : root.getRole()) {
        if (lastChangeBy.equals(instance.getSerial())) {
          lastChangeByRole = instance;
          return;
        }
      }
    }
    if (lastReviewBy != null && lastReviewBy.isSetValue()) {
      for (Role instance : root.getRole()) {
        if (lastReviewBy.equals(instance.getSerial())) {
          lastReviewByRole = instance;
          return;
        }
      }
    }
    if (modAllowedBy != null && modAllowedBy.isSetValue()) {
      for (Role instance : root.getRole()) {
        if (modAllowedBy.equals(instance.getSerial())) {
          modAllowedByRole = instance;
          return;
        }
      }
    }
  }//</editor-fold>

  //<editor-fold defaultstate="collapsed" desc="Hashcode Equals and Comparable">
  /**
   * Hash code is based upon the object serial number.
   * <p>
   * @return A unique hash code for this object instance.
   */
  @Override
  public int hashCode() {
    int hash = 5;
    hash = 67 * hash + Objects.hashCode(this.serial);
    return hash;
  }

  /**
   * Equality is based upon the object serial number.
   * <p>
   * @param obj the other object
   * @return TRUE if the objects are of the same class and their serial numbers
   *         match
   */
  @Override
  public boolean equals(Object obj) {
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    return Objects.equals(this.serial, ((Common<?>) obj).getSerial());
  }

  /**
   * Comparison is based alphabetically by class type, reverse chronologically
   * by entry date/time, then finally by alphabetically by the (semi-random)
   * serial number.
   * <p>
   * @param o the other object instance to sort
   * @return alphabetical sort order
   */
  @Override
  public int compareTo(Object o) {
    if (o == null) {
      return 1;
    }
    if (this.getClass().equals(o.getClass())) {
      if (this.getEntryDateTime().equals(((Common<T>) o).getEntryDateTime())) {
        /**
         * If the classes are equal and have the same time stamp then sort by
         * serial number. Note that this is semi-random.
         */
        return this.serial.compareTo(((Common<T>) o).getSerial());
      }
      /**
       * Sort reverse chronologically.
       */
      return this.getEntryDateTime().compareTo(((Common<T>) o).getEntryDateTime());
    }
    /**
     * Sort based upon the class name.
     */
    return this.getClass().getSimpleName().compareTo(o.getClass().getSimpleName());
  }//</editor-fold>
}