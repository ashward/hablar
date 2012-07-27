package com.calclab.hablar.core.client;

import com.calclab.hablar.core.client.container.main.MainContainer;
import com.calclab.hablar.core.client.mvp.DefaultEventBus;
import com.calclab.hablar.core.client.mvp.HablarEventBus;
import com.calclab.hablar.core.client.pages.accordion.AccordionAnnotation;
import com.calclab.hablar.core.client.pages.accordion.AccordionContainer;
import com.calclab.hablar.core.client.pages.accordion.AccordionLayout;
import com.calclab.hablar.core.client.pages.tabs.TabsAnnotation;
import com.calclab.hablar.core.client.pages.tabs.TabsContainer;
import com.calclab.hablar.core.client.pages.tabs.TabsLayout;
import com.google.gwt.inject.client.AbstractGinModule;
import com.google.inject.Provides;
import com.google.inject.Singleton;

public class HablarCoreModule extends AbstractGinModule {

	@Override
	protected void configure() {
		bind(HablarWidget.class).in(Singleton.class);
		bind(HablarCore.class).in(Singleton.class);
		bind(MainContainer.class).annotatedWith(AccordionAnnotation.class).to(AccordionContainer.class);
		bind(MainContainer.class).annotatedWith(TabsAnnotation.class).to(TabsContainer.class);
		bind(HablarEventBus.class).to(DefaultEventBus.class);
		bind(AccordionLayout.class);
		bind(TabsLayout.class);
	}

	@Provides
	Hablar provideHablar(HablarWidget widget) {
		return widget.getHablar();
	}

	@Provides
	HablarDisplay provideHablarDisplay(HablarWidget widget) {
		return widget;
	}
}
