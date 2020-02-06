package com.siliangchang.springdemo;

import org.springframework.stereotype.Component;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.annotation.PostConstruct;

@Component
public class FileFortuneService implements FortuneService {
	
	private String fileName = "C:\\Users\\Siliang\\Desktop\\fortunes.txt";
	private List<String> fortuneList;
	private Random myRand = new Random();
	
	@PostConstruct
	public void readFortuneFile() {
		File list = new File(fileName);
		System.out.println("Reading fortunes from file: " + list);
		System.out.println("File exists: " + list.exists());
		
		fortuneList = new ArrayList<String>();
		// read file into arraylist
		try {
			BufferedReader br = new BufferedReader(new FileReader(list));
			String line;
			while ((line = br.readLine()) != null) {
				fortuneList.add(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public FileFortuneService() {
		
	}
	
	@Override
	public String getFortune() {
		int index = fortuneList.size();
		return fortuneList.get(myRand.nextInt(index));
	}

}
