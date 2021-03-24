package it.polito.tdp.dizionari;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AccessoFile
{
	private List<String> elenco;
	private final String ITALIANO = "src/main/resources/Italian.txt";
	private final String ENGLISH = "src/main/resources/English.txt";

	public List<String> setEnglish()
	{
		this.elenco = new ArrayList<>();
		this.setFile(ITALIANO);
		return elenco;
	}
	public List<String> setItalian()
	{
		this.elenco = new ArrayList<>();
		this.setFile(ENGLISH);
		return elenco;
	}
	private void setFile(String lingua)
	{
		try
		{
			FileReader fr = new FileReader(lingua);
			BufferedReader br = new BufferedReader(fr);
			String word;
			while ((word = br.readLine()) != null)
			{
				elenco.add(word);
			}
			br.close();
			fr.close();
		} catch (IOException e)
		{
			System.out.println("Errore nella lettura del file");
		}
	}
}
