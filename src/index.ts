import { registerPlugin } from '@capacitor/core';

import type { DevOptionsCheckerPlugin } from './definitions';

const DevOptionsChecker = registerPlugin<DevOptionsCheckerPlugin>('DevOptionsChecker', {
  web: () => import('./web').then(m => new m.DevOptionsCheckerWeb()),
});

export * from './definitions';
export { DevOptionsChecker };
