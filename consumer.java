package com.san;

import java.io.IOException;
import java.util.HashSet;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class consumer {

	public void start(String key,int page) throws IOException{
		String url="http://www.shopping.com/products~PG-"+page+"?KW="+key;
		crawl(url);

	}
public void start(String key) throws IOException{
	String url="http://www.shopping.com/products?KW="+key;
		crawl(url);

	}
	private void crawl(String url) throws IOException{
		
		HashSet<String> anchors=new HashSet<String>();
		Document doc = Jsoup.connect(url).get();

		String title=doc.title();
		
		Elements hrefs = doc.select("a");
		for(Element e : hrefs){
			String anchor=e.attr("href").trim();
			String text=e.text().trim();
			anchors.add("link : "+anchor+" \tText : "+text);
			//System.out.println(anchor);
		}
		System.out.println("Title of the web :"+ title);
		System.out.println("List of href link on the webpage containing keyword \n");
		for(String e:anchors){
			System.out.println(e);
		}
	}


}
