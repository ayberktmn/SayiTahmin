package com.ayberk.sayitahmin;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.lifecycle.SavedStateHandle;
import androidx.navigation.NavArgs;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class SonucFragmentArgs implements NavArgs {
  private final HashMap arguments = new HashMap();

  private SonucFragmentArgs() {
  }

  @SuppressWarnings("unchecked")
  private SonucFragmentArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static SonucFragmentArgs fromBundle(@NonNull Bundle bundle) {
    SonucFragmentArgs __result = new SonucFragmentArgs();
    bundle.setClassLoader(SonucFragmentArgs.class.getClassLoader());
    if (bundle.containsKey("sonuc")) {
      boolean sonuc;
      sonuc = bundle.getBoolean("sonuc");
      __result.arguments.put("sonuc", sonuc);
    } else {
      throw new IllegalArgumentException("Required argument \"sonuc\" is missing and does not have an android:defaultValue");
    }
    return __result;
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static SonucFragmentArgs fromSavedStateHandle(@NonNull SavedStateHandle savedStateHandle) {
    SonucFragmentArgs __result = new SonucFragmentArgs();
    if (savedStateHandle.contains("sonuc")) {
      boolean sonuc;
      sonuc = savedStateHandle.get("sonuc");
      __result.arguments.put("sonuc", sonuc);
    } else {
      throw new IllegalArgumentException("Required argument \"sonuc\" is missing and does not have an android:defaultValue");
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  public boolean getSonuc() {
    return (boolean) arguments.get("sonuc");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Bundle toBundle() {
    Bundle __result = new Bundle();
    if (arguments.containsKey("sonuc")) {
      boolean sonuc = (boolean) arguments.get("sonuc");
      __result.putBoolean("sonuc", sonuc);
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public SavedStateHandle toSavedStateHandle() {
    SavedStateHandle __result = new SavedStateHandle();
    if (arguments.containsKey("sonuc")) {
      boolean sonuc = (boolean) arguments.get("sonuc");
      __result.set("sonuc", sonuc);
    }
    return __result;
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) {
        return true;
    }
    if (object == null || getClass() != object.getClass()) {
        return false;
    }
    SonucFragmentArgs that = (SonucFragmentArgs) object;
    if (arguments.containsKey("sonuc") != that.arguments.containsKey("sonuc")) {
      return false;
    }
    if (getSonuc() != that.getSonuc()) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + (getSonuc() ? 1 : 0);
    return result;
  }

  @Override
  public String toString() {
    return "SonucFragmentArgs{"
        + "sonuc=" + getSonuc()
        + "}";
  }

  public static final class Builder {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    public Builder(@NonNull SonucFragmentArgs original) {
      this.arguments.putAll(original.arguments);
    }

    @SuppressWarnings("unchecked")
    public Builder(boolean sonuc) {
      this.arguments.put("sonuc", sonuc);
    }

    @NonNull
    public SonucFragmentArgs build() {
      SonucFragmentArgs result = new SonucFragmentArgs(arguments);
      return result;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public Builder setSonuc(boolean sonuc) {
      this.arguments.put("sonuc", sonuc);
      return this;
    }

    @SuppressWarnings({"unchecked","GetterOnBuilder"})
    public boolean getSonuc() {
      return (boolean) arguments.get("sonuc");
    }
  }
}
