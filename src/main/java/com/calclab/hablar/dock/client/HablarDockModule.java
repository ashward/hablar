package com.calclab.hablar.dock.client;

import com.google.gwt.inject.client.AbstractGinModule;

public class HablarDockModule extends AbstractGinModule {

	@Override
	protected void configure() {
		bind(HablarDock.class);
	}

}
