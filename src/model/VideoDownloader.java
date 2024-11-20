package model;

public class VideoDownloader {

	public VideoDownloader() {
		// TODO Auto-generated constructor stub
		System.out.println("Build VideoDownloader");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Done Build VideoDownloader");
	}
	public Video downloadVideo(String link) {
		System.out.println("Download video from " + link);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new Video(link);
	}
}
