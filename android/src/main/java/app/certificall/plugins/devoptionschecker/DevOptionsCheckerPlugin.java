package app.certificall.plugins.DevOptionsChecker;

import com.getcapacitor.JSObject;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;

@CapacitorPlugin(name = "DevOptionsChecker")
public class DevOptionsCheckerPlugin extends Plugin {

  private DevOptionsChecker implementation;

  @Override
  public void load() {
    implementation = new DevOptionsChecker(getActivity());
  }

  @PluginMethod()
  public void checkDevOptions(PluginCall call) {
    JSObject ret = new JSObject();
    boolean enabled = implementation.getDevOptionsEnabled();


    ret.put("enabled", enabled);
    call.resolve(ret);
  }

}
