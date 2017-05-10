package webalkeniko.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import webalkeniko.model.Konyv;
import webalkeniko.persist.KonyvRepository;

@Service
public class KonyvManager {
	
	@Autowired
	private KonyvRepository konyvRepo;
	
	public Konyv saveKonyv(Konyv konyv) {
		return this.konyvRepo.save(konyv);
	}
	
	public Konyv getKonyv(int kkod) {
		Konyv talaltKonyv = konyvRepo.findOne(kkod);
		return talaltKonyv;
	}
	
	public List<Konyv> getAllKonyv()
	{
		Iterable<Konyv> it = this.konyvRepo.findAll();
		List<Konyv> lista = new ArrayList<>();
		for(Konyv konyv : it)
		{
			lista.add(konyv);
		}
		return lista;
	}
	
	public void deleteKonyv(int kkod) {
		konyvRepo.delete(kkod);
	}


}
