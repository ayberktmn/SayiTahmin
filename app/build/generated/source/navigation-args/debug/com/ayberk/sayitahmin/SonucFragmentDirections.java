package com.ayberk.sayitahmin;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;

public class SonucFragmentDirections {
  private SonucFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionSonucFragmentToGirisFragment() {
    return new ActionOnlyNavDirections(R.id.action_sonucFragment_to_girisFragment);
  }
}
