package webalkeniko.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import webalkeniko.model.Kolcsonzes;
import webalkeniko.model.Konyv;
import webalkeniko.model.Olvaso;
import webalkeniko.service.KolcsonzesManager;
import webalkeniko.service.KonyvManager;
import webalkeniko.service.OlvasoManager;

@Controller
public class IndexController {
	
	@Autowired
	private KolcsonzesManager kolcsonManager;
	@Autowired
	private OlvasoManager olvasoManager;
	@Autowired
	private KonyvManager konyvManager;
	
	@RequestMapping(value={"", "/", "/index"})
	public String index() {
		/*olvasoManager.saveOlvaso(new Olvaso(1, "asd", "dsa"));
		konyvManager.saveKonyv(new Konyv(1, "a", "b"));
		konyvManager.saveKonyv(new Konyv(2, "b", "c"));*/
		return "index";
	}
	
	@RequestMapping("/kolcsonzes")
	public String kolcsonzesek(Model model) {
		List<Kolcsonzes> kolcsonzesek = kolcsonManager.getAllKolcsonzes();
		model.addAttribute("kolcsonzesek", kolcsonzesek);
		return "kolcsonzesek";
	}
	
	@RequestMapping("/olvaso")
	public String olvasok(Model model) {
		List<Olvaso> olvasok = olvasoManager.getAllOlvaso();
		model.addAttribute("olvasok", olvasok);
		return "olvasok";
	}
	
	@RequestMapping("/konyv")
	public String konyvek(Model model) {
		List<Konyv> konyvek = konyvManager.getAllKonyv();
		model.addAttribute("konyvek", konyvek);
		return "konyvek";
	}
	
}
