/**
 * Autogenerated by Thrift Compiler (0.8.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package qa.qcri.nadeef.service.thrift;


import java.util.Map;
import java.util.HashMap;
import org.apache.thrift.TEnum;

public enum TRuleType implements org.apache.thrift.TEnum {
  UDF(0),
  FD(1),
  CFD(2);

  private final int value;

  private TRuleType(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  public static TRuleType findByValue(int value) { 
    switch (value) {
      case 0:
        return UDF;
      case 1:
        return FD;
      case 2:
        return CFD;
      default:
        return null;
    }
  }
}
