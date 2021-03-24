package it.polito.tdp.dizionari;

import java.util.*;

public class Dizionario
{
	private List<String> elenco;
	private AccessoFile file = new AccessoFile();
	
	public void setItaliano()
	{
		elenco = file.setItalian();
	}
	public void setEnglish()
	{
		elenco = file.setEnglish();
	}
	
	/**
	 * @param parole è un array di parole da cercare nel dizionario
	 * @return una {@code List} di parole non trovate
	 */
	public List<String> cerca(String[] parole)
	{
		List<String> paroleNonTrovate = new ArrayList<>();
		for (String parola : parole)
			if(!elenco.contains(parola))
				paroleNonTrovate.add(parola);
		return paroleNonTrovate;
	}
	
	public List<String> cercaDicotomica(String[] parole)
	{
		List<String> paroleNonTrovate = new ArrayList<>();
		for(int i = 0; i < elenco.size(); i++)
		{
			
		}
		return null;
	}
}
