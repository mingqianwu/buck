/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.facebook.buck.distributed.thrift;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2016-09-19")
public class ScribeData implements org.apache.thrift.TBase<ScribeData, ScribeData._Fields>, java.io.Serializable, Cloneable, Comparable<ScribeData> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ScribeData");

  private static final org.apache.thrift.protocol.TField CATEGORY_FIELD_DESC = new org.apache.thrift.protocol.TField("category", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField LINES_FIELD_DESC = new org.apache.thrift.protocol.TField("lines", org.apache.thrift.protocol.TType.LIST, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new ScribeDataStandardSchemeFactory());
    schemes.put(TupleScheme.class, new ScribeDataTupleSchemeFactory());
  }

  public String category; // optional
  public List<String> lines; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    CATEGORY((short)1, "category"),
    LINES((short)2, "lines");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // CATEGORY
          return CATEGORY;
        case 2: // LINES
          return LINES;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final _Fields optionals[] = {_Fields.CATEGORY,_Fields.LINES};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.CATEGORY, new org.apache.thrift.meta_data.FieldMetaData("category", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.LINES, new org.apache.thrift.meta_data.FieldMetaData("lines", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ScribeData.class, metaDataMap);
  }

  public ScribeData() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ScribeData(ScribeData other) {
    if (other.isSetCategory()) {
      this.category = other.category;
    }
    if (other.isSetLines()) {
      List<String> __this__lines = new ArrayList<String>(other.lines);
      this.lines = __this__lines;
    }
  }

  public ScribeData deepCopy() {
    return new ScribeData(this);
  }

  @Override
  public void clear() {
    this.category = null;
    this.lines = null;
  }

  public String getCategory() {
    return this.category;
  }

  public ScribeData setCategory(String category) {
    this.category = category;
    return this;
  }

  public void unsetCategory() {
    this.category = null;
  }

  /** Returns true if field category is set (has been assigned a value) and false otherwise */
  public boolean isSetCategory() {
    return this.category != null;
  }

  public void setCategoryIsSet(boolean value) {
    if (!value) {
      this.category = null;
    }
  }

  public int getLinesSize() {
    return (this.lines == null) ? 0 : this.lines.size();
  }

  public java.util.Iterator<String> getLinesIterator() {
    return (this.lines == null) ? null : this.lines.iterator();
  }

  public void addToLines(String elem) {
    if (this.lines == null) {
      this.lines = new ArrayList<String>();
    }
    this.lines.add(elem);
  }

  public List<String> getLines() {
    return this.lines;
  }

  public ScribeData setLines(List<String> lines) {
    this.lines = lines;
    return this;
  }

  public void unsetLines() {
    this.lines = null;
  }

  /** Returns true if field lines is set (has been assigned a value) and false otherwise */
  public boolean isSetLines() {
    return this.lines != null;
  }

  public void setLinesIsSet(boolean value) {
    if (!value) {
      this.lines = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case CATEGORY:
      if (value == null) {
        unsetCategory();
      } else {
        setCategory((String)value);
      }
      break;

    case LINES:
      if (value == null) {
        unsetLines();
      } else {
        setLines((List<String>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case CATEGORY:
      return getCategory();

    case LINES:
      return getLines();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case CATEGORY:
      return isSetCategory();
    case LINES:
      return isSetLines();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ScribeData)
      return this.equals((ScribeData)that);
    return false;
  }

  public boolean equals(ScribeData that) {
    if (that == null)
      return false;

    boolean this_present_category = true && this.isSetCategory();
    boolean that_present_category = true && that.isSetCategory();
    if (this_present_category || that_present_category) {
      if (!(this_present_category && that_present_category))
        return false;
      if (!this.category.equals(that.category))
        return false;
    }

    boolean this_present_lines = true && this.isSetLines();
    boolean that_present_lines = true && that.isSetLines();
    if (this_present_lines || that_present_lines) {
      if (!(this_present_lines && that_present_lines))
        return false;
      if (!this.lines.equals(that.lines))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_category = true && (isSetCategory());
    list.add(present_category);
    if (present_category)
      list.add(category);

    boolean present_lines = true && (isSetLines());
    list.add(present_lines);
    if (present_lines)
      list.add(lines);

    return list.hashCode();
  }

  @Override
  public int compareTo(ScribeData other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetCategory()).compareTo(other.isSetCategory());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCategory()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.category, other.category);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetLines()).compareTo(other.isSetLines());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLines()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.lines, other.lines);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("ScribeData(");
    boolean first = true;

    if (isSetCategory()) {
      sb.append("category:");
      if (this.category == null) {
        sb.append("null");
      } else {
        sb.append(this.category);
      }
      first = false;
    }
    if (isSetLines()) {
      if (!first) sb.append(", ");
      sb.append("lines:");
      if (this.lines == null) {
        sb.append("null");
      } else {
        sb.append(this.lines);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class ScribeDataStandardSchemeFactory implements SchemeFactory {
    public ScribeDataStandardScheme getScheme() {
      return new ScribeDataStandardScheme();
    }
  }

  private static class ScribeDataStandardScheme extends StandardScheme<ScribeData> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, ScribeData struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // CATEGORY
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.category = iprot.readString();
              struct.setCategoryIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // LINES
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list8 = iprot.readListBegin();
                struct.lines = new ArrayList<String>(_list8.size);
                String _elem9;
                for (int _i10 = 0; _i10 < _list8.size; ++_i10)
                {
                  _elem9 = iprot.readString();
                  struct.lines.add(_elem9);
                }
                iprot.readListEnd();
              }
              struct.setLinesIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, ScribeData struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.category != null) {
        if (struct.isSetCategory()) {
          oprot.writeFieldBegin(CATEGORY_FIELD_DESC);
          oprot.writeString(struct.category);
          oprot.writeFieldEnd();
        }
      }
      if (struct.lines != null) {
        if (struct.isSetLines()) {
          oprot.writeFieldBegin(LINES_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.lines.size()));
            for (String _iter11 : struct.lines)
            {
              oprot.writeString(_iter11);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ScribeDataTupleSchemeFactory implements SchemeFactory {
    public ScribeDataTupleScheme getScheme() {
      return new ScribeDataTupleScheme();
    }
  }

  private static class ScribeDataTupleScheme extends TupleScheme<ScribeData> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, ScribeData struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetCategory()) {
        optionals.set(0);
      }
      if (struct.isSetLines()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetCategory()) {
        oprot.writeString(struct.category);
      }
      if (struct.isSetLines()) {
        {
          oprot.writeI32(struct.lines.size());
          for (String _iter12 : struct.lines)
          {
            oprot.writeString(_iter12);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, ScribeData struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.category = iprot.readString();
        struct.setCategoryIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TList _list13 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.lines = new ArrayList<String>(_list13.size);
          String _elem14;
          for (int _i15 = 0; _i15 < _list13.size; ++_i15)
          {
            _elem14 = iprot.readString();
            struct.lines.add(_elem14);
          }
        }
        struct.setLinesIsSet(true);
      }
    }
  }

}

