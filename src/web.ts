import { WebPlugin } from '@capacitor/core';

import type { DevOptionsCheckerPlugin } from './definitions';

export class DevOptionsCheckerWeb extends WebPlugin implements DevOptionsCheckerPlugin {
  async echo(options: { value: string }): Promise<{ value: string }> {
    console.log('ECHO', options);
    return options;
  }
}
