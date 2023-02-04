package com.ayberk.sayitahmin;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;

public class GirisFragmentDirections {
  private GirisFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionGirisFragmentToTahminFragment2() {
    return new ActionOnlyNavDirections(R.id.action_girisFragment_to_tahminFragment2);
  }
}
