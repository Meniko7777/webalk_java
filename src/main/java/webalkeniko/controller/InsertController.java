package webalkeniko.controller;


import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import webalkeniko.model.Kolcsonzes;
import webalkeniko.model.Konyv;
import webalkeniko.model.Olvaso;
import webalkeniko.service.KolcsonzesManager;
import webalkeniko.service.KonyvManager;
import webalkeniko.service.OlvasoManager;

@Controller
public class InsertController {
	
	@Autowired
	private KonyvManager konyvManager;
	@Autowired
	private OlvasoManager olvasoManager;
	@Autowired
	private KolcsonzesManager kolcsonManager;
	
	@RequestMapping("/konyvForm")
	public String konyvForm(@RequestParam(required=false) Integer id, @ModelAttribute("konyv") Konyv konyv) {
		if (id == null) {
			konyv.setKkod(0);
			konyv.setCim("");
			konyv.setSzerzo("");
		} else {
			Konyv k = konyvManager.getKonyv(id);
			konyv.setKkod(k.getKkod());
			konyv.setCim(k.getCim());
			konyv.setSzerzo(k.getSzerzo());
		}
		return "konyvform";
	}
	
	@RequestMapping("/insertKonyv")
	public String insertKonyv(@Valid @ModelAttribute("konyv") Konyv k, BindingResult bindigRes) {
		if (bindigRes.hasErrors())
			return "konyvform";
		konyvManager.saveKonyv(k);	
		return "redirect:/konyv";
	}
	
	@RequestMapping("/olvasoForm")
	public String olvasoForm(@RequestParam(required=false) Integer id, @ModelAttribute("olvaso") Olvaso olvaso) {
		if (id == null) {
			olvaso.setOkod(0);
			olvaso.setLakcim("");
			olvaso.setNev("");
		} else {
			Olvaso tempOlvaso = olvasoManager.getOlvaso(id);
			olvaso.setOkod(tempOlvaso.getOkod());
			olvaso.setNev(tempOlvaso.getNev());
			olvaso.setLakcim(tempOlvaso.getLakcim());
		}
		return "olvasoform";
	}
	
	@RequestMapping("/insertOlvaso")
	public String insertKonyv(@Valid @ModelAttribute("olvaso") Olvaso o, BindingResult bindigRes) {
		if (bindigRes.hasErrors())
			return "olvasoform";
		olvasoManager.saveOlvaso(o);	
		return "redirect:/olvaso";
	}
	
	@RequestMapping("/kolcsonzesForm")
	public String kolcsonzesForm(@RequestParam(required=false) Integer id, @ModelAttribute("kolcsonzes") Kolcsonzes kolcsonzes, Model model) {
		if (id == null) {
			kolcsonzes.setKolcsonzesID(0);
			kolcsonzes.setDb(0);
			kolcsonzes.setDatum(null);
			kolcsonzes.setOlvaso(null);
			model.addAttribute("konyvek", konyvManager.getAllKonyv());
		} else {
			Kolcsonzes k = kolcsonManager.getKolcsonzes(id);
			kolcsonzes.setKolcsonzesID(k.getKolcsonzesID());
			kolcsonzes.setDb(k.getDb());
			kolcsonzes.setDatum(k.getDatum());
			kolcsonzes.setOlvaso(k.getOlvaso());
			model.addAttribute("konyvek", konyvManager.getAllKonyv());
		}
		return "kolcsonzesform";
	}
	
	@RequestMapping("/insertKolcsonzes")
	public String insertKolcsonzes(@Valid @ModelAttribute("kolcsonzes") Kolcsonzes k, BindingResult bindingRes, Model model) {
		if (bindingRes.hasErrors()) {
			return "redirect:/kolcsonzesForm";
		}
		kolcsonManager.saveKolcsonzes(k);
		return "redirect:/kolcsonzes";
	}

}
