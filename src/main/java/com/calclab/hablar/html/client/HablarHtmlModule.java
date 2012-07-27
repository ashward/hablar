package com.calclab.hablar.html.client;

import com.calclab.hablar.chat.client.ChatConfig;
import com.calclab.hablar.chat.client.HablarChatModule;
import com.calclab.hablar.client.HablarConfig;
import com.calclab.hablar.client.HablarModule;
import com.google.gwt.inject.client.AbstractGinModule;
import com.google.inject.Provides;
import com.google.inject.Singleton;

public class HablarHtmlModule extends AbstractGinModule {

	@Override
	protected void configure() {
		install(new HablarModule());
	}
	
	@Provides @Singleton
	HablarConfig provideHablarConfig() {
		return HablarConfig.getFromMeta();
	}
	
	@Provides @Singleton
	ChatConfig provideChatConfig(HablarConfig config) {
		return config.chatConfig;
	}
}
