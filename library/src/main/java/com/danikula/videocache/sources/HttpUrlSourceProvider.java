package com.danikula.videocache.sources;

import android.support.annotation.NonNull;

import com.danikula.videocache.HttpUrlSource;
import com.danikula.videocache.Source;
import com.danikula.videocache.headers.HeaderInjector;
import com.danikula.videocache.sourcestorage.SourceInfoStorage;

/**
 * Created by Summerly on 2017/9/30.
 * Desc:
 */

public class HttpUrlSourceProvider implements SourceProvider {
    @Override
    public Source provideSource(@NonNull String url,
                                @NonNull SourceInfoStorage sourceInfoStorage,
                                @NonNull HeaderInjector headerInjector) {
        return new HttpUrlSource(url, sourceInfoStorage, headerInjector);
    }
}
