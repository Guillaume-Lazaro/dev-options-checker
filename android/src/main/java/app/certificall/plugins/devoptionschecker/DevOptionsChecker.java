package app.certificall.plugins.DevOptionsChecker;

import androidx.appcompat.app.AppCompatActivity;
import android.provider.Settings;

public class DevOptionsChecker {
  private AppCompatActivity activity;

  public DevOptionsChecker(AppCompatActivity activity) {
    this.activity = activity;
  }

  public boolean getDevOptionsEnabled() {

    int androidSdkVersion = android.os.Build.VERSION.SDK_INT;
    String settings = "";

    try {
      if(androidSdkVersion < 16) {
        settings = Settings.Secure.ADB_ENABLED;
      } else {
        if(androidSdkVersion == 16) {
          settings = Settings.Secure.DEVELOPMENT_SETTINGS_ENABLED;
        } else {
          settings = Settings.Global.DEVELOPMENT_SETTINGS_ENABLED;
        }
      }

      if(settings == "development_settings_enabled") {
        return true;
      } else {
        return false;
      }
    } catch (Exception e) {
      return false;
    }
  }

}
