package de.wlsc.gwt.project.mvp;

import com.google.gwt.place.shared.PlaceHistoryMapper;
import com.google.gwt.place.shared.WithTokenizers;

import de.wlsc.gwt.project.mvp.place.WelcomePlace;

@WithTokenizers({ WelcomePlace.Tokenizer.class })
public interface ProjectPlaceHistoryMapper extends
		PlaceHistoryMapper {

}
