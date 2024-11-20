package proxy;

import java.util.ArrayList;
import java.util.HashMap;

import model.Video;
import model.VideoDownloader;

public class VideoDownloaderProxy {
	private VideoDownloader downloader = null;
	private HashMap<String, Video> cache;
	private ArrayList<String> blockedLink;
	
	public VideoDownloaderProxy() {
		// TODO Auto-generated constructor stub
		cache = new HashMap<>();
		blockedLink = new ArrayList<>();
		insert();
	}
	
	private void insert() {
		blockedLink.add("x.com");
		blockedLink.add("reddit.com");
		blockedLink.add("twiter.com");
	}
	
	public Video downloadVideo(String link) {
		if(blockedLink.contains(link)) {
			System.out.println("Cannot download this video from " + link);
			return null;
		}
		
		if(downloader == null) {
			downloader = new VideoDownloader();
		}
		
		if(cache.containsKey(link)) {
			System.out.println("Video " + link + " get from cache");
			return cache.get(link);
		}
		
		Video video = downloader.downloadVideo(link);
		cache.put(link, video);
		return video;
	}
}
