package com.bt.service;

import java.util.Locale;
import java.util.Set;
import java.util.TreeSet;

import org.springframework.stereotype.Service;
@Service("LocaleService")
public class LocaleService implements ILocaleService {

	@Override
	public Set<String> fetchCountriesList() {
		Locale locale[]=null;
		Set<String> getCountries=null;
		
		locale=Locale.getAvailableLocales();
		getCountries=new TreeSet<String>();
		for(Locale l:locale) {
			if(!l.getDisplayCountry().equals(""))
				getCountries.add(l.getDisplayCountry());
		}
		return getCountries;
	}

}
