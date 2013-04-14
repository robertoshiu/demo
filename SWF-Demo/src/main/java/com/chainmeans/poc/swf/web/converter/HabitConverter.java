/**
 * Created on April 13, 2013
 */
package com.chainmeans.poc.swf.web.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import com.chainmeans.poc.swf.domain.Habit;

/**
 * @author Roberto
 *
 */
@FacesConverter("habit")
public class HabitConverter implements Converter {

	@Override
	public Object getAsObject(FacesContext ctx, UIComponent component, String value) {
		return new Habit(value);
	}

	@Override
	public String getAsString(FacesContext ctx, UIComponent component, Object value) {
		return (String) value;
	}

}
