package com.calclab.hablar.chat.client;

import com.google.gwt.inject.client.AbstractGinModule;
import com.google.inject.Singleton;

public class HablarChatModule extends AbstractGinModule {

	@Override
	protected void configure() {
		bind(HablarChat.class).in(Singleton.class);
	}

}
