import { WebPlugin } from '@capacitor/core';
import type { DevOptionsCheckerPlugin } from './definitions';

export class DevOptionsCheckerWeb extends WebPlugin implements DevOptionsCheckerPlugin {
  constructor() {
    super();
    console.log("Web plugin !");
  }

  async checkDevOptions(): Promise<{ enabled: boolean }> {
    return { enabled: false }
  }
}