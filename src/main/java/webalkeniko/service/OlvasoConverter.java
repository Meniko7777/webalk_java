package webalkeniko.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import webalkeniko.model.Olvaso;

@Component
public class OlvasoConverter implements Converter<Integer, Olvaso> {

	@Autowired
	private OlvasoManager olvasoManager;
	
	@Override
	public Olvaso convert(Integer id) {
		Olvaso o = olvasoManager.getOlvaso(id);
		return o;
	}

}
