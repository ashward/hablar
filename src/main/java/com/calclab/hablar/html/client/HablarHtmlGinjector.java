package com.calclab.hablar.html.client;

import com.calclab.emite.browser.client.BrowserModule;
import com.calclab.hablar.client.HablarGinjector;
import com.calclab.hablar.client.HablarModule;
import com.google.gwt.inject.client.GinModules;

@GinModules({ HablarHtmlModule.class, HablarModule.class, BrowserModule.class })
public interface HablarHtmlGinjector extends HablarGinjector {
}
