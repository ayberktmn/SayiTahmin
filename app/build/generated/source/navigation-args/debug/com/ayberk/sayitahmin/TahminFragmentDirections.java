package com.ayberk.sayitahmin;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.NavDirections;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class TahminFragmentDirections {
  private TahminFragmentDirections() {
  }

  @NonNull
  public static ActionTahminFragment2ToSonucFragment actionTahminFragment2ToSonucFragment(
      boolean sonuc) {
    return new ActionTahminFragment2ToSonucFragment(sonuc);
  }

  public static class ActionTahminFragment2ToSonucFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    private ActionTahminFragment2ToSonucFragment(boolean sonuc) {
      this.arguments.put("sonuc", sonuc);
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionTahminFragment2ToSonucFragment setSonuc(boolean sonuc) {
      this.arguments.put("sonuc", sonuc);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
      Bundle __result = new Bundle();
      if (arguments.containsKey("sonuc")) {
        boolean sonuc = (boolean) arguments.get("sonuc");
        __result.putBoolean("sonuc", sonuc);
      }
      return __result;
    }

    @Override
    public int getActionId() {
      return R.id.action_tahminFragment2_to_sonucFragment;
    }

    @SuppressWarnings("unchecked")
    public boolean getSonuc() {
      return (boolean) arguments.get("sonuc");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionTahminFragment2ToSonucFragment that = (ActionTahminFragment2ToSonucFragment) object;
      if (arguments.containsKey("sonuc") != that.arguments.containsKey("sonuc")) {
        return false;
      }
      if (getSonuc() != that.getSonuc()) {
        return false;
      }
      if (getActionId() != that.getActionId()) {
        return false;
      }
      return true;
    }

    @Override
    public int hashCode() {
      int result = 1;
      result = 31 * result + (getSonuc() ? 1 : 0);
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionTahminFragment2ToSonucFragment(actionId=" + getActionId() + "){"
          + "sonuc=" + getSonuc()
          + "}";
    }
  }
}
