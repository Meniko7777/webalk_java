package webalkeniko.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import webalkeniko.model.Olvaso;
import webalkeniko.persist.OlvasoRepository;

@Service
public class OlvasoManager {
	
	@Autowired
	private OlvasoRepository olvasoRepo;
	
	public Olvaso saveOlvaso(Olvaso olvaso) {
		return this.olvasoRepo.save(olvaso);
	}
	
	public Olvaso getOlvaso(int okod) {
		Olvaso talaltOlvaso = olvasoRepo.findOne(okod);
		return talaltOlvaso;
	}
	
	public List<Olvaso> getAllOlvaso()
	{
		Iterable<Olvaso> it = this.olvasoRepo.findAll();
		List<Olvaso> lista = new ArrayList<>();
		for(Olvaso olvaso : it)
		{
			lista.add(olvaso);
		}
		return lista;
	}
	
	public void deleteOlvaso(int okod) {
		olvasoRepo.delete(okod);
	}

}
