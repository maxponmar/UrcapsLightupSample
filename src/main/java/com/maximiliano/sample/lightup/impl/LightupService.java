package com.maximiliano.sample.lightup.impl;

import java.util.Locale;

import com.ur.urcap.api.contribution.ViewAPIProvider;
import com.ur.urcap.api.contribution.program.ContributionConfiguration;
import com.ur.urcap.api.contribution.program.CreationContext;
import com.ur.urcap.api.contribution.program.ProgramAPIProvider;
import com.ur.urcap.api.contribution.program.swing.SwingProgramNodeService;
import com.ur.urcap.api.domain.data.DataModel;

public class LightupService implements SwingProgramNodeService<LightupContribution, LightupView>{

	@Override
	public String getId() { 
		return "lightupnode";
	}

	@Override
	public void configureContribution(ContributionConfiguration configuration) {
		configuration.setChildrenAllowed(false);
	}

	@Override
	public String getTitle(Locale locale) {
		return "lightup";
	}

	@Override
	public LightupView createView(ViewAPIProvider apiProvider) {
		return new LightupView(apiProvider);
	}

	@Override
	public LightupContribution createNode(ProgramAPIProvider apiProvider, LightupView view, DataModel model,
			CreationContext context) {
		return new LightupContribution(apiProvider, view, model);
	}

	

}
