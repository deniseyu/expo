package abi40_0_0.expo.modules.av.player.datasource;

import android.content.Context;

import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.TransferListener;

import java.util.Collections;
import java.util.List;
import java.util.Map;

import abi40_0_0.org.unimodules.core.ModuleRegistry;
import abi40_0_0.org.unimodules.core.interfaces.InternalModule;

public class SharedCookiesDataSourceFactoryProvider implements InternalModule, DataSourceFactoryProvider {
  @Override
  public List<Class> getExportedInterfaces() {
    return Collections.singletonList((Class) DataSourceFactoryProvider.class);
  }

  @Override
  public DataSource.Factory createFactory(Context reactApplicationContext, ModuleRegistry moduleRegistry, String userAgent, Map<String, Object> requestHeaders, TransferListener transferListener) {
    return new SharedCookiesDataSourceFactory(reactApplicationContext, moduleRegistry, userAgent, requestHeaders, transferListener);
  }
}
