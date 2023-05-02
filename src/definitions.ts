// import type { PluginListenerHandle } from '@capacitor/core';

export interface DevOptionsCheckerPlugin {
  /**
   * Returns true if the developer mode is enabled on Android
   */
   checkDevOptions(): Promise<{ enabled: boolean }>;
}