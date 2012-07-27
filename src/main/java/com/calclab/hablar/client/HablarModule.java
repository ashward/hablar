package com.calclab.hablar.client;

import com.calclab.emite.core.client.CoreModule;
import com.calclab.emite.im.client.ImModule;
import com.calclab.emite.xep.disco.client.DiscoveryModule;
import com.calclab.emite.xep.muc.client.MucModule;
import com.calclab.emite.xep.mucdisco.client.MucDiscoveryModule;
import com.calclab.emite.xep.search.client.SearchModule;
import com.calclab.emite.xep.vcard.client.VCardModule;
import com.calclab.hablar.chat.client.ChatConfig;
import com.calclab.hablar.chat.client.HablarChatModule;
import com.calclab.hablar.core.client.Hablar;
import com.calclab.hablar.core.client.HablarCore;
import com.calclab.hablar.core.client.HablarCoreModule;
import com.calclab.hablar.core.client.HablarDisplay;
import com.calclab.hablar.core.client.HablarWidget;
import com.calclab.hablar.icons.client.AvatarProviderRegistry;
import com.google.gwt.inject.client.AbstractGinModule;
import com.google.inject.Inject;
import com.google.inject.Provider;
import com.google.inject.Provides;
import com.google.inject.Singleton;

public class HablarModule extends AbstractGinModule {

	@Override
	protected void configure() {
		// Emite modules
		install(new CoreModule());
		install(new ImModule());
		install(new DiscoveryModule());
		install(new MucModule());
		install(new MucDiscoveryModule());
		install(new SearchModule());
		install(new VCardModule());

		// Hablar modules
		install(new HablarCoreModule());
		install(new HablarChatModule());
		
        bind(AvatarProviderRegistry.class).in(Singleton.class);
	}

	@Provides
	ChatConfig provideChatConfig(HablarConfig config) {
		return config.chatConfig;
	}
}
