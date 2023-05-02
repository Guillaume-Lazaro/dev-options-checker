export interface DevOptionsCheckerPlugin {
  echo(options: { value: string }): Promise<{ value: string }>;
}
