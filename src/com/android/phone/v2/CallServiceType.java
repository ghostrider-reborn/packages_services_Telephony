package com.android.phone;

public enum CallServiceType {
  GSM,
  CDMA,
  THIRD_PARTY,

  // Allowing the system to choose one of the above values based on whatever
  // heuristics it might have.
  DONT_CARE
}
