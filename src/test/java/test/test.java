package test;

import httpServer.booter;
import interfaceApplication.Content;
import interfaceApplication.ContentGroup;
import model.ContentGroupModel;
import model.ContentModel;

public class test {
	public static void main(String[] args) {
		 booter booter = new booter();
		 try {
		 System.out.println("GrapeContent!");
		 System.setProperty("AppName", "GrapeContent");
		 booter.start(1003);
		} catch (Exception e) {
		}
		//// System.out.println(new
		// Content().getImgs("58f75b0c1a4769cbf53bc310", 7));
		// System.out.println(new
		// ContentGroup().GroupDelete("58f884671a4769cbf53e6aa5"));
//		String contents = "{\"content\":\"<span><span>123tyujtyfjugfkjg</span><span>tyujtyfjugfkjg</span><span>tyujtyfjugfkjg</span><span>tyujtyfjugfkjg</span><span>tyujtyfjugfkjg</span><span>tyujtyfjugfkjg</span><span>tyujtyfjugfkjg</span><span>tyujtyfjugfkjg</span><span>tyujtyfjugfkjg</span><span>tyujtyfjugfkjg</span><span>tyujtyfjugfkjg</span><span>tyujtyfjugfkjg</span><span>tyujtyfjugfkjg</span><span>tyujtyfjugfkjg</span><span>tyujtyfjugfkjg</span><span>tyujtyfjugfkjg</span><span>tyujtyfjugfkjg</span><span>tyujtyfjugfkjg</span><span>tyujtyfjugfkjg</span><span>tyujtyfjugfkjg</span><span>tyujtyfjugfkjg</span><span>tyujtyfjugfkjg</span><span>tyujtyfjugfkjg</span><span>tyujtyfjugfkjg</span><span>tyujtyfjugfkjg</span><span>tyujtyfjugfkjg</span><span>tyujtyfjugfkjg</span><span>tyujtyfjugfkjg</span><span>tyujtyfjugfkjg</span><span>tyujtyfjugfkjg</span><span>tyujtyfjugfkjg</span><span>tyujtyfjugfkjg</span><span>tyujtyfjugfkjg</span><span>tyujtyfjugfkjg</span><span>tyujtyfjugfkjg</span><span>tyujtyfjugfkjg</span><span>tyujtyfjugfkjg</span><span>tyujtyfjugfkjg</span><span>tyujtyfjugfkjg</span><span>tyujtyfjugfkjg</span><span>tyujtyfjugfkjg</span><span>tyujtyfjugfkjg</span><span>tyujtyfjugfkjg</span><span>tyujtyfjugfkjg</span><span>tyujtyfjugfkjg</span><span>tyujtyfjugfkjg</span><span>tyujtyfjugfkjg</span><span>tyujtyfjugfkjg</span><span>tyujtyfjugfkjg</span><span>tyujtyfjugfkjg</span><span>tyujtyfjugfkjg</span><span>tyujtyfjugfkjg</span><span>tyujtyfjugfkjg</span><span>tyujtyfjugfkjg</span><span>tyujtyfjugfkjg</span><span>tyujtyfjugfkjg</span><span>tyujtyfjugfkjg</span><span>tyujtyfjugfkjg</span><span>tyujtyfjugfkjg</span><span>tyujtyfjugfkjg</span><span>tyujtyfjugfkjg</span><span>tyujtyfjugfkjg</span><span>tyujtyfjugfkjg</span><span>tyujtyfjugfkjg</span><span>tyujtyfjugfkjg</span><span>tyujtyfjugfkjg</span><span>tyujtyfjugfkjg</span><span>tyujtyfjugfkjg</span><span>tyujtyfjugfkjg</span><span>tyujtyfjugfkjg</span><span>tyujtyfjugfkjg</span><span>tyujtyfjugfkjg</span><span>tyujtyfjugfkjg</span><span>tyujtyfjugfkjg</span><span>tyujtyfjugfkjg</span><span>tyujtyfjugfkjg</span><span>tyujtyfjugfkjg</span><span>tyujtyfjugfkjg</span><span>tyujtyfjugfkjg</span><span>tyujtyfjugfkjg</span><span>tyujtyfjugfkjg</span><span>tyujtyfjugfkjg</span><span>tyujtyfjugfkjg</span><span>tyujtyfjugfkjg</span><span>tyujtyfjugfkjg</span><span>tyujtyfjugfkjg</span><span>tyujtyfjugfkjg</span><span>tyujtyfjugfkjg</span><span>tyujtyfjugfkjg</span><span>tyujtyfjugfkjg</span><span>tyujtyfjugfkjg</span><span>tyujtyfjugfkjg</span><span>tyujtyfjugfkjg</span><span>tyujtyfjugfkjg</span><span>tyujtyfjugfkjg</span><span>tyujtyfjugfkjg</span><span>tyujtyfjugfkjg</span><span>tyujtyfjugfkjg</span><span>tyujtyfjugfkjg</span><span>tyujtyfjugfkjg</span><span>tyujtyfjugfkjg</span><span>tyujtyfjugfkjg</span><span>tyujtyfjugfkjg</span><span>tyujtyfjugfkjg</span><span>tyujtyfjugfkjg</span><span>tyujtyfjugfk123jg</span><span>tyujtyfjugfkjg</span><span>tyujtyfjugfkjg</span><span>tyujtyfjugfkjg</span><span>tyujtyfjugfkjg</span><span>tyujtyfjugfkjg</span><span>tyujtyfjugfkjg</span><span>tyujtyfjugfkjg</span><span>tyujtyfjugfkjg</span><span>tyujtyfjugfkjg</span><span>tyujtyfjugfkjg</span><span>tyujtyfjugfkjg</span><span>tyujtyfjugfkjg</span><span>tyujtyfjugfkjg</span><span>tyujtyfjugfkjg</span><span>tyujtyfjugfkjg</span><span>tyujtyfjugfkjg</span><span>tyujtyfjugfkjg</span><span>tyujtyfjugfkjg</span><span>tyujtyfjugfkjg</span><span>tyujtyfjugfkjg</span><span>tyujtyfjugfkjg</span><span>tyujtyfjugfkjg</span><span>tyujtyfjugfkjg</span><span>tyujtyfjugfkjg</span><span>tyujtyfjugfkjg</span><span>tyujtyfjugfkjg</span><span>tyujtyfjugfkjg</span><span>tyujtyfjugfkjg</span><span>tyujtyfjugfkjg</span><span>tyujtyfjugfkjg</span><span>tyujtyfjugfkjg</span><span>tyujtyfjugfkjg</span><span>tyujtyfjugfkjg</span><span>tyujtyfjugfkjg</span><span>tyujtyfjugfkjg</span><span>tyujtyfjugfkjg</span><span>tyujtyfjugfkjg</span><span>tyujtyfjugfkjg</span><span>tyujtyfjugfkjg</span><span>tyujtyfjugfkjg</span><span>tyujtyfjugfkjg</span><span>tyujtyfjugfkjg</span><span>tyujtyfjugfkjg</span><span>tyujtyfjugfkjg</span><span>tyujtyfjugfkjg</span><span>tyujtyfjugfkjg</span>jgtyujtyfjugfkjgtyujtyfjugfkjgtyujtyfjugfkjgtyujtyfjugfkjgtyujtyfjugfkjgtyujtyfjugfkjgtyujtyfjugfkjgtyujtyfjugfkjgtyujtyfjugfkjgtyujtyfjugfkjgtyujtyfjugfkjgtyujtyfjugfkjgtyujtyfjugfkjgtyujtyfjugfkjgtyujtyfjugfkjgtyujtyfjugfkjgtyujtyfjugfkjgtyujtyfjugfkjgtyujtyfjugfkjgtyujtyfjugfkjg</span><span></span>\",\"subName\":\"123\",\"mainName\":\"asdgdsfg\",\"time\":\"1493222400000\",\"souce\":null,\"desp\":null}";
//		System.out.println(new Content().EditArticle("58f8890cc6c2040bbccd692b",
//				contents));
		
//		System.out.println(new Content().ShowByGroupId("58f62de01a4769cbf53908ae"));
	}
}
