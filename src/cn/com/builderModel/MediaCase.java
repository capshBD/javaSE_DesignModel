package cn.com.builderModel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

//不同的媒体形式
class Media extends ArrayList {}
class Book extends Media {}
class Magazine extends Media {}
class WebSite extends Media {}

//不同的媒体组成元素
class MediaItem {
	private String s;

	public MediaItem(String s) {
		this.s = s;
	}

	public String toString() {
		return s;
	}
}

class Chapter extends MediaItem {
	public Chapter(String s) {
		super(s);
	}
}

class Article extends MediaItem {
	public Article(String s) {
		super(s);
	}
}

class WebItem extends MediaItem {
	public WebItem(String s) {
		super(s);
	}
}

//抽象建造者角色，它规范了所有媒体建造的步骤
abstract class MediaBuilder {
	public abstract void buildBase() ;
	public abstract void addMediaItem(MediaItem item);
	public abstract Media getFinishedMedia();
}

//具体建造者
class BookBuilder extends MediaBuilder {
	private Book b;

	public void buildBase() {
		System.out.println("Building book framework");
		b = new Book();
	}

	public void addMediaItem(MediaItem chapter) {
		System.out.println("Adding 媒体元素 " + chapter);
		b.add(chapter);
	}

	public Media getFinishedMedia() {
		return b;
	}
}

class MagazineBuilder extends MediaBuilder {
	private Magazine m;

	public void buildBase() {
		System.out.println("Building magazine framework");
		m = new Magazine();
	}

	public void addMediaItem(MediaItem article) {
		System.out.println("Adding article " + article);
		m.add(article);
	}

	public Media getFinishedMedia() {
		return m;
	}
}

class WebSiteBuilder extends MediaBuilder {
	private WebSite w;

	public void buildBase() {
		System.out.println("Building web site framework");
		w = new WebSite();
	}

	public void addMediaItem(MediaItem webItem) {
		System.out.println("Adding web item " + webItem);
		w.add(webItem);
	}

	public Media getFinishedMedia() {
		return w;
	}
}

// 指导者角色，也叫上下文
class MediaDirector {
	private MediaBuilder mb;

	public MediaDirector(MediaBuilder mb) {
		this.mb = mb; // 具有策略模式相似特征的
	}

	public Media produceMedia(List input) {
		mb.buildBase();
		for (Iterator it = input.iterator(); it.hasNext();)
			mb.addMediaItem((MediaItem) it.next());
		return mb.getFinishedMedia();
	}
}

public class MediaCase{
	public static void main(String[] args) {
		List input = Arrays.asList(new MediaItem[] {
				new MediaItem("MediaItem"),
				new Article("Article"),
				new WebItem("WebItem"), 
				new Chapter("Chapter"),});
		MediaDirector buildBook = new MediaDirector(new BookBuilder());
		Media book = buildBook.produceMedia(input);
		String result = "book: " + book;
		System.out.println(result);
	}
}
