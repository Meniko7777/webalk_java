package webalkeniko.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import webalkeniko.model.Konyv;

@Component
public class KonyvConverter implements Converter<Integer, Konyv> {

	@Autowired
	private KonyvManager konyvManager;
	
	@Override
	public Konyv convert(Integer id) {
		Konyv konyv = konyvManager.getKonyv(id);
		return konyv;
	}

}
