package com.danikula.videocache.sources;

import android.support.annotation.NonNull;

import com.danikula.videocache.Source;
import com.danikula.videocache.headers.HeaderInjector;
import com.danikula.videocache.sourcestorage.SourceInfoStorage;

/**
 * Created by Summerly on 2017/9/30.
 * Desc: Provide an source to open url connection.
 */
public interface SourceProvider {
    /**
     * @param url               Resource URL
     * @param sourceInfoStorage storage for source info
     * @param headerInjector    url headers
     * @return
     */
    Source provideSource(@NonNull String url,
                         @NonNull SourceInfoStorage sourceInfoStorage,
                         @NonNull HeaderInjector headerInjector);
}
