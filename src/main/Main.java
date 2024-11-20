//Simulation VideoDownloaderProxy in Java.
package main;

import model.VideoDownloader;
import proxy.VideoDownloaderProxy;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
		VideoDownloader downloader = new VideoDownloader();
		
		System.out.println("Download Pertama!");		
		downloader.downloadVideo("youtube.com");
		downloader.downloadVideo("facebook.com");
		System.out.println();
		
		VideoDownloaderProxy proxy = new VideoDownloaderProxy();
		System.out.println("Download Kedua!");		
		proxy.downloadVideo("youtube.com");
		proxy.downloadVideo("youtube.com");
		proxy.downloadVideo("facebook.com");
		proxy.downloadVideo("twiter.com");
		proxy.downloadVideo("facebook.com");
		proxy.downloadVideo("facebook.com");
		proxy.downloadVideo("reddit.com");
		proxy.downloadVideo("facebook.com");
		proxy.downloadVideo("facebook.com");
		proxy.downloadVideo("facebook.com");
		proxy.downloadVideo("facebook.com");
		proxy.downloadVideo("x.com");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}
