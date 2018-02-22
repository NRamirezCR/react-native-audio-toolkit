package com.futurice.rctaudiotoolkit;

import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import com.tanguyantoine.react.MusicControl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AudioPackage implements ReactPackage {
    @Override
    public List<NativeModule> createNativeModules(ReactApplicationContext reactContext) {
        List<NativeModule> modules = new ArrayList<>();
        modules.add(new AudioRecorderModule(reactContext));
        modules.add(new AudioPlayerModule(reactContext));
        modules.add(new MusicControl());
        return modules;
    }

    @Override
    public List<ViewManager> createViewManagers(ReactApplicationContext reactContext) {
        return Collections.emptyList();
    }
}
